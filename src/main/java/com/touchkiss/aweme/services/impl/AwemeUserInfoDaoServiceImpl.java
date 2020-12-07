package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeUserInfo;
import com.touchkiss.aweme.mapper.AwemeUserInfoDaoM;
import com.touchkiss.aweme.services.AwemeUserInfoDaoService;
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
public class AwemeUserInfoDaoServiceImpl implements AwemeUserInfoDaoService {
	@Resource
	AwemeUserInfoDaoM awemeUserInfoDaoM;

	@Override
	public boolean insert(AwemeUserInfo awemeUserInfo) {
        return awemeUserInfoDaoM.insert(awemeUserInfo) == 1;
	}

	@Override
	public boolean deleteByUid(Long uid) {
        return awemeUserInfoDaoM.deleteByUid(uid) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeUserInfoDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateByUid(AwemeUserInfo awemeUserInfo, Long uid) {
        return awemeUserInfoDaoM.updateByUid(awemeUserInfo, uid) == 1;
    }

    @Override
    public boolean updateSelectiveByUid(AwemeUserInfo awemeUserInfo, Long uid) {
        return awemeUserInfoDaoM.updateSelectiveByUid(awemeUserInfo, uid) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeUserInfo awemeUserInfo, Map<String, String> wheres) {
        return awemeUserInfoDaoM.updateSelectiveByMap(awemeUserInfo, wheres);
    }

    @Override
    public AwemeUserInfo selectByUid(Long uid) {
        return awemeUserInfoDaoM.selectByUid(uid);
    }

	@Override
	public List<AwemeUserInfo> queryAwemeUserInfoList(Map<String, String> map) {
		return awemeUserInfoDaoM.queryAwemeUserInfoList(map);
	}

	@Override
	public Page<AwemeUserInfo> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeUserInfoDaoM.findByPage(map);
	}
}
