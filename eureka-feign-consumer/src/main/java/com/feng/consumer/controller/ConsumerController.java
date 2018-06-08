package com.feng.consumer.controller;

import com.feng.consumer.feign.HelloServiceFeign;
import com.feng.consumer.feign.RefactorHelloServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 * @author: PMTY
 * @create: 2018-05-28 14:04
 **/
@RestController
public class ConsumerController {

    @Autowired
    private HelloServiceFeign helloServiceFeign;

    @Autowired
    private RefactorHelloServiceFeign refactorHelloServiceFeign;

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer() {
        return helloServiceFeign.hello();
    }

    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloServiceFeign.hello()).append("\n");
        sb.append(helloServiceFeign.hello("DIDI")).append("\n");
        sb.append(helloServiceFeign.hello("DIDI", "30")).append("\n");
//        sb.append(helloServiceFeign.hello(new UserDemo("DIDI", "30"))).append("\n");
        return sb.toString();
    }

    @RequestMapping(value = "feign-consumer3",method = RequestMethod.GET)
    public String helloConsumer3() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloServiceFeign.hello("PMTY")).append("\n");
        sb.append(refactorHelloServiceFeign.hello("PMTY")).append("\n");
        sb.append(refactorHelloServiceFeign.hello("PMTY", "20")).append("\n");
//        sb.append(refactorHelloServiceFeign.hello(new UserDemo("PMTY", "30"))).append("\n");
        return sb.toString();
    }
}