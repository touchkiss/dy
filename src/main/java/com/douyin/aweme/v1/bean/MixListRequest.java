package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/07 20:54
 * 用户合集列表
 *
 * @author Touchkiss
 */
@Data
public class MixListRequest extends BaseRequest<MixListResponse> {
    private long user_id;
    private String sec_user_id;
    private int count = 15;
    private int cursor = 0;
    private int version_code=130800;
    private int update_version_code=13809900;

    public MixListRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "User-Agent")), Arrays.asList("user_id", "count", "cursor", "_rticket", "channel", "device_type", "language", "cpu_support64", "host_abi", "resolution", "update_version_code", "appTheme", "os_api", "dpi", "ac", "mcc_mnc", "os_version", "version_code"), "api3-normal-c-hl.amemv.com", "/aweme/v1/mix/list/", "get");
    }
}
