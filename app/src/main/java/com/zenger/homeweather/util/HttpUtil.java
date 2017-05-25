package com.zenger.homeweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Apple ios on 2017/4/16.
 */

public class HttpUtil  {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
        //callback:待会再调用的时候会具体写类 new Callback(){//在这里重写onFailure和onResponse这两个方法}
    }
}
