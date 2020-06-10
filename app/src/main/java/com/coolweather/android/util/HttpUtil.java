package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
//通过服务器端获取省市县数据
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
