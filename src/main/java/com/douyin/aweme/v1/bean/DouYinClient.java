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
 * Created on 2020/09/16 10:01
 *
 * @author Touchkiss
 */
@Data
public class DouYinClient {
    private String cookie;
    private BaseParams baseParams;
    private Map<String, String> basicHeaders;

    @Data
    public static class BaseParams {
        private String ac;
        private String aid;
        private String app_name;
        private String app_type;
        private String appTheme;
        private String as;
        private String channel;
        private String cp;
        private String cpu_support64;
        private String device_brand;
        private String device_id;
        private String device_platform;
        private String device_type;
        private String dpi;
        private String host_abi;
        private String iid;
        private String js_sdk_version;
        private String language;
        private String manifest_version_code;
        private String mas;
        private String mcc_mnc;
        private String oaid;
        private String os_api;
        private String os_version;
        private String openudid;
        private String resolution;
        private String retry_type;
        private String ssmix;
        private String update_version_code;
        private String version_code;
        private String version_name;
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
                    headers.put(headerName, Collections.singletonList(XGorgonUtil_V036.xGorgon(ts, params, "", cookie)));
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
        System.out.println(body);
        return GsonUtil.fromJson(body, request.getResponseClass());
    }

    public static DouYinClient getInstance(){
        DouYinClient douYinClient = new DouYinClient();
        BaseParams baseParams = new BaseParams();
        baseParams.setCpu_support64("true");
        baseParams.setHost_abi("arm64-v8a");
        baseParams.setAppTheme("dark");
        baseParams.setOaid("6292668db7e5f1fc");
        baseParams.setRetry_type("no_retry");
        baseParams.setMcc_mnc("46001");
        baseParams.setIid("650551645976190");
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
//        baseParams.setAs("a165d69cc0476f54520999");
//        baseParams.setCp("627cf058072acc4de1QqYu");
//        baseParams.setMas("013d2a53b928f8e974099b0be90d744b159c9c9c0c4cac2cac666c");
        douYinClient.cookie = "install_id=650551645976190; ttreq=1$c08d790d460d136d144a6c2a90a866b4ac9fa076; odin_tt=afbb4d09f9287d86ec70bc289d4b6dd9fe9b5de17b7ea45693ba89a2e164cca436d9b150a6d59215f671d0203321a56b58ba02dbd8fc43ec3ce2b62d6a1b9b19";
        douYinClient.baseParams = baseParams;
        douYinClient.basicHeaders = new HashMap() {{
            put("Accept-Encoding", "gzip");
            put("sdk-version", "1");
//            put("User-Agent", "okhttp/3.10.0.1");
            put("User-Agent", "com.ss.android.ugc.aweme/421 (Linux; U; Android 10; zh_CN; Redmi Note 8 Pro; Build/QP1A.190711.020; Cronet/58.0.2991.0)");
            put("Connection", "Keep-Alive");
            put("X-SS-QUERIES", "dGMCDL6ot3awALq29MzedztVVY75xqwVa8tRSsSsmUjE367hsCodObDoQxwPFtATrSW5sLBSiDi9Z7QeCxbeHZVp29e9ChDM%2FYIAasRHoamiw9uHvhzMqLAMW7Y2RZqrDKEMW%2Fn9rBVv2tUAN96aYfixhAo%3D");
            put("X-Pods", " ");
            put("X-SS-RS", "0");
        }};
        return douYinClient;
    }

