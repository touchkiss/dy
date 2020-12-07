package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeChallengeInfo;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeChallengeInfoDaoService {
	boolean insert(AwemeChallengeInfo awemeChallengeInfo);

	boolean deleteByCid(Long cid);

    int deleteByMap(Map<String, String> wheres);

    boolean updateByCid(AwemeChallengeInfo awemeChallengeInfo, Long cid);

    boolean updateSelectiveByCid(AwemeChallengeInfo awemeChallengeInfo, Long cid);

    int updateSelectiveByMap(AwemeChallengeInfo awemeChallengeInfo, Map<String, String> wheres);

	AwemeChallengeInfo selectByCid(Long cid);

	List<AwemeChallengeInfo> queryAwemeChallengeInfoList(Map<String, String> map);

	Page<AwemeChallengeInfo> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
