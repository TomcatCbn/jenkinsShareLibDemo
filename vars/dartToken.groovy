// dart token pub add

def call(String repositoryUrl, String tokenEnvVar){
    sh "export TOKEN_FOR_DART=${env.TOKEN_JFROG} && dart pub token add $repositoryUrl --env-var TOKEN_FOR_DART"
//    sh "dart pub token add $repositoryUrl --env-var $tokenEnvVar"
//    sh "dart pub token add $repositoryUrl --env-var TOKEN_FOR_DART"
}