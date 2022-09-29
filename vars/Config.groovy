import com.dssomobile.jenkins.models.CodeProjectDo
import com.dssomobile.jenkins.models.SettingsDo
import  com.dssomobile.jenkins.models.DynamicDataDo

/**
 * pipeline中全局配置汇总，外部注入
 */
class Config implements Serializable {
    // 当前所有工程信息
    static Map<String, CodeProjectDo> codeProjects = [:]

    // pipeline的一些全局设置
    static SettingsDo settings = new SettingsDo()

    // 动态的，stage之间传递的一些数据
    static DynamicDataDo dynamicData = new DynamicDataDo()
}