package com.douyin.webcast;

import com.douyin.aweme.v1.bean.BaseRequest;
import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/05 19:51
 * 直播榜
 *
 * @author Touchkiss
 */
@Data
public class WebcastRanklistHotRequest extends BaseRequest<WebcastRanklistHotResponse> {
    private int is_vcd=1;
    private String request_tag_from="h5";
    public WebcastRanklistHotRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "sdk-version", "passport-sdk-version", "X-SS-DP", "x-tt-trace-id", "User-Agent",
                "Accept-Encoding", "X-Khronos", "X-Gorgon")), Arrays.asList("is_vcd", "request_tag_from", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "cpu_support64", "host_abi", "resolution", "openudid", "update_version_code", "cdid", "appTheme", "os_api", "dpi", "oaid", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "device_brand", "ssmix", "device_platform", "aid", "ts"), "webcast3-normal-c-hl.amemv.com", "/webcast/ranklist/hot/", "get");
    }
}


