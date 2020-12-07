package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeUserInfo;
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
public interface AwemeUserInfoDaoM {
	int insert(AwemeUserInfo awemeUserInfo);

    int deleteByUid(Long uid);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateByUid(@Param("awemeUserInfo") AwemeUserInfo awemeUserInfo, @Param("uid") Long uid);

    int updateSelectiveByUid(@Param("awemeUserInfo") AwemeUserInfo awemeUserInfo, @Param("uid") Long uid);

    int updateSelectiveByMap(@Param("awemeUserInfo") AwemeUserInfo awemeUserInfo, @Param("wheres") Map<String,String> wheres);

    AwemeUserInfo selectByUid(Long uid);

    List<AwemeUserInfo> queryAwemeUserInfoList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeUserInfo> findByPage(@Param("wheres") Map<String, String> wheres);
}
