package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/05 21:52
 * 搜索页、更多
 * 品牌榜、好物榜
 *
 * @author Touchkiss
 */
@Data
public class BranchBillboardEntranceRequest extends BaseRequest<BranchBillboardEntranceReqsponse> {
    private int is_vcd = 1;
    private String request_tag_from = "h5";

    public BranchBillboardEntranceRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "sdk-version", "passport-sdk-version", "X-SS-REQ-TICKET", "X-SS-DP", "x-tt-trace-id", "User-Agent", "Accept-Encoding", "X-Khronos", "X-Gorgon")), Arrays.asList("is_vcd", "request_tag_from", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "cpu_support64", "host_abi", "resolution", "openudid", "update_version_code", "cdid", "appTheme", "os_api", "dpi", "oaid", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "device_brand", "ssmix", "device_platform", "aid", "ts"), "api3-normal-c-hl.amemv.com", "/aweme/v1/branch/billboard/entrance/", "get");
    }
}

