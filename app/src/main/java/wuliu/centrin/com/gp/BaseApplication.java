package wuliu.centrin.com.gp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;

import java.util.LinkedList;
import java.util.List;

import wuliu.centrin.com.gp.entity.UserEntity;
import wuliu.centrin.com.gp.util.ConstantUtil;
import wuliu.centrin.com.gp.util.SPUtils;
import wuliu.centrin.com.gp.view.MyUncaughtException;
import wuliu.centrin.com.gp.view.XsDialog;

/**
 * Created by lile on 2018/6/4.
 */

public class BaseApplication extends Application {

    private static BaseApplication application;

    /**
     * 用户个人信息实体类
     */
    public static UserEntity entity_user;

    public static String store_house;
    /**
     * 货区编号全局变量（仅限盘点模块）
     */
    public static String goods_area;
    /**
     * 当前渠道
     */
    public static String CHANNEL_STR = "BOYAH";
    /**
     * 获取全局的上下文
     */
    public static Context context;

    /**
     * 是否已经登录
     */
    public static int is_login=0;
    /**
     * 当前用户名
     */
    public static String userid = null;
    /**
     * xutils网络请求类
     */

    public static HttpUtils utils;

    /**
     * Gson解析类
     */
    public static Gson gson;

    /**
     * 用于存放所有的Activity
     */
    private List<Activity> mList = new LinkedList<Activity>();

    /**
     * 退出所有activity
     */
    public void exit() {
        try {
            for (Activity activity : mList) {
                if (activity != null)
                    activity.finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

    public synchronized static BaseApplication getInstance() {
        if (null == application) {
            application = new BaseApplication();
        }
        return application;
    }



    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        context = getApplicationContext();
        utils = new HttpUtils(10000);
        gson=new Gson();
        //在Appliction里面设置我们的异常处理器为UncaughtExceptionHandler处理器
        MyUncaughtException handler = MyUncaughtException.getInstance();
        handler.init(application);
        //初始化userid
       initUserid();
    }

    /**
     * 初始化userid
     */
    private void initUserid() {
        String myid = SPUtils.getStorage(application, ConstantUtil.USERID);
        if (myid != null) {
            this.userid = myid;
        }
    }

    /**
     * 未登录提示框
     */
    public static void showLogin(final Context context) {
        final XsDialog noticeDialog = new XsDialog(context, "系统提示:", "亲,请先登录!", true, true, true);
        noticeDialog.setBtnOklistener(new XsDialog.BtnOKListener() {
            @Override
            public void clickOk() {
                //当点击  登录  注册
                context.startActivity(new Intent(context, MainActivity.class));
            }
        });
        noticeDialog.setBtnCancelListener(new XsDialog.BtnCancelListener() {
            @Override
            public void clickCancel() {
            }
        });
        noticeDialog.show();
    }

    /**
     * 添加Activity
     * @param activity
     */
    public void addActivity(Activity activity) {
        mList.add(activity);
    }


}
