package com.feng.client.controller;

import com.feng.client.servie.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费方控制器
 * @author: PMTY
 * @create: 2018-04-15 14:41
 **/
@RestController
public class ClientController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ClientService clientService;

//    @RequestMapping(value = "/ribbon-client",method = RequestMethod.GET)
//    public String helloClient() {
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
//    }

    @RequestMapping(value = "/ribbon-client",method = RequestMethod.GET)
    public String helloClient() {
        String s = clientService.testService();
        System.out.println(s);
        return clientService.helloService();
    }

}