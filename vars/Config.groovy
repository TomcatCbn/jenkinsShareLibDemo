import com.dssomobile.jenkins.models.CodeProjectDo
//import com.dssomobile.jenkins.models.SettingsDo

class Config implements Serializable {
    // 当前选中的工程信息
    static Map<String, CodeProjectDo> codeProjects = [:]

    // pipeline的一些全局配置
    static SettingsDo settings = new SettingsDo()
}