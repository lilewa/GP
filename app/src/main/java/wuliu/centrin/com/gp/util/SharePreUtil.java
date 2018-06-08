package wuliu.centrin.com.gp.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by lile on 2018/6/5.
 */

public class SharePreUtil {

    private Context context;
    private SharedPreferences sp = null;
    private SharedPreferences.Editor edit = null;

    /**
     * Create DefaultSharedPreferences
     *
     * @param context
     */
    public SharePreUtil(Context context) {
        this(context, PreferenceManager.getDefaultSharedPreferences(context));
    }

    /**
     * Create SharedPreferences by filename
     *
     * @param context
     * @param filename
     */
    public SharePreUtil(Context context, String filename) {
        this(context, context.getSharedPreferences(filename, Context.MODE_PRIVATE));
    }

    /**
     * Create SharedPreferences by SharedPreferences
     *
     * @param context
     * @param sp
     */
    public SharePreUtil(Context context, SharedPreferences sp) {
        this.context = context;
        this.sp = sp;
        edit = sp.edit();
    }

    /**
     * set方式
     */
    // Boolean
    public void setValue(String key, boolean value) {
        edit.putBoolean(key, value);
        edit.commit();
    }

    public void setValue(int resKey, boolean value) {
        setValue(this.context.getString(resKey), value);
    }

    // Float
    public void setValue(String key, float value) {
        edit.putFloat(key, value);
        edit.commit();
    }

    public void setValue(int resKey, float value) {
        setValue(this.context.getString(resKey), value);
    }

    // Integer
    public void setValue(String key, int value) {
        edit.putInt(key, value);
        edit.commit();
    }

    public void setValue(int resKey, int value) {
        setValue(this.context.getString(resKey), value);
    }

    // Long
    public void setValue(String key, long value) {
        edit.putLong(key, value);
        edit.commit();
    }

    public void setValue(int resKey, long value) {
        setValue(this.context.getString(resKey), value);
    }

    // String
    public void setValue(String key, String value) {
        edit.putString(key, value);
        edit.commit();
    }

    public void setValue(int resKey, String value) {
        setValue(this.context.getString(resKey), value);
    }

    /**
     * Get方式
     */
    // Boolean
    public boolean getValue(String key, boolean defaultValue) {
        return sp.getBoolean(key, defaultValue);
    }

    public boolean getValue(int resKey, boolean defaultValue) {
        return getValue(this.context.getString(resKey), defaultValue);
    }

    // Float
    public float getValue(String key, float defaultValue) {
        return sp.getFloat(key, defaultValue);
    }

    public float getValue(int resKey, float defaultValue) {
        return getValue(this.context.getString(resKey), defaultValue);
    }

    // Integer
    public int getValue(String key, int defaultValue) {
        return sp.getInt(key, defaultValue);
    }

    public int getValue(int resKey, int defaultValue) {
        return getValue(this.context.getString(resKey), defaultValue);
    }

    // Long
    public long getValue(String key, long defaultValue) {
        return sp.getLong(key, defaultValue);
    }

    public long getValue(int resKey, long defaultValue) {
        return getValue(this.context.getString(resKey), defaultValue);
    }

    // String
    public String getValue(String key, String defaultValue) {
        return sp.getString(key, defaultValue);
    }

    public String getValue(int resKey, String defaultValue) {
        return getValue(this.context.getString(resKey), defaultValue);
    }

    /**
     * Delete
     */
    public void remove(String key) {
        edit.remove(key);
        edit.commit();
    }

    public void clear() {
        edit.clear();
        edit.commit();
    }
}
