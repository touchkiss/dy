package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeItemComment;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeItemCommentDaoService {
	boolean insert(AwemeItemComment awemeItemComment);

	boolean deleteByCid(Long cid);

    int deleteByMap(Map<String, String> wheres);

    boolean updateByCid(AwemeItemComment awemeItemComment, Long cid);

    boolean updateSelectiveByCid(AwemeItemComment awemeItemComment, Long cid);

    int updateSelectiveByMap(AwemeItemComment awemeItemComment, Map<String, String> wheres);

	AwemeItemComment selectByCid(Long cid);

	List<AwemeItemComment> queryAwemeItemCommentList(Map<String, String> map);

	Page<AwemeItemComment> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
