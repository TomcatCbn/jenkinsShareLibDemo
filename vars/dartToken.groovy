// dart token pub add

// 给[repositoryUrl]用环境变量[tokenEnvVar]进行授权
def call(String repositoryUrl, String tokenEnvVar){
    // 先移除，再添加
    sh "dart pub token remove $repositoryUrl || true"
    sh "dart pub token add $repositoryUrl --env-var $tokenEnvVar"
}