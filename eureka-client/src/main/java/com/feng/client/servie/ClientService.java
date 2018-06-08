package com.feng.client.servie;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 断路器测试服务类
 */
@Service
public class ClientService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        long start = System.currentTimeMillis();
        String result = restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        long end = System.currentTimeMillis();
        System.out.println("Spend time : " + (end - start));
        return result;
    }

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String testService() {

        return "呵呵哒";
    }
    public String helloFallback() {
        return "error";
    }
}
