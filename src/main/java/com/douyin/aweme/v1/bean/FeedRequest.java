package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/01 17:49
 *
 * @author Touchkiss
 */
@Data
public class FeedRequest extends BaseRequest<FeedResponse> {
    private int type=0;
    private int max_cursor = 0;
    private int min_cursor = -1;
    private int count = 6;
    private double volume = 0.0d;
    private int pull_type = 2;
    private int need_relive_aweme = 0;
    private int filter_warn = 0;
    private String req_from;
    private int is_cold_start = 0;
    private double longitude = 0;
    private double latitude = 0;

    public FeedRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("type", "max_cursor", "min_cursor", "count", "volume", "pull_type", "need_relieve_aweme", "filter_warn", "req_from", "is_cold_start", "longitude", "latitude", "ts", "js_sdk_version", "app_type", "manifest_version_code", "_rticket", "ac", "device_id", "iid", "mcc_mnc", "os_version", "channel", "version_code", "device_type", "language", "resolution", "openudid", "update_version_code", "app_name", "version_name", "os_api", "device_brand", "ssmix", "device_platform", "dpi", "aid", "as", "cp", "mas"), "aweme-eagle.snssdk.com", "/aweme/v1/feed/", "get");
    }
}




