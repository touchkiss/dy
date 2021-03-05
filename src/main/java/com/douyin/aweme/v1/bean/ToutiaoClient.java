package com.douyin.aweme.v1.bean;

import cn.hutool.http.HttpRequest;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.XGorgonUtil_V036;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created on 2021/03/04 15:42
 *
 * @author Touchkiss
 */
public class ToutiaoClient {
    private String cookie;
    private BaseParams baseParams;
    private Map<String, String> basicHeaders;

    @Data
    public static class BaseParams {
        private String manifest_version_code;
        private String _rticket;
        private String iid;
        private String channel;
        private String device_type;
        private String language;
        private String host_abi;
        private String resolution;
        private String openudid;
        private String update_version_code;
        private String cdid;
        private String os_api;
        private String mac_address;
        private String dpi;
        private String oaid;
        private String ab_feature;
        private String ac;
        private String device_id;
        private String os_version;
        private String version_code;
        private String tma_jssdk_version;
        private String app_name;
        private String ab_version;
        private String version_name;
        private String plugin;
        private String device_brand;
        private String ssmix;
        private String device_platform;
        private String aid;
        private String rom_version;
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
                    if (o != null) {
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
                    String gorgon = XGorgonUtil_V036.xGorgon(ts, params, "", cookie);
                    System.out.println("gorgon:" + gorgon);
                    headers.put(headerName, Collections.singletonList(gorgon));
                } else if ("Host".equals(headerName)) {
                    headers.put(headerName, Collections.singletonList(request.Host));
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

    public static ToutiaoClient getInstance() {
        ToutiaoClient toutiaoClient = new ToutiaoClient();
        ToutiaoClient.BaseParams baseParams = new ToutiaoClient.BaseParams();
        baseParams.setManifest_version_code("7990");
//        baseParams.set_rticket();
        baseParams.setIid("3430117366318008");
        baseParams.setChannel("xiaomi_13_64");
        baseParams.setDevice_type("Redmi+Note+8+Pro");
        baseParams.setLanguage("zh");
        baseParams.setHost_abi("arm64-v8a");
        baseParams.setResolution("1080*2134");
        baseParams.setOpenudid("ce348c6bf7df0427");
        baseParams.setUpdate_version_code("79910");
        baseParams.setCdid("590208d4-76e3-49b4-82e9-79a316ed6e9e");
        baseParams.setOs_api("29");
        baseParams.setMac_address("98%3AF6%3A21%3A63%3AC7%3AC8");
        baseParams.setDpi("440");
        baseParams.setOaid("6292668db7e5f1fc");
        baseParams.setAb_feature("94563%2C102749");
        baseParams.setAc("wifi");
        baseParams.setDevice_id("1213500227850904");
        baseParams.setOs_version("10");
        baseParams.setVersion_code("799");
        baseParams.setTma_jssdk_version("1.90.1.4");
        baseParams.setApp_name("news_article");
        baseParams.setAb_version("2481295%2C2493335%2C2462946%2C2466154%2C2247463%2C2001178%2C1593455%2C668775%2C2480962%2C2480957%2C668779%2C660830%2C2480624%2C2480960%2C662176%2C2480944%2C1859937%2C2480910%2C662099%2C668774%2C2453679%2C2480951%2C2184401%2C2197734%2C2379365");
        baseParams.setVersion_name("7.9.9");
        baseParams.setPlugin("0");
        baseParams.setDevice_brand("Redmi");
        baseParams.setSsmix("a");
        baseParams.setDevice_platform("android");
        baseParams.setAid("13");
        baseParams.setRom_version("miui_v12_20.11.11");


        toutiaoClient.cookie = "odin_tt=1cc676da932e953f58e30c96e5134a4b51b45f1b95bb813a54a67ae6ff08de4ea44be5b51064ac0ddaa51a008f893a18e08e6cde27902b1bc807650ed93fea1e;";
        toutiaoClient.baseParams = baseParams;
        toutiaoClient.basicHeaders = new HashMap() {{
            put("Accept-Encoding", "gzip");
            put("sdk-version", "2");
//            put("User-Agent", "okhttp/3.10.0.1");
            put("User-Agent", "com.ss.android.article.news/7990 (Linux; U; Android 10; zh_CN; Redmi Note 8 Pro; Build/QP1A.190711.020; Cronet/TTNetVersion:58eeeb7f 2020-11-03 QuicVersion:47946d2a 2020-10-14)");
            put("Connection", "Keep-Alive");
//            put("X-SS-QUERIES", "dGMCDL6ot3awALq29MzedztVVY75xqwVa8tRSsSsmUjE367hsCodObDoQxwPFtATrSW5sLBSiDi9Z7QeCxbeHZVp29e9ChDM%2FYIAasRHoamiw9uHvhzMqLAMW7Y2RZqrDKEMW%2Fn9rBVv2tUAN96aYfixhAo%3D");
//            put("X-Pods", " ");
//            put("X-SS-RS", "0");
            put("x-tt-trace-id","00-fc2d174b0d44fac0a0412989bba9000d-fc2d174b0d44fac0-01");
        }};
        return toutiaoClient;
    }

    public static void main(String[] args) {
        for (int j = 0; j < 3; j++) {
            for (int i = 1; i < 20; i++) {
                ToutiaoFeedNormandyNewestRequest toutiaoFeedNormandyNewestRequest = new ToutiaoFeedNormandyNewestRequest();
                toutiaoFeedNormandyNewestRequest.setNormandy_local_id("110000");
//                toutiaoFeedNormandyNewestRequest.setNormandy_category("edu");
                toutiaoFeedNormandyNewestRequest.setCategory("normandy_newest");
                toutiaoFeedNormandyNewestRequest.setQuery_id(String.valueOf(i));
                toutiaoFeedNormandyNewestRequest.setOffset(String.valueOf((i-1)*15));
                toutiaoFeedNormandyNewestRequest.setCount("15");
                ToutiaoFeedNormandyNewestResponse toutiaoFeedNormandyNewestResponse = getInstance().doAction(toutiaoFeedNormandyNewestRequest);
                System.out.println(toutiaoFeedNormandyNewestResponse.getData().size());
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            }
        }
    }
}
