package com.feng.streammq.inface;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;

/**
 * Input消息通道作为输出通道接口
 * @author: PMTY
 * @create: 2018-06-07 13:41
 **/
public interface ISinkSender {

//    @Output(Source.OUTPUT)
    @Output(Sink.INPUT)
    MessageChannel output();
}
