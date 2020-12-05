package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/05 23:19
 * 地点aweme列表
 *
 * @author Touchkiss
 */
@Data
public class PoiAwemeRequest extends BaseRequest<PoiAwemeResponse> {
    private String poi_id;
    private int aweme_type=3;
    private int count=20;
    private int cursor=0;
    private String aweme_id;

    public PoiAwemeRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection",
                "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "User-Agent", "X-Khronos", "X-Gorgon")), Arrays.asList("poi_id", "aweme_type", "count", "cursor", "aweme_id", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "resolution", "openudid", "update_version_code", "os_api", "dpi", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "js_sdk_version", "device_brand", "ssmix", "device_platform", "aid", "ts"), "api.amemv.com", "/aweme/v1/poi/aweme/", "get");
    }
}
