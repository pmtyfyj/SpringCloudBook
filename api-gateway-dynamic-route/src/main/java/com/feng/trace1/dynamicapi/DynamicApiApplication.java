package com.feng.trace1.dynamicapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;

/**
 * 动态网关启动类
 * @author: PMTY
 * @create: 2018-06-06 09:24
 **/
@EnableZuulProxy
@SpringCloudApplication
public class DynamicApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicApiApplication.class, args);
    }

    @Bean
    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties() {
        return new ZuulProperties();
    }
}