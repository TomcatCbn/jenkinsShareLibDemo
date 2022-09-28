// dart token pub add

def call(String repositoryUrl, String tokenEnvVar){
    echo "$TOKEN_FOR_JFROG"
    sh "dart pub token add $repositoryUrl --env-var $tokenEnvVar"
}