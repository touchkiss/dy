package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeUserFollowersDetail;
import com.touchkiss.aweme.mapper.AwemeUserFollowersDetailDaoM;
import com.touchkiss.aweme.services.AwemeUserFollowersDetailDaoService;
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
public class AwemeUserFollowersDetailDaoServiceImpl implements AwemeUserFollowersDetailDaoService {
	@Resource
	AwemeUserFollowersDetailDaoM awemeUserFollowersDetailDaoM;

	@Override
	public boolean insert(AwemeUserFollowersDetail awemeUserFollowersDetail) {
        if (awemeUserFollowersDetail.getId() == null) {
            return awemeUserFollowersDetailDaoM.insertWithoutId(awemeUserFollowersDetail) == 1;
        }
        return awemeUserFollowersDetailDaoM.insert(awemeUserFollowersDetail) == 1;
	}

	@Override
	public boolean deleteById(Long id) {
        return awemeUserFollowersDetailDaoM.deleteById(id) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeUserFollowersDetailDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateById(AwemeUserFollowersDetail awemeUserFollowersDetail, Long id) {
        return awemeUserFollowersDetailDaoM.updateById(awemeUserFollowersDetail, id) == 1;
    }

    @Override
    public boolean updateSelectiveById(AwemeUserFollowersDetail awemeUserFollowersDetail, Long id) {
        return awemeUserFollowersDetailDaoM.updateSelectiveById(awemeUserFollowersDetail, id) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeUserFollowersDetail awemeUserFollowersDetail, Map<String, String> wheres) {
        return awemeUserFollowersDetailDaoM.updateSelectiveByMap(awemeUserFollowersDetail, wheres);
    }

    @Override
    public AwemeUserFollowersDetail selectById(Long id) {
        return awemeUserFollowersDetailDaoM.selectById(id);
    }

	@Override
	public List<AwemeUserFollowersDetail> queryAwemeUserFollowersDetailList(Map<String, String> map) {
		return awemeUserFollowersDetailDaoM.queryAwemeUserFollowersDetailList(map);
	}

	@Override
	public Page<AwemeUserFollowersDetail> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeUserFollowersDetailDaoM.findByPage(map);
	}
}
