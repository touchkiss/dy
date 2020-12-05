package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/05 21:44
 *
 * @author Touchkiss
 */
@Data
public class ChartMusicListRequest extends BaseRequest<ChartMusicListResponse>{
    private int cursor=0;
    private int count=8;
    private String chart_id="6853972723954146568";
    private boolean with_detail_url=true;
    private String app_language="zh-hant";
    private int is_vcd=1;
    private String request_tag_from="h5";

    public ChartMusicListRequest() {
        super(new HashSet<>(Arrays.asList("Host",        "Connection",          "sdk-version",        "passport-sdk-version",        "X-SS-REQ-TICKET",        "X-SS-DP",        "x-tt-trace-id",        "User-Agent",        "Accept-Encoding",        "X-Khronos",        "X-Gorgon")), Arrays.asList("cursor","count","chart_id","with_detail_url","app_language","is_vcd","request_tag_from","manifest_version_code","_rticket","app_type","iid","channel","device_type","language","cpu_support64","host_abi","resolution","openudid","update_version_code","cdid","appTheme","os_api","dpi","oaid","ac","device_id","mcc_mnc","os_version","version_code","app_name","version_name","device_brand","ssmix","device_platform","aid","ts"), "api3-normal-c-hl.amemv.com", "/aweme/v1/chart/music/list/", "get");
    }
}
