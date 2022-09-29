package com.dssomobile.jenkins.models

// 描述dart包信息
class DartPackageDo {

    // package唯一标识名字
    String packageName

    // 相对路径
    String relativePath

    Map toMap() {
        return [
                packageName : packageName,
                relativePath: relativePath,
        ]
    }

    String toString() {
        "packageName: $packageName"
    }
}