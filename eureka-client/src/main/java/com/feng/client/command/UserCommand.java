package com.feng.client.command;

import com.feng.trace1.pojo.User;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

/**
 * 创建请求命令
 * @author: PMTY
 * @create: 2018-05-11 10:08
 **/
public class UserCommand extends HystrixCommand<User> {

    private RestTemplate restTemplate;
    private Long id;

    public UserCommand(RestTemplate restTemplate, Long id) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("UserGroup")));
        this.restTemplate = restTemplate;
        this.id = id;
    }

    @Override
    protected User run() throws Exception {
        return restTemplate.getForEntity("http://USER-SERVICE/users/{1}", User.class, id).getBody();
    }

    //开启请求缓存功能
    //通过重载getCacheKey方法开启请求缓存
    @Override
    protected String getCacheKey() {
        //根据id置入缓存
        return String.valueOf(id);
    }
}