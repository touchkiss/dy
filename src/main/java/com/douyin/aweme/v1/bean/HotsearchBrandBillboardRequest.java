package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/05 22:07
 *
 * @author Touchkiss
 */
@Data
public class HotsearchBrandBillboardRequest extends BaseRequest<HotsearchBrandBillboardResponse>{
    private String start_date;
    private int category_id = 10;
    private boolean is_by_device=true;
    private int is_vcd = 1;
    private String request_tag_from = "h5";
    public HotsearchBrandBillboardRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "sdk-version", "passport-sdk-version", "X-SS-REQ-TICKET", "X-SS-DP", "x-tt-trace-id", "User-Agent", "Accept-Encoding", "X-Khronos", "X-Gorgon")), Arrays.asList("start_date","category_id","is_by_device", "is_vcd", "request_tag_from", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "cpu_support64", "host_abi", "resolution", "openudid", "update_version_code", "cdid", "appTheme", "os_api", "dpi", "oaid", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "device_brand", "ssmix", "device_platform", "aid", "ts"), "api3-normal-c-hl.amemv.com", "/aweme/v1/hotsearch/brand/billboard/", "get");
    }
}
