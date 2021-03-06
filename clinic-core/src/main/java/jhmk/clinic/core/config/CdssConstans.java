package jhmk.clinic.core.config;

public class CdssConstans {


    public static final String BINGANSHOUYE = "binganshouye";
    public static final String ZHUANKEJILU = "zhuankejilu";
    public static final String BINGLIZHENDUAN = "binglizhenduan";
    public static final String SHOUCIBINGCHENGJILU = "shoucibingchengjilu";
    public static final String SHOUYEZHENDUAN = "shouyezhenduan";
    public static final String RUYUANJILU = "ruyuanjilu";
    public static final String SJYSCFL = "shangjiyishichafanglu";
    public static final String JCBG = "jianchabaogao";
    public static final String JYBG = "jianyanbaogao";
    public static final String YIZHU = "yizhu";
    public static final String CHUYUANJILU = "chuyuanjilu";
    public static final String ZHUYUANFEIYONG = "zhuyuanfeiyong";


    public static final String MENZHENSHUJU = "menzhenshuju";
    public static final String MENZHENZHENDUAN = "menzhenzhenduan";
    public static final String mzjzjl = "menzhenjiuzhenjilu";


    //mongo数据库配置
    public static final int PORT = 20000;


    public static final String CDSSDATASOURCE = "cdss";
    public static final String DECISION_RULE = "decision_rule";

//        public static final String URL = "http://localhost:8111/warn/rule/ruleMatch";
    //    public static final String URLFORRULE = "http://192.168.132:8111/warn/match/ruleMatch";
//    public static final String URLFORRULE = "http://192.168.8.22:8111/warn/match/ruleMatch";


    //3院服务器
//    public static final String DATASOURCE = "BJDXDSYY_ETL_V20180204";
//    public static final String HOST = "192.168.132.4";
//    public static final String URL = "http://192.168.132.7:8111/warn/rule/ruleMatch";
//    public static final String URLFORRULE = "http://192.168.132.7:8111/warn/match/ruleMatch";


    //朝阳服务器
//    public static final String HOST = "172.16.19.212";
//    public static final String URL = "http://192.168.132.7:8111/warn/rule/ruleMatch";
//    public static final String URLFORRULE = "http://192.168.132.7:8111/warn/match/ruleMatch";

    //        数据库
//    public static final String DATASOURCE = "bysyalldata";
    public static final String DATASOURCE = "bysyalldept";
    public static final String HOST = "192.168.8.22";
    public static final String URL = "http://192.168.8.22:8111/warn/rule/ruleMatch";
    public static final String URLFORRULE = "http://localhost:8111/warn/match/ruleMatch";


//    private static final String head = "http://192.168.8.20:8010";
    private static final String head = "http://192.168.8.20:8010";
    private static final String ESHEAD = "http://192.168.132.13:8805";
//    private static final String ESHEAD = "http://192.168.8.31:8877";
    public static final String QUERY = ESHEAD+"/med/cdss/query.json";
//    private static final String head = "http://192.168.132.7:8010";

    //获取疾病同义词
    public static final String getSamilarWord = head + "/med/cdss/getSamilarWord.json";

    //获取疾病子节点
    public static final String getDiseaseChildrenList = head + "/med/cdss/getDiseaseChildrenList.json";
    //获取疾病父节点
    public static final String getParentList = head + "/med/cdss/getParentList.json";

    public static final int BEGINCOUNT = 0;
//    public static final int ENDCOUNT = 800;
    public static final int ENDCOUNT = 30000;


    //es查询
    public static final String patients="http://192.168.8.31:8833/med/advanced/allVariableJilian.json";
//    public static final String patients="http://192.168.132.13:8800/med/advanced/allVariableJilian.json";


    static final public String DEVURL = "/data/1/CDSS/data/";
    public String LOCALURL = "";

}
