package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/04 17:20
 *
 * @author Touchkiss
 */
@Data
public class MixDetailRequest extends BaseRequest<MixDetailResponse> {

    public MixDetailRequest(Set<String> headers, List<String> params, String host, String uri, String method) {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "sdk-version", "passport-sdk-version", "X-SS-REQ-TICKET", "X-SS-DP", "x-tt-trace-id", "User-Agent", "Accept-Encoding", "X-Khronos", "X-Gorgon")), Arrays.asList("mix_id", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "cpu_support64", "host_abi", "resolution", "openudid", "update_version_code", "cdid", "appTheme", "os_api", "dpi", "oaid", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "device_brand", "ssmix", "device_platform", "aid", "ts"), "api3-normal-c-hl.amemv.com", "/aweme/v1/mix/detail/", "get");
    }
}




