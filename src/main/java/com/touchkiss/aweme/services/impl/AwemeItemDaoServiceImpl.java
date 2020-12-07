package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeItem;
import com.touchkiss.aweme.mapper.AwemeItemDaoM;
import com.touchkiss.aweme.services.AwemeItemDaoService;
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
public class AwemeItemDaoServiceImpl implements AwemeItemDaoService {
	@Resource
	AwemeItemDaoM awemeItemDaoM;

	@Override
	public boolean insert(AwemeItem awemeItem) {
        long currentTimeMillis = System.currentTimeMillis();
        if (awemeItem.getCreateTime() == null) {
            awemeItem.setCreateTime(currentTimeMillis);
        }
        return awemeItemDaoM.insert(awemeItem) == 1;
	}

	@Override
	public boolean deleteByAwemeId(Long awemeId) {
        return awemeItemDaoM.deleteByAwemeId(awemeId) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeItemDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateByAwemeId(AwemeItem awemeItem, Long awemeId) {
        return awemeItemDaoM.updateByAwemeId(awemeItem, awemeId) == 1;
    }

    @Override
    public boolean updateSelectiveByAwemeId(AwemeItem awemeItem, Long awemeId) {
        return awemeItemDaoM.updateSelectiveByAwemeId(awemeItem, awemeId) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeItem awemeItem, Map<String, String> wheres) {
        return awemeItemDaoM.updateSelectiveByMap(awemeItem, wheres);
    }

    @Override
    public AwemeItem selectByAwemeId(Long awemeId) {
        return awemeItemDaoM.selectByAwemeId(awemeId);
    }

	@Override
	public List<AwemeItem> queryAwemeItemList(Map<String, String> map) {
		return awemeItemDaoM.queryAwemeItemList(map);
	}

	@Override
	public Page<AwemeItem> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeItemDaoM.findByPage(map);
	}
}
