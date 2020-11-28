package com.touchkiss.dy.services.impl;

import com.douyin.aweme.v1.bean.response.GeneralSingleSearchResponse;
import com.douyin.aweme.v1.bean.response.UserProfileResponse;
import com.touchkiss.dy.services.DouyinService;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.HttpUtil;
import com.touchkiss.dy.utils.MD5Util;
import com.touchkiss.dy.utils.XGorgonUtil;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 2020/10/09 12:38
 *
 * @author Touchkiss
 */
@Service
public class DouyinServiceImpl implements DouyinService {
    @Override
    public UserProfileResponse userProfile(String secId) {
        try {
            long time = System.currentTimeMillis();
            long ts = time / 1000;
            String id = null;
            if (secId.matches("^[\\d]+$")) {
                id = "user_id=" + secId;
            } else {
                id = "sec_user_id=" + secId;
            }
            String url = "https://aweme-eagle.snssdk.com/aweme/v1/user/?sec_user_id=MS4wLjABAAAAT_y6U7R-QeZ4C2tpyzFHaUlwoKmZQGg0x9YCW15soh4&retry_type=no_retry&mcc_mnc=46001&iid=175561601975351&device_id=1213500227850904&ac=wifi&channel=tianzhuo_dy_wifi1&aid=1128&app_name=aweme&version_code=421&version_name=4.2.1&device_platform=android&ssmix=a&device_type=Redmi+Note+8+Pro&device_brand=Redmi&language=zh&os_api=29&os_version=10&openudid=ce348c6bf7df0427&manifest_version_code=421&resolution=1080*2134&dpi=440&update_version_code=4212&_rticket=" + time + "&ts=" + ts + "&js_sdk_version=1.9.1&as=a1c5deec6b51cfbfe18444&cp=e51efe50bb17ccfae1_mMq&mas=012c4c4b856c5f4a202df3a753ff7508ef2c2c2c1c8ca6664666c6";
            String cookie = "install_id=175561601975351; ttreq=1$b58700d61faec314340a870b0ec82de5f1a0a4fa; odin_tt=a2a7581df5326b17c71dd091826bf564f05f91b5dafd4f08e4a7c0e7c8d7a3bacf410a5ff548cd09567c3703463a195bd90a2f0f51b9bd422caefbd362ec7eaa";
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
        return null;
    }

    @Override
    public GeneralSingleSearchResponse generalSingleSearch(String keyword, int offset, int count) {
        try {
            long now = System.currentTimeMillis();
            List<Header> headers = new ArrayList<>();
            String body = "keyword=" + URLEncoder.encode(keyword, "UTF-8") + "&offset=" + offset + "&count=" + count + "&is_pull_refresh=0&search_source=normal_search&hot_search=0&latitude=31.247221&longitude=121.492479&search_id=&query_correct_type=1&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&is_filter_search=0&sort_type=0&publish_time=0&disable_synthesis=0&multi_mod=0&single_filter_aladdin=0&client_width=480&client_height=853&dynamic_type=0&epidemic_card_type=0&enter_from=homepage_hot";
            headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            String stub = MD5Util.MD5(body).toUpperCase();
            headers.add(new BasicHeader("X-SS-STUB", stub));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("Accept-Encoding", "gzip"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
            String cookie = "odin_tt=f5e3b3e5aef95c660d1c3e7bdc86dbdfb5eab65dbd4b0c2ab65c1d337c9a2c847b2574e088e031ef3b51506ff3325d8fcc9b6d864a34612a0c3dc94ff2b14f87; install_id=69980830055940; ttreq=1$0e2fdb6d7beec72990d442f1118f7bb13c1b87eb";
            headers.add(new BasicHeader("Cookie", cookie));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://search-hl.amemv.com/aweme/v1/general/search/single/?version_name=11.3.0&ts=" + (now / 1000) + "&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket=" + now + "&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            HashMap<String, String> headerMap = (HashMap<String, String>) headers.stream().collect(Collectors.toMap(Header::getName, Header::getValue));
            String gorgon = XGorgonUtil.xGorgon(now / 1000, url.substring(url.indexOf("?") + 1), stub, cookie);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.post(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, body, headers);
            System.out.println(response);
            return GsonUtil.fromJson(response, GeneralSingleSearchResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
