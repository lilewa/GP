package wuliu.centrin.com.gp.util;

import android.os.Environment;

/**
 * Created by lile on 2018/6/5.
 */

public class ConstantUtil {

    /**
     * 应用根路径
     */
    public static final String ROOT_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/rf/";
    /**
     * 应用缓存路径
     */
    public static final String CACHE_PATH = ROOT_PATH + "cache";
    /**
     * 应用图片途径
     */
    public static final String IMAGE_PATH = ROOT_PATH + "image";
    /**
     * 联系人头像途径
     */
    public static final String CONTACT_LOGO_PATH = ROOT_PATH + "logo";
    /**
     * 用户id
     */
    public static final String USER_ID = "user_id";
    /**
     * 数据库Key
     */
    public static final String DFT_DATABASE="rf_database.db";
    /**
     * MOb网站key值(API)
     */
    public static final String MOB_API_KEY="151287b074320";
    /**
     * 是否第一次运行
     **/
    public static final String IS_FIRST = "1.0.0_is_first";
    /**
     * 编码格式
     */
    public static final String ENCODING = "UTF-8";
    /**
     * 存储路径
     */
    public static final String STORAGE_PATH = "storagepath";
    /**
     * 当前版本号
     */
    public static final String CURRENT_VERSION_CODE = "1";
    /**
     * 退出登录
     */
    public static final String EXIT_APP = "exit_app";
    /**
     * 默认用这个方法加载图片
     */
    public static int IMAGE_SMALL = 1;
    public static String IMAGES_PATH = "/comboyahcampuseek/images";
    /**
     * 注册 参数 phone 参数 手机号
     */
    public static String USERID = "userid";
    /**
     * 网址头
     */
    public static String BASE_URL = "http://192.168.80.254/jiekou/index.php?";
    /**
     * 默认SharedPreferences存储文件名
     */
    public static String FILENAME_SP="Goods";
    /**
     * 默认SharedPreferences的POS机信息
     */
    public static String POSINFO_SP="posInfo";
    /*************************** 支付宝支付 ************************************/
    /**
     * 商户PID
     */
    public static final String PARTNER = "2088021615328422";
    /**
     * 商户收款账号
     */
    public static final String SELLER = "3163765643@qq.com";
    /**
     * 商户私钥，pkcs8格式
     */
    public static final String RSA_PRIVATE =
            "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBALYAkFVPnGTE/qTu"
                    + "MgN9OrdGbIUpLSPEYnUA+YHMbD2YFZUasDBJFHqTrVA4BMWdsikWFOGyYd+B3dKO"
                    + "tF4kKTRYiNrHYUW1hzlPnIUVPfJx/OshGBDVDLoMD8Q7hcWl4eCFM8eHtbNld9wI"
                    + "40yZQTIB/KdzxFC1JgLESpM+pMjfAgMBAAECgYBDK2QZSB9lBVshjZNBvGb+GuyU"
                    + "HIU/TQw1OF3dLI/KD6XveIEL4PzA3F27XGFOeYu2JCMixM3gSjKOsgIZOGlH+25y"
                    + "9zFIme9sHdX/8aC0CBpyH5lOc02/dXZAcez4U8q+vhFGC34fc3lzOcSntyzGaHmN"
                    + "w2q4nytlR1Gxb45HCQJBAOu+PeelQL9U1GuDEJ+yOtFuQJlGjUETeQ6800/qIkc+"
                    + "mTMciyipHt4dNkXskHd7G8E2SZBO4L1UKk/dPZh9WR0CQQDFpCf8YhvaXukjSS5w"
                    + "JBdMvx5B9/9isQehrbDlB+FM4yi+se7rKTYG1MrV8UocM4gtvrDQ5kZtHRV3EszI"
                    + "OkUrAkEA5vsGwrJbB10BqLnJjv9dvBgvuT60Zl/DDFqdHT8GCRJfnwHHo7ZZJT4w"
                    + "EEEip776ycv8NiXi8/7EWm4mzQN8TQJBAJfeXxdxcAOpwK3rkvJ62SiRBzgbz7NP"
                    + "YxTaeb5UAszpFKsL4RH0ld5D7yTch10KQA8eo5GyENXRbmgUGyWUmQcCQQCl4hC0"
                    + "Aezba3fPDhrYj1d1pe0HWP1QJdVc1twUMIBeVyji2tGd8g9q/bBEKMpIp4Hqwony"
                    + "GusVP0XvbsLpI2e9";
    /**
     * 支付宝公钥
     */
    public static final String RSA_PUBLIC =
            "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFl"
                    + "jhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/"
                    + "VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG"
                    + "9zpgmLCUYuLkxpLQIDAQAB";
    /*************************** 微信支付 ************************************/
    /**
     *  APP_ID 替换为你的应用从官方网站申请到的合法appId
     */
    public static final String APP_ID = "wx6288f56f5910a72b";

}
