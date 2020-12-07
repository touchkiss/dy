package com.touchkiss.aweme.services.impl;

import com.touchkiss.aweme.bean.AwemeItemChallenge;
import com.touchkiss.aweme.mapper.AwemeItemChallengeDaoM;
import com.touchkiss.aweme.services.AwemeItemChallengeDaoService;
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
public class AwemeItemChallengeDaoServiceImpl implements AwemeItemChallengeDaoService {
	@Resource
	AwemeItemChallengeDaoM awemeItemChallengeDaoM;

	@Override
	public boolean insert(AwemeItemChallenge awemeItemChallenge) {
        if (awemeItemChallenge.getId() == null) {
            return awemeItemChallengeDaoM.insertWithoutId(awemeItemChallenge) == 1;
        }
        return awemeItemChallengeDaoM.insert(awemeItemChallenge) == 1;
	}

	@Override
	public boolean deleteById(Long id) {
        return awemeItemChallengeDaoM.deleteById(id) == 1;
	}

    @Override
    public int deleteByMap(Map<String, String> wheres) {
        return awemeItemChallengeDaoM.deleteByMap(wheres);
    }

    @Override
    public boolean updateById(AwemeItemChallenge awemeItemChallenge, Long id) {
        return awemeItemChallengeDaoM.updateById(awemeItemChallenge, id) == 1;
    }

    @Override
    public boolean updateSelectiveById(AwemeItemChallenge awemeItemChallenge, Long id) {
        return awemeItemChallengeDaoM.updateSelectiveById(awemeItemChallenge, id) == 1;
    }

    @Override
    public int updateSelectiveByMap(AwemeItemChallenge awemeItemChallenge, Map<String, String> wheres) {
        return awemeItemChallengeDaoM.updateSelectiveByMap(awemeItemChallenge, wheres);
    }

    @Override
    public AwemeItemChallenge selectById(Long id) {
        return awemeItemChallengeDaoM.selectById(id);
    }

	@Override
	public List<AwemeItemChallenge> queryAwemeItemChallengeList(Map<String, String> map) {
		return awemeItemChallengeDaoM.queryAwemeItemChallengeList(map);
	}

	@Override
	public Page<AwemeItemChallenge> findByPage(int pageNo, int pageSize, Map<String, String> map) {
		PageHelper.startPage(pageNo, pageSize);
		return awemeItemChallengeDaoM.findByPage(map);
	}
}
