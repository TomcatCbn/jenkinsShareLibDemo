package com.dssomobile.jenkins.models

// 整个工程的全局配置
class SettingsDo {

    // 默认仓库代码存放的位置
    String defaultPackageDir

    // dart 仓库，如 jfrog的虚拟仓库
    String dartPubHostedUrl

    // dart仓库token环境变量名
    String dartTokenEnvVar

    // dart package publish to 地址
    String dartPublishToUrl

    // git credentialsId
    String gitCredentialsId

    Map toMap() {
        return [
                defaultPackageDir: defaultPackageDir,
                dartPubHostedUrl : dartPubHostedUrl,
                dartTokenEnvVar  : dartTokenEnvVar,
                dartPublishToUrl : dartPublishToUrl,
                gitCredentialsId : gitCredentialsId,
        ]
    }

}
