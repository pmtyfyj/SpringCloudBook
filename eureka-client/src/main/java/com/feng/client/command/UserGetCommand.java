package com.feng.client.command;

import com.feng.trace1.pojo.User;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixRequestCache;
import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategyDefault;
import org.springframework.web.client.RestTemplate;

/**
 * 获取请求命令
 * @author: PMTY
 * @create: 2018-05-11 10:30
 **/
public class UserGetCommand extends HystrixCommand<User> {

    private static final HystrixCommandKey GETTER_KEY = HystrixCommandKey.Factory.asKey("CommandKey");
    private RestTemplate restTemplate;
    private Long id;
    public UserGetCommand() {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("GetSetGet")).andCommandKey(GETTER_KEY));
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

    public static void flushCache(Long id) {
        //刷新缓存，根据id进行清理
        HystrixRequestCache.getInstance(GETTER_KEY, HystrixConcurrencyStrategyDefault.getInstance()).clear(String.valueOf(id));
    }
}