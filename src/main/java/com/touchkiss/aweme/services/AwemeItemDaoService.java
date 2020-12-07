package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeItem;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeItemDaoService {
	boolean insert(AwemeItem awemeItem);

	boolean deleteByAwemeId(Long awemeId);

    int deleteByMap(Map<String, String> wheres);

    boolean updateByAwemeId(AwemeItem awemeItem, Long awemeId);

    boolean updateSelectiveByAwemeId(AwemeItem awemeItem, Long awemeId);

    int updateSelectiveByMap(AwemeItem awemeItem, Map<String, String> wheres);

	AwemeItem selectByAwemeId(Long awemeId);

	List<AwemeItem> queryAwemeItemList(Map<String, String> map);

	Page<AwemeItem> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
