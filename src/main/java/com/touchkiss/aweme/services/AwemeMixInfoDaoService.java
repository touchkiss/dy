package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeMixInfo;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeMixInfoDaoService {
	boolean insert(AwemeMixInfo awemeMixInfo);

	boolean deleteByMixId(Long mixId);

    int deleteByMap(Map<String, String> wheres);

    boolean updateByMixId(AwemeMixInfo awemeMixInfo, Long mixId);

    boolean updateSelectiveByMixId(AwemeMixInfo awemeMixInfo, Long mixId);

    int updateSelectiveByMap(AwemeMixInfo awemeMixInfo, Map<String, String> wheres);

	AwemeMixInfo selectByMixId(Long mixId);

	List<AwemeMixInfo> queryAwemeMixInfoList(Map<String, String> map);

	Page<AwemeMixInfo> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
