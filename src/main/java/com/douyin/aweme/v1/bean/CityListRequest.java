package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/07 21:24
 * 城市列表
 *
 * @author Touchkiss
 */
@Data
public class CityListRequest extends BaseRequest<CityListResponse> {
    private double longitude;
    private double latitude;
    private int location_permission = 0;

    public CityListRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connectino", "User-Agent")), Arrays.asList("longitude", "latitude", "location_permission"), "api3-normal-c-hl.amemv.com", "/aweme/v1/city/list/", "get");
    }
}
