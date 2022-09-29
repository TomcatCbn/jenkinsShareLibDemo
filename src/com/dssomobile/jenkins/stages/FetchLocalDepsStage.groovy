package com.dssomobile.jenkins.stages

import com.dssomobile.jenkins.models.CodeProjectDo
import com.dssomobile.jenkins.models.DartPackageDo

/**
 * 获取某个package下overridden_dependency为path的packages
 */

def name() {
    return 'Fetch Local Deps Stage'
}

def fetchLocalDeps(CodeProjectDo projectDo) {
    log.i("${name()}: fetch local deps, ${projectDo.key}")

    dir("${Config.settings.defaultPackageDir}/${projectDo.key}") {

    }
}