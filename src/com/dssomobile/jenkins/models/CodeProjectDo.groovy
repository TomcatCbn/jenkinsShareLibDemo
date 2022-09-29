package com.dssomobile.jenkins.models

import com.dssomobile.jenkins.models.DartPackageDo
// 代码仓库描述

class CodeProjectDo {

    // 仓库名字/也是目录名
    String key

    // git仓库地址
    String repoUrl

    // 子package
    List<DartPackageDo> packages

    Map toMap() {
        List<Map> p = []
        for (pack in packages) {
            p.add(pack.toMap())
        }

        return [
            key: key,
            repoUrl: repoUrl,
            packages: p
        ]
    }

}
