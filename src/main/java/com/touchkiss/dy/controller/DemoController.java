package com.touchkiss.dy.controller;

import com.douyin.aweme.v1.GeneralSingleSearchResponse;
import com.douyin.aweme.v1.UserProfileResponse;
import com.touchkiss.dy.services.DouyinService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping("test")
    public String test() {
        return "你好啊";
    }
    @RequestMapping("profile")
    public UserProfileResponse profile(String secId){
        return douyinService.userProfile(secId);
    }
    @RequestMapping("search")
    public GeneralSingleSearchResponse search(String word){
        return douyinService.generalSingleSearch(word, 0, 20);
    }
}
