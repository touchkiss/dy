package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/05 23:44
 * 用户点赞的视频
 *
 * @author Touchkiss
 */
@Data
public class AwemeFavoriteRequest extends BaseRequest<AwemeFavoriteResponse> {
    private long max_cursor=0;
    private long user_id;
//    private String sec_user_id;
    private int count=20;
    public AwemeFavoriteRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-QUERIES", "sdk-version", "User-Agent", "X-Khronos", "X-Gorgon")), Arrays.asList("max_cursor", "user_id", "count", "retry_type", "iid", "device_id", "ac", "channel", "aid", "app_name", "version_code", "version_name", "device_platform", "ssmix", "device_type", "device_brand", "language", "os_api", "os_version", "openudid", "manifest_version_code", "resolution", "dpi", "update_version_code", "_rticket", "app_type", "js_sdk_version", "mcc_mnc", "ts", "sec_user_id"), "api.amemv.com", "/aweme/v1/aweme/favorite/", "get");
    }
}