    public static void main(String[] args) throws InterruptedException {

//        UserInfoRequest userInfoRequest = new UserInfoRequest();
////        userInfoRequest.setSec_user_id("MS4wLjABAAAAT_y6U7R-QeZ4C2tpyzFHaUlwoKmZQGg0x9YCW15soh4");
//        userInfoRequest.setUser_id("58814164483");
//        UserInfoResponse userProfileResponse = douYinClient.doAction(userInfoRequest);
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
//        List<String> awemeList = Arrays.asList("6749300646844943628");
//        for (String awemeid : awemeList) {
//            int cursor = 0;
//            System.out.println("当前awemeid：" + awemeid);
//            while (true) {
//                try {
//                    CommentListRequest commentListRequest = new CommentListRequest();
//                    commentListRequest.setAweme_id(awemeid);
//                    commentListRequest.setCursor(cursor);
//                    commentListRequest.setCount(20);
//                    CommentListResponse commentListResponse = douYinClient.doAction(commentListRequest);
//                    for (CommentListResponse.CommentsBean comment : commentListResponse.getComments()) {
//                        System.out.println(comment.getText());
//                    }
//                    cursor += 20;
//                    Thread.sleep(1000);
//                } catch (Exception e) {
////                    e.printStackTrace();
//                    break;
//                }
//            }
//
//        }
//        MusicDetailRequest musicDetailRequest = new MusicDetailRequest();
//        musicDetailRequest.setMusic_id("6889957451349674760");
//        musicDetailRequest.setClick_reason("0");
//        MusicDetailResponse musicDetailResponse = douYinClient.doAction(musicDetailRequest);
//        System.out.println(GsonUtil.toJson(musicDetailResponse));

//        MusicAwemeListRequest musicAwemeListRequest=new MusicAwemeListRequest();
//        musicAwemeListRequest.setMusic_id("6889957451349674760");
//        musicAwemeListRequest.setCursor(0);
//        musicAwemeListRequest.setCount(16);
//        musicAwemeListRequest.setType(6);
//        MusicAwemeListResponse musicAwemeListResponse = douYinClient.doAction(musicAwemeListRequest);
//        System.out.println(GsonUtil.toJson(musicAwemeListResponse));

//        MusicFreshAwemeListRequest musicFreshAwemeListRequest=new MusicFreshAwemeListRequest();
//        musicFreshAwemeListRequest.setMusic_id("6889957451349674760");
//        musicFreshAwemeListRequest.setCursor(0);
//        musicFreshAwemeListRequest.setCount(20);
//        musicFreshAwemeListRequest.setType(6);
//        MusicFreshAwemeListResponse musicFreshAwemeListResponse = douYinClient.doAction(musicFreshAwemeListRequest);
//        System.out.println(GsonUtil.toJson(musicFreshAwemeListResponse));

//        try {
//            SearchSugRequest searchSugRequest = new SearchSugRequest();
//            searchSugRequest.setKeyword(URLEncoder.encode("元旦", "utf-8"));
//            searchSugRequest.setSource("general");
//            SearchSugResponse searchSugResponse = douYinClient.doAction(searchSugRequest);
//            System.out.println(GsonUtil.toJson(searchSugResponse));
//        } catch (Exception e) {
//
//        }

//        HotSearchListRequest hotSearchListRequest = new HotSearchListRequest();
//        hotSearchListRequest.setDetail_list("0");
//        HotSearchListResponse hotSearchListResponse = douYinClient.doAction(hotSearchListRequest);
//        System.out.println(GsonUtil.toJson(hotSearchListResponse));

//        try {
//            GeneralSearchSingleRequest generalSearchSingleRequest = new GeneralSearchSingleRequest();
//            generalSearchSingleRequest.setKeyword(URLEncoder.encode("圣诞节","utf-8"));
//            GeneralSearchSingleResponse generalSearchSingleResponse = douYinClient.doAction(generalSearchSingleRequest);
//            System.out.println(GsonUtil.toJson(generalSearchSingleResponse));
//        }catch (Exception e){
//
//        }
//        NearbyFeedRequest nearbyFeedRequest = new NearbyFeedRequest();
//        NearbyFeedResponse nearbyFeedResponse = getInstance().doAction(nearbyFeedRequest);
//        System.out.println(GsonUtil.toJson(nearbyFeedResponse));

//        FeedRequest feedRequest = new FeedRequest();
//        FeedResponse feedResponse = getInstance().doAction(feedRequest);
//        System.out.println(GsonUtil.toJson(feedResponse));
//        HotsearchAwemeBillboardRequest hotsearchAwemeBillboardRequest = new HotsearchAwemeBillboardRequest();
//        System.out.println(GsonUtil.toJson(getInstance().doAction(hotsearchAwemeBillboardRequest)));

//        MixDetailRequest mixDetailRequest = new MixDetailRequest();
//        mixDetailRequest.setMix_id("6826190273844873230");
//        MixDetailResponse mixDetailResponse = getInstance().doAction(mixDetailRequest);
//        System.out.println(GsonUtil.toJson(mixDetailResponse));

        MixAwemeRequest mixAwemeRequest = new MixAwemeRequest();
        mixAwemeRequest.setMix_id("6826190273844873230");
        MixAwemeResponse mixAwemeResponse = getInstance().doAction(mixAwemeRequest);
        System.out.println(GsonUtil.toJson(mixAwemeResponse));
    }
}
