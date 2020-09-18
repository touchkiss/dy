package com.touchkiss.dy;

import com.douyin.aweme.v1.HotSearchResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * Created on 2020/08/28 14:47
 *
 * @author Touchkiss
 */
@SpringBootTest
public class GorgonTest {
    @Autowired
    private RestTemplate restTemplate;

    static {
//        System.load("D:\\documents\\java\\dyspider\\src\\main\\resources\\libs\\libcms.so");
    }

    @Test
    public void test() {

        System.out.println(restTemplate.postForEntity("http://192.168.8.206:8888/url", new HashMap() {{
            put("url", "https://hotsoon-hl.snssdk.com/hotsoon/user/profile/_get_profile/");
        }}, String.class).getBody());

//        System.out.println(Gorgon.getGorgon(""));
    }

    //    搜索实时热榜
    @Test
    public void detailList() {
        HotSearchResponse body = restTemplate.getForEntity("https://api3-normal-c-hl.amemv.com/aweme/v1/hot/search/list/?detail_list=1&mac_address=72%3A4C%3A76%3A99%3AB5%3A63&source=0&current_word&words_in_panel=+&trend_entry_word&os_api=22&device_type=MI+9&ssmix=a&manifest_version_code=120501&dpi=320&uuid=863064010674184&app_name=aweme&version_name=12.5.0&ts=1598599227&cpu_support64=false&storage_type=0&app_type=normal&appTheme=dark&ac=wifi&host_abi=armeabi-v7a&update_version_code=12509900&channel=tengxun_new&_rticket=1598599227432&device_platform=android&iid=2268999134742253&version_code=120500&cdid=36a16802-45cd-4cb4-b163-d002e9de6635&openudid=d988605f54619904&device_id=307500159341687&resolution=1080*1920&os_version=5.1.1&language=zh&device_brand=Xiaomi&aid=1128&mcc_mnc=46007", HotSearchResponse.class).getBody();
        body.getData().getWord_list().forEach(wordListBean -> {
            System.out.println(wordListBean.getWord());
        });
    }

    //直播实时热榜
    @Test
    public void webcastList() {
//        restTemplate.getForEntity()
    }
}
