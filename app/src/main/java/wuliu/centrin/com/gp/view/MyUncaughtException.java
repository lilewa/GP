package wuliu.centrin.com.gp.view;

import android.content.Context;
import android.os.Looper;
import wuliu.centrin.com.gp.BaseApplication;
import wuliu.centrin.com.gp.util.LogUtil;
import wuliu.centrin.com.gp.util.ToastUtils;

/**
 * Created by lile on 2018/6/4.
 */

public class MyUncaughtException implements Thread.UncaughtExceptionHandler {

    //程序的 Context 对象
    private Context mContext;
    //单例引用，这里我们做成单例的，因为我们一个应用程序里面只需要一个UncaughtExceptionHandler实例
    private static MyUncaughtException instance;
    //系统默认的UncaughtException处理类
    private Thread.UncaughtExceptionHandler mDefaultHandler;

    private MyUncaughtException() {
    }

    public synchronized static MyUncaughtException getInstance() {  //同步方法，以免单例多线程环境下出现异常
        if (instance == null) {
            instance = new MyUncaughtException();
        }
        return instance;
    }

    public void init(Context ctx) {
        mContext = ctx;
        //获取系统默认的UncaughtException处理器
        mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        //初始化，把当前对象设置成UncaughtExceptionHandler处理器
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {  //当有未处理的异常发生时，就会来到这里。。
        LogUtil.i("TAG", "uncaughtException, thread: " + thread+"\n"+
                " name: " + thread.getName() +"\n"+
                " id: " + thread.getId() +"\n"+
                "exception: "+ ex);
        if (!handleException(ex) && mDefaultHandler != null) {
            //如果用户没有处理则让系统默认的异常处理器来处理
            mDefaultHandler.uncaughtException(thread, ex);
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                LogUtil.i("TAG", "error : " + e);
            }
            //退出所有activity
            BaseApplication.getInstance().exit();
            //退出程序
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0);
        }
    }

    /**
     * 自定义错误处理,收集错误信息 发送错误报告等操作均在此完成.
     *
     * @param ex
     * @return true:如果处理了该异常信息;否则返回false.
     */
    private boolean handleException(Throwable ex) {
        if (ex == null) {
            return false;
        }
        //使用Toast来显示异常信息
        new Thread() {
            @Override
            public void run() {
                Looper.prepare();
                ToastUtils.showShort(mContext, "很抱歉,程序出现异常,即将退出！");
                Looper.loop();
            }
        }.start();
        //收集设备参数信息
        //collectDeviceInfo(mContext);
        //保存日志文件
        //saveCrashInfo2File(ex);
        return true;
    }
}
