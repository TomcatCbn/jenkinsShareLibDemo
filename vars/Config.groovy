import com.dssomobile.jenkins.models.CodeProjectDo
import com.dssomobile.jenkins.models.SettingsDo

// pipeline中全局配置汇总，外部注入
class Config implements Serializable {
    // 当前选中的工程信息
    static Map<String, CodeProjectDo> codeProjects = [:]

    // pipeline的一些全局设置
    static SettingsDo settings = new SettingsDo()
}