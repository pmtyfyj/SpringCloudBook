package com.feng.trace1.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取配置中心数据
 * @author: PMTY
 * @create: 2018-06-05 15:47
 **/
@RefreshScope
@RestController
public class TestController {

//    @Value("${from}")
//    private String from;
//
//    @RequestMapping("/from")
//    public String from() {
//        return this.from;
//    }

    @Autowired
    private Environment env;

    @RequestMapping("/from")
    public String from() {
        return env.getProperty("from","undefined");
    }
}