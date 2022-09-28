import com.dssomobile.jenkins.stage.CodeUpdateStage
//import com.dssomobile.jenkins.stage.BuildStage
//import com.dssomobile.jenkins.stage.DeployStage

def call() {

    def codeUpdateStage = new CodeUpdateStage()
    def buildStage = new BuildStage()
    def deployStage = new DeployStage()

    def branchName = 'develop'
    def credentialsId = 'gitlab0'

    node {
        OneappBranchSettings.config()
    }

    pipeline {
        agent any
        stages {
            stage(codeUpdateStage.name()) {
                steps {
                    script {
                        log("Stage: ${codeUpdateStage.name()} begin...")
                        codeUpdateStage.getCodeFromGit(Config.codeProjects.values(), branchName, credentialsId)
                    }
                }
            }
        }
    }
}