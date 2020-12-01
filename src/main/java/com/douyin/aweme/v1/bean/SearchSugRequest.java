package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/01 15:50
 * 搜索建议
 *
 * @author Touchkiss
 */
@Data
public class SearchSugRequest extends BaseRequest<SearchSugResponse> {
    private String keyword;
    private String source;
    public SearchSugRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("keyword", "source", "ts", "js_sdk_version", "app_type", "manifest_version_code", "_rticket", "ac", "device_id", "iid", "mcc_mnc", "os_version", "channel", "version_code", "device_type", "language", "resolution", "openudid", "update_version_code", "app_name", "version_name", "os_api", "device_brand", "ssmix", "device_platform", "dpi", "aid", "as", "cp", "mas"), "api.amemv.com", "/aweme/v1/search/sug/", "get");
    }
}


