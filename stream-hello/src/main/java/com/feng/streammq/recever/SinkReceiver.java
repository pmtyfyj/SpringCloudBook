//package com.feng.streammq.recever;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.feng.pojo.UserDemo;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.cloud.stream.annotation.StreamListener;
//
///**
// * 接受mq消息的消费者
// * @author: PMTY
// * @create: 2018-06-07 13:18
// **/
////@EnableBinding(value = {Sink.class,SinkSender.class})
////public class SinkReceiver {
////
////    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);
////
////    @StreamListener(Sink.INPUT)
////    public void receive(Object payload) {
////        logger.info("Received: " + payload);
////    }
////}
//
////@EnableBinding(value = {SinkSender.SinkOutput.class})
//public class SinkReceiver {
//
//    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);
//
//    //对指定通道消息进行转换
////    @Transformer(inputChannel = SinkSender.SinkOutput.OUTPUT,outputChannel = SinkSender.SinkOutput.OUTPUT)
////    public Object transform(Date message) {
////        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(message));
////        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(message);
////    }
//
////    @ServiceActivator(inputChannel = SinkSender.SinkOutput.OUTPUT)
//////    @ServiceActivator(inputChannel = Sink.INPUT)
//////    @StreamListener(Sink.INPUT)
////    public void receive(Object payload) {
////        logger.info("^_^Received: " + payload);
////    }
//
//
//    //@Transformer(inputChannel = SinkSender.SinkOutput.OUTPUT,outputChannel = SinkSender.SinkOutput.OUTPUT)
//    public UserDemo transform(String message) throws Exception {
//        ObjectMapper obm = new ObjectMapper();
//        UserDemo userDemo = obm.readValue(message, UserDemo.class);
//        return userDemo;
//    }
//
////    @ServiceActivator(inputChannel = SinkSender.SinkOutput.OUTPUT)
//    @StreamListener(SinkSender.SinkOutput.OUTPUT)
//    public void receive(UserDemo userDemo) {
//        logger.info("^_^Received: " + userDemo);
//    }
//}