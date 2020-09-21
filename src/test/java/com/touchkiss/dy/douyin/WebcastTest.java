package com.touchkiss.dy.douyin;

import com.douyin.webcast.*;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.HttpUtil;
import com.touchkiss.dy.utils.MD5Util;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicHeader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created on 2020/09/21 16:30
 *
 * @author Touchkiss
 */
public class WebcastTest {
    static{
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "stdout");
    }
    @Test
    public void testWebcastRoomMessage() {
        try {
            long now = System.currentTimeMillis();
            long room = 6874848272780167936L;
            String body = "internal_ext=fetch_time%3A" + now + "%7Cstart_time%3A1600676014227%7Cack_ids%3A6874851130582452999_1cd4%7Cfetch_id%3A6874851127326675828%7Cflag%3A1%7Cseq%3A5&identity=audience&cursor=" + now + "_6874851131621643132_1_1&resp_content_type=protobuf&parse_cnt=4&user_id=0&recv_cnt=4&last_rtt=254&live_id=1";
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
            String url = "https://quic-amemv-all-lq.snssdk.com/webcast/room/" + room + "/_fetch_message_polling/?webcast_sdk_version=1540&webcast_language=zh&webcast_locale=zh_CN&version_name=11.3.0&ts=" + (now / 1000) + "&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket=" + now + "&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            CloseableHttpResponse response = HttpUtil.postResponse(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, body, headers);
            HttpEntity httpEntity = response.getEntity();
            InputStream content = httpEntity.getContent();
            ProtobufTest protobufTest = new ProtobufTest();
            protobufTest.parseMessage(content);
//            FileUtils.copyInputStreamToFile(content,new File("D:\\message\\roomMessage"+now+".bin"));
//            NearbyFeedResponse nearbyFeedResponse = GsonUtil.fromJson(response, NearbyFeedResponse.class);
//            for (AwemeInfo awemeInfo : nearbyFeedResponse.getAweme_list()) {
//                System.out.println(awemeInfo.getDesc());
//            }
        } catch (Exception e) {
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

    /**
     * 点击左上角直接进入推荐的直播，此接口是获取直播推荐列表
     */
    @Test
    public void feedWebcast(){
        try {
            long now = System.currentTimeMillis();
            List<Header> headers = new ArrayList<>();
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("Accept-Encoding", "gzip"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
            headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://webcast3-core-c-lq.amemv.com/webcast/feed/?cate_id=0&channel_id=21&content_type=0&req_type=0&show_location=0&style=3&sub_channel_id=0&sub_type=live_merge&tab_id=1&type=live&max_time=0&req_from=enter_auto_feed_draw_refresh&is_draw=0&draw_room_id=-1&draw_room_owner_id=-1&webcast_sdk_version=1540&webcast_language=zh&webcast_locale=zh_CN&version_name=11.3.0&ts="+(now/1000)+"&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket="+now+"&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, headers);
            FeedResponse feedResponse = GsonUtil.fromJson(response, FeedResponse.class);
            for (FeedResponse.DataBeanXX datum : feedResponse.getData()) {
                System.out.println(datum.getData().getAnchor_share_text());
                long roomid = datum.getData().getId();
                roomInfo(roomid);
                enterRoom(roomid);
                giftList(roomid);
                roomRankList(roomid);
                leaveRoom(roomid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void roomInfo(long roomid){
        try {
            long now = System.currentTimeMillis();
            List<Header> headers = new ArrayList<>();
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("sdk-version", "1"));
//            若带有此参数，则返回protobuf
//            headers.add(new BasicHeader("response-format","protobuf"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
            headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://webcast3-normal-c-lq.amemv.com/webcast/room/info/?pack_level=4&room_id="+roomid+"&webcast_sdk_version=1540&webcast_language=zh&webcast_locale=zh_CN&version_name=11.3.0&ts="+(now/1000)+"&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket="+now+"&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT,HttpUtil.DEFAULT_CHARSET,headers);
            RoomInfoResponse roomInfo = GsonUtil.fromJson(response, RoomInfoResponse.class);
            System.out.println("当前直播间标题："+roomInfo.getData().getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void enterRoom(long roomid){
        try {
            long now = System.currentTimeMillis();
            DateFormat df=new SimpleDateFormat("yyyyMMddHHmmss");
            String body="room_id="+roomid+"&hold_living_room=1&is_login=0&live_reason=rec&enter_type=draw&request_id="+df.format(new Date(now))+"0101310340742D657405&enter_source=live_merge-live_cover";
            List<Header> headers = new ArrayList<>();
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("X-SS-STUB", MD5Util.MD5(body).toUpperCase()));
            headers.add(new BasicHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8"));
//            若带有此参数，则返回protobuf
//            headers.add(new BasicHeader("response-format","protobuf"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
            headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://webcast3-core-c-lq.amemv.com/webcast/room/enter/?webcast_sdk_version=1540&webcast_language=zh&webcast_locale=zh_CN&version_name=11.3.0&ts="+(now/1000)+"&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket="+now+"&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.post(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT,HttpUtil.DEFAULT_CHARSET,body,headers);
            RoomInfoResponse roomInfo = GsonUtil.fromJson(response, RoomInfoResponse.class);
            System.out.println("已进入直播间："+roomInfo.getData().getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void giftList(long roomid){
        try {
            long now = System.currentTimeMillis();
            DateFormat df=new SimpleDateFormat("yyyyMMddHHmmss");
            List<Header> headers = new ArrayList<>();
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8"));
//            若带有此参数，则返回protobuf
//            headers.add(new BasicHeader("response-format","protobuf"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
            headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://webcast3-core-c-lq.amemv.com/webcast/gift/list/?room_id="+roomid+"&fetch_giftlist_from=2&webcast_sdk_version=1540&webcast_language=zh&webcast_locale=zh_CN&version_name=11.3.0&ts="+(now/1000)+"&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket="+now+"&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT,HttpUtil.DEFAULT_CHARSET,headers);
            GiftListResponse giftListResponse = GsonUtil.fromJson(response, GiftListResponse.class);
            System.out.println("获取直播间礼物列表："+giftListResponse.getData().getGifts_info().getGift_words());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void roomRankList(long roomid){
        try {
            long now = System.currentTimeMillis();
            DateFormat df=new SimpleDateFormat("yyyyMMddHHmmss");
            List<Header> headers = new ArrayList<>();
            String sec_id="MS4wLjABAAAAzd0tgyBC1_iKpGE_XDYkKhTaF4QaPT4nJz30cZL40jA";
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8"));
//            若带有此参数，则返回protobuf
//            headers.add(new BasicHeader("response-format","protobuf"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
            headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://webcast3-normal-c-lq.amemv.com/webcast/ranklist/room/"+roomid+"/contributor/?rank_type=18&room_id="+roomid+"&sec_anchor_id="+sec_id+"&webcast_sdk_version=1540&webcast_language=zh&webcast_locale=zh_CN&version_name=11.3.0&ts="+(now/1000)+"&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket="+now+"&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT,HttpUtil.DEFAULT_CHARSET,headers);
            RoomRankListResponse roomRankListResponse = GsonUtil.fromJson(response, RoomRankListResponse.class);
            System.out.println("获取直播间礼物排行榜列表：");
            for (RoomRankListResponse.DataBeanX.RanksBean rank : roomRankListResponse.getData().getRanks()) {
                System.out.println(rank.getUser().getNickname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void leaveRoom(long roomid){
        try {
            long now = System.currentTimeMillis();
            DateFormat df=new SimpleDateFormat("yyyyMMddHHmmss");
            String body="room_id="+roomid;
            List<Header> headers = new ArrayList<>();
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("X-SS-STUB", MD5Util.MD5(body).toUpperCase()));
            headers.add(new BasicHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8"));
//            若带有此参数，则返回protobuf
//            headers.add(new BasicHeader("response-format","protobuf"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
            headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://webcast3-normal-c-lq.amemv.com/webcast/room/leave/?webcast_sdk_version=1540&webcast_language=zh&webcast_locale=zh_CN&version_name=11.3.0&ts="+(now/1000)+"&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket="+now+"&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            String gorgon = HttpUtil.post("http://192.168.8.229:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
                put("url", url);
            }}, headers);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.post(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT,HttpUtil.DEFAULT_CHARSET,body,headers);
            LeaveRoomResponse roomInfo = GsonUtil.fromJson(response, LeaveRoomResponse.class);
            System.out.println("已离开直播间");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
