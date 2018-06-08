//package com.feng.streammq;
//
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
///**
// * 消息启动服务测试类
// * @author: PMTY
// * @create: 2018-06-07 13:45
// **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = StreamMqApplication.class)
//@WebAppConfiguration
//public class StreamMqApplicationTests {
//
////    @Autowired
////    private ISinkSender sinkSender;
////
////    @Autowired
////    private MessageChannel input;
////
////    @Test
////    public void contextLoads() {
////        sinkSender.output().send(MessageBuilder.withPayload("From SinkSender").build());
////    }
////
////    @Test
////    public void contextLoads1() {
////        input.send(MessageBuilder.withPayload("From MessageChannel").build());
////    }
//}