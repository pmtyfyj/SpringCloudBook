package com.feng.gateway.filter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 本地跳转控制器
 * @author: PMTY
 * @create: 2018-06-04 14:16
 **/
@RestController
public class HelloController {

    @RequestMapping("/local/hellopmty")
    public String hello() {
        return "Hello World Local";
    }
}