package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 赵 on 2017/3/28.
 */

/**
 * 发起HTTP请求
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
