package com.feng.rabbitmq;

import com.feng.rabbitmq.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * mq消息启动测试类
 * @author: PMTY
 * @create: 2018-06-06 14:44
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitMqApplication.class)
@WebAppConfiguration
public class RabbitMqApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }
}