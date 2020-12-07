package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeUserFollowersDetail;
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
public interface AwemeUserFollowersDetailDaoM {
	int insert(AwemeUserFollowersDetail awemeUserFollowersDetail);

	int insertWithoutId(AwemeUserFollowersDetail awemeUserFollowersDetail);

    int deleteById(Long id);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateById(@Param("awemeUserFollowersDetail") AwemeUserFollowersDetail awemeUserFollowersDetail, @Param("id") Long id);

    int updateSelectiveById(@Param("awemeUserFollowersDetail") AwemeUserFollowersDetail awemeUserFollowersDetail, @Param("id") Long id);

    int updateSelectiveByMap(@Param("awemeUserFollowersDetail") AwemeUserFollowersDetail awemeUserFollowersDetail, @Param("wheres") Map<String,String> wheres);

    AwemeUserFollowersDetail selectById(Long id);

    List<AwemeUserFollowersDetail> queryAwemeUserFollowersDetailList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeUserFollowersDetail> findByPage(@Param("wheres") Map<String, String> wheres);
}
