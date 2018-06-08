//package com.feng.consumer.config;
//
//import feign.Feign;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
///**
// * 关闭Hystrix配置类
// * @author: PMTY
// * @create: 2018-06-01 15:48
// **/
//@Configuration
//public class DisableHystrixConfiguration {
//
//    @Bean
//    @Scope("prototype")
//    public Feign.Builder feignBuilder() {
//        return Feign.builder();
//    }
//}