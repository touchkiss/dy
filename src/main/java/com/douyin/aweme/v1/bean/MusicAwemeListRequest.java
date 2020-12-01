package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/01 15:09
 * 创作的原声
 * 热门
 *
 * @author Touchkiss
 */
@Data
public class MusicAwemeListRequest extends BaseRequest<MusicAwemeListResponse> {
    private String music_id;
    private int cursor;
    private int count;
    private int type;
    public MusicAwemeListRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Cookie", "Accept-Encoding", "X-SS-QUERIES", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("music_id", "cursor", "count", "type", "retry_type", "mcc_mnc", "iid", "device_id", "ac", "channel", "aid", "app_name", "version_code", "version_name", "device_platform", "ssmix", "device_type", "device_brand", "language", "os_api", "os_version", "openudid", "manifest_version_code", "resolution", "dpi", "update_version_code", "_rticket", "ts", "js_sdk_version", "as", "cp", "mas"), "api.amemv.com", "/aweme/v1/music/aweme/", "get");
    }
}

