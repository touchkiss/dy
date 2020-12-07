package com.touchkiss.aweme.services;

import com.github.pagehelper.Page;
import com.touchkiss.aweme.bean.AwemeStickerInfo;
import java.util.Map;
import java.util.List;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
public interface AwemeStickerInfoDaoService {
	boolean insert(AwemeStickerInfo awemeStickerInfo);

	boolean deleteById(Long id);

    int deleteByMap(Map<String, String> wheres);

    boolean updateById(AwemeStickerInfo awemeStickerInfo, Long id);

    boolean updateSelectiveById(AwemeStickerInfo awemeStickerInfo, Long id);

    int updateSelectiveByMap(AwemeStickerInfo awemeStickerInfo, Map<String, String> wheres);

	AwemeStickerInfo selectById(Long id);

	List<AwemeStickerInfo> queryAwemeStickerInfoList(Map<String, String> map);

	Page<AwemeStickerInfo> findByPage(int pageNo, int pageSize, Map<String, String> map);
}
