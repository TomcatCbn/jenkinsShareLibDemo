// 该文件存放oneapp group的一些配置，当切换其他应用group的时候
// 只需要更换这里的配置

def config() {
    defaultSettings()
}

def defaultSettings() {

    Config.codeProjects = [
            'dssomobile-oneapp-basic-error': [
                    key     : 'dssomobile-oneapp-basic-error',
                    repoUrl : 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-error.git',
                    packages: [
                            [packageName : 'basic_error',
                             relativePath: '.']

                    ]

            ],

            'dssomobile-oneapp-app-main'   : [
                    key     : 'dssomobile-oneapp-app-main',
                    repoUrl : 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-main.git',
                    packages: [
                            [packageName : 'app_main',
                             relativePath: '.']

                    ]

            ],
    ]

    Config.settings = [
            defaultPackageDir: 'packages',
            dartPubHostedUrl : 'https://jfrog-prod.maezia.com/artifactory/api/pub/dssomobile-pub-virtual',
            dartTokenEnvVar: 'TOKEN_JFROG',
            dartPublishToUrl: 'https://jfrog-prod.maezia.com/artifactory/api/pub/dssomobile-pub-internal-local',
            gitCredentialsId: 'gitlab0',
    ]
}

/// oneapp group 所有工程
//file:noinspection GrPackage
def projectsGit = [
        // basic part
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-config.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-error.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-intl.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-logger.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-modular.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-network.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-platform.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-push.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-resource.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-storage.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-theme.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-upgrade.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-webview.git',

        // clr part
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-account.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-collector.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-geo.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-maintenance.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-media.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-message.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-mno.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-order.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-payment.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-setting.git',

        // ui part
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-ui-basic.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-ui-business.git',

        // app part
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-account.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-main.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-maintenance.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-media.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-order.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-setting.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-car-app.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-car-vehicle.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-car-services.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-car-connector.git',

        // kits
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-kit-dartlints.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-kit-dartsonarscanner.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-kit-debugtools.git',
        'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-kit-precommithooks.git',
]