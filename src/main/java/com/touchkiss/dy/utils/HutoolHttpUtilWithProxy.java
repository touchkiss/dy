package com.touchkiss.dy.utils;

import cn.hutool.http.HttpRequest;

import java.net.Proxy;

/**
 * Created on 2020/12/08 12:56
 * 使用代理访问
 *
 * @author Touchkiss
 */
public class HutoolHttpUtilWithProxy {
    public static final String USERAGENT = "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1";

    public static String get(String url) {
        HttpRequest httpRequest = HttpRequest.get(url);
        Proxy proxy = ProxyUtil.getProxy();
        if (proxy != null) {
            httpRequest.setProxy(proxy);
        }
        httpRequest.header("User-Agent", USERAGENT);
        return httpRequest.execute().body();
    }
}
