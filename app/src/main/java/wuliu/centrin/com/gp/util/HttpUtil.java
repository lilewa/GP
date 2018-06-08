package wuliu.centrin.com.gp.util;

import android.text.TextUtils;

import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import wuliu.centrin.com.gp.BaseApplication;

/**
 * Created by lile on 2018/6/7.
 */

public class HttpUtil {

    /**
     * 请求数据Get方式
     *
     * @param url
     */
    public void initHttpGet(String url, final OnHttp doWhat) {

        BaseApplication.utils.send(HttpRequest.HttpMethod.GET, url, new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                if (responseInfo != null && !TextUtils.isEmpty(responseInfo.result)) {
                    doWhat.onHttpSuccess(responseInfo.result);
                }
            }

            @Override
            public void onFailure(HttpException error, String msg) {
                doWhat.onHttpFailure(msg);
            }
        });
    }

    /**
     * 请求数据Post方式
     *
     * @param url
     */
    public void initHttpPost(String url, RequestParams params, final OnHttp doWhat) {

        BaseApplication.utils.send(HttpRequest.HttpMethod.POST, url, params, new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                if (responseInfo != null && !TextUtils.isEmpty(responseInfo.result)) {
                    doWhat.onHttpSuccess(responseInfo.result);
                }
            }

            @Override
            public void onFailure(HttpException error, String msg) {
                doWhat.onHttpFailure(msg);
            }
        });

    }

    /**
     * 请求数据Post方式
     * type 用于一个页面多个请求时区分
     *
     * @param url
     */
    public void initHttpPost(String url, RequestParams params, final OnHttpPost doWhat, final int type) {

        BaseApplication.utils.send(HttpRequest.HttpMethod.POST, url, params, new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                if (responseInfo != null && !TextUtils.isEmpty(responseInfo.result)) {
                    doWhat.onHttpSuccess(responseInfo.result, type);
                }
            }

            @Override
            public void onFailure(HttpException error, String msg) {
                doWhat.onHttpFailure(msg, type);
            }
        });

    }

    /**
     * 回调接口
     */
    public interface OnHttpPost {

        void onHttpSuccess(String result, int type);

        void onHttpFailure(String msg, int type);
    }

    /**
     * 回调接口
     */
    public interface OnHttp {

        void onHttpSuccess(String result);

        void onHttpFailure(String msg);
    }
    /*********************************************文件下载******************************************/
    /**
     * 下载
     */
    public void initHttpDownload() {

    }
}
