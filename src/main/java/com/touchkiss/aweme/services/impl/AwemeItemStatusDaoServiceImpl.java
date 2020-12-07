package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeItemStatus;
import com.touchkiss.aweme.mapper.AwemeItemStatusDaoM;
import com.touchkiss.aweme.services.AwemeItemStatusDaoService;
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
public class AwemeItemStatusDaoServiceImpl implements AwemeItemStatusDaoService {
	@Resource
	AwemeItemStatusDaoM awemeItemStatusDaoM;

	@Override
	public boolean insert(AwemeItemStatus awemeItemStatus) {
        return awemeItemStatusDaoM.insert(awemeItemStatus) == 1;
	}

	@Override
	public boolean deleteByAwemeId(Long awemeId) {
        return awemeItemStatusDaoM.deleteByAwemeId(awemeId) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeItemStatusDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateByAwemeId(AwemeItemStatus awemeItemStatus, Long awemeId) {
        return awemeItemStatusDaoM.updateByAwemeId(awemeItemStatus, awemeId) == 1;
    }

    @Override
    public boolean updateSelectiveByAwemeId(AwemeItemStatus awemeItemStatus, Long awemeId) {
        return awemeItemStatusDaoM.updateSelectiveByAwemeId(awemeItemStatus, awemeId) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeItemStatus awemeItemStatus, Map<String, String> wheres) {
        return awemeItemStatusDaoM.updateSelectiveByMap(awemeItemStatus, wheres);
    }

    @Override
    public AwemeItemStatus selectByAwemeId(Long awemeId) {
        return awemeItemStatusDaoM.selectByAwemeId(awemeId);
    }

	@Override
	public List<AwemeItemStatus> queryAwemeItemStatusList(Map<String, String> map) {
		return awemeItemStatusDaoM.queryAwemeItemStatusList(map);
	}

	@Override
	public Page<AwemeItemStatus> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeItemStatusDaoM.findByPage(map);
	}
}
