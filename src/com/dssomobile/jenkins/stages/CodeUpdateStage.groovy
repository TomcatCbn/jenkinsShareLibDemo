package com.dssomobile.jenkins.stages
// 该Stage处理以下几件事
// 1.根据构建页面所选的仓库进行代码更新，包括切换分支
import com.dssomobile.jenkins.models.CodeProjectDo
import com.dssomobile.jenkins.models.SettingsDo

def name = 'Code Update Stage'

def getCodeFromGit(List<CodeProjectDo> codeProjectDoList, SettingsDo settings, String branchName, String credentialsId) {
    log.i("${name}: 执行getCodeFromGit")
    // 各个子工程
    script {
        dir(settings.defaultPackageDir) {
            for (codeProjectDo in codeProjectDoList) {
                String codeProjectDir = codeProjectDo.key
                log.i("执行${codeProjectDir}工程代码更新")
                sh "mkdir -p $codeProjectDir"
                dir(codeProjectDir) {
                    git branch: branchName, credentialsId: credentialsId, url: codeProjectDo.repoUrl
                }
            }
        }
    }
}