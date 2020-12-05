package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/05 11:13
 *
 * @author Touchkiss
 */
@Data
public class MixAwemeRequest extends BaseRequest<MixAwemeResponse>{
    private String mix_id;
    private int cursor=0;
    private int count=15;
    private int pull_type=2;
    public MixAwemeRequest() {
        super(new HashSet<>(Arrays.asList("Host",       "Connection",              "sdk-version",       "passport-sdk-version",       "X-SS-REQ-TICKET",       "X-SS-DP",       "x-tt-trace-id",       "User-Agent",       "Accept-Encoding",       "X-Khronos",       "X-Gorgon")), Arrays.asList("mix_id","cursor","count","pull_type","manifest_version_code","_rticket","app_type","iid","channel","device_type","language","cpu_support64","host_abi","resolution","openudid","update_version_code","cdid","appTheme","os_api","dpi","oaid","ac","device_id","mcc_mnc","os_version","version_code","app_name","version_name","device_brand","ssmix","device_platform","aid","ts"), "api3-normal-c-hl.amemv.com", "/aweme/v1/mix/aweme/", "get");
    }
}
