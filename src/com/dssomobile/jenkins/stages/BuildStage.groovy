// 该Stage处理以下几件事
// 1.进行android打包
// 2.进行android渠道打包
// 3.进行ios打包
package com.dssomobile.jenkins.stages

import com.dssomobile.jenkins.models.SettingsDo

def name() {
    return 'Build Stage'
}

def buildAndroid(/*CodeProjectDo*/ codeProjectDo, SettingsDo settingsDo) {
    log.i("${name()}: 执行buildAndroid")
    script {
        dir("${settingsDo.defaultPackageDir}/${codeProjectDo.key}") {
            log.i "begin build ${codeProjectDo.key}"
            dartToken(settingsDo.dartPubHostedUrl, settingsDo.dartTokenEnvVar)
            sh 'flutter pub get'
            sh 'flutter build apk'
            archiveArtifacts artifacts: 'build/app/outputs/apk/**/*.apk'
        }
    }
}