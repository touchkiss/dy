package com.touchkiss.dy.task;

import com.douyin.Gorgon2;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 2020/10/09 12:59
 *
 * @author Touchkiss
 */
@Service
public class KeepGorgonAliveTask {
//    @Scheduled(cron = "* * * * * ?")
    public void keepGorgonAliveTask() {
        try {
            for (int i = 0; i < 10; i++) {
                long now = System.currentTimeMillis();
                String secId = "MS4wLjABAAAAjSSqouhinGIiV0qnn_e0k-GDyhFZatWmyrEw6dFkXKQ";
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
                String gorgon = Gorgon2.getGorgon((int) (now / 1000), url, headerMap);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
