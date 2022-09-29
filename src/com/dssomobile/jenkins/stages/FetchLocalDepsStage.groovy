package com.dssomobile.jenkins.stages

import com.dssomobile.jenkins.models.CodeProjectDo
import com.dssomobile.jenkins.models.DartPackageDo
import com.dssomobile.jenkins.tools.DssomobileTool

/**
 * 获取某个package下overridden_dependency为path的packages
 */

def name() {
    return 'Fetch Local Deps Stage'
}

def fetchLocalDeps(CodeProjectDo projectDo) {
    log.i("${name()}: fetch local deps, ${projectDo.key}")

    dir("${Config.settings.defaultPackageDir}/${projectDo.key}") {
        sh "${DssomobileTool.TOOL_CMD} ${DssomobileTool.FETCH_LOCAL_DEPS} pubspec.yaml local_deps_temp.properties"
        def prop = fileTools.read_properties('local_deps_temp.properties')
        log.i("local dependencies is \n ${prop.ketSet().join("\n")}")
        def res = [:]
        prop.each {
            for (codeProj in Config.codeProjects.values()) {
//                log.i("try find ${it.key} in ${codeProj.key}")
                if (codeProj.containsPackage(it.key)) {
                    res.put(codeProj.key, codeProj)
                }
            }
        }

        log.i("select code projects is \n ${res.keySet().join("\n")}")

        Config.dynamicData.selectedProject = res.values()
    }
}
