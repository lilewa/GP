package wuliu.centrin.com.gp.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.File;
import wuliu.centrin.com.gp.R;
/**
 * Created by lile on 2018/6/7.
 */

public class SharePreferenceUtil {
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private String name = "GLOBAL_SET";
    private Context context;

    /**
     * 类的构造方法.
     *
     * @param context
     */
    public SharePreferenceUtil(Context context) {
        this.context = context;
        sp = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        editor = sp.edit();
    }

    /**
     * 类的构造方法.
     *
     * @param context
     * @param name 文件名
     */
    public SharePreferenceUtil(Context context, String name) {
        sp = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        editor = sp.edit();
    }

    /**
     * 获取应用的Base路径.
     *
     * @return
     * @author yinxuejian
     * @update 2014年6月4日 下午3:16:17
     */
    public String getBasePath() {
        String basePath = getStoragePath() + context.getString(R.string.dir);
        return basePath;
    }

    /**
     * 获取应用的更新路径.
     *
     * @return
     * @author yinxuejian
     * @update 2014年6月4日 下午3:16:17
     */
    public String getUpdatePath() {
        String updatePath = getStoragePath() + context.getString(R.string.download);
        return updatePath;
    }

    /**
     * 获取应用的BitmapCache路径.
     *
     * @return
     * @author yinxuejian
     * @update 2014年6月4日 下午3:16:17
     */
    public String getBitmapCachePath() {
        String bitmapCachePath = getBasePath() + context.getString(R.string.bitmap_cache);
        File dirFile = new File(bitmapCachePath);
        if (!dirFile.exists()) {
            dirFile.mkdirs();
        }
        return bitmapCachePath;
    }

    /**
     * 功能:获取画板合成图片路径
     *
     * @return
     * @author yinxuejian
     */
    public String getCanvasBitmapPath() {
        String bitmapCachePath = getBasePath() + context.getString(R.string.canvas_bitmap);
        File dirFile = new File(bitmapCachePath);
        if (!dirFile.exists()) {
            dirFile.mkdirs();
        }
        return bitmapCachePath;
    }

    /**
     * 获取应用的拍照临时保存的路径.
     *
     * @return
     * @author yinxuejian
     * @update 2014年6月23日 下午4:35:07
     */
    public String getCameraTempPath() {
        String cameraTempPath = getBasePath() + context.getString(R.string.camera_temp);
        File dirFile = new File(cameraTempPath);
        if (!dirFile.exists()) {
            dirFile.mkdir();
        }
        return cameraTempPath;
    }

    /**
     * 存储卡路径 .
     *
     * @param value
     * @author yinxuejian
     * @update 2014年5月24日 下午5:04:20
     */
    public void setStoragePath(String value) {
        editor.putString(ConstantUtil.STORAGE_PATH, value);
        editor.commit();
    }

    public String getStoragePath() {
        return sp.getString(ConstantUtil.STORAGE_PATH, null);
    }

    public void setUserName(String value) {
        editor.putString("user_name", value);
        editor.commit();
    }

    public String getUserName() {
        return sp.getString("user_name", null);
    }

    /**
     * 是否第一次运行本应用. 默认是第一次登录
     *
     * @return
     * @author yinxuejian
     * @update 2014年5月24日 下午5:29:34
     */
    public boolean getisFirst() {
        return sp.getBoolean(ConstantUtil.IS_FIRST, true);
    }

    public void setIsFirst(boolean isFirst) {
        editor.putBoolean(ConstantUtil.IS_FIRST, isFirst);
        editor.commit();
    }

    /**
     * 功能:存贮临时图片
     *
     * @param imgPath
     * @author yinxuejian
     */
    public void setTempQuizImg(String imgPath) {
        editor.putString("quizimg", imgPath).commit();
    }

    public String getSigninDay() {
        return sp.getString("signinday", null);
    }

    public void setSigninDay(String day) {
        editor.putString("signinday", day).commit();
    }

}
