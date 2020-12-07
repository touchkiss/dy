package com.touchkiss.aweme.mapper;

import com.touchkiss.aweme.bean.AwemeItemComment;
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
public interface AwemeItemCommentDaoM {
	int insert(AwemeItemComment awemeItemComment);

    int deleteByCid(Long cid);

    int deleteByMap(@Param("wheres") Map<String,String> wheres);

    int updateByCid(@Param("awemeItemComment") AwemeItemComment awemeItemComment, @Param("cid") Long cid);

    int updateSelectiveByCid(@Param("awemeItemComment") AwemeItemComment awemeItemComment, @Param("cid") Long cid);

    int updateSelectiveByMap(@Param("awemeItemComment") AwemeItemComment awemeItemComment, @Param("wheres") Map<String,String> wheres);

    AwemeItemComment selectByCid(Long cid);

    List<AwemeItemComment> queryAwemeItemCommentList(@Param("wheres") Map<String,String> wheres);

	Page<AwemeItemComment> findByPage(@Param("wheres") Map<String, String> wheres);
}
