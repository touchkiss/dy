package com.touchkiss.dy.huoshan;

import com.huoshan.bean.ItemInfoResponse;
import com.huoshan.hotsoon.general_search.SearchResponse;
import com.huoshan.hotsoon.item.profile.PublishedListResponse;
import com.huoshan.user.profile.ProfileResponse;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.HttpUtil;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created on 2020/09/08 18:07
 *
 * @author Touchkiss
 */
@SpringBootTest
public class SearchTest {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testSearch() throws IOException {
        long now = System.currentTimeMillis();
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
        headers.add(new BasicHeader("Accept-Encoding", "gzip"));
        headers.add(new BasicHeader("sdk-version", "1"));
        headers.add(new BasicHeader("User-Agent", "ttnet okhttp/3.10.0.2"));
        headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
        String url = "https://hotsoon-lq.snssdk.com/hotsoon/general_search/?query=" + URLEncoder.encode("晚上好", "utf-8") + "&search_id&user_action=Initiative&count=10&offset=0&search_type=0&click_rectify_bar=0&live_sdk_version=915&iid=122756065136519&device_id=2708807412624253&ac=wifi&mac_address=20%3Ab4%3Af1%3A90%3Acc%3A44&channel=pcandroid&aid=1112&app_name=live_stream&version_code=915&version_name=9.1.5&device_platform=android&ssmix=a&device_type=PCRT00&device_brand=OPPO&language=zh&os_api=19&os_version=4.4.4&uuid=865746239395652&openudid=1062042365927853&manifest_version_code=915&resolution=720*1280&dpi=240&update_version_code=9156&_rticket=" + now + "&hs_location_permission=1&tab_mode=1&jssdk_version=1620000&ab_version=1990767%2C1138752%2C1998272%2C1490523%2C2015605%2C1945345%2C1683111%2C1944969%2C1788894%2C1354483%2C1776523%2C1479194%2C2019428%2C1502675%2C1521584%2C2010893%2C1822757%2C1050089%2C1182061%2C2012850%2C1851125%2C1921248%2C1978301%2C1971442%2C1985671%2C1432944%2C2002020%2C1622340%2C1380327%2C1802649%2C1747490%2C1801791%2C2020529%2C2019301%2C1698610%2C1880613%2C1917928%2C1247683%2C1497464%2C1993142%2C2009144%2C1856843%2C2013308%2C2021152%2C1764590%2C2014044%2C1745643%2C1912671%2C1988901%2C1972816%2C1396601%2C1999625%2C1317441%2C692223%2C1169772%2C1167794%2C2011968%2C1974796%2C2002973%2C1988364%2C1019139%2C2000818%2C682009%2C1244220%2C1032070%2C1973125%2C1682255%2C1847355%2C1945472%2C1540549%2C1989373%2C2014322%2C1837386%2C1751686%2C1477983%2C1165209%2C1942975%2C1639425%2C1409058%2C1258912%2C2006713%2C1881213%2C2009576%2C1810166&client_version_code=915&mcc_mnc=46000&cdid=255dec09-48f9-479f-aa9c-a793f82e282b&new_nav=1&ws_status=CONNECTED&settings_version=24&last_update_time=" + now + "&cpu_model=intel&ts=" + (now / 1000);

        System.out.println(url);
        String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, headers);
        SearchResponse searchResponse = GsonUtil.fromJson(response, SearchResponse.class);

