package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/01 16:07
 *
 * @author Touchkiss
 */
@Data
public class GeneralSearchSingleRequest extends BaseRequest<GeneralSearchSingleResponse> {
    private String keyword;
    private int offset = 0;
    private int count = 10;
    private int is_pull_refresh = 0;
    private int hot_search = 0;
    private double latitude = 0.0d;
    private double longitude = 0.0d;

    public GeneralSearchSingleRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("keyword", "offset", "count", "is_pull_refresh", "hot_search", "latitude", "longitude", "ts", "js_sdk_version", "app_type", "manifest_version_code", "_rticket", "ac", "device_id", "iid", "mcc_mnc", "os_version", "channel", "version_code", "device_type", "language", "resolution", "openudid", "update_version_code", "app_name", "version_name", "os_api", "device_brand", "ssmix", "device_platform", "dpi", "aid", "as", "cp", "mas"), "api.amemv.com", "/aweme/v1/general/search/single/", "get");
    }
}



