package com.touchkiss.dy.services;

import com.douyin.aweme.v1.bean.response.GeneralSingleSearchResponse;
import com.douyin.aweme.v1.bean.response.UserProfileResponse;

/**
 * Created on 2020/10/09 12:38
 *
 * @author Touchkiss
 */
public interface DouyinService {
    UserProfileResponse userProfile(String secId);

    GeneralSingleSearchResponse generalSingleSearch(String keyword, int offset, int count);
}