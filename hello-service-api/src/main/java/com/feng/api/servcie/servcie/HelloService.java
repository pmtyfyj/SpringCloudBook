package com.feng.api.servcie.servcie;

import com.feng.trace1.pojo.UserDemo;
import org.springframework.web.bind.annotation.*;

/**
 * @author: PMTY
 * @create: 2018-05-30 13:44
 **/

@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5",method = RequestMethod.GET)
    UserDemo hello(@RequestHeader("name") String name, @RequestHeader("age") String age);

    @RequestMapping(value = "/hello6",method = RequestMethod.GET)
    String hello(@RequestBody UserDemo userDemo);

    @RequestMapping(value = "/hello7",method = RequestMethod.GET)
    String hello(@RequestParam("/hello7") Long uId);
}
