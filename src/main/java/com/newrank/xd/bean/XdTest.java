package com.newrank.xd.bean;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/12/11 22:11
 *
 * @author Touchkiss
 */
public class XdTest {
    public static void main(String[] args) {

        Map<String, String> headers = new HashMap<>();
        headers.put("accept-encoding", "gzip, deflate, br");
        headers.put("accept-language", "zh-CN,zh;q=0.9,en;q=0.8");
        headers.put("cache-control", "no-cache");
        headers.put("content-type", "application/json;charset=UTF-8");
        headers.put("dnt", "1");
        headers.put("origin", "https://xd.newrank.cn");
        headers.put("pragma", "no-cache");
        headers.put("sec-fetch-dest", "empty");
        headers.put("sec-fetch-mode", "cors");
        headers.put("referer","https://xd.newrank.cn/tiktok/detail/broadcastAnalysis/3830331655328956");
//        headers.put("cookie", "_uab_collina=160674116551298350533582; Hm_lvt_a19fd7224d30e3c8a6558dcb38c4beed=1606820845; UM_distinctid=1761dfc56a81e-0cca0c37d2dd67-c791e37-4b9600-1761dfc56a9362; __root_domain_v=.newrank.cn; _qddaz=QD.9u5dr1.bds4hl.ki5vn963; token=DABEDD1DA65541BBA1A34E686F6E8A7B");
        headers.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
        headers.put("accept", "application/json, text/plain, */*");
        System.out.println(HttpUtil.get("https://xd.newrank.cn/tiktok/detail/latest/3830331655328956"));
        HttpRequest post = HttpRequest.post("https://xd.newrank.cn/xdnphb/nr/cloud/douyin/detail/accountInfoAll").headerMap(headers,true);
        System.out.println(post.body("{\"uid\": \"3830331655328956\"}").execute().body());
    }
}
