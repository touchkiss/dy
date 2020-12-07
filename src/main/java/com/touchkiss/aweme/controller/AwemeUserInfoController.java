package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeUserInfo;
import com.touchkiss.aweme.services.AwemeUserInfoDaoService;
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
public class AwemeUserInfoController implements BaseController {
    @Autowired
    private AwemeUserInfoDaoService awemeUserInfoDaoService;

    @GetMapping("awemeUserInfo")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeUserInfoDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeUserInfo/{uid}")
    public AwemeUserInfo getOne(@PathVariable("uid") Long uid) {
        return awemeUserInfoDaoService.selectByUid(uid);
    }

    @DeleteMapping("/awemeUserInfo/{uid}")
    public boolean deleteOne(@PathVariable("uid") Long uid) {
        return awemeUserInfoDaoService.deleteByUid(uid);
    }

    @PostMapping("awemeUserInfo")
    public boolean insertOne(@RequestBody AwemeUserInfo awemeUserInfo) {
        return awemeUserInfoDaoService.insert(awemeUserInfo);
    }

    @PutMapping("awemeUserInfo/{uid}")
    public boolean updateOne(@RequestBody AwemeUserInfo awemeUserInfo, @PathVariable("uid") Long uid) {
        return awemeUserInfoDaoService.updateByUid(awemeUserInfo, uid);
    }

    @PatchMapping("awemeUserInfo/{uid}")
    public boolean updateSelective(@RequestBody AwemeUserInfo awemeUserInfo, @PathVariable("uid") Long uid) {
        return awemeUserInfoDaoService.updateSelectiveByUid(awemeUserInfo, uid);
    }
}
