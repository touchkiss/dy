package com.touchkiss.dy.controller;

import com.douyin.aweme.v1.bean.GeneralSearchSingleResponse;
import com.douyin.aweme.v1.bean.UserResponse;
import com.douyin.aweme.v2.bean.UserInfoResponse;
import com.douyin.aweme.v2.services.AwemeServiceV2;
import com.touchkiss.aweme.constant.RedisConstant;
import com.touchkiss.dy.services.DouyinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
