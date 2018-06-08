package com.feng.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * @author: PMTY
 * @create: 2018-06-08 14:58
 **/
@EnableZipkinStreamServer  //用消息代理
//@EnableZipkinServer //启动ZipKin Server http方式收集
@SpringBootApplication
public class ZipkinServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }
}