package com.dssomobile.jenkins.models

// 代码仓库描述
class CodeProjectDo {
    // 仓库名字
    String key

    // git仓库地址
    String repoUrl

    // 子package
    List<DartPackageDo> packages
}

// 描述dart包信息
class DartPackageDo {
    // package唯一标识名字
    String packageName

    // 相对路径
    String relativePath
}