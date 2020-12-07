package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeStickerInfo;
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
public interface AwemeStickerInfoDaoM {
	int insert(AwemeStickerInfo awemeStickerInfo);

    int deleteById(Long id);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateById(@Param("awemeStickerInfo") AwemeStickerInfo awemeStickerInfo, @Param("id") Long id);

    int updateSelectiveById(@Param("awemeStickerInfo") AwemeStickerInfo awemeStickerInfo, @Param("id") Long id);

    int updateSelectiveByMap(@Param("awemeStickerInfo") AwemeStickerInfo awemeStickerInfo, @Param("wheres") Map<String,String> wheres);

    AwemeStickerInfo selectById(Long id);

    List<AwemeStickerInfo> queryAwemeStickerInfoList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeStickerInfo> findByPage(@Param("wheres") Map<String, String> wheres);
}
