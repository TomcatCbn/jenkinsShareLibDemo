import com.dssomobile.jenkins.stages.CodeUpdateStage
//import com.dssomobile.jenkins.stages.BuildStage
//import com.dssomobile.jenkins.stages.DeployStage

def call() {

    def codeUpdateStage = new CodeUpdateStage()
//    def buildStage = new BuildStage()
//    def deployStage = new DeployStage()

    def branchName = 'develop'
    def credentialsId = 'gitlab0'

    node {
        OneappBranchSettings.config()
    }

    pipeline {
        agent any
        stages {
            stage('codeUpdateStage') {
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