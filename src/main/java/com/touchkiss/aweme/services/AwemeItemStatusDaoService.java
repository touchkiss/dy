package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeItemStatus;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeItemStatusDaoService {
	boolean insert(AwemeItemStatus awemeItemStatus);

	boolean deleteByAwemeId(Long awemeId);

    int deleteByMap(Map<String, String> wheres);

    boolean updateByAwemeId(AwemeItemStatus awemeItemStatus, Long awemeId);

    boolean updateSelectiveByAwemeId(AwemeItemStatus awemeItemStatus, Long awemeId);

    int updateSelectiveByMap(AwemeItemStatus awemeItemStatus, Map<String, String> wheres);

	AwemeItemStatus selectByAwemeId(Long awemeId);

	List<AwemeItemStatus> queryAwemeItemStatusList(Map<String, String> map);

	Page<AwemeItemStatus> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
