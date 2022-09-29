// ignore_for_file: avoid_print

import 'package:tools_jenkins/src/command/get_overriden_deps.dart';
import 'package:tools_jenkins/version.dart';

Future<void> main(List<String> arguments) async {
  if (arguments.isEmpty) {
    return;
  }

  if (arguments.contains('--version') || arguments.contains('-v')) {
    print(dssomobileVersion);

    return;
  }

  // 后续可以参照melos工具写，这里先easy实现
  switch (arguments[0]) {
    case 'fetchLocalDeps':
      await fetchLocalDeps(arguments[1], arguments[2]);
      break;
    default:
      print('unknown cmd, ${arguments[0]}');
      break;
  }
}
