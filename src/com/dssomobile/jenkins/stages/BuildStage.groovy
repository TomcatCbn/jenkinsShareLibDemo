package com.dssomobile.jenkins.stages

import com.dssomobile.jenkins.models.CodeProjectDo
import com.dssomobile.jenkins.models.SettingsDo

def name() {
    return 'Build Stage'
}

def buildAndroid(CodeProjectDo mainProject) {
    log.i("${name()}: 执行buildAndroid")
    script {
//        dir(settings.defaultPackageDir) {
//            log.i "begin build ${mainProject.key}"
//            sh 'flutter pub get'
//            sh 'flutter build apk'
//            archiveArtifacts artifacts: 'build/app/outputs/apk/**/*.apk'
//        }
        log.i("$mainProject")
    }
}