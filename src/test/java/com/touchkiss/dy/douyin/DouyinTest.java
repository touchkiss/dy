package com.touchkiss.dy.douyin;

import com.douyin.aweme.v1.bean.GeneralSearchSingleResponse;
import com.douyin.aweme.v1.bean.NearbyFeedResponse;
import com.douyin.aweme.v1.bean.AwemeInfo;
import com.douyin.aweme.v1.bean.UserResponse;
import com.douyin.aweme.v2.bean.CommentListResponse;
import com.touchkiss.dy.utils.*;
import org.apache.commons.io.FileUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicHeader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.*;
import java.util.stream.Collectors;

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
        String cookie = "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad";
        headers.add(new BasicHeader("Cookie", cookie));
        headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
        String url = "https://api5-core-c-lq.amemv.com/aweme/v1/user/profile/other/?sec_user_id=" + userid + "&address_book_access=2&from=0&publish_video_strategy_type=2&version_name=11.3.0&ts=" + (now / 1000) + "&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket=" + now + "&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
//        String gorgon = HttpUtil.post("http://192.168.8.232:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
//            put("url", url);
//        }}, headers);
        HashMap<String, String> headerMap = (HashMap<String, String>) headers.stream().collect(Collectors.toMap(Header::getName, Header::getValue));
        String gorgon = XGorgonUtil_V036.xGorgon(now/1000,url.substring(url.indexOf("?")+1),"", cookie);
        System.out.println("计算出："+gorgon);
        headers.add(new BasicHeader("X-Gorgon", gorgon));
//        System.out.println(SendRequest.sendGet(url, headers));
        String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, headers);
        System.out.println(response);
        UserResponse userResponse = GsonUtil.fromJson(response, UserResponse.class);
        System.out.println(userResponse.getUser().getNickname());
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
            String cookie = "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad";
            headers.add(new BasicHeader("Cookie", cookie));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            headers.add(new BasicHeader("x-common-params-v2", "os_api=19&device_platform=android&device_type=PCRT00&iid=69980830055940&version_code=110300&app_name=aweme&openudid=1062042365927853&device_id=2708807412624253&os_version=4.4.4&aid=1128&channel=aweGW&ssmix=a&manifest_version_code=110301&dpi=240&cdid=23083b87-0468-4aba-b87a-1b14297f826a&version_name=11.3.0&resolution=720*1280&language=zh&device_brand=OPPO&app_type=normal&ac=wifi&update_version_code=11309900&uuid=865746239395652"));
            String url = "https://api3-core-c-lq.amemv.com/aweme/v2/feed/?type=0&max_cursor=0&min_cursor=0&count=6&volume=0.73&pull_type=0&need_relieve_aweme=0&filter_warn=0&req_from=enter_auto&is_cold_start=1&longitude=121.492479&latitude=31.247221&address_book_access=2&gps_access=1&cached_item_num=0&last_ad_show_interval=-1&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&download_sdk_info=%7B%22space_unoccupied%22%3A5544624%7D&action_mask=-1&teen_protector_vote_aweme_count=0&last_teen_protector_vote_aweme_interval=0&ts="+(now/1000)+"&_rticket="+now+"&cpu_support64=false&mcc_mnc=46000&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&";
//            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
//                put("url", url);
//            }}, headers);
            HashMap<String, String> headerMap = (HashMap<String, String>) headers.stream().collect(Collectors.toMap(Header::getName, Header::getValue));
            String gorgon = XGorgonUtil_V036.xGorgon(now/1000,url.substring(url.indexOf("?")+1),"", cookie);
            System.out.println("计算出："+gorgon);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            CloseableHttpResponse response = HttpUtil.getResponse(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, headers);
            HttpEntity httpEntity = response.getEntity();
            InputStream content = httpEntity.getContent();
            FileUtils.copyInputStreamToFile(content,new File("D:\\feed.bin"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testGeneralSingleSearch(){
        try {
            long now = System.currentTimeMillis();
            List<Header> headers = new ArrayList<>();
            String keyword="国庆节";
            int offset=0,count=20;
            String body="keyword="+ URLEncoder.encode(keyword,"UTF-8") +"&offset="+offset+"&count="+count+"&is_pull_refresh=0&search_source=normal_search&hot_search=0&latitude=31.247221&longitude=121.492479&search_id=&query_correct_type=1&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&is_filter_search=0&sort_type=0&publish_time=0&disable_synthesis=0&multi_mod=0&single_filter_aladdin=0&client_width=480&client_height=853&dynamic_type=0&epidemic_card_type=0&enter_from=homepage_hot";
            headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("X-SS-STUB", MD5Util.MD5(body).toUpperCase()));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("Accept-Encoding", "gzip"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
        headers.add(new BasicHeader("Cookie", "odin_tt=f5e3b3e5aef95c660d1c3e7bdc86dbdfb5eab65dbd4b0c2ab65c1d337c9a2c847b2574e088e031ef3b51506ff3325d8fcc9b6d864a34612a0c3dc94ff2b14f87; install_id=69980830055940; ttreq=1$0e2fdb6d7beec72990d442f1118f7bb13c1b87eb"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://search-hl.amemv.com/aweme/v1/general/search/single/?version_name=11.3.0&ts="+(now/1000)+"&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket="+now+"&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.post(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT,HttpUtil.DEFAULT_CHARSET,body, headers);
            System.out.println(response);
            GeneralSearchSingleResponse generalSearchSingleResponse = GsonUtil.fromJson(response, GeneralSearchSingleResponse.class);
            for (GeneralSearchSingleResponse.DataBean datum : generalSearchSingleResponse.getData()) {
                if (datum.getAweme_info()!=null){
                    System.out.println(datum.getAweme_info().getAuthor().getNickname());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
