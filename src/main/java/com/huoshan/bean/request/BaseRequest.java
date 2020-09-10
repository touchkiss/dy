package com.huoshan.bean.request;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/09/10 16:35
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class BaseRequest {
    private Integer live_sdk_version;
    private String iid;
    private String device_id;
    private String ac;
    private String mac_address;
    private String channel;
    private Integer aid;
    private String app_name;
    private Integer version_code;
    private String version_name;
    private String device_platform;
    private String ssmix;
    private String device_type;
    private String device_brand;
    private String language;
    private Integer os_api;
    private String os_version;
    private String uuid;
    private String openudid;
    private String manifest_version_code;
    private String resolution;
    private Integer dpi;
    private String update_version_code;
    /**
     * 毫秒时间戳
     */
    private Long _rticket;
    private Integer hs_location_permission;
    private Integer tab_mode;
    private String jssdk_version;
    private String ab_version;
    private String client_version_code;
    private Integer mcc_mnc;
    private String cdid;
    private Integer new_nav;
    private String ws_status;
    private Integer settings_version;
    /**
     * 毫秒时间戳
     */
    private Long last_update_time;
    private String cpu_model;
    /**
     * 秒时间戳
     */
    private Long ts;
}
