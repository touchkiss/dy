package com.douyin.aweme.v1.bean;

import cn.hutool.http.HttpRequest;
import com.douyin.aweme.v1.bean.request.BaseRequest;
import com.douyin.aweme.v1.bean.response.BaseResponse;
import com.touchkiss.dy.utils.GsonUtil;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@Data
public class DouYinClient {
    private String cookie;
    private BaseParams baseParams;
    private BaseHeaders basicHeaders;

    @Data
    public static class BaseParams {
        private String retry_type;
        private String mcc_mnc;
        private String iid;
        private String device_id;
        private String ac;
        private String channel;
        private String aid;
        private String app_name;
        private String version_code;
        private String version_name;
        private String device_platform;
        private String ssmix;
        private String device_type;
        private String device_brand;
        private String os_api;
        private String os_version;
        private String openudid;
        private String manifest_version_code;
        private String resolution;
        private String dpi;
        private String update_version_code;
        private String js_sdk_version;
    }

    public static class BaseHeaders extends HashMap<String, String> {
    }

    public <T extends BaseResponse> T doAction(BaseRequest<T> request) {
        String url = "https://" + request.host + request.uri;
        long time = System.currentTimeMillis();
        long ts = time / 1000;
        Class<? extends BaseRequest> requestClass = request.getClass();
        Class<BaseParams> baseParamsClass = BaseParams.class;
        Map<String,Field> requestFieldMap = Arrays.stream(requestClass.getDeclaredFields()).collect(Collectors.toMap(Field::getName,o->o));
        Map<String,Field> baseParamFieldMap = Arrays.stream(baseParamsClass.getDeclaredFields()).collect(Collectors.toMap(Field::getName,o->o));
        Map<String, List<String>> headers = new HashMap<>();
        Set<String> headerNames = request.getHeaders();
        String params = request.getParams().stream().map(paramName -> {
            String value = "";
            try {
                if (requestFieldMap.containsKey(paramName)){
                    Field field = requestFieldMap.get(paramName);
                    field.setAccessible(true);
                    value= field.get(request).toString();
                }else if (baseParamFieldMap.containsKey(paramName)){
                    Field field = baseParamFieldMap.get(paramName);
                    field.setAccessible(true);
                    value= field.get(this.baseParams).toString();
                }else if ("ts".equals(paramName)){
                    value=String.valueOf(ts);
                }else if ("_rticket".equals(paramName)){
                    value=String.valueOf(name);
                }
            }catch (Exception ignore){
                ignore.printStackTrace();
            }
            return paramName + "=" + value;
        }).collect(Collectors.joining("&"));

        if (CollectionUtils.isNotEmpty(headerNames)) {
            for (String headerName : headerNames) {

            }
        }
        HttpRequest httpRequest = null;
        if ("get".equalsIgnoreCase(request.getMethod())) {
            httpRequest = HttpRequest.get(url);
        } else if ("post".equalsIgnoreCase(request.getMethod())) {
            httpRequest = HttpRequest.post(url);
        }
        httpRequest.cookie(this.cookie)
                .header(headers, true);
        return GsonUtil.fromJson(httpRequest.execute().body(), request.getResponseClass());
    }
}
