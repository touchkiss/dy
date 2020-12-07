package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeItemStatus;
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
public interface AwemeItemStatusDaoM {
	int insert(AwemeItemStatus awemeItemStatus);

    int deleteByAwemeId(Long awemeId);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateByAwemeId(@Param("awemeItemStatus") AwemeItemStatus awemeItemStatus, @Param("awemeId") Long awemeId);

    int updateSelectiveByAwemeId(@Param("awemeItemStatus") AwemeItemStatus awemeItemStatus, @Param("awemeId") Long awemeId);

    int updateSelectiveByMap(@Param("awemeItemStatus") AwemeItemStatus awemeItemStatus, @Param("wheres") Map<String,String> wheres);

    AwemeItemStatus selectByAwemeId(Long awemeId);

    List<AwemeItemStatus> queryAwemeItemStatusList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeItemStatus> findByPage(@Param("wheres") Map<String, String> wheres);
}
