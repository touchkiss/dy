package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeItemStatistics;
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
public interface AwemeItemStatisticsDaoM {
	int insert(AwemeItemStatistics awemeItemStatistics);

    int deleteByAwemeId(Long awemeId);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateByAwemeId(@Param("awemeItemStatistics") AwemeItemStatistics awemeItemStatistics, @Param("awemeId") Long awemeId);

    int updateSelectiveByAwemeId(@Param("awemeItemStatistics") AwemeItemStatistics awemeItemStatistics, @Param("awemeId") Long awemeId);

    int updateSelectiveByMap(@Param("awemeItemStatistics") AwemeItemStatistics awemeItemStatistics, @Param("wheres") Map<String,String> wheres);

    AwemeItemStatistics selectByAwemeId(Long awemeId);

    List<AwemeItemStatistics> queryAwemeItemStatisticsList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeItemStatistics> findByPage(@Param("wheres") Map<String, String> wheres);
}
