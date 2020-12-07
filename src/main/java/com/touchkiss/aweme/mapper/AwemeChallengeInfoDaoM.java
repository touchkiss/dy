package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeChallengeInfo;
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
public interface AwemeChallengeInfoDaoM {
	int insert(AwemeChallengeInfo awemeChallengeInfo);

    int deleteByCid(Long cid);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateByCid(@Param("awemeChallengeInfo") AwemeChallengeInfo awemeChallengeInfo, @Param("cid") Long cid);

    int updateSelectiveByCid(@Param("awemeChallengeInfo") AwemeChallengeInfo awemeChallengeInfo, @Param("cid") Long cid);

    int updateSelectiveByMap(@Param("awemeChallengeInfo") AwemeChallengeInfo awemeChallengeInfo, @Param("wheres") Map<String,String> wheres);

    AwemeChallengeInfo selectByCid(Long cid);

    List<AwemeChallengeInfo> queryAwemeChallengeInfoList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeChallengeInfo> findByPage(@Param("wheres") Map<String, String> wheres);
}
