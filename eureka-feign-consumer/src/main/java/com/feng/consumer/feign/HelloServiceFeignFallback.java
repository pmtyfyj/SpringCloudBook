package com.feng.consumer.feign;

import com.feng.trace1.pojo.UserDemo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务降级类
 * @author: PMTY
 * @create: 2018-06-01 17:02
 **/
@Component
public class HelloServiceFeignFallback implements HelloServiceFeign {

    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "error";
    }

    @Override
    public String hello(@RequestHeader("name") String name, @RequestHeader("age") String age) {
        return "error";
    }

    @Override
    public String hello(@RequestBody UserDemo userDemo) {
        return "error";
    }
}