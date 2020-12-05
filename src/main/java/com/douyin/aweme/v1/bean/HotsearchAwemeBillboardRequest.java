package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/01 18:02
 * 今日最热视频
 *
 * @author Touchkiss
 */
@Data
public class HotsearchAwemeBillboardRequest extends BaseRequest<HotsearchAwemeBillboardResponse>{
    public HotsearchAwemeBillboardRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("ts","js_sdk_version","app_type","manifest_version_code","_rticket","ac","device_id","iid","mcc_mnc","os_version","channel","version_code","device_type","language","resolution","openudid","update_version_code","app_name","version_name","os_api","device_brand","ssmix","device_platform","dpi","aid","as","cp","mas"), "api.amemv.com", "/aweme/v1/hotsearch/aweme/billboard/", "get");
    }
}
