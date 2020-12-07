package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeStickerInfo;
import com.touchkiss.aweme.mapper.AwemeStickerInfoDaoM;
import com.touchkiss.aweme.services.AwemeStickerInfoDaoService;
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
public class AwemeStickerInfoDaoServiceImpl implements AwemeStickerInfoDaoService {
	@Resource
	AwemeStickerInfoDaoM awemeStickerInfoDaoM;

	@Override
	public boolean insert(AwemeStickerInfo awemeStickerInfo) {
        return awemeStickerInfoDaoM.insert(awemeStickerInfo) == 1;
	}

	@Override
	public boolean deleteById(Long id) {
        return awemeStickerInfoDaoM.deleteById(id) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeStickerInfoDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateById(AwemeStickerInfo awemeStickerInfo, Long id) {
        return awemeStickerInfoDaoM.updateById(awemeStickerInfo, id) == 1;
    }

    @Override
    public boolean updateSelectiveById(AwemeStickerInfo awemeStickerInfo, Long id) {
        return awemeStickerInfoDaoM.updateSelectiveById(awemeStickerInfo, id) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeStickerInfo awemeStickerInfo, Map<String, String> wheres) {
        return awemeStickerInfoDaoM.updateSelectiveByMap(awemeStickerInfo, wheres);
    }

    @Override
    public AwemeStickerInfo selectById(Long id) {
        return awemeStickerInfoDaoM.selectById(id);
    }

	@Override
	public List<AwemeStickerInfo> queryAwemeStickerInfoList(Map<String, String> map) {
		return awemeStickerInfoDaoM.queryAwemeStickerInfoList(map);
	}

	@Override
	public Page<AwemeStickerInfo> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeStickerInfoDaoM.findByPage(map);
	}
}
