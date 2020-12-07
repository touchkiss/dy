package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeItemStatistics;
import com.touchkiss.aweme.mapper.AwemeItemStatisticsDaoM;
import com.touchkiss.aweme.services.AwemeItemStatisticsDaoService;
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
public class AwemeItemStatisticsDaoServiceImpl implements AwemeItemStatisticsDaoService {
	@Resource
	AwemeItemStatisticsDaoM awemeItemStatisticsDaoM;

	@Override
	public boolean insert(AwemeItemStatistics awemeItemStatistics) {
        return awemeItemStatisticsDaoM.insert(awemeItemStatistics) == 1;
	}

	@Override
	public boolean deleteByAwemeId(Long awemeId) {
        return awemeItemStatisticsDaoM.deleteByAwemeId(awemeId) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeItemStatisticsDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateByAwemeId(AwemeItemStatistics awemeItemStatistics, Long awemeId) {
        return awemeItemStatisticsDaoM.updateByAwemeId(awemeItemStatistics, awemeId) == 1;
    }

    @Override
    public boolean updateSelectiveByAwemeId(AwemeItemStatistics awemeItemStatistics, Long awemeId) {
        return awemeItemStatisticsDaoM.updateSelectiveByAwemeId(awemeItemStatistics, awemeId) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeItemStatistics awemeItemStatistics, Map<String, String> wheres) {
        return awemeItemStatisticsDaoM.updateSelectiveByMap(awemeItemStatistics, wheres);
    }

    @Override
    public AwemeItemStatistics selectByAwemeId(Long awemeId) {
        return awemeItemStatisticsDaoM.selectByAwemeId(awemeId);
    }

	@Override
	public List<AwemeItemStatistics> queryAwemeItemStatisticsList(Map<String, String> map) {
		return awemeItemStatisticsDaoM.queryAwemeItemStatisticsList(map);
	}

	@Override
	public Page<AwemeItemStatistics> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeItemStatisticsDaoM.findByPage(map);
	}
}
