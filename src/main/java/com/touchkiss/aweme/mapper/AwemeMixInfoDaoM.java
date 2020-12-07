package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeMixInfo;
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
public interface AwemeMixInfoDaoM {
	int insert(AwemeMixInfo awemeMixInfo);

    int deleteByMixId(Long mixId);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateByMixId(@Param("awemeMixInfo") AwemeMixInfo awemeMixInfo, @Param("mixId") Long mixId);

    int updateSelectiveByMixId(@Param("awemeMixInfo") AwemeMixInfo awemeMixInfo, @Param("mixId") Long mixId);

    int updateSelectiveByMap(@Param("awemeMixInfo") AwemeMixInfo awemeMixInfo, @Param("wheres") Map<String,String> wheres);

    AwemeMixInfo selectByMixId(Long mixId);

    List<AwemeMixInfo> queryAwemeMixInfoList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeMixInfo> findByPage(@Param("wheres") Map<String, String> wheres);
}
