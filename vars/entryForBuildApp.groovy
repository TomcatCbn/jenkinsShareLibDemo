// 该entry用于构建应用，支持以下操作
// 1.按照指定分支或Tag构建
// 2.构建android渠道
// 3.发布应用

import com.dssomobile.jenkins.stages.CodeUpdateStage
import com.dssomobile.jenkins.stages.BuildStage
import com.dssomobile.jenkins.models.CodeProjectDo

// jenkins pipeline入口
def call(String appProjectKey, String branchName) {
    log.i("begin pipeline...entryForBuildApp, app = $appProjectKey")

    def codeUpdateStage = new CodeUpdateStage()
    // def buildStage = new BuildStage()
//    def deployStage = new DeployStage()

    // def mainProject = appProject.key

    node {
        oneAppConfig.config()
    }

    pipeline {
        agent any
        environment {
            TOKEN_JFROG = "${env.TOKEN_JFROG}"
        }
        stages {
            stage('codeUpdateStage') {
                steps {
                    script {
                        log.i("Stage: ${codeUpdateStage.name()} begin...")
                        codeUpdateStage.getCodeFromGit(Config.codeProjects.values(), Config.settings, branchName)
                    }
                }
            }

            // stage('buildStage') {
            //     steps {
            //         script {
            //             log.i("Stage: ${buildStage.name()} begin...")
            //             buildStage.buildAndroid(Config.codeProjects[mainProject], Config.settings)
            //         }
            //     }
            // }
        }
    }
}