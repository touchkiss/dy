package com.touchkiss.dy.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.douyin.aweme.v1.bean.GeneralSearchSingleResponse;
import com.douyin.aweme.v1.bean.UserResponse;
import com.douyin.aweme.v2.bean.UserInfoResponse;
import com.douyin.aweme.v2.services.AwemeServiceV2;
import com.touchkiss.aweme.constant.RedisConstant;
import com.touchkiss.dy.services.DouyinService;
import org.apache.http.message.BasicHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
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
    private static Pattern DY_PATTERN=Pattern.compile("(?<=\"srcNoMark\":\")([^\"]+)(?=\")");

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
    public boolean testRedis(){
        stringRedisTemplate.delete(RedisConstant.LAST_STICKER_ID);
        return stringRedisTemplate.hasKey(RedisConstant.LAST_STICKER_ID);
    }
    @RequestMapping("dy")
    public String dy(@RequestParam String src) throws IOException {
        String response = com.touchkiss.dy.utils.HttpUtil.get(src
                , com.touchkiss.dy.utils.HttpUtil.DEFAULT_CONNECT_TIMEOUT
                , com.touchkiss.dy.utils.HttpUtil.DEFAULT_SOCKET_TIMEOUT
                , com.touchkiss.dy.utils.HttpUtil.DEFAULT_CHARSET
                , Collections.singletonList(new BasicHeader("User-Agent","Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1")));
        Matcher matcher = DY_PATTERN.matcher(response);
        if (matcher.find()){
            return matcher.group(0);
        }
        return "未找到";
    }
}
