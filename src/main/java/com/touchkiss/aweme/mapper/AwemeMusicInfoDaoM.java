package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeMusicInfo;
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
public interface AwemeMusicInfoDaoM {
	int insert(AwemeMusicInfo awemeMusicInfo);

    int deleteByMid(Long mid);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateByMid(@Param("awemeMusicInfo") AwemeMusicInfo awemeMusicInfo, @Param("mid") Long mid);

    int updateSelectiveByMid(@Param("awemeMusicInfo") AwemeMusicInfo awemeMusicInfo, @Param("mid") Long mid);

    int updateSelectiveByMap(@Param("awemeMusicInfo") AwemeMusicInfo awemeMusicInfo, @Param("wheres") Map<String,String> wheres);

    AwemeMusicInfo selectByMid(Long mid);

    List<AwemeMusicInfo> queryAwemeMusicInfoList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeMusicInfo> findByPage(@Param("wheres") Map<String, String> wheres);
}
