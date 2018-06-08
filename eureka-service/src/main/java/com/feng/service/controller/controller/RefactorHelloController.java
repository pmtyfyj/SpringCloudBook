package com.feng.service.controller.controller;

import com.feng.api.servcie.servcie.HelloService;
import com.feng.trace1.pojo.UserDemo;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign调用接口控制层
 * @author: PMTY
 * @create: 2018-06-01 09:51
 **/
@RestController
public class RefactorHelloController implements HelloService {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @Override
    public UserDemo hello(@RequestHeader("name") String name, @RequestHeader("age") String age) {
        return new UserDemo(name,age);
    }

    @Override
    public String hello(UserDemo userDemo) {
        return "Hello " + userDemo.getName() + ", " + userDemo.getAge();
    }

    @Override
    public String hello(Long uId) {
        return "HelloWW";
    }
}