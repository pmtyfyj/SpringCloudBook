package com.feng.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费方启动类
 * @author: PMTY
 * @create: 2018-04-15 14:38
 **/
@EnableCircuitBreaker //开启断路器功能
@EnableDiscoveryClient //注册为eureka客户端应用
@SpringBootApplication
//@SpringCloudApplication  //可以统一使用该注解代替以上所有注解
public class EurekaClientApplication {

    @Bean
    @LoadBalanced  //开启客户端负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}