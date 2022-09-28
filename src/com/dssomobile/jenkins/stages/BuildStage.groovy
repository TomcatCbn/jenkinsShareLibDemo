package com.dssomobile.jenkins.stages

import com.dssomobile.jenkins.models.SettingsDo

def name() {
    return 'Build Stage'
}

def buildAndroid(codeProjectDo, SettingsDo settingsDo) {
    log.i("${name()}: 执行buildAndroid")
    script {
        dir("${settings.defaultPackageDir}/${codeProjectDo.key}") {
            log.i "begin build ${codeProjectDo.key}"
            sh 'flutter pub get'
            sh 'flutter build apk'
            archiveArtifacts artifacts: 'build/app/outputs/apk/**/*.apk'
        }
    }
}