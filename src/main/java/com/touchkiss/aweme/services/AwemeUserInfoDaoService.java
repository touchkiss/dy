package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeUserInfo;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeUserInfoDaoService {
	boolean insert(AwemeUserInfo awemeUserInfo);

	boolean deleteByUid(Long uid);

    int deleteByMap(Map<String, String> wheres);

    boolean updateByUid(AwemeUserInfo awemeUserInfo, Long uid);

    boolean updateSelectiveByUid(AwemeUserInfo awemeUserInfo, Long uid);

    int updateSelectiveByMap(AwemeUserInfo awemeUserInfo, Map<String, String> wheres);

	AwemeUserInfo selectByUid(Long uid);

	List<AwemeUserInfo> queryAwemeUserInfoList(Map<String, String> map);

	Page<AwemeUserInfo> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
