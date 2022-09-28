// dart token pub add

def call(String repositoryUrl, String tokenEnvVar){
    echo "TOKEN_FOR_JFROG=$TOKEN_FOR_JFROG"
    echo "TOKEN_JFROG=$TOKEN_JFROG"
    sh "dart pub token add $repositoryUrl --env-var $tokenEnvVar"
}