package com.feng.gateway.filter;

import com.feng.gateway.filter.filter.AccessFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * API网关启动类
 * @author: PMTY
 * @create: 2018-06-02 13:14
 **/
@EnableZuulProxy   //开启Zuul的API网关服务功能
@SpringBootApplication
public class ZuulApplication {
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }

    @Bean   //使过滤器生效
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

//    @Bean  //定义版本路径
//    public PatternServiceRouteMapper serviceRouteMapper() {
//        return new PatternServiceRouteMapper(
//                "(?<name>^.+)-(?<version>v.+$)",
//                "${version}/${name}");
//    }
}