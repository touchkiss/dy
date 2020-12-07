package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeChallengeInfo;
import com.touchkiss.aweme.mapper.AwemeChallengeInfoDaoM;
import com.touchkiss.aweme.services.AwemeChallengeInfoDaoService;
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
public class AwemeChallengeInfoDaoServiceImpl implements AwemeChallengeInfoDaoService {
	@Resource
	AwemeChallengeInfoDaoM awemeChallengeInfoDaoM;

	@Override
	public boolean insert(AwemeChallengeInfo awemeChallengeInfo) {
        return awemeChallengeInfoDaoM.insert(awemeChallengeInfo) == 1;
	}

	@Override
	public boolean deleteByCid(Long cid) {
        return awemeChallengeInfoDaoM.deleteByCid(cid) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeChallengeInfoDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateByCid(AwemeChallengeInfo awemeChallengeInfo, Long cid) {
        return awemeChallengeInfoDaoM.updateByCid(awemeChallengeInfo, cid) == 1;
    }

    @Override
    public boolean updateSelectiveByCid(AwemeChallengeInfo awemeChallengeInfo, Long cid) {
        return awemeChallengeInfoDaoM.updateSelectiveByCid(awemeChallengeInfo, cid) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeChallengeInfo awemeChallengeInfo, Map<String, String> wheres) {
        return awemeChallengeInfoDaoM.updateSelectiveByMap(awemeChallengeInfo, wheres);
    }

    @Override
    public AwemeChallengeInfo selectByCid(Long cid) {
        return awemeChallengeInfoDaoM.selectByCid(cid);
    }

	@Override
	public List<AwemeChallengeInfo> queryAwemeChallengeInfoList(Map<String, String> map) {
		return awemeChallengeInfoDaoM.queryAwemeChallengeInfoList(map);
	}

	@Override
	public Page<AwemeChallengeInfo> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeChallengeInfoDaoM.findByPage(map);
	}
}
