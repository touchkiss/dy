package com.touchkiss.dy.services.impl;

import com.douyin.Gorgon2;
import com.douyin.aweme.v1.GeneralSingleSearchResponse;
import com.douyin.aweme.v1.UserProfileResponse;
import com.touchkiss.dy.services.DouyinService;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.HttpUtil;
import com.touchkiss.dy.utils.MD5Util;
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
            long now = System.currentTimeMillis();
            List<Header> headers = new ArrayList<>();
            headers.add(new BasicHeader("X-SS-REQ-TICKET", String.valueOf(now)));
            headers.add(new BasicHeader("X-SS-DP", "1128"));
            headers.add(new BasicHeader("x-tt-trace-id", "00-94a3a7110d99fa55f982b7da9ea50468-94a3a7110d99fa55-01"));
            headers.add(new BasicHeader("Accept-Encoding", "gzip"));
            headers.add(new BasicHeader("sdk-version", "1"));
            headers.add(new BasicHeader("User-Agent", "com.ss.android.ugc.aweme/110301 (Linux; U; Android 4.4.4; zh_CN; PCRT00; Build/KTU84P; Cronet/TTNetVersion:b4d74d15 2020-04-23 QuicVersion:0144d358 2020-03-24)"));
            headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac; install_id=122756065136519; ttreq=1$10d78d3432166e5a13f415a0ba0c8deece73e6ad"));
            headers.add(new BasicHeader("X-Khronos", String.valueOf(now / 1000)));
            String url = "https://api5-core-c-lq.amemv.com/aweme/v1/user/profile/other/?sec_user_id=" + secId + "&address_book_access=2&from=0&publish_video_strategy_type=2&version_name=11.3.0&ts=" + (now / 1000) + "&device_type=PCRT00&iid=69980830055940&app_type=normal&resolution=720*1280&aid=1128&app_name=aweme&_rticket=" + now + "&device_platform=android&version_code=110300&dpi=240&openudid=1062042365927853&cdid=23083b87-0468-4aba-b87a-1b14297f826a&cpu_support64=false&ssmix=a&os_api=19&mcc_mnc=46000&device_id=2708807412624253&device_brand=OPPO&manifest_version_code=110301&os_version=4.4.4&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&host_abi=armeabi-v7a&update_version_code=11309900&ac=wifi&uuid=865746239395652&language=zh&channel=aweGW";
            HashMap<String, String> headerMap = (HashMap<String, String>) headers.stream().collect(Collectors.toMap(Header::getName, Header::getValue));
            String gorgon = Gorgon2.getGorgonInTime((int)(now/1000),url, headerMap);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, headers);
            System.out.println(response);
            UserProfileResponse userProfileResponse = GsonUtil.fromJson(response, UserProfileResponse.class);
            return userProfileResponse;
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
        return null;
    }

    @Override
    public GeneralSingleSearchResponse generalSingleSearch(String keyword, int offset, int count) {
        try {
            long now = System.currentTimeMillis();
            List<Header> headers = new ArrayList<>();
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
            HashMap<String, String> headerMap = (HashMap<String, String>) headers.stream().collect(Collectors.toMap(Header::getName, Header::getValue));
            String gorgon = Gorgon2.getGorgonInTime((int)(now/1000),url, headerMap);
            headers.add(new BasicHeader("X-Gorgon", gorgon));
            String response = HttpUtil.post(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT,HttpUtil.DEFAULT_CHARSET,body, headers);
            System.out.println(response);
            return GsonUtil.fromJson(response, GeneralSingleSearchResponse.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
