package com.feng.consumer.feign;

import com.feng.consumer.config.FullLogConfiguration;
import com.feng.trace1.pojo.UserDemo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 调用服务接口
 * @author: PMTY
 * @create: 2018-05-25 14:41
 **/
//@FeignClient(name = "hello-service",configuration = DisableHystrixConfiguration.class)  //关闭Hystrix
//@FeignClient(name = "hello-service",fallback = HelloServiceFeignFallback.class)
@FeignClient(name = "hello-service",configuration = FullLogConfiguration.class) //日志配置
//@FeignClient(name = "hello-service-v1",configuration = FullLogConfiguration.class) //日志配置
public interface HelloServiceFeign {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    String hello(@RequestHeader("name") String name,@RequestHeader("age") String age);

    @RequestMapping(value = "/hello3",method = RequestMethod.GET)
    String hello(@RequestBody UserDemo userDemo);
}