package com.touchkiss.dy.huoshan;

import com.touchkiss.dy.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created on 2020/09/07 17:32
 *
 * @author Touchkiss
 */
@Slf4j
public class FeedTest {
    @Test
    public void testFeed() {
        int offset = 0;
        long curTime = System.currentTimeMillis();
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("Cookie", "odin_tt=d8c9680a30c399124e57bf6ed19c3aac23e138d82624f1186e437cc478d4486df89d33b33f68764abfc22c6c92b6142d1bb6904a128380dee79bda337632efac"));
        headers.add(new BasicHeader("sdk-version","1"));
        headers.add(new BasicHeader("X-SS-REQ-TICKET",String.valueOf(curTime)));
        headers.add(new BasicHeader("User-Agent","ttnet okhttp/3.10.0.2"));
        headers.add(new BasicHeader("Accept-Encoding","gzip"));
        headers.add(new BasicHeader("X-Khronos", String.valueOf(curTime / 1000)));
        String feedUrl = "https://hotsoon-lq.snssdk.com/hotsoon/feed/?type=video&tab_id=5&minor_control_status=0&req_from=enter_auto&count=10&audio_value=73&ad_user_agent=com.ss.android.ugc.live%2F915+%28Linux%3B+U%3B+Android+4.4.4%3B+zh_CN%3B+PCRT00%3B+Build%2FKTU84P%3B+Chrome%29&secs_video_watching=3&n_skipped=0&feed_relate_search=0&diff_stream=1&offset=0&min_time=0&n_viewed=0&live_sdk_version=915&iid=122756065136519&device_id=2708807412624253&ac=wifi&mac_address=20%3Ab4%3Af1%3A90%3Acc%3A44&channel=pcandroid&aid=1112&app_name=live_stream&version_code=915&version_name=9.1.5&device_platform=android&ssmix=a&device_type=PCRT00&device_brand=OPPO&language=zh&os_api=19&os_version=4.4.4&uuid=865746239395652&openudid=1062042365927853&manifest_version_code=915&resolution=720*1280&dpi=240&update_version_code=9156&_rticket=" + curTime + "&hs_location_permission=1&tab_mode=1&jssdk_version=1620000&ab_version=1989655%2C1990767%2C1998272%2C1490523%2C1945345%2C1167794%2C692223%2C1944969%2C1788894%2C1354483%2C1682255%2C1479194%2C1258912%2C1521584%2C2010893%2C1822757%2C2018290%2C1050089%2C1182061%2C2012850%2C1851125%2C1921248%2C682009%2C1985671%2C1432944%2C2002020%2C1622340%2C1540549%2C1802649%2C1747490%2C1801791%2C1396601%2C1880613%2C1917928%2C1954105%2C1497464%2C1993142%2C2009144%2C1856843%2C2013308%2C1978301%2C1764590%2C2014044%2C1745643%2C1912671%2C1988901%2C1972816%2C2011968%2C1999625%2C1317441%2C1380327%2C1698610%2C1169772%2C1683111%2C1822635%2C1974796%2C2002973%2C1988364%2C1019139%2C2000818%2C1971442%2C1244220%2C1032070%2C1973125%2C1776523%2C1847355%2C1945472%2C2006713%2C1440152%2C1976542%2C1989373%2C1751686%2C1902035%2C1477983%2C1247683%2C1165209%2C1942975%2C1639425%2C1409058%2C1502675%2C1837386%2C1881213%2C2009576%2C1810166&client_version_code=915&mcc_mnc=46000&cdid=255dec09-48f9-479f-aa9c-a793f82e282b&new_nav=1&ws_status=CONNECTED&settings_version=24&last_update_time=" + curTime + "&mac_address=20%3Ab4%3Af1%3A90%3Acc%3A44&ts=" + (curTime / 1000);
        try {
            System.out.println(feedUrl);
            String gorgon = HttpUtil.post("http://192.168.8.206:8888/urlAndHeaders", new HashMap() {{
                put("url", feedUrl);
            }}, headers);
            log.info("返回了gorgon：{}", gorgon);

//            headers.add(new BasicHeader("X-Gorgon", gorgon));
//            String response = HttpUtil.get(feedUrl, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT,
//                    HttpUtil.DEFAULT_CHARSET
//                    , headers);
//            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
