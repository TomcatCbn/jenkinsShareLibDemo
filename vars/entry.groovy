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
    def mainProject = 'dssomobile-oneapp-app-main'

    node {
        oneappBranchSettings.config()
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

            stage('buildStage') {
                steps {
                    script {
                        log.i("Stage: ${buildStage.name()} begin...")
                        buildStage.buildAndroid(Config.codeProjects[mainProject], Config.settings)
                    }
                }
            }
        }
    }
}