package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/05 23:30
 * 地点详情
 *
 * @author Touchkiss
 */
@Data
public class PoiDetailRequest extends BaseRequest<PoiDetailResponse> {
    private String poi_id;
    private double longitude = 0.0d;
    private double latitude = 0.0d;
    private String extensions = "all";
    private int display_style = 2;
    private int is_preview = 0;
    private int from_ads = 0;
    private String item_id;

    public PoiDetailRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "User-Agent", "X-Khronos", "X-Gorgon")), Arrays.asList("poi_id", "longitude", "latitude", "extensions", "display_style", "is_preview", "from_ads", "item_id", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "resolution", "openudid", "update_version_code", "os_api", "dpi", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "js_sdk_version", "device_brand", "ssmix", "device_platform", "aid", "ts"), "api.amemv.com", "/aweme/v1/poi/detail/", "get");
    }
}
