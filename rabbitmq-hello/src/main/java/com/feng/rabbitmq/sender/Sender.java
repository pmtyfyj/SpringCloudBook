package com.feng.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消息生产者类
 * @author: PMTY
 * @create: 2018-06-06 14:45
 **/
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender: " + context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}