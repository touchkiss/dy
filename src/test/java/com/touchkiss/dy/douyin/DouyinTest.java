package com.touchkiss.dy.douyin;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import com.douyin.aweme.v1.NearbyFeedResponse;
import com.douyin.aweme.v1.AwemeInfo;
import com.douyin.aweme.v1.UserProfileResponse;
import com.douyin.aweme.v2.CommentListResponse;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.HttpUtil;
import com.touchkiss.dy.utils.MD5Util;
import org.apache.commons.io.FileUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicHeader;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created on 2020/09/16 10:01
 *
 * @author Touchkiss
 */
public class DouyinTest {
    @Test
    public void testProfile() throws IOException {
        long now = System.currentTimeMillis();
        String userid = "MS4wLjABAAAAjSSqouhinGIiV0qnn_e0k-GDyhFZatWmyrEw6dFkXKQ";
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
        headers.add(new BasicHeader("X-SS-DP", "1128"));
        headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
        headers.add(new BasicHeader("Accept-Encoding", "gzip"));
        headers.add(new BasicHeader("sdk-version", "1"));
        headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
//        headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
        headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
        String url = "https://api5-core-c-lq.amemv.com/aweme/v1/user/profile/other/?sec_user_id=" + userid + "&address_book_access=2&from=0&publish_video_strategy_type=2&version_name=11.3.0&ts=" + (now / 1000) + "&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket=" + now + "&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
        String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
            put("url", url);
        }}, headers);
        headers.add(new BasicHeader("X-Gorgon", gorgon));
