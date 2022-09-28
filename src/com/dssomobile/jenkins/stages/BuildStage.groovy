package com.dssomobile.jenkins.stages

import com.dssomobile.jenkins.models.CodeProjectDo
import com.dssomobile.jenkins.models.SettingsDo

def name() {
    return 'Build Stage'
}

def buildAndroid(CodeProjectDo mainProject, SettingsDo settings) {
    log.i("${name}: 执行buildAndroid")
    script {
        dir(settings.defaultPackageDir) {
            log.i "begin build ${mainProject.key}"
            sh "flutter build apk"
            archiveArtifacts artifacts: 'build/app/outputs/apk/**/*.apk'
        }

//        sh "dart pub global activate melos"
//        sh "melos clean"
//        sh "melos bootstrap"
//        dir('packages/dssomobile-oneapp-app-main') {
//            echo 'Begin build app'
//
//        }
    }
}