package com.feng.service.controller.controller;

import com.feng.trace1.pojo.UserDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * 前端控制器
 * @author: PMTY
 * @create: 2018-04-15 12:26
 **/
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String showIndex() throws Exception {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        //模拟服务阻塞（长时间未响应）
        //让处理线程等待几秒钟
        int sleepTime = new Random().nextInt(30000);
        logger.info("sleepTime: " + sleepTime);
        Thread.sleep(sleepTime);
        logger.info("/hello, host " + instance.getHost() + ", service_id:" + instance.getServiceId());
//        try {
//            //int i = 1 / 0;
//            return "Hello World";
//        } catch (Exception e) {
//            throw new RuntimeException("Exist some errors...");
//        }
        return "Hello World";
    }

    @RequestMapping("/showList")
    public List<String> showList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("23");
        list.add("shanghai");
        return list;
    }

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello" + name;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public UserDemo hello(@RequestHeader String name, @RequestHeader String age) {
        return new UserDemo(name,age);
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.GET)
    public String hello(@RequestBody UserDemo userDemo) {
        return "Hello" + userDemo.getName() + ", " + userDemo.getAge();
    }
}