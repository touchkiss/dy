package com.touchkiss.dy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2020/09/22 22:12
 *
 * @author Touchkiss
 */
@RestController
public class DemoController {
    @RequestMapping("test")
    public String test() {
        return "你好啊";
    }
}
