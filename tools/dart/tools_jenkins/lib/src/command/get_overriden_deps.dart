library tools_jenkins;

import 'dart:io';

import 'package:yaml/yaml.dart';

/// 根据[pubspecFilePath]获取本地依赖的packages
/// 并输出到[outputFilePath]
Future<void> fetchLocalDeps(
  String pubspecFilePath,
  String outputFilePath,
) async {
  final File? pubspecFile = _getPubspecFile(pubspecFilePath);
  if (pubspecFile == null) {
    throw Exception("Can't find 'pubspec.yaml' file.");
  }

  final pubspecFileContent = pubspecFile.readAsStringSync();
  final pubspecYaml = loadYaml(pubspecFileContent);

  if (pubspecYaml is! YamlMap) {
    throw Exception(
      "Failed to extract config from the 'pubspec.yaml' file.\n"
      'Expected YAML map but got ${pubspecYaml.runtimeType}.',
    );
  }

  final File outPutFile = File(outputFilePath);
  if (outPutFile.existsSync()) {
    outPutFile.deleteSync();
  }
  outPutFile.createSync();
  final YamlMap? map = pubspecYaml['dependency_overrides'] as YamlMap?;
  if (map != null) {
    final openWrite = outPutFile.openWrite();
    map.forEach((key, value) {
      if (value['path'] != null) {
        openWrite.writeln('$key=${value['path']}');
      }
    });
    await openWrite.flush();
  }
}

/// Gets the pubspec file.
File? _getPubspecFile(String yamlFilePath) {
  final pubspecFile = File(yamlFilePath);

  return pubspecFile.existsSync() ? pubspecFile : null;
}
