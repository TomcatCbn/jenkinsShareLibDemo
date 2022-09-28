import com.dssomobile.jenkins.stages.CodeUpdateStage
//import com.dssomobile.jenkins.stages.BuildStage
//import com.dssomobile.jenkins.stages.DeployStage

def call() {
    log.i('begin pipeline...')

    def codeUpdateStage = new CodeUpdateStage()
//    def buildStage = new BuildStage()
//    def deployStage = new DeployStage()

    def branchName = 'develop'
    def credentialsId = 'gitlab0'

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
                        codeUpdateStage.getCodeFromGit(Config.codeProjects.values(), branchName, credentialsId)
                    }
                }
            }
        }
    }
}