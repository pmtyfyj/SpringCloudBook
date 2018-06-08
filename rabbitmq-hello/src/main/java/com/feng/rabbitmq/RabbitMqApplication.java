package com.feng.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * mq消息启动类
 * @author: PMTY
 * @create: 2018-06-06 14:44
 **/
@SpringBootApplication
public class RabbitMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMqApplication.class, args);
    }
}