package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeItemChallenge;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeItemChallengeDaoService {
	boolean insert(AwemeItemChallenge awemeItemChallenge);

	boolean deleteById(Long id);

    int deleteByMap(Map<String, String> wheres);

    boolean updateById(AwemeItemChallenge awemeItemChallenge, Long id);

    boolean updateSelectiveById(AwemeItemChallenge awemeItemChallenge, Long id);

    int updateSelectiveByMap(AwemeItemChallenge awemeItemChallenge, Map<String, String> wheres);

	AwemeItemChallenge selectById(Long id);

	List<AwemeItemChallenge> queryAwemeItemChallengeList(Map<String, String> map);

	Page<AwemeItemChallenge> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
