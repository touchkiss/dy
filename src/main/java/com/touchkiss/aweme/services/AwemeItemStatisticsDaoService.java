package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeItemStatistics;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeItemStatisticsDaoService {
	boolean insert(AwemeItemStatistics awemeItemStatistics);

	boolean deleteByAwemeId(Long awemeId);

    int deleteByMap(Map<String, String> wheres);

    boolean updateByAwemeId(AwemeItemStatistics awemeItemStatistics, Long awemeId);

    boolean updateSelectiveByAwemeId(AwemeItemStatistics awemeItemStatistics, Long awemeId);

    int updateSelectiveByMap(AwemeItemStatistics awemeItemStatistics, Map<String, String> wheres);

	AwemeItemStatistics selectByAwemeId(Long awemeId);

	List<AwemeItemStatistics> queryAwemeItemStatisticsList(Map<String, String> map);

	Page<AwemeItemStatistics> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
