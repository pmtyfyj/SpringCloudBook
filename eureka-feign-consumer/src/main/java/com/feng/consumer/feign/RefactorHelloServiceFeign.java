package com.feng.consumer.feign;

import com.feng.api.servcie.servcie.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Feign api调用接口
 * @author: PMTY
 * @create: 2018-06-01 09:59
 **/
@FeignClient("hello-service")
public interface RefactorHelloServiceFeign extends HelloService {
}