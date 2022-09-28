package com.dssomobile.jenkins.models

class SettingsDo {
    // 默认仓库代码存放的位置
    String defaultPackageDir

    def toString() {
        return "defaultPackageDir=$defaultPackageDir"
    }
}