//        System.out.println(SendRequest.sendGet(url, headers));
        String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, headers);
        System.out.println(response);
        UserProfileResponse userProfileResponse = GsonUtil.fromJson(response, UserProfileResponse.class);
        System.out.println(userProfileResponse.getUser().getNickname());
    }

    @Test
    public void testComments() throws IOException {
        long now = System.currentTimeMillis();
        String awemeId = "6858429635630255360";
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
        headers.add(new BasicHeader("X-SS-DP", "1128"));
        headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
        headers.add(new BasicHeader("Accept-Encoding", "gzip"));
        headers.add(new BasicHeader("sdk-version", "1"));
        headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
//        headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
        headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
        String url = "https://api3-normal-c-lq.amemv.com/aweme/v2/comment/list/?aweme_id=" + awemeId + "&cursor=0&count=20&address_book_access=2&gps_access=1&forward_page_type=1&channel_id=3&city=310000&hotsoon_filtered_count=0&hotsoon_has_more=0&follower_count=0&is_familiar=0&page_source=0&version_name=11.3.0&ts=" + (now / 1000) + "&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket=" + now + "&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
        String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
            put("url", url);
        }}, headers);
        headers.add(new BasicHeader("X-Gorgon", gorgon));
        String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, headers);
        CommentListResponse commentListResponse = GsonUtil.fromJson(response, CommentListResponse.class);
        for (CommentListResponse.CommentsBean comment : commentListResponse.getComments()) {
            System.out.println(comment.getText());
        }
    }
    @Test
    public void testNearbyFeed(){
        try {
            long now = System.currentTimeMillis();
            int city=310000;
            List<Header> headers = new ArrayList<>();
            headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("Accept-Encoding", "gzip"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
//        headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://api100-core-c-lq.amemv.com/aweme/v1/nearby/feed/?max_cursor=0&min_cursor=0&count=20&feed_style=1&filter_warn=0&city="+city+"&latitude=31.247221&longitude=121.492479&poi_class_code=0&pull_type=0&location_permission=1&nearby_distance=0&roam_city_name&insert_fresh_aweme_ids&insert_fresh_type=0&version_name=11.3.0&ts="+(now/1000)+"&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket="+now+"&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, headers);
            NearbyFeedResponse nearbyFeedResponse = GsonUtil.fromJson(response, NearbyFeedResponse.class);
            for (AwemeInfo awemeInfo : nearbyFeedResponse.getAweme_list()) {
                System.out.println(awemeInfo.getDesc());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testFeed(){
        try {
            long now = System.currentTimeMillis();
            int city=310000;
            List<Header> headers = new ArrayList<>();
            headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("Accept-Encoding", "gzip"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
        headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            headers.add(new BasicHeader("x-common-params-v2", "os_api=19&device_platform=android&device_type=PCRT00&iid=69980830055940&version_code=110300&app_name=aweme&openudid=1062042365927853&device_id=2708807412624253&os_version=4.4.4&aid=1128&channel=aweGW&ssmix=a&manifest_version_code=110301&dpi=240&cdid=23083b87-0468-4aba-b87a-1b14297f826a&version_name=11.3.0&resolution=720*1280&language=zh&device_brand=OPPO&app_type=normal&ac=wifi&update_version_code=11309900&uuid=865746239395652"));
            String url = "https://api3-core-c-lq.amemv.com/aweme/v2/feed/?type=0&max_cursor=0&min_cursor=0&count=6&volume=0.73&pull_type=0&need_relieve_aweme=0&filter_warn=0&req_from=enter_auto&is_cold_start=1&longitude=121.492479&latitude=31.247221&address_book_access=2&gps_access=1&cached_item_num=0&last_ad_show_interval=-1&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&download_sdk_info=%7B%22space_unoccupied%22%3A5544624%7D&action_mask=-1&teen_protector_vote_aweme_count=0&last_teen_protector_vote_aweme_interval=0&ts="+(now/1000)+"&_rticket="+now+"&cpu_support64=false&mcc_mnc=46000&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            CloseableHttpResponse response = HttpUtil.getResponse(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, headers);
            HttpEntity httpEntity = response.getEntity();
            InputStream content = httpEntity.getContent();
            FileUtils.copyInputStreamToFile(content,new File("D:\\feed.bin"));
//            NearbyFeedResponse nearbyFeedResponse = GsonUtil.fromJson(response, NearbyFeedResponse.class);
//            for (AwemeInfo awemeInfo : nearbyFeedResponse.getAweme_list()) {
//                System.out.println(awemeInfo.getDesc());
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
    } @Test
    public void testWebcastRoomMessage(){
        try {
            long now = System.currentTimeMillis();
            long room=6874085960708016910L;
            String body = "internal_ext=fetch_time%3A" + now + "%7Cstart_time%3A1600499029267%7Cfetch_id%3A6874091025489463073%7Cflag%3A0%7Cseq%3A807&identity=audience&cursor=" + now + "_6874091038374364965_1_1&resp_content_type=protobuf&parse_cnt=1&user_id=0&recv_cnt=1&last_rtt=50&live_id=1";
            List<Header> headers = new ArrayList<>();
            headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("X-SS-STUB", MD5Util.MD5(body).toUpperCase()));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("Accept-Encoding", "gzip"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
        headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://quic-amemv-all-lq.snssdk.com/webcast/room/"+room+"/_fetch_message_polling/?webcast_sdk_version=1540&webcast_language=zh&webcast_locale=zh_CN&version_name=11.3.0&ts="+(now/1000)+"&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket="+now+"&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            CloseableHttpResponse response = HttpUtil.postResponse(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT,HttpUtil.DEFAULT_CHARSET, body, headers);
            HttpEntity httpEntity = response.getEntity();
            InputStream content = httpEntity.getContent();
            FileUtils.copyInputStreamToFile(content,new File("D:\\message\\roomMessage"+now+".bin"));
//            NearbyFeedResponse nearbyFeedResponse = GsonUtil.fromJson(response, NearbyFeedResponse.class);
//            for (AwemeInfo awemeInfo : nearbyFeedResponse.getAweme_list()) {
//                System.out.println(awemeInfo.getDesc());
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void pressure() throws IOException, InterruptedException {

        for (int i = 0; i < 200; i++) {
            testWebcastRoomMessage();
            Thread.sleep(1000);
        }
    }
}
