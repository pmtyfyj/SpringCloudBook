package com.feng.streammq.group;

import com.feng.trace1.pojo.UserDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 消费者应用
 * @author: PMTY
 * @create: 2018-06-08 09:57
 **/
@EnableBinding(Sink.class)
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(UserDemo userDemo) {
        logger.info("Received: " + userDemo);
    }
}