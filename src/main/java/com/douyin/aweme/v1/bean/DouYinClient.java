package com.douyin.aweme.v1.bean;

import cn.hutool.http.HttpRequest;
import com.douyin.aweme.v1.bean.request.AwemePostRequest;
import com.douyin.aweme.v1.bean.request.BaseRequest;
import com.douyin.aweme.v1.bean.request.CommentListRequest;
import com.douyin.aweme.v1.bean.request.ForwardListRequest;
import com.douyin.aweme.v1.bean.response.AwemePostResponse;
import com.douyin.aweme.v1.bean.response.BaseResponse;
import com.douyin.aweme.v1.bean.response.ForwardListResponse;
import com.douyin.aweme.v2.CommentListResponse;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.XGorgonUtil;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@Data
public class DouYinClient {
    private String cookie;
    private BaseParams baseParams;
    private Map<String, String> basicHeaders;

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
        private String app_type;
        private String version_code;
        private String version_name;
        private String device_platform;
        private String ssmix;
        private String device_type;
        private String device_brand;
        private String language;
        private String os_api;
        private String os_version;
        private String openudid;
        private String manifest_version_code;
        private String resolution;
        private String dpi;
        private String update_version_code;
        private String js_sdk_version;
        private String as;
        private String cp;
        private String mas;
    }

    public <T extends BaseResponse> T doAction(BaseRequest<T> request) {
        long time = System.currentTimeMillis();
        long ts = time / 1000;
        Class<? extends BaseRequest> requestClass = request.getClass();
        Class<BaseParams> baseParamsClass = BaseParams.class;
        Map<String, Field> requestFieldMap = Arrays.stream(requestClass.getDeclaredFields()).collect(Collectors.toMap(Field::getName, o -> o));
        Map<String, Field> baseParamFieldMap = Arrays.stream(baseParamsClass.getDeclaredFields()).collect(Collectors.toMap(Field::getName, o -> o));
        Map<String, List<String>> headers = new HashMap<>();
        Set<String> headerNames = request.getHeaders();
        String params = request.getParams().stream().map(paramName -> {
            String value = "";
            try {
                if (requestFieldMap.containsKey(paramName)) {
                    Field field = requestFieldMap.get(paramName);
                    field.setAccessible(true);
                    Object o = field.get(request);
                    if (o != null) {
                        value = o.toString();
                    }
                } else if (baseParamFieldMap.containsKey(paramName)) {
                    Field field = baseParamFieldMap.get(paramName);
                    field.setAccessible(true);
                    Object o = field.get(this.baseParams);
                    if (o!=null){
                        value = o.toString();
                    }
                } else if ("ts".equals(paramName)) {
                    value = String.valueOf(ts);
                } else if ("_rticket".equals(paramName)) {
                    value = String.valueOf(time);
                }
            } catch (Exception ignore) {
                ignore.printStackTrace();
            }
            return StringUtils.isNotBlank(value) ? paramName + "=" + value : "";
        }).filter(StringUtils::isNotBlank).collect(Collectors.joining("&"));

        String url = "https://" + request.Host + request.uri + "?" + params;
        if (CollectionUtils.isNotEmpty(headerNames)) {
            headerNames.stream().forEach(headerName -> {
                if (basicHeaders.containsKey(headerName)) {
                    headers.put(headerName, Collections.singletonList(basicHeaders.get(headerName)));
                } else if (requestFieldMap.containsKey(headerName)) {
                    try {
                        Field field = requestFieldMap.get(headerName);
                        field.setAccessible(true);
                        String value = field.get(request).toString();
                        headers.put(headerName, Collections.singletonList(value));
                    } catch (Exception e) {

                    }
                } else if ("X-SS-REQ-TICKET".equals(headerName)) {
                    headers.put(headerName, Collections.singletonList(String.valueOf(time)));
                } else if ("X-Khronos".equals(headerName)) {
                    headers.put(headerName, Collections.singletonList(String.valueOf(ts)));
                } else if ("X-Gorgon".equals(headerName)) {
                    headers.put(headerName, Collections.singletonList(XGorgonUtil.xGorgon(ts, params, "", cookie)));
                }
            });
        }
        HttpRequest httpRequest = null;
        if ("get".equalsIgnoreCase(request.getMethod())) {
            httpRequest = HttpRequest.get(url);
        } else if ("post".equalsIgnoreCase(request.getMethod())) {
            httpRequest = HttpRequest.post(url);
        }
        httpRequest.cookie(this.cookie)
                .header(headers, true);
        String body = httpRequest.execute().body();
        return GsonUtil.fromJson(body, request.getResponseClass());
    }

    public static void main(String[] args) {
        DouYinClient douYinClient = new DouYinClient();
        BaseParams baseParams = new BaseParams();
        baseParams.setRetry_type("no_retry");
        baseParams.setMcc_mnc("46001");
        baseParams.setIid("175561601975351");
        baseParams.setDevice_id("1213500227850904");
        baseParams.setAc("wifi");
        baseParams.setChannel("tianzhuo_dy_wifi1");
        baseParams.setAid("1128");
        baseParams.setApp_name("aweme");
        baseParams.setApp_type("normal");
        baseParams.setVersion_code("421");
        baseParams.setVersion_name("4.2.1");
        baseParams.setDevice_platform("android");
        baseParams.setSsmix("a");
        baseParams.setDevice_type("Redmi+Note+8+Pro");
        baseParams.setDevice_brand("Redmi");
        baseParams.setLanguage("zh");
        baseParams.setOs_api("29");
        baseParams.setOs_version("10");
        baseParams.setOpenudid("ce348c6bf7df0427");
        baseParams.setManifest_version_code("421");
        baseParams.setResolution("1080*2134");
        baseParams.setDpi("440");
        baseParams.setUpdate_version_code("4212");
//        baseParams.setJs_sdk_version("1.9.1");
        baseParams.setAs("a165d69cc0476f54520999");
        baseParams.setCp("627cf058072acc4de1QqYu");
        baseParams.setMas("013d2a53b928f8e974099b0be90d744b159c9c9c0c4cac2cac666c");
        douYinClient.cookie = "install_id=175561601975351; ttreq=1$b58700d61faec314340a870b0ec82de5f1a0a4fa; odin_tt=8691c0e9404cff945fd089a3210d5c1df7dc1313ee2ecb1805f71f8d71a45d3e4a7f62d6e0efed283a691b9b95856ee7";
        douYinClient.baseParams = baseParams;
        douYinClient.basicHeaders = new HashMap() {{
            put("Accept-Encoding", "gzip");
            put("sdk-version", "1");
//            put("User-Agent", "okhttp/3.10.0.1");
            put("User-Agent", "com.ss.android.ugc.aweme/421 (Linux; U; Android 10; zh_CN; Redmi Note 8 Pro; Build/QP1A.190711.020; Cronet/58.0.2991.0)");
            put("Connection", "Keep-Alive");
        }};
//        UserInfoRequest userInfoRequest = new UserInfoRequest();
////        userInfoRequest.setSec_user_id("MS4wLjABAAAAT_y6U7R-QeZ4C2tpyzFHaUlwoKmZQGg0x9YCW15soh4");
//        userInfoRequest.setUser_id("58814164483");
//        UserProfileResponse userProfileResponse = douYinClient.doAction(userInfoRequest);
//        System.out.println(GsonUtil.toJson(userProfileResponse));

//        AwemePostRequest awemePostRequest = new AwemePostRequest();
//        awemePostRequest.setMax_cursor(0);
////        awemePostRequest.setUser_id("58814164483");
//        awemePostRequest.setSec_user_id("MS4wLjABAAAAT_y6U7R-QeZ4C2tpyzFHaUlwoKmZQGg0x9YCW15soh4");
//        awemePostRequest.setCount(20);
//        AwemePostResponse awemePostResponse = douYinClient.doAction(awemePostRequest);
//        System.out.println(GsonUtil.toJson(awemePostResponse));
//        ForwardListRequest forwardListRequest = new ForwardListRequest();
//        forwardListRequest.setUser_id("58814164483");
//        forwardListRequest.setMax_cursor(0L);
//        forwardListRequest.setMin_cursor(0L);
//        forwardListRequest.setCount(20);
//        ForwardListResponse forwardListResponse = douYinClient.doAction(forwardListRequest);
//        System.out.println(GsonUtil.toJson(forwardListResponse));
        CommentListRequest commentListRequest = new CommentListRequest();
        commentListRequest.setAweme_id("6892336724219940108");
        commentListRequest.setCursor(20);
        commentListRequest.setCount(20);
        CommentListResponse commentListResponse = douYinClient.doAction(commentListRequest);
        System.out.println(GsonUtil.toJson(commentListResponse));
    }
}