        for (SearchResponse.DataBean datum : searchResponse.getData()) {
            System.out.println(GsonUtil.toJson(datum));
            try {
                for (SearchResponse.DataBean.ItemResultBean.ItemsBean item : datum.getItem_result().getItems()) {
                    System.out.println(item.getItem().getTitle());
                }
            } catch (Exception ignore) {

            }
        }
    }

    @Test
    public void testUserProfile() throws IOException {
        long now = System.currentTimeMillis();
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
        headers.add(new BasicHeader("Accept-Encoding", "gzip"));
        headers.add(new BasicHeader("sdk-version", "1"));
        headers.add(new BasicHeader("User-Agent", "ttnet okhttp/3.10.0.2"));
        headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
        String url = "https://hotsoon-hl.snssdk.com/hotsoon/user/profile/_get_profile/?to_user_id=MS4wLjABAAAAMO34MHOC1by7yJLp9_5Fz60LM2NvhVR5O9tNTwZedv4&live_sdk_version=915&iid=3676378050084343&device_id=3183795066649768&ac=wifi&mac_address=00%3A1e%3A55%3Af1%3Abf%3A25&channel=pcandroid&aid=1112&app_name=live_stream&version_code=915&version_name=9.1.5&device_platform=android&ssmix=a&device_type=VOG-AL00&device_brand=HUAWEI&language=zh&os_api=19&os_version=4.4.4&uuid=861523723004015&openudid=4082049201375812&manifest_version_code=915&resolution=1080*1920&dpi=288&update_version_code=9156&_rticket=" + now + "&hs_location_permission=1&tab_mode=3&jssdk_version=1620000&ab_version=1974897%2C1490523%2C1788898%2C1945345%2C1683111%2C1857360%2C1771433%2C692223%2C2010997%2C1354483%2C1682255%2C1479194%2C2009141%2C1258912%2C1502676%2C1521584%2C2010893%2C2008902%2C1050089%2C2019301%2C2010898%2C1851124%2C1497471%2C682009%2C1985671%2C2012832%2C1432944%2C2002020%2C1622340%2C1380327%2C1227333%2C1802649%2C1182060%2C1969314%2C1917928%2C1247684%2C1880617%2C2011976%2C1988364%2C1993142%2C1856843%2C1944969%2C2007178%2C1978300%2C2014044%2C1747490%2C1745644%2C1988901%2C1972816%2C1396601%2C1801789%2C1317441%2C1698610%2C1167794%2C1169771%2C1837386%2C1945472%2C1974796%2C2002973%2C1465133%2C1019139%2C2000818%2C1244221%2C1032070%2C2020688%2C1776523%2C1973121%2C1540549%2C1989373%2C1822757%2C2014322%2C2019428%2C1751686%2C1477983%2C1968565%2C1165209%2C1942975%2C2020532%2C1409058%2C1966990%2C2006713%2C1625927%2C1810166&client_version_code=915&mcc_mnc=46000&cdid=3294548f-03be-4946-8905-e2920508e5ce&ts=" + (now / 1000);
        String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, headers);
        System.out.println(response);
        ProfileResponse profileResponse = GsonUtil.fromJson(response, ProfileResponse.class);
        System.out.println(profileResponse.getData().getNickname());
        System.out.println(profileResponse.getData().getSignature());
    }

    @Test
    public void testPublishedList() throws IOException {
        String userid = "MS4wLjABAAAAKktjl7kAAUBN_M4HStRcZcu9BXtdCeYMmJUq2jGRDRE";
        long now = System.currentTimeMillis();
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
        headers.add(new BasicHeader("Accept-Encoding", "gzip"));
        headers.add(new BasicHeader("sdk-version", "1"));
        headers.add(new BasicHeader("User-Agent", "ttnet okhttp/3.10.0.2"));
//        headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
        headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
        String url = "https://hotsoon-hl.snssdk.com/hotsoon/item/profile/published_list/?to_user_id=" + userid + "&mix_picture=1&=3&minor_control_status=0&req_from=enter_auto&count=20&audio_value=73&ad_user_agent=com.ss.android.ugc.live%2F915+%28Linux%3B+U%3B+Android+4.4.4%3B+zh_CN%3B+VOG-AL00%3B+Build%2FKTU84P%3B+Chrome%29&secs_video_watching=36&n_skipped=0&feed_relate_search=0&offset=0&min_time=0&n_viewed=0&live_sdk_version=915&iid=3676378050084343&device_id=3183795066649768&ac=wifi&mac_address=00%3A1e%3A55%3Af1%3Abf%3A25&channel=pcandroid&aid=1112&app_name=live_stream&version_code=915&version_name=9.1.5&device_platform=android&ssmix=a&device_type=VOG-AL00&device_brand=HUAWEI&language=zh&os_api=19&os_version=4.4.4&uuid=861523723004015&openudid=4082049201375812&manifest_version_code=915&resolution=1080*1920&dpi=288&update_version_code=9156&_rticket=" + now + "&hs_location_permission=1&tab_mode=3&jssdk_version=1620000&ab_version=1974897%2C1490523%2C1788898%2C1945345%2C1683111%2C1857360%2C1771433%2C692223%2C2010997%2C1354483%2C1682255%2C1479194%2C2009141%2C1258912%2C1502676%2C1521584%2C2010893%2C2008902%2C1050089%2C2019301%2C2010898%2C1851124%2C1497471%2C682009%2C1985671%2C2012832%2C1432944%2C2002020%2C1622340%2C1380327%2C1227333%2C1802649%2C1182060%2C1969314%2C1917928%2C1247684%2C1880617%2C2011976%2C1988364%2C1993142%2C1856843%2C1944969%2C2007178%2C1978300%2C2014044%2C1747490%2C1745644%2C1988901%2C1972816%2C1396601%2C1801789%2C1317441%2C1698610%2C1167794%2C1169771%2C1837386%2C1945472%2C1974796%2C2002973%2C1465133%2C1019139%2C2000818%2C1244221%2C1032070%2C2020688%2C1776523%2C1973121%2C1540549%2C1989373%2C1822757%2C2014322%2C2019428%2C1751686%2C1477983%2C1968565%2C1165209%2C1942975%2C2020532%2C1409058%2C1966990%2C2006713%2C1625927%2C1810166&client_version_code=915&mcc_mnc=46000&cdid=3294548f-03be-4946-8905-e2920508e5ce&new_nav=1&ws_status=CONNECTED&settings_version=24&last_update_time=" + now + "&cpu_model=+placeholder&ts=" + (now / 1000);
        String gorgon = HttpUtil.post("http://192.168.8.206:8888/urlAndHeaders", HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, new HashMap() {{
            put("url", url);
        }}, headers);
        System.out.println(gorgon);
        headers.add(new BasicHeader("X-Gorgon", gorgon));
        String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, headers);
        System.out.println(response);
        PublishedListResponse publishedListResponse = GsonUtil.fromJson(response, PublishedListResponse.class);
        for (PublishedListResponse.DataBeanX datum : publishedListResponse.getData()) {
            String title = datum.getData().getTitle();
            System.out.println(title);
        }
    }

    @Test
    public void testToUserId(){
        System.out.println(HttpUtil.getRedirectUrl("https://share.huoshan.com/hotsoon/s/mxej7Bs7wb8/"));
        System.out.println(HttpUtil.getRedirectUrl("https://share.huoshan.com/hotsoon/s/WVbqmUr7wb8/"));
        System.out.println(HttpUtil.getRedirectUrl("https://v.douyin.com/JBbcDhL/"));
        System.out.println(HttpUtil.getRedirectUrl("https://v.douyin.com/102499440278/"));
    }


    @Test
    public void testId(){
        try {
            String response = HttpUtil.get("https://share.huoshan.com/api/item/info?item_id=6867427050211314952");
            ItemInfoResponse itemInfoResponse = GsonUtil.fromJson(response, ItemInfoResponse.class);
            System.out.println(itemInfoResponse.getData().getUser_info().getEncrypted_id());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
