package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/08 14:18
 *
 * @author Touchkiss
 */
@Deprecated
@Data
public class OriginalMusicListRequest extends BaseRequest<OriginalMusicListResponse> {
    private long user_id;
    private int cursor = 0;
    private int count = 10;
    private String sec_user_id;

    public OriginalMusicListRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "User-Agent", "X-Khronos", "X-Gorgon")), Arrays.asList("user_id", "cursor", "count", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "resolution", "openudid", "update_version_code", "os_api", "dpi", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "js_sdk_version", "device_brand", "ssmix", "device_platform", "aid", "ts", "sec_user_id"), "aweme.snssdk.com", "/aweme/v1/original/music/list/", "get");
    }
}


