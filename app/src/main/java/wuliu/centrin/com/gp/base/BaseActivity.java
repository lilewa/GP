package wuliu.centrin.com.gp.base;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.Toast;

import com.mob.tools.utils.UIHandler;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.tencent.qq.QQClientNotExistException;
import cn.sharesdk.wechat.utils.WechatClientNotExistException;
import wuliu.centrin.com.gp.BaseApplication;
import wuliu.centrin.com.gp.util.ConstantUtil;
import wuliu.centrin.com.gp.util.SharePreferenceUtil;


import java.util.HashMap;

/**
 * Created by lile on 2018/6/5.
 */

public class BaseActivity extends AppCompatActivity implements PlatformActionListener,  Handler.Callback  {

    protected static final int COUNTING_MAX = 60;
    private boolean doAnimi = false;
    protected Handler refreshUi = new Handler();
    protected Activity mContext = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initConfig();
        initBaseView();
        initCustomView(savedInstanceState);
        initCustomData();
        registerBroadcast();
        BaseApplication.getInstance().addActivity(this);
    }
    public void initConfig() {
        path_root = ConstantUtil.BASE_URL;
        //    requestWindowFeature(Window.FEATURE_NO_TITLE);
        mApplication = (BaseApplication) getApplication();
        mInflater = LayoutInflater.from(this);
        mResources = mContext.getResources();
        spUtil = new SharePreferenceUtil(this);
    }

    @Override
    public void onCancel(Platform arg0, int action) {
        Message msg = new Message();
        msg.arg1 = 3;
        msg.arg2 = action;
        msg.obj = arg0;
        UIHandler.sendMessage(msg, this);
    }

    @Override
    public void onComplete(Platform arg0, int action, HashMap<String, Object> arg2) {
        Message msg = new Message();
        msg.arg1 = 1;
        msg.arg2 = action;
        msg.obj = arg0;
        UIHandler.sendMessage(msg, this);
    }

    @Override
    public void onError(Platform arg0, int action, Throwable arg2) {
        Message msg = new Message();
        msg.arg1 = 2;
        msg.arg2 = action;
        msg.obj = arg2;
        UIHandler.sendMessage(msg, this);
    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.arg1) {
            case 1:// 成功
                showToast("分享成功!");
                break;
            case 2:// 失败
                if (msg.obj instanceof WechatClientNotExistException) {
                    Toast.makeText(mContext, "目前您的微信版本过低或未安装微信，需要安装微信才能使用", Toast.LENGTH_SHORT).show();
                } else if (msg.obj instanceof QQClientNotExistException) {
                    Toast.makeText(mContext, "版本过低或者没有安装，需要升级或安装QQ才能使用", Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(mContext, "分享失败!", Toast.LENGTH_SHORT);
                }

                break;
            case 3:
                break;
        }

        return false;
    }

    /**
     * 显示提示
     *
     * @param msg 要显示的提示文字
     */
    protected void showToast(final String msg) {
        refreshUi.post(new Runnable() {

            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 显示提示
     *
     * @param msgRid 要显示的提示文字资源ID
     */
    protected void showToast(final int msgRid) {
        refreshUi.post(new Runnable() {

            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), msgRid, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
