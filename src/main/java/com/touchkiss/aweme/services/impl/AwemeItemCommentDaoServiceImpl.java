package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeItemComment;
import com.touchkiss.aweme.mapper.AwemeItemCommentDaoM;
import com.touchkiss.aweme.services.AwemeItemCommentDaoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@Service
@Transactional
public class AwemeItemCommentDaoServiceImpl implements AwemeItemCommentDaoService {
	@Resource
	AwemeItemCommentDaoM awemeItemCommentDaoM;

	@Override
	public boolean insert(AwemeItemComment awemeItemComment) {
        long currentTimeMillis = System.currentTimeMillis();
        if (awemeItemComment.getCreateTime() == null) {
            awemeItemComment.setCreateTime(currentTimeMillis);
        }
        return awemeItemCommentDaoM.insert(awemeItemComment) == 1;
	}

	@Override
	public boolean deleteByCid(Long cid) {
        return awemeItemCommentDaoM.deleteByCid(cid) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeItemCommentDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateByCid(AwemeItemComment awemeItemComment, Long cid) {
        return awemeItemCommentDaoM.updateByCid(awemeItemComment, cid) == 1;
    }

    @Override
    public boolean updateSelectiveByCid(AwemeItemComment awemeItemComment, Long cid) {
        return awemeItemCommentDaoM.updateSelectiveByCid(awemeItemComment, cid) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeItemComment awemeItemComment, Map<String, String> wheres) {
        return awemeItemCommentDaoM.updateSelectiveByMap(awemeItemComment, wheres);
    }

    @Override
    public AwemeItemComment selectByCid(Long cid) {
        return awemeItemCommentDaoM.selectByCid(cid);
    }

	@Override
	public List<AwemeItemComment> queryAwemeItemCommentList(Map<String, String> map) {
		return awemeItemCommentDaoM.queryAwemeItemCommentList(map);
	}

	@Override
	public Page<AwemeItemComment> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeItemCommentDaoM.findByPage(map);
	}
}
