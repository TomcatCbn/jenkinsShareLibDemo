// 该文件存放oneapp group的一些配置，当切换其他应用group的时候
// 只需要更换这里的配置

def config() {
    defaultSettings()
}

def keyRepoUrl = 'repoUrl'
def keyKey = 'key'
def keyPackages = 'packages'
def keyPackageName = 'packageName'
def keyRelativePath = 'relativePath'

def defaultSettings() {
//    def cp1 = new CodeProjectDo()
//    cp1.key = 'dssomobile-oneapp-basic-error'
//    cp1.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-error.git'
//    def cp1P = new DartPackageDo()
//    cp1P.packageName = 'basic_error'
//    cp1P.relativePath = '.'

//    cp1.packages = [cp1P]

    Config.codeProjects = [
            'dssomobile-oneapp-basic-error': [
                    key     : 'dssomobile-oneapp-basic-error',
                    repoUrl : 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-error.git',
                    packages: [
                            [packageName : 'basic_error',
                             relativePath: '.']

                    ]

            ],
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