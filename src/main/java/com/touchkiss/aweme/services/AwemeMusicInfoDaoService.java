package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeMusicInfo;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeMusicInfoDaoService {
	boolean insert(AwemeMusicInfo awemeMusicInfo);

	boolean deleteByMid(Long mid);

    int deleteByMap(Map<String, String> wheres);

    boolean updateByMid(AwemeMusicInfo awemeMusicInfo, Long mid);

    boolean updateSelectiveByMid(AwemeMusicInfo awemeMusicInfo, Long mid);

    int updateSelectiveByMap(AwemeMusicInfo awemeMusicInfo, Map<String, String> wheres);

	AwemeMusicInfo selectByMid(Long mid);

	List<AwemeMusicInfo> queryAwemeMusicInfoList(Map<String, String> map);

	Page<AwemeMusicInfo> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
