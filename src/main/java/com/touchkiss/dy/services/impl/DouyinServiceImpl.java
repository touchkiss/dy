package com.touchkiss.dy.services.impl;

import com.douyin.aweme.v1.bean.DouYinClient;
import com.douyin.aweme.v1.bean.GeneralSearchSingleRequest;
import com.douyin.aweme.v1.bean.UserRequest;
import com.douyin.aweme.v1.bean.GeneralSearchSingleResponse;
import com.douyin.aweme.v1.bean.UserResponse;
import com.touchkiss.dy.services.DouyinService;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;

/**
 * Created on 2020/10/09 12:38
 *
 * @author Touchkiss
 */
@Service
public class DouyinServiceImpl implements DouyinService {
    @Override
    public UserResponse userProfile(String secId) {
        UserRequest userRequest = new UserRequest();
                if (secId.matches("^[\\d]+$")){
                    userRequest.setUser_id(secId);
                }else{
                    userRequest.setSec_user_id(secId);
                }
        return DouYinClient.getInstance().doAction(userRequest);
    }

    @Override
    public GeneralSearchSingleResponse generalSingleSearch(String keyword, int offset, int count) {
        try {
            GeneralSearchSingleRequest generalSearchSingleRequest = new GeneralSearchSingleRequest();
            generalSearchSingleRequest.setKeyword(URLEncoder.encode(keyword,"UTF-8"));
            return DouYinClient.getInstance().doAction(generalSearchSingleRequest);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
