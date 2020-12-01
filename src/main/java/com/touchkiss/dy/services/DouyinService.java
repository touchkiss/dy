package com.touchkiss.dy.services;

import com.douyin.aweme.v1.bean.GeneralSearchSingleResponse;
import com.douyin.aweme.v1.bean.UserResponse;

/**
 * Created on 2020/10/09 12:38
 *
 * @author Touchkiss
 */
public interface DouyinService {
    UserResponse userProfile(String secId);

    GeneralSearchSingleResponse generalSingleSearch(String keyword, int offset, int count);
}
