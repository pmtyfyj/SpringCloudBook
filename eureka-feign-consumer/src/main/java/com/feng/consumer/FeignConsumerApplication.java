package com.feng.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * feign启动类
 * @author: PMTY
 * @create: 2018-05-25 14:37
 **/
@EnableFeignClients  //开启Spring Cloud Feign 支持
@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }

    //配置日志
//    @Bean
//    Logger.Level feignLoggerLevel() {
//        return Logger.Level.FULL;
//    }
}