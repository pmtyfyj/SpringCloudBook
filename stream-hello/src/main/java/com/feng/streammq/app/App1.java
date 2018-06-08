package com.feng.streammq.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;


/**
 * 对input输入通道监听
 * @author: PMTY
 * @create: 2018-06-08 09:28
 **/
//@EnableBinding(Processor.class)
public class App1 {
    private static Logger logger = LoggerFactory.getLogger(App1.class);

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Object receiveFromInput(Object payload) {
        logger.info("Received: " + payload);
        return "From Input Channel Return - " + payload;
    }
}