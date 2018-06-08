package com.feng.client.command;

import com.feng.trace1.pojo.User;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

/**
 * 发送请求命令
 * @author: PMTY
 * @create: 2018-05-11 10:40
 **/
public class UserPostCommand extends HystrixCommand<User> {

    private RestTemplate restTemplate;
    private User user;

    public UserPostCommand(RestTemplate restTemplate, User user) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("GetSetGet")));
        this.restTemplate = restTemplate;
        this.user = user;
    }

    @Override
    protected User run() throws Exception {
        //写操作
        User user = restTemplate.postForEntity("http://USER-SERVICE/users", this.user, User.class).getBody();

        //刷新缓存，清理缓存中失效的User
        UserGetCommand.flushCache(user.getId());
        return user;
    }
}