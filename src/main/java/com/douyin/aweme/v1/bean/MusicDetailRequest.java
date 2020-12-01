package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/11/28 23:33
 *
 * @author Touchkiss
 */
@Data
@Deprecated
public class MusicDetailRequest extends BaseRequest<MusicDetailResponse> {
    private String music_id;
    private String click_reason;

    public MusicDetailRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-QUERIES", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("music_id", "click_reason", "retry_type", "mcc_mnc", "iid", "device_id", "ac", "channel", "aid", "app_name", "version_code", "version_name", "device_platform", "ssmix", "device_type", "device_brand", "language", "os_api", "os_version", "openudid", "manifest_version_code", "resolution", "dpi", "update_version_code", "_rticket", "ts", "js_sdk_version"), "api.amemv.com", "/aweme/v1/music/detail/", "get");
    }
}



