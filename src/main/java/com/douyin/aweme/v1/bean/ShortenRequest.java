package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/07 15:03
 *
 * @author Touchkiss
 */
@Data
public class ShortenRequest extends BaseRequest<ShortenResponse> {
    private String target;
    private String belong="aweme";
    private int persist=1;
    public ShortenRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "x-tt-trace-id", "User-Agent", "X-Khronos", "X-Gorgon")), Arrays.asList("target", "belong", "persist", "manifest_version_code", "_rticket", "ac", "app_type", "device_id", "iid", "mcc_mnc", "os_version", "channel", "version_code", "device_type", "language", "resolution", "openudid", "update_version_code", "app_name", "version_name", "os_api", "device_brand", "ssmix", "device_platform", "dpi", "aid", "ts"), "lf.snssdk.com", "/shorten/", "get");
    }
}
