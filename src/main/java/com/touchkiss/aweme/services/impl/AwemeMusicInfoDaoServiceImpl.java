package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeMusicInfo;
import com.touchkiss.aweme.mapper.AwemeMusicInfoDaoM;
import com.touchkiss.aweme.services.AwemeMusicInfoDaoService;
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
public class AwemeMusicInfoDaoServiceImpl implements AwemeMusicInfoDaoService {
	@Resource
	AwemeMusicInfoDaoM awemeMusicInfoDaoM;

	@Override
	public boolean insert(AwemeMusicInfo awemeMusicInfo) {
        return awemeMusicInfoDaoM.insert(awemeMusicInfo) == 1;
	}

	@Override
	public boolean deleteByMid(Long mid) {
        return awemeMusicInfoDaoM.deleteByMid(mid) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeMusicInfoDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateByMid(AwemeMusicInfo awemeMusicInfo, Long mid) {
        return awemeMusicInfoDaoM.updateByMid(awemeMusicInfo, mid) == 1;
    }

    @Override
    public boolean updateSelectiveByMid(AwemeMusicInfo awemeMusicInfo, Long mid) {
        return awemeMusicInfoDaoM.updateSelectiveByMid(awemeMusicInfo, mid) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeMusicInfo awemeMusicInfo, Map<String, String> wheres) {
        return awemeMusicInfoDaoM.updateSelectiveByMap(awemeMusicInfo, wheres);
    }

    @Override
    public AwemeMusicInfo selectByMid(Long mid) {
        return awemeMusicInfoDaoM.selectByMid(mid);
    }

	@Override
	public List<AwemeMusicInfo> queryAwemeMusicInfoList(Map<String, String> map) {
		return awemeMusicInfoDaoM.queryAwemeMusicInfoList(map);
	}

	@Override
	public Page<AwemeMusicInfo> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeMusicInfoDaoM.findByPage(map);
	}
}
