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
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "User-Agent", "X-Khronos", "X-Gorgon")), Arrays.asList("music_id", "click_reason", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "resolution", "openudid", "update_version_code", "os_api", "dpi", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "js_sdk_version", "device_brand", "ssmix", "device_platform", "aid", "ts"), "api.amemv.com", "/aweme/v1/music/detail/", "get");
    }
}



