package wuliu.centrin.com.gp.util;

import android.util.Log;

/**
 * Created by lile on 2018/6/4.
 */

public class LogUtil {

    // 是否打印日志
    public static boolean isDebug = true;

    /**
     * 黑色
     * @param tag
     * @param msg
     */
    public static void v(String tag, String msg) {
        if (isDebug) {
            if (msg == null || tag == null)
                return;
            Log.v(tag, msg);
        }
    }

    /**
     * 绿色
     * @param tag
     * @param msg
     */
    public static void i(String tag, String msg) {
        if (isDebug) {
            if (msg == null || tag == null)
                return;
            Log.i(tag, msg);
        }
    }

    /**
     * 黑色
     * @param tag
     * @param msg
     */
    public static void d(String tag, String msg) {
        if (isDebug) {
            if (msg == null || tag == null)
                return;
            Log.d(tag, msg);
        }
    }

    /**
     * 橙色
     * @param tag
     * @param msg
     */
    public static void w(String tag, String msg) {
        if (isDebug) {
            if (msg == null || tag == null)
                return;
            Log.w(tag, msg);
        }
    }

    /**
     * 红色
     * @param tag
     * @param msg
     */
    public static void e(String tag, String msg) {
        if (isDebug) {
            if (msg == null || tag == null)
                return;
            Log.e(tag, msg);
        }
    }

    public static void e(String tag, String msg, Throwable e) {
        if (isDebug) {
            if (msg == null || tag == null)
                return;
            Log.e(tag, msg, e);
        }
    }

    public static void print(String tag, String msg) {
        if (isDebug) {
            if (msg == null || tag == null)
                return;
            System.out.println(tag + "==" + msg);
        }
    }

    /**
     * 设置debug 模式
     *
     * @param isDebug
     *            true 打印日志 false：不打印
     */
    public static void setiSDebug(boolean isDebug) {
        LogUtil.isDebug = isDebug;
    }
}
