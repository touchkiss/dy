package com.douyin.aweme.v1.bean;

import cn.hutool.http.HttpRequest;
import com.douyin.aweme.v2.bean.PlatformShareCommandTransRequest;
import com.douyin.aweme.v2.bean.PlatformShareCommandTransResponse;
import com.google.gson.Gson;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.XGorgonUtil_V036;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.net.URLEncoder;
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
        System.out.println(body);
        return GsonUtil.fromJson(body, request.getResponseClass());
    }

    public static DouYinClient getInstance() {
        DouYinClient douYinClient = new DouYinClient();
        BaseParams baseParams = new BaseParams();
        baseParams.setCpu_support64("true");
        baseParams.setHost_abi("arm64-v8a");
        baseParams.setAppTheme("dark");
        baseParams.setOaid("6292668db7e5f1fc");
        baseParams.setRetry_type("no_retry");
        baseParams.setMcc_mnc("46001");
        baseParams.setIid("105196150336925");
        baseParams.setDevice_id("1213500227850904");
        baseParams.setAc("wifi");
        baseParams.setChannel("wandoujia_aweme1");
        baseParams.setAid("1128");
        baseParams.setApp_name("aweme");
        baseParams.setApp_type("normal");
        baseParams.setVersion_code("721");
        baseParams.setVersion_name("7.2.1");
        baseParams.setDevice_platform("android");
        baseParams.setSsmix("a");
        baseParams.setDevice_type("Redmi+Note+8+Pro");
        baseParams.setDevice_brand("Redmi");
        baseParams.setLanguage("zh");
        baseParams.setOs_api("29");
        baseParams.setOs_version("10");
        baseParams.setOpenudid("ce348c6bf7df0427");
        baseParams.setManifest_version_code("721");
        baseParams.setResolution("1080*2134");
        baseParams.setDpi("440");
        baseParams.setUpdate_version_code("4212");
        baseParams.setJs_sdk_version("1.19.2.0");
//        baseParams.setAs("a165d69cc0476f54520999");
//        baseParams.setCp("627cf058072acc4de1QqYu");
//        baseParams.setMas("013d2a53b928f8e974099b0be90d744b159c9c9c0c4cac2cac666c");
        douYinClient.cookie = "odin_tt=8e4d37f8f4677252fc66224cb794b3bf2e65714ff5c1554aaa9099ed3e8896d4ca324897e43a005259d8b6fda4585b90";
        douYinClient.baseParams = baseParams;
        douYinClient.basicHeaders = new HashMap() {{
            put("Accept-Encoding", "gzip");
            put("sdk-version", "1");
//            put("User-Agent", "okhttp/3.10.0.1");
            put("User-Agent", "com.ss.android.ugc.aweme/721 (Linux; U; Android 10; zh_CN; Redmi Note 8 Pro; Build/QP1A.190711.020; Cronet/58.0.2991.0)");
            put("Connection", "Keep-Alive");
            put("X-SS-QUERIES", "dGMCDL6ot3awALq29MzedztVVY75xqwVa8tRSsSsmUjE367hsCodObDoQxwPFtATrSW5sLBSiDi9Z7QeCxbeHZVp29e9ChDM%2FYIAasRHoamiw9uHvhzMqLAMW7Y2RZqrDKEMW%2Fn9rBVv2tUAN96aYfixhAo%3D");
            put("X-Pods", " ");
            put("X-SS-RS", "0");
        }};
        return douYinClient;
    }

    public static void main(String[] args) throws Exception {

        UserRequest userInfoRequest = new UserRequest();
        userInfoRequest.setSec_user_id("MS4wLjABAAAAY1jwiMWneNkXcflxlw9vPUW1ZvG71QSuLhFIsJo7GovhjYWXw8mpUwJlUKloDEUZ");
//        userInfoRequest.setUser_id("58814164483");
        UserResponse userProfileResponse = getInstance().doAction(userInfoRequest);
        System.out.println(GsonUtil.toJson(userProfileResponse));

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
//        musicDetailRequest.setMusic_id("6456638950865029902");
//        musicDetailRequest.setClick_reason("0");
//        MusicDetailResponse musicDetailResponse = getInstance().doAction(musicDetailRequest);
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
//            GeneralSearchSingleResponse generalSearchSingleResponse = getInstance().doAction(generalSearchSingleRequest);
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

//        MixAwemeRequest mixAwemeRequest = new MixAwemeRequest();
//        mixAwemeRequest.setMix_id("6826190273844873230");
//        MixAwemeResponse mixAwemeResponse = getInstance().doAction(mixAwemeRequest);
//        System.out.println(GsonUtil.toJson(mixAwemeResponse));

//        HotsearchStarBillboardRequest hotsearchStarBillboardRequest = new HotsearchStarBillboardRequest();
//        HotsearchStarBillboardResponse hotsearchStarBillboardResponse = getInstance().doAction(hotsearchStarBillboardRequest);
//        System.out.println(GsonUtil.toJson(hotsearchStarBillboardResponse));


//        WebcastRanklistHotRequest webcastRanklistHotRequest = new WebcastRanklistHotRequest();
//        System.out.println(GsonUtil.toJson(getInstance().doAction(webcastRanklistHotRequest)));

//        ChartMusicListRequest chartMusicListRequest = new ChartMusicListRequest();
//        System.out.println(GsonUtil.toJson(getInstance().doAction(chartMusicListRequest)));

//        BranchBillboardEntranceRequest branchBillboardEntranceRequest = new BranchBillboardEntranceRequest();
//        System.out.println(GsonUtil.toJson(getInstance().doAction(branchBillboardEntranceRequest)));

//        HotsearchBrandCategoryRequest hotsearchBrandCategoryRequest = new HotsearchBrandCategoryRequest();
//        System.out.println(GsonUtil.toJson(getInstance().doAction(hotsearchBrandCategoryRequest)));

//        HotsearchBrandWeeklyListRequest hotsearchBrandWeeklyListRequest = new HotsearchBrandWeeklyListRequest();
//        System.out.println(GsonUtil.toJson(getInstance().doAction(hotsearchBrandWeeklyListRequest)));

//        HotsearchBrandBillboardRequest hotsearchBrandBillboardRequest = new HotsearchBrandBillboardRequest();
//        System.out.println(GsonUtil.toJson(getInstance().doAction(hotsearchBrandBillboardRequest)));
//
//        PoiAwemeRequest poiAwemeRequest = new PoiAwemeRequest();
//        poiAwemeRequest.setPoi_id("6679538858037725191");
//        poiAwemeRequest.setAweme_id("6902755433556036878");
//        System.out.println(GsonUtil.toJson(getInstance().doAction(poiAwemeRequest)));

//        PoiDetailRequest poiDetailRequest = new PoiDetailRequest();
//        poiDetailRequest.setPoi_id("6679538858037725191");
//        poiDetailRequest.setItem_id("6902755433556036878");
//        System.out.println(GsonUtil.toJson(getInstance().doAction(poiDetailRequest)));

//        AwemeFavoriteRequest awemeFavoriteRequest = new AwemeFavoriteRequest();
//        awemeFavoriteRequest.setUser_id(58548061709L);
////        awemeFavoriteRequest.setSec_user_id("MS4wLjABAAAAM6JVXq80BLR7m2fjOyFso0NmUd_vE9Gv6zdviKawR0o");
//        System.out.println(GsonUtil.toJson(getInstance().doAction(awemeFavoriteRequest)));

//        ChallengeDetailRequest challengeDetailRequest = new ChallengeDetailRequest();
//        challengeDetailRequest.setHashtag_name(URLEncoder.encode("圣诞节","utf-8"));
//        System.out.println(GsonUtil.toJson(getInstance().doAction(challengeDetailRequest)));

//        ChallengeAwemeRequest challengeAwemeRequest = new ChallengeAwemeRequest();
//        challengeAwemeRequest.setHashtag_name(URLEncoder.encode("圣诞节","utf-8"));
//        System.out.println(GsonUtil.toJson(getInstance().doAction(challengeAwemeRequest)));

//        ShortenRequest shortenRequest = new ShortenRequest();
//        shortenRequest.setTarget(URLEncoder.encode("http://tool.chinaz.com/Tools/unixtime.aspx","utf-8"));
//        ShortenResponse shortenResponse = getInstance().doAction(shortenRequest);
//        System.out.println(GsonUtil.toJson(shortenResponse));

//        PlatformShareCommandTransRequest platformShareCommandTransRequest = new PlatformShareCommandTransRequest();
//        platformShareCommandTransRequest.setCommand(URLEncoder.encode("##uDrQ76eHXd8##","utf-8"));
//        PlatformShareCommandTransResponse platformShareCommandTransResponse = getInstance().doAction(platformShareCommandTransRequest);
//        System.out.println(GsonUtil.toJson(platformShareCommandTransResponse));

//        StickerDetailRequest stickerDetailRequest = new StickerDetailRequest();
//        stickerDetailRequest.setSticker_ids(645185);
//        StickerDetailResponse stickerDetailResponse = getInstance().doAction(stickerDetailRequest);
//        System.out.println(GsonUtil.toJson(stickerDetailResponse));

//        StickerAwemeRequest stickerAwemeRequest = new StickerAwemeRequest();
//        stickerAwemeRequest.setSticker_id(645185);
//        System.out.println(GsonUtil.toJson(getInstance().doAction(stickerAwemeRequest)));


//        MixListRequest mixListRequest = new MixListRequest();
//        mixListRequest.setUser_id(58686979942L);
////        mixListRequest.setSec_user_id("MS4wLjABAAAAuRrM8MTRNOaHtnKXcCkKHbSNGjF2jOyyBEckGLnT8aM");
//        System.out.println(GsonUtil.toJson(getInstance().doAction(mixListRequest)));


//        OriginalMusicListRequest originalMusicListRequest = new OriginalMusicListRequest();
//        originalMusicListRequest.setUser_id(80430828164L);
//        originalMusicListRequest.setSec_user_id("MS4wLjABAAAAcZGzyELZy3zQ9m3XBFl9rq3Z9_mlEDfrQTxE7Lxuz2o");
//        System.out.println(GsonUtil.toJson(getInstance().doAction(originalMusicListRequest)));
    }
}
