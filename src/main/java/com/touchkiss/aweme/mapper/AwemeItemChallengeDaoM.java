package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeItemChallenge;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@Mapper
public interface AwemeItemChallengeDaoM {
	int insert(AwemeItemChallenge awemeItemChallenge);

	int insertWithoutId(AwemeItemChallenge awemeItemChallenge);

    int deleteById(Long id);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateById(@Param("awemeItemChallenge") AwemeItemChallenge awemeItemChallenge, @Param("id") Long id);

    int updateSelectiveById(@Param("awemeItemChallenge") AwemeItemChallenge awemeItemChallenge, @Param("id") Long id);

    int updateSelectiveByMap(@Param("awemeItemChallenge") AwemeItemChallenge awemeItemChallenge, @Param("wheres") Map<String,String> wheres);

    AwemeItemChallenge selectById(Long id);

    List<AwemeItemChallenge> queryAwemeItemChallengeList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeItemChallenge> findByPage(@Param("wheres") Map<String, String> wheres);
}
