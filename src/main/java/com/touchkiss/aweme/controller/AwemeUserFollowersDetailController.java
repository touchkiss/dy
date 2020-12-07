package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeUserFollowersDetail;
import com.touchkiss.aweme.services.AwemeUserFollowersDetailDaoService;
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
public class AwemeUserFollowersDetailController implements BaseController {
    @Autowired
    private AwemeUserFollowersDetailDaoService awemeUserFollowersDetailDaoService;

    @GetMapping("awemeUserFollowersDetail")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeUserFollowersDetailDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeUserFollowersDetail/{id}")
    public AwemeUserFollowersDetail getOne(@PathVariable("id") Long id) {
        return awemeUserFollowersDetailDaoService.selectById(id);
    }

    @DeleteMapping("/awemeUserFollowersDetail/{id}")
    public boolean deleteOne(@PathVariable("id") Long id) {
        return awemeUserFollowersDetailDaoService.deleteById(id);
    }

    @PostMapping("awemeUserFollowersDetail")
    public boolean insertOne(@RequestBody AwemeUserFollowersDetail awemeUserFollowersDetail) {
        return awemeUserFollowersDetailDaoService.insert(awemeUserFollowersDetail);
    }

    @PutMapping("awemeUserFollowersDetail/{id}")
    public boolean updateOne(@RequestBody AwemeUserFollowersDetail awemeUserFollowersDetail, @PathVariable("id") Long id) {
        return awemeUserFollowersDetailDaoService.updateById(awemeUserFollowersDetail, id);
    }

    @PatchMapping("awemeUserFollowersDetail/{id}")
    public boolean updateSelective(@RequestBody AwemeUserFollowersDetail awemeUserFollowersDetail, @PathVariable("id") Long id) {
        return awemeUserFollowersDetailDaoService.updateSelectiveById(awemeUserFollowersDetail, id);
    }
}
