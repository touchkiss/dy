package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeChallengeInfo;
import com.touchkiss.aweme.services.AwemeChallengeInfoDaoService;
import com.touchkiss.common.PageResult;
import com.touchkiss.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@RestController
@RequestMapping("aweme")
public class AwemeChallengeInfoController implements BaseController {
    @Autowired
    private AwemeChallengeInfoDaoService awemeChallengeInfoDaoService;

    @GetMapping("awemeChallengeInfo")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeChallengeInfoDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeChallengeInfo/{cid}")
    public AwemeChallengeInfo getOne(@PathVariable("cid") Long cid) {
        return awemeChallengeInfoDaoService.selectByCid(cid);
    }

    @DeleteMapping("/awemeChallengeInfo/{cid}")
    public boolean deleteOne(@PathVariable("cid") Long cid) {
        return awemeChallengeInfoDaoService.deleteByCid(cid);
    }

    @PostMapping("awemeChallengeInfo")
    public boolean insertOne(@RequestBody AwemeChallengeInfo awemeChallengeInfo) {
        return awemeChallengeInfoDaoService.insert(awemeChallengeInfo);
    }

    @PutMapping("awemeChallengeInfo/{cid}")
    public boolean updateOne(@RequestBody AwemeChallengeInfo awemeChallengeInfo, @PathVariable("cid") Long cid) {
        return awemeChallengeInfoDaoService.updateByCid(awemeChallengeInfo, cid);
    }

    @PatchMapping("awemeChallengeInfo/{cid}")
    public boolean updateSelective(@RequestBody AwemeChallengeInfo awemeChallengeInfo, @PathVariable("cid") Long cid) {
        return awemeChallengeInfoDaoService.updateSelectiveByCid(awemeChallengeInfo, cid);
    }
}
