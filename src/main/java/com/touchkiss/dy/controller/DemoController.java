package com.touchkiss.dy.controller;

import com.douyin.aweme.v1.bean.AwemeInfo;
import com.douyin.aweme.v1.bean.GeneralSearchSingleResponse;
import com.douyin.aweme.v1.bean.UserResponse;
import com.douyin.aweme.v2.bean.AwemeIteminfoResponse;
import com.douyin.aweme.v2.bean.UserInfoResponse;
import com.douyin.aweme.v2.services.AwemeServiceV2;
import com.touchkiss.aweme.bean.AwemeWebItem;
import com.touchkiss.aweme.constant.RedisConstant;
import com.touchkiss.dy.services.DouyinService;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.HttpUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.http.message.BasicHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created on 2020/09/22 22:12
 *
 * @author Touchkiss
 */
@RestController
public class DemoController {
    @Autowired
    private DouyinService douyinService;
    @Autowired
    private AwemeServiceV2 awemeServiceV2;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    private static Pattern KS_PATTERN = Pattern.compile("(?<=\"srcNoMark\":\")([^\"]+)(?=\")");
    private static Pattern DY_PATTERN = Pattern.compile("(?<=video/)[\\d]+");
    private static Pattern DY_DATA_PATTERN = Pattern.compile("(?<=<script id=\"RENDER_DATA\" type=\"application/json\">)[\\s]*[\\S]+(?=[\\s]*</script>)");

    @RequestMapping("test")
    public String test() {
        return "你好啊";
    }

    @RequestMapping("profile")
    public UserResponse profile(String secId) {
        return douyinService.userProfile(secId);
    }

    @RequestMapping("profile2")
    public UserInfoResponse profile2(String secId) {
        return awemeServiceV2.userInfo(secId);
    }

    @RequestMapping("search")
    public GeneralSearchSingleResponse search(String word) {
        return douyinService.generalSingleSearch(word, 0, 20);
    }

    @RequestMapping("redis")
    public boolean testRedis() {
        stringRedisTemplate.delete(RedisConstant.LAST_STICKER_ID);
        return stringRedisTemplate.hasKey(RedisConstant.LAST_STICKER_ID);
    }

    @RequestMapping("ks")
    public void ks(@RequestParam String src, HttpServletResponse response) throws IOException {
        String str = com.touchkiss.dy.utils.HttpUtil.get(src
                , com.touchkiss.dy.utils.HttpUtil.DEFAULT_CONNECT_TIMEOUT
                , com.touchkiss.dy.utils.HttpUtil.DEFAULT_SOCKET_TIMEOUT
                , com.touchkiss.dy.utils.HttpUtil.DEFAULT_CHARSET
                , Collections.singletonList(new BasicHeader("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1")));
        Matcher matcher = KS_PATTERN.matcher(str);
        if (matcher.find()) {
            String redirect = matcher.group(0);
            response.sendRedirect(redirect);
        }
    }

    @RequestMapping("dy")
    public void dy(@RequestParam String src, HttpServletResponse response) throws IOException {
        String redirectUrl = HttpUtil.getRedirectUrl(src);
//        Matcher matcher = DY_PATTERN.matcher(redirectUrl);
//        if (matcher.find()){
//            String videoid = matcher.group(0);
//            AwemeIteminfoResponse awemeIteminfoResponse = awemeServiceV2.awemeIteminfo(videoid);
//            if (awemeIteminfoResponse!=null&& CollectionUtils.isNotEmpty(awemeIteminfoResponse.getItem_list())){
//                AwemeInfo awemeInfo = awemeIteminfoResponse.getItem_list().get(0);
//                response.sendRedirect(awemeInfo.getVideo().getPlay_addr().getUrl_list().get(0));
//            }
//        }
        Matcher matcher = DY_DATA_PATTERN.matcher(HttpUtil.get(redirectUrl, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, HttpUtil.DEFAULT_CHARSET, Arrays.asList(new BasicHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36"))));
        if (matcher.find()) {
            String decode = URLDecoder.decode(matcher.group(0), "utf-8");
            AwemeWebItem awemeWebItem = GsonUtil.fromJson(decode, AwemeWebItem.class);
            if (awemeWebItem != null
                    && awemeWebItem.getC_18() != null
                    && awemeWebItem.getC_18().getAweme() != null
                    && awemeWebItem.getC_18().getAweme().getDetail() != null
                    && awemeWebItem.getC_18().getAweme().getDetail().getVideo() != null
                    && CollectionUtils.isNotEmpty(awemeWebItem.getC_18().getAweme().getDetail().getVideo().getPlayAddr())) {
                response.sendRedirect(awemeWebItem.getC_18().getAweme().getDetail().getVideo().getPlayAddr().get(0).getSrc());
            }
        }
    }
}
