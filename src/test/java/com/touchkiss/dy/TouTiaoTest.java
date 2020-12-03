package com.touchkiss.dy;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created on 2020/12/02 17:01
 *
 * @author Touchkiss
 */
public class TouTiaoTest {
    public static void main(String[] args) {
//        Set<String>panels=new HashSet<>(Arrays.asList("13_musiccol_2", "13_wenda_2", "13_browser_1", "13_homepage_1", "13_comment_1", "13_article_6", "13_ugcpost_2", "13_nbathree_2", "13_homepage_4", "13_wenda_4", "13_ugcpost_8", "13_titlebar_1", "13_video_11", "13_comment_2", "13_wenda_3", "13_fantasy_common_2", "13_article_4", "13_fantasy_team_2", "13_video_5", "13_article_1", "13_goods_2", "13_video_6", "13_video_7", "13_normandy_1", "13_mainshare_1", "13_image_4", "13_ttpic_1", "13_goods_1", "13_quanzi_1", "13_longimage_1", "13_topic_1", "13_image_1", "13_ugcrepos_1", "13_appad_1", "13_immersivead_1", "13_paidlive_1", "13_wenda_5", "13_musiccol_1", "13_video_8", "13_image_2", "13_niuthree_1", "13_livehost_1", "13_test_1", "13_svideo_2", "13_video_2", "13_learning_2", "13_audio_1", "13_novel_1", "13_feedshare_1", "13_course_1", "13_article_2", "13_svideo_1", "13_cardbeg_1", "13_cardsend_1", "13_livehost_2", "13_livechat_1", "13_videoad_1", "13_audio_2", "13_timor_1", "13_chatshare_1", "13_jsbshare_2", "13_wenda_6", "13_fantasy_screenshot_2", "13_vaccines_2", "13_article_3", "13_feedshare_2", "13_ugcrepos_2", "13_webarticl_1", "13_titlebar_2", "13_livecell_2", "13_wenda_1", "13_video_3", "13_wenda_12", "13_learning_3", "13_svtopic_1", "13_timor_2", "13_ugcpost_3", "13_livevide_1", "13_video_20", "13_jsbshare_1", "13_ugcpost_1", "13_video_10", "13_article_7", "13_image_5", "13_video_4", "13_wenda_7", "13_learning_1", "13_livevide_2", "13_video_21", "13_video_1", "13_xtlive_1", "13_repostvi_2", "13_repostvi_1", "13_video_9", "13_longimage_2", "13_svideo_3", "13_cardshow_1", "13_ugcpost_9", "13_mainpage_1", "13_fantasy_token_2"));
//        panels.forEach(panel->{
//            HttpRequest post = HttpRequest.post("https://api3-trial-h2-hl.snssdk.com/share_strategy/v1/info/?ug_share_aid=13&ug_share_package_name=com.ss.android.article.news&ug_share_v_code=220002&ug_share_v_name=2.2.0-rc.2&ug_share_os_api=29&ug_share_platform=android&_rticket=1606898524804&");
//            post.header("Host","api3-trial-h2-hl.snssdk.com")
//                    .header("Connection","keep-alive ttreq=1$060ec37a0191fb8e5f3ee574ccb5f675420ccf45; WIN_WH=393_724; PIXIEL_RATIO=2.75; FRM=new")
//                    .header("User-Agent","Dalvik/2.1.0 (Linux; U; Android 10; Redmi Note 8 Pro MIUI/20.11.11) NewsArticle/7.9.9 cronet/TTNetVersion:58eeeb7f 2020-11-03 QuicVersion:47946d2a 2020-10-14")
//                    .header("Content-Type","application/json; charset=utf-8")
//                    .header("x-tt-trace-id","00-229da40301081a740965246193ee000d-229da40301081a74-01")
//                    .header("Accept-Encoding","gzip")
//                    .header("x-common-params-v2","ac=wifi&channel=xiaomi_13_64&aid=13&app_name=news_article&version_code=799&version_name=7.9.9&device_platform=android&ssmix=a&device_type=Redmi+Note+8+Pro&device_brand=Redmi&language=zh&os_api=29&os_version=10&manifest_version_code=7990&resolution=1080*2134&dpi=440&update_version_code=79910&cdid=590208d4-76e3-49b4-82e9-79a316ed6e9e&oaid=6292668db7e5f1fc")
//                    .body("{\"share_panel_id\":\""+panel+"\",\"data\":\"{\\\"share_url\\\":\\\"https://www.baidu.com/s?ie=UTF-8&wd=04%E7%89%88%E6%8A%96%E9%9F%B3xgorgon%E5%8A%A0%E5%AF%86\\\",\\\"token_type\\\":9,\\\"need_short_url\\\":false,\\\"open_url\\\":\\\"https://www.baidu.com/s?ie=UTF-8&wd=04%E7%89%88%E6%8A%96%E9%9F%B3xgorgon%E5%8A%A0%E5%AF%86\\\",\\\"title\\\":\\\"来城市服务，让生活更方便一点\\\",\\\"desc\\\":\\\"本地生活服务一键办理查询\\\",\\\"thumb_image_url\\\":\\\"https://www.baidu.com/s?ie=UTF-8&wd=04%E7%89%88%E6%8A%96%E9%9F%B3xgorgon%E5%8A%A0%E5%AF%86\\\"}\"}");
//            String body = post.execute().body();
////            if (body.contains("€")){
////                System.out.println("找到了找到了：" + panel);
//                System.out.println(body);
////            }
//        });
        System.out.println(UUID.randomUUID().toString().substring(0,8));
    }
}









