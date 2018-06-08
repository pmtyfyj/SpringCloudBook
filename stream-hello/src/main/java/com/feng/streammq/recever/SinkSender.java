//package com.feng.streammq.recever;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.cloud.stream.annotation.Output;
//import org.springframework.context.annotation.Bean;
//import org.springframework.integration.annotation.InboundChannelAdapter;
//import org.springframework.integration.annotation.Poller;
//import org.springframework.integration.core.MessageSource;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.support.GenericMessage;
//
//import java.util.Date;
//
///**
// * 接受mq消息的生产者
// * @author: PMTY
// * @create: 2018-06-07 15:01
// **/
////@EnableBinding(value = {SinkSender.SinkOutput.class})
//public class SinkSender {
//    private static Logger logger = LoggerFactory.getLogger(SinkSender.class);
//
//    @Bean
//    @InboundChannelAdapter(value = SinkOutput.OUTPUT,poller = @Poller(fixedDelay = "2000"))
//    public MessageSource<Date> timerMessageSource() {
//        return () -> new GenericMessage("{\"name\":\"pmty\",\"age\":\"30\"}");
////        return () -> new GenericMessage<>(new Date());
//    }
//
//    public interface SinkOutput {
//        String OUTPUT = "input";
//
//        @Output(SinkOutput.OUTPUT)
//        MessageChannel output();
//    }
//
//
//}