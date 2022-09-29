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
    def res = []
    dir("${Config.settings.defaultPackageDir}/${projectDo.key}") {
        sh "${DssomobileTool.TOOL_CMD} ${DssomobileTool.FETCH_LOCAL_DEPS} pubspec.yaml local_deps_temp.properties"
        def prop = fileTools.read_properties('local_deps_temp.properties')

        prop.each {
            for ( codeProj in Config.codeProjects) {
                if (codeProj.containsPackage(it.key)) {
                    res.add(codeProj)
                }
            }
        }
        Config.dynamicData.selectedProject = res
    }

    return res
}
