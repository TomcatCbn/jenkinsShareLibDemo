// 该Stage处理以下几件事
// 1.根据构建页面所选的仓库进行代码更新
// 2.切换分支
package com.dssomobile.jenkins.stages

import com.dssomobile.jenkins.models.CodeProjectDo
import com.dssomobile.jenkins.models.DartPackageDo
import com.dssomobile.jenkins.models.SettingsDo

def name() {
    return 'Code Update Stage'
}

def getCodeFromGit(List<CodeProjectDo> codeProjectDoList, SettingsDo settings, String branchName) {
    log.i("${name()}: 执行getCodeFromGit")
    // 各个子工程
    script {
        dir(settings.defaultPackageDir) {
            for (codeProjectDo in codeProjectDoList) {
                String codeProjectDir = codeProjectDo.key
                log.i("执行${codeProjectDir}工程代码更新")
                sh "mkdir -p $codeProjectDir"
                dir(codeProjectDir) {
                    git branch: branchName, credentialsId: settings.gitCredentialsId, url: codeProjectDo.repoUrl
                }
            }
        }
    }
}