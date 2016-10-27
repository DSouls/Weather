package com.alex.coolweather.util;

/**
 * Created by Administrator on 2016/10/24.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
