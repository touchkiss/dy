package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/07 20:24
 *
 * @author Touchkiss
 */
@Data
public class StickerAwemeRequest extends BaseRequest<StickerAwemeResponse>{
    private int sticker_id;
    private int cursor=0;
    private int count=20;
    private int is_order_flow=0;
    public StickerAwemeRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "sdk-version", "passport-sdk-version", "X-SS-REQ-TICKET", "X-SS-DP", "x-tt-trace-id", "User-Agent", "Accept-Encoding", "X-Khronos", "X-Gorgon", "X-Tyhon")), Arrays.asList("sticker_id","cursor","count","is_order_flow","manifest_version_code","_rticket","app_type","iid","channel","device_type","language","cpu_support64","host_abi","resolution","openudid","update_version_code","cdid","appTheme","os_api","dpi","oaid","ac","device_id","mcc_mnc","os_version","version_code","app_name","version_name","device_brand","ssmix","device_platform","aid","ts"), "api3-normal-c-hl.amemv.com", "/aweme/v1/sticker/aweme/", "get");
    }
}

