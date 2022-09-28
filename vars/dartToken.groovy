// dart token pub add

def call(String repositoryUrl, String tokenEnvVar){
    echo "jenkins env ${env.TOKEN_JFROG}"
    sh "dart pub token add $repositoryUrl --env-var $tokenEnvVar"
}