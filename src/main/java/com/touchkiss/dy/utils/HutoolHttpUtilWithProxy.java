package com.touchkiss.dy.utils;

import cn.hutool.http.HttpRequest;
import com.douyin.aweme.v1.bean.StickerDetailResponse;
import com.douyin.aweme.v2.bean.StickerListResponse;
import lombok.extern.slf4j.Slf4j;

import java.net.Proxy;

/**
 * Created on 2020/12/08 12:56
 * 使用代理访问
 *
 * @author Touchkiss
 */
@Slf4j
public class HutoolHttpUtilWithProxy {
    public static final String USERAGENT = "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1";

    public static String get(String url) {
        HttpRequest httpRequest = HttpRequest.get(url);
        Proxy proxy = ProxyUtil.getProxy();
        if (proxy != null) {
            httpRequest.setProxy(proxy);
        }
        httpRequest.header("User-Agent", USERAGENT);
        log.info("正在访问：{}",url);
        return httpRequest.execute().body();
    }

    public static void main(String[] args) {
        String url="https://www.iesdouyin.com/web/api/v2/sticker/detail/?sticker_ids=121,122,123,124,125,126,127,128,129";
        HttpRequest httpRequest = HttpRequest.get(url);
        httpRequest.header("User-Agent", USERAGENT);
        log.info("正在访问：{}",url);
        String body = httpRequest.execute().body();
        StickerDetailResponse stickerDetailResponse = GsonUtil.fromJson(body, StickerDetailResponse.class);
        System.out.println(stickerDetailResponse.getSticker_infos().size());
        System.out.println(body);
    }
}
