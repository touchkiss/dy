package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeItemChallenge;
import com.touchkiss.aweme.services.AwemeItemChallengeDaoService;
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
public class AwemeItemChallengeController implements BaseController {
    @Autowired
    private AwemeItemChallengeDaoService awemeItemChallengeDaoService;

    @GetMapping("awemeItemChallenge")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeItemChallengeDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeItemChallenge/{id}")
    public AwemeItemChallenge getOne(@PathVariable("id") Long id) {
        return awemeItemChallengeDaoService.selectById(id);
    }

    @DeleteMapping("/awemeItemChallenge/{id}")
    public boolean deleteOne(@PathVariable("id") Long id) {
        return awemeItemChallengeDaoService.deleteById(id);
    }

    @PostMapping("awemeItemChallenge")
    public boolean insertOne(@RequestBody AwemeItemChallenge awemeItemChallenge) {
        return awemeItemChallengeDaoService.insert(awemeItemChallenge);
    }

    @PutMapping("awemeItemChallenge/{id}")
    public boolean updateOne(@RequestBody AwemeItemChallenge awemeItemChallenge, @PathVariable("id") Long id) {
        return awemeItemChallengeDaoService.updateById(awemeItemChallenge, id);
    }

    @PatchMapping("awemeItemChallenge/{id}")
    public boolean updateSelective(@RequestBody AwemeItemChallenge awemeItemChallenge, @PathVariable("id") Long id) {
        return awemeItemChallengeDaoService.updateSelectiveById(awemeItemChallenge, id);
    }
}
