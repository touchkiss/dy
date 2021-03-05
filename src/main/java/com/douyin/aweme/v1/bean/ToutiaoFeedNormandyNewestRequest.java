package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.*;

/**
 * Created on 2021/03/04 15:55
 *
 * @author Touchkiss
 */
@Data
public class ToutiaoFeedNormandyNewestRequest extends BaseRequest<ToutiaoFeedNormandyNewestResponse> {
    private String normandy_local_id;
    private String normandy_category;
    private String category;
    private String query_id;
    private String offset;
    private String count;
    public ToutiaoFeedNormandyNewestRequest() {
        super(new HashSet<>(Arrays.asList("passport-sdk-version", "X-SS-DP", "X-SS-REQ-TICKET", "sdk-version", "X-Khronos", "X-Gorgon", "User-Agent", "Host", "Connection")), new ArrayList<>(Arrays.asList("normandy_local_id", "normandy_category", "category", "query_id", "offset", "count", "manifest_version_code", "_rticket", "iid", "channel", "device_type", "language", "host_abi", "resolution", "openudid", "update_version_code", "cdid", "os_api", "mac_address", "dpi", "oaid", "ab_feature", "ac", "device_id", "os_version", "version_code", "tma_jssdk_version", "app_name", "ab_version", "version_name", "plugin", "device_brand", "ssmix", "device_platform", "aid", "rom_version"
        )), "api3-normal-c-hl.snssdk.com", "/api/feed/normandy_newest/v1/", "get");
    }
}


