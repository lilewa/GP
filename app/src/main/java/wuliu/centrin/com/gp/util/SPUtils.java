package wuliu.centrin.com.gp.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by lile on 2018/6/5.
 */

public class SPUtils {

    /**
     * android系统下用于数据存储的一个方便的API
     */

    public SPUtils(Context context) {
        // 完成sp的初始化。
    }

    public static void putStorage(Context context, String Key, String name, Boolean MD5) {
        SharedPreferences sp = context.getSharedPreferences("centrin", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        if (MD5) {
            editor.putString(Key, MD5Utils.encode(name));
        } else {
            editor.putString(Key, name);
        }
        // 把数据给保存到sp里面
        editor.commit();
    }

    public static String getStorage(Context context, String key) {

        return context.getSharedPreferences("centrin", context.MODE_PRIVATE).getString(key, null);

    }
}
