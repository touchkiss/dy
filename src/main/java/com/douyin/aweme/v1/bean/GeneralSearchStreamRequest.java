package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/05 22:22
 *
 * @author Touchkiss
 */
@Data
public class GeneralSearchStreamRequest extends BaseRequest<GeneralSearchSingleResponse>{
    public GeneralSearchStreamRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("keyword", "offset", "count", "is_pull_refresh", "hot_search", "latitude", "longitude", "ts", "js_sdk_version", "app_type", "manifest_version_code", "_rticket", "ac", "device_id", "iid", "mcc_mnc", "os_version", "channel", "version_code", "device_type", "language", "resolution", "openudid", "update_version_code", "app_name", "version_name", "os_api", "device_brand", "ssmix", "device_platform", "dpi", "aid", "as", "cp", "mas"), "api.amemv.com", "/aweme/v1/general/search/stream/", "post");
    }
}
//https://search5-search-lf.amemv.com/aweme/v1/general/search/stream/?manifest_version_code=130701&_rticket=1607178064411&app_type=normal&iid=3799554091133837&channel=xiaomi&device_type=Redmi+Note+8+Pro&language=zh&cpu_support64=true&host_abi=arm64-v8a&resolution=1080*2134&openudid=ce348c6bf7df0427&update_version_code=13709900&cdid=e1cb5eff-0b74-430e-941a-53765fd70d8c&appTheme=dark&os_api=29&dpi=440&oaid=6292668db7e5f1fc&ac=wifi&device_id=1213500227850904&mcc_mnc=46001&os_version=10&version_code=130700&app_name=aweme&version_name=13.7.0&device_brand=Redmi&ssmix=a&device_platform=android&aid=1128&ts=1607178066
