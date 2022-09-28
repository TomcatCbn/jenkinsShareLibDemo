// dart token pub add

def call(String repositoryUrl, String tokenEnvVar){
    sh "dart pub token add $repositoryUrl --env-var $tokenEnvVar"
}