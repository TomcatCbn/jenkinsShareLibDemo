// 该entry用于构建应用，支持以下操作
// 1.按照指定分支或Tag构建
// 2.构建android渠道
// 3.发布应用

import com.dssomobile.jenkins.stages.BuildStage
import com.dssomobile.jenkins.stages.CodeUpdateStage
import com.dssomobile.jenkins.stages.EnvironmentPrepareStage
import com.dssomobile.jenkins.stages.FetchLocalDepsStage

// jenkins pipeline入口
def call(String appProjectKey, String branchName) {
    log.i("begin pipeline...entryForBuildApp, app = $appProjectKey")

    def codeUpdateStage = new CodeUpdateStage()
    def buildStage = new BuildStage()
    def environmentStage = new EnvironmentPrepareStage()
    def fetchLocalDepsStage = new FetchLocalDepsStage()

    pipeline {
        agent any
        environment {
            TOKEN_JFROG = "${env.TOKEN_JFROG}"
        }
        stages {

            stage('environmentPrepareStage') {
                steps {
                    script {
                        log.i("Stage: ${environmentStage.name()} begin...")
                        environmentStage.prepareEnvironment(Config.settings)
                    }
                }
            }

            stage('codeUpdateStageForMain') {
                steps {
                    script {
                        log.i("Stage: ${codeUpdateStage.name()} begin...")
                        codeUpdateStage.getCodeFromGit([Config.codeProjects[appProjectKey]], Config.settings, branchName)
                    }
                }
            }

            stage('fetchLocalDepsStage') {
                steps {
                    script {
                        log.i("Stage: ${fetchLocalDepsStage.name()} begin...")
                        fetchLocalDepsStage.fetchLocalDeps(Config.codeProjects[appProjectKey])
                    }
                }
            }

            stage('codeUpdateStageForLocalDeps') {
                steps {
                    script {
                        log.i("Stage: ${codeUpdateStage.name()} begin...")
                        log.i("local dependency is \n${Config.dynamicData.selectedProject.collect { "${it.key}" }.join("\n")}")
                        codeUpdateStage.getCodeFromGit(Config.dynamicData.selectedProject, Config.settings, branchName)
                    }
                }
            }

            stage('buildStage') {
                steps {
                    script {
                        log.i("Stage: ${buildStage.name()} begin...")
                        buildStage.buildAndroid(Config.codeProjects[appProjectKey], Config.settings)
                    }
                }
            }
        }
    }
}