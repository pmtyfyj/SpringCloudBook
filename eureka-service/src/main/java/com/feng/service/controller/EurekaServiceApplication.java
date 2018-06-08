package com.feng.service.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * eureka服务提供者
 * @author: PMTY
 * @create: 2018-04-15 12:23
 **/
//@EnableCircuitBreaker //开启断路器功能
@EnableDiscoveryClient //自动化配置
@SpringBootApplication
public class EurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}