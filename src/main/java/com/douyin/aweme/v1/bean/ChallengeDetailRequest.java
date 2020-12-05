package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/05 23:58
 * 话题详情
 *
 * @author Touchkiss
 */
@Data
public class ChallengeDetailRequest extends BaseRequest<ChallengeDetailResponse> {
    private int click_reason=0;
    private int query_type=1;
    private String hashtag_name;
    public ChallengeDetailRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "User-Agent", "X-Khronos", "X-Gorgon")), Arrays.asList("click_reason", "query_type", "hashtag_name", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "resolution", "openudid", "update_version_code", "os_api", "dpi", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "js_sdk_version", "device_brand", "ssmix", "device_platform", "aid", "ts"), "aweme.snssdk.com", "/aweme/v1/challenge/detail/", "get");
    }
}
