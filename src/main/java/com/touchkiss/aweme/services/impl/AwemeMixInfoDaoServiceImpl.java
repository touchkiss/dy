package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeMixInfo;
import com.touchkiss.aweme.mapper.AwemeMixInfoDaoM;
import com.touchkiss.aweme.services.AwemeMixInfoDaoService;
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
public class AwemeMixInfoDaoServiceImpl implements AwemeMixInfoDaoService {
	@Resource
	AwemeMixInfoDaoM awemeMixInfoDaoM;

	@Override
	public boolean insert(AwemeMixInfo awemeMixInfo) {
        long currentTimeMillis = System.currentTimeMillis();
        if (awemeMixInfo.getCreateTime() == null) {
            awemeMixInfo.setCreateTime(currentTimeMillis);
        }
        return awemeMixInfoDaoM.insert(awemeMixInfo) == 1;
	}

	@Override
	public boolean deleteByMixId(Long mixId) {
        return awemeMixInfoDaoM.deleteByMixId(mixId) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeMixInfoDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateByMixId(AwemeMixInfo awemeMixInfo, Long mixId) {
        return awemeMixInfoDaoM.updateByMixId(awemeMixInfo, mixId) == 1;
    }

    @Override
    public boolean updateSelectiveByMixId(AwemeMixInfo awemeMixInfo, Long mixId) {
        return awemeMixInfoDaoM.updateSelectiveByMixId(awemeMixInfo, mixId) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeMixInfo awemeMixInfo, Map<String, String> wheres) {
        return awemeMixInfoDaoM.updateSelectiveByMap(awemeMixInfo, wheres);
    }

    @Override
    public AwemeMixInfo selectByMixId(Long mixId) {
        return awemeMixInfoDaoM.selectByMixId(mixId);
    }

	@Override
	public List<AwemeMixInfo> queryAwemeMixInfoList(Map<String, String> map) {
		return awemeMixInfoDaoM.queryAwemeMixInfoList(map);
	}

	@Override
	public Page<AwemeMixInfo> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeMixInfoDaoM.findByPage(map);
	}
}
