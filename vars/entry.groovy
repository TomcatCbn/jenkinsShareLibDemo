import com.dssomobile.jenkins.stages.CodeUpdateStage
import com.dssomobile.jenkins.stages.BuildStage

//import com.dssomobile.jenkins.stages.DeployStage

// jenkins pipeline入口
def call() {
    log.i('begin pipeline...')

    def codeUpdateStage = new CodeUpdateStage()
    def buildStage = new BuildStage()
//    def deployStage = new DeployStage()

    def branchName = 'develop'
    def credentialsId = 'gitlab0'
    def mainProject = 'dssomobile-oneapp-app-main'

    node {
        oneappBranchSettings.config()
    }

    pipeline {
        agent any
        stages {
            stage('codeUpdateStage') {
                steps {
                    script {
                        log.i("Stage: ${codeUpdateStage.name()} begin...")
                        codeUpdateStage.getCodeFromGit(Config.codeProjects.values(), Config.settings, branchName, credentialsId)
                    }
                }
            }

            stage('buildStage') {
                steps {
                    script {
                        log.i("Stage: ${buildStage.name()} begin...")
                        log.i("build package: ${Config.codeProjects.values()}")
//                        buildStage.buildAndroid(Config.codeProjects[mainProject])
                        buildStage.buildAndroid(Config.settings)
                    }
                }
            }
        }
    }
}