package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeUserFollowersDetail;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeUserFollowersDetailDaoService {
	boolean insert(AwemeUserFollowersDetail awemeUserFollowersDetail);

	boolean deleteById(Long id);

    int deleteByMap(Map<String, String> wheres);

    boolean updateById(AwemeUserFollowersDetail awemeUserFollowersDetail, Long id);

    boolean updateSelectiveById(AwemeUserFollowersDetail awemeUserFollowersDetail, Long id);

    int updateSelectiveByMap(AwemeUserFollowersDetail awemeUserFollowersDetail, Map<String, String> wheres);

	AwemeUserFollowersDetail selectById(Long id);

	List<AwemeUserFollowersDetail> queryAwemeUserFollowersDetailList(Map<String, String> map);

	Page<AwemeUserFollowersDetail> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
