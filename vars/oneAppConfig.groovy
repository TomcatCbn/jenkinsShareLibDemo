// 该文件存放oneapp group的一些配置，当切换其他应用group的时候
// 只需要更换这里的配置
import com.dssomobile.jenkins.models.CodeProjectDo
import com.dssomobile.jenkins.models.DartPackageDo

def config() {
        defaultSettings()
}

def defaultSettings() {
        Config.codeProjects = [
            'dssomobile-oneapp-basic-error': basic_error(),

            'dssomobile-oneapp-app-main'   : app_main(),
    ]

        Config.settings = [
            defaultPackageDir: 'packages',
            dartPubHostedUrl : 'https://jfrog-prod.maezia.com/artifactory/api/pub/dssomobile-pub-virtual',
            dartTokenEnvVar: 'TOKEN_JFROG',
            dartPublishToUrl: 'https://jfrog-prod.maezia.com/artifactory/api/pub/dssomobile-pub-internal-local',
            gitCredentialsId: 'gitlab0',
    ]
}

def app_main() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-app-main'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-main.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'app_main'
        cp.packages = [pack1]

        return cp
}

def app_account() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-app-account'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-account.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'app_account'
        cp.packages = [pack1]

        return cp
}

def app_maintenance() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-app-maintenance'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-maintenance.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = 'app_maintenance'
        pack1.packageName = 'app_maintenance'
        cp.packages = [pack1]

        return cp
}

def app_media() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-app-media'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-media.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'app_media'
        cp.packages = [pack1]

        return cp
}

def app_order() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-app-order'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-order.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'app_order'
        cp.packages = [pack1]

        return cp
}

def app_setting() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-app-setting'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-app-setting.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'app_setting'
        cp.packages = [pack1]

        return cp
}

def car_app() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-car-app'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-car-app.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'app_car'
        cp.packages = [pack1]

        return cp
}

def car_vehicle() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-car-vehicle'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-car-vehicle.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'vehicle'
        cp.packages = [pack1]

        return cp
}

def car_services() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-car-services'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-car-services.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'services'
        cp.packages = [pack1]

        return cp
}

def car_connector() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-car-connector'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-car-connector.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'connector'
        cp.packages = [pack1]

        return cp
}

def ui_basic() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-ui-basic'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-ui-basic.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'ui_basic'

        def pack2 = new DartPackageDo()
        pack2.relativePath = 'packages/ui_basic_annotation'
        pack2.packageName = 'ui_basic_annotation'
        cp.packages = [pack1, pack2]

        return cp
}

def ui_business() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-ui-business'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-ui-business.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'ui_business'
        cp.packages = [pack1]

        return cp
}

def clr_setting() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-clr-setting'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-setting.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'clr_setting'
        cp.packages = [pack1]

        return cp
}

def clr_payment() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-clr-payment'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-payment.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'clr_payment'
        cp.packages = [pack1]

        return cp
}

def clr_order() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-clr-order'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-order.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'clr_order'
        cp.packages = [pack1]

        return cp
}

def clr_media() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-clr-media'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-media.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'clr_media'
        cp.packages = [pack1]

        return cp
}

def clr_maintenance() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-clr-maintenance'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-maintenance.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = 'clr_maintenance'
        pack1.packageName = 'clr_maintenance'
        cp.packages = [pack1]

        return cp
}

def clr_geo() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-clr-geo'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-geo.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = 'clr_geo'
        pack1.packageName = 'clr_geo'
        cp.packages = [pack1]

        return cp
}

def clr_account() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-clr-account'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-clr-account.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'clr_account'
        cp.packages = [pack1]

        return cp
}

def basic_webview() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-webview'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-webview.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = 'basic_webview'
        pack1.packageName = 'basic_webview'
        cp.packages = [pack1]

        return cp
}

def basic_theme() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-theme'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-theme.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = 'basic_theme'
        pack1.packageName = 'basic_theme'
        cp.packages = [pack1]

        return cp
}

def basic_storage() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-storage'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-storage.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = 'basic-storage'
        pack1.packageName = 'basic_storage'
        def pack2 = new DartPackageDo()
        pack2.relativePath = 'basic-storage-generator'
        pack2.packageName = 'basic_storage_generator'
        cp.packages = [pack1, pack2]

        return cp
}

def basic_resource() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-resource'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-resource.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'basic_resource'

        def pack2 = new DartPackageDo()
        pack2.relativePath = 'packages/clr_obs_access'
        pack2.packageName = 'clr_obs_access'

        def pack3 = new DartPackageDo()
        pack3.relativePath = 'packages/ui_resource'
        pack3.packageName = 'ui_resource'

        cp.packages = [pack1, pack2, pack3]

        return cp
}

def basic_push() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-push'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-push.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'basic_push'
        cp.packages = [pack1]

        return cp
}

def basic_platform() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-platform'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-platform.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'basic_platform'

        def pack2 = new DartPackageDo()
        pack2.relativePath = 'packages/permission_annotation_generator'
        pack2.packageName = 'permission_annotation_generator'

        cp.packages = [pack1, pack2]

        return cp
}

def basic_network() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-network'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-network.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'basic_network'
        cp.packages = [pack1]

        return cp
}

def basic_modular() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-modular'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-modular.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'basic_modular'

        def pack2 = new DartPackageDo()
        pack2.relativePath = 'packages/basic_modular_generator'
        pack2.packageName = 'basic_modular_generator'

        def pack3 = new DartPackageDo()
        pack3.relativePath = 'packages/basic_modular_route'
        pack3.packageName = 'basic_modular_route'

        cp.packages = [pack1, pack2, pack3]

        return cp
}

def basic_logger() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-logger'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-logger.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'basic_logger'
        cp.packages = [pack1]

        return cp
}

def basic_intl() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-intl'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-intl.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = 'intl'
        pack1.packageName = 'basic_intl'

        def pack2 = new DartPackageDo()
        pack2.relativePath = 'intl_localizely'
        pack2.packageName = 'basic_intl_localizely'

        def pack3 = new DartPackageDo()
        pack3.relativePath = 'intl_flutter'
        pack3.packageName = 'basic_intl_flutter'

        def pack4 = new DartPackageDo()
        pack4.relativePath = 'intl_utils'
        pack4.packageName = 'basic_intl_utils'

        cp.packages = [pack1, pack2, pack3, pack4]

        return cp
}

def basic_error() {
        def cp = new CodeProjectDo()
        cp.key = 'dssomobile-oneapp-basic-error'
        cp.repoUrl = 'https://gitlab-rd0.maezia.com/dssomobile/oneapp/dssomobile-oneapp-basic-error.git'

        def pack1 = new DartPackageDo()
        pack1.relativePath = '.'
        pack1.packageName = 'basic_error'
        cp.packages = [pack1]

        return cp
}
