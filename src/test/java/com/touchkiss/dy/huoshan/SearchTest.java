package com.touchkiss.dy.huoshan;

import com.huoshan.hotsoon.general_search.SearchResponse;
import com.touchkiss.dy.utils.GsonUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

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
    public void testSearch(){
        SearchResponse searchResponse = restTemplate.getForEntity("https://hotsoon-lq.snssdk.com/hotsoon/general_search/?query=%E5%8D%81%E4%B8%83&search_id&user_action=Initiative&count=10&offset=0&search_type=0&click_rectify_bar=0&live_sdk_version=915&iid=122756065136519&device_id=2708807412624253&ac=wifi&mac_address=20%3Ab4%3Af1%3A90%3Acc%3A44&channel=pcandroid&aid=1112&app_name=live_stream&version_code=915&version_name=9.1.5&device_platform=android&ssmix=a&device_type=PCRT00&device_brand=OPPO&language=zh&os_api=19&os_version=4.4.4&uuid=865746239395652&openudid=1062042365927853&manifest_version_code=915&resolution=720*1280&dpi=240&update_version_code=9156&_rticket=1599550221175&hs_location_permission=1&tab_mode=1&jssdk_version=1620000&ab_version=1990767%2C1138752%2C1998272%2C1490523%2C2015605%2C1945345%2C1683111%2C1944969%2C1788894%2C1354483%2C1776523%2C1479194%2C2019428%2C1502675%2C1521584%2C2010893%2C1822757%2C1050089%2C1182061%2C2012850%2C1851125%2C1921248%2C1978301%2C1971442%2C1985671%2C1432944%2C2002020%2C1622340%2C1380327%2C1802649%2C1747490%2C1801791%2C2020529%2C2019301%2C1698610%2C1880613%2C1917928%2C1247683%2C1497464%2C1993142%2C2009144%2C1856843%2C2013308%2C2021152%2C1764590%2C2014044%2C1745643%2C1912671%2C1988901%2C1972816%2C1396601%2C1999625%2C1317441%2C692223%2C1169772%2C1167794%2C2011968%2C1974796%2C2002973%2C1988364%2C1019139%2C2000818%2C682009%2C1244220%2C1032070%2C1973125%2C1682255%2C1847355%2C1945472%2C1540549%2C1989373%2C2014322%2C1837386%2C1751686%2C1477983%2C1165209%2C1942975%2C1639425%2C1409058%2C1258912%2C2006713%2C1881213%2C2009576%2C1810166&client_version_code=915&mcc_mnc=46000&cdid=255dec09-48f9-479f-aa9c-a793f82e282b&new_nav=1&ws_status=CONNECTED&settings_version=24&last_update_time=1599556532933&cpu_model=intel&ts=1599550221", SearchResponse.class).getBody();

        for (SearchResponse.DataBean datum : searchResponse.getData()) {
            System.out.println(GsonUtil.toJson(datum));
//            for (SearchResponse.DataBean.ItemResultBean.ItemsBean item : datum.getItem_result().getItems()) {
//                System.out.println(item.getItem().getTitle());
//            }
        }
    }
}
