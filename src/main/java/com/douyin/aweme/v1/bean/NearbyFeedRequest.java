package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/01 16:20
 *
 * @author Touchkiss
 */
@Data
public class NearbyFeedRequest extends BaseRequest<NearbyFeedResponse> {
    private int max_cursor=0;
    private int min_cursor=0;
    private int count=20;
    private int feed_style=0;
    private int filter_warn=0;
    private String city;
    private double latitude=0.0d;
    private double longitude=0.0d;
    private int poi_class_code=0;
    public NearbyFeedRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("max_cursor", "min_cursor", "count", "feed_style", "filter_warn", "city", "latitude", "longitude", "poi_class_code", "ts", "js_sdk_version", "app_type", "manifest_version_code", "_rticket", "ac", "device_id", "iid", "mcc_mnc", "os_version", "channel", "version_code", "device_type", "language", "resolution", "openudid", "update_version_code", "app_name", "version_name", "os_api", "device_brand", "ssmix", "device_platform", "dpi", "aid", "as", "cp", "mas"), "api.amemv.com", "/aweme/v1/nearby/feed/", "get");
    }
}

