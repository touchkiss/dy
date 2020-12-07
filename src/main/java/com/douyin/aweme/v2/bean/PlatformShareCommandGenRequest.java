package com.douyin.aweme.v2.bean;

import com.douyin.aweme.v1.bean.BaseRequest;
import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/12/07 15:38
 *
 * @author Touchkiss
 */
@Data
public class PlatformShareCommandGenRequest extends BaseRequest<PlatformShareCommandGenResponse> {
    public PlatformShareCommandGenRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Content-Length", "sdk-version", "passport-sdk-version", "X-SS-REQ-TICKET", "Content-Type", "X-SS-STUB", "X-SS-DP", "x-tt-trace-id", "User-Agent", "Accept-Encoding", "X-Khronos", "X-Gorgon", "X-Tyhon")), Arrays.asList("schema", "schema_type", "object_id", "copy_type", "manifest_version_code", "_rticket", "app_type", "iid", "channel", "device_type", "language", "cpu_support64", "host_abi", "resolution", "openudid", "update_version_code", "cdid", "appTheme", "os_api", "dpi", "oaid", "ac", "device_id", "mcc_mnc", "os_version", "version_code", "app_name", "version_name", "device_brand", "ssmix", "device_platform", "aid", "ts"), "api3-normal-c-hl.amemv.com", "/aweme/v2/platform/share/command/gen/", "get");
    }
}
