package com.feng.streammq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 消息驱动服务启动类
 * @author: PMTY
 * @create: 2018-06-07 13:16
 **/
@SpringBootApplication
public class StreamMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamMqApplication.class, args);
    }
}