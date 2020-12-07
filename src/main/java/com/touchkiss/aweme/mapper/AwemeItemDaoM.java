package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeItem;
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
public interface AwemeItemDaoM {
	int insert(AwemeItem awemeItem);

    int deleteByAwemeId(Long awemeId);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateByAwemeId(@Param("awemeItem") AwemeItem awemeItem, @Param("awemeId") Long awemeId);

    int updateSelectiveByAwemeId(@Param("awemeItem") AwemeItem awemeItem, @Param("awemeId") Long awemeId);

    int updateSelectiveByMap(@Param("awemeItem") AwemeItem awemeItem, @Param("wheres") Map<String,String> wheres);

    AwemeItem selectByAwemeId(Long awemeId);

    List<AwemeItem> queryAwemeItemList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeItem> findByPage(@Param("wheres") Map<String, String> wheres);
}
