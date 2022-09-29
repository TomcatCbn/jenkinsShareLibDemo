import com.dssomobile.jenkins.models.SettingsDo

def name() {
    return 'Environment Prepare Stage'
}

def prepareEnvironment(SettingsDo settingsDo) {
    dartToken(settingsDo.dartPubHostedUrl, settingsDo.dartTokenEnvVar)
    // install tools_jenkins
    sh 'dart pub global activate tools_jenkins'
    sh 'dssomobile --version'
}