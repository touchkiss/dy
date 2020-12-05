package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/06 0:09
 * 话题aweme列表
 *
 * @author Touchkiss
 */
@Data
public class ChallengeAwemeRequest extends BaseRequest<ChallengeAwemeResponse> {
    private int cursor = 0;
    private int count = 20;
    private int query_type = 1;
    private String source = "challenge_video";
    private int type = 5;
    private String hashtag_name;

    public ChallengeAwemeRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "User-Agent", "X-Khronos", "X-Gorgon")), Arrays.asList("cursor", "count", "query_type", "source", "type", "hashtag_name", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "resolution", "openudid", "update_version_code", "os_api", "dpi", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "js_sdk_version", "device_brand", "ssmix", "device_platform", "aid", "ts"), "aweme.snssdk.com", "/aweme/v1/challenge/aweme/", "get");
    }
}
