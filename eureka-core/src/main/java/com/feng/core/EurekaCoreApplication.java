package com.feng.trace1.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务注册中心
 * @author: PMTY
 * @create: 2018-04-15 12:23
 **/
@EnableEurekaServer   //开启服务注册中心
@SpringBootApplication
public class EurekaCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCoreApplication.class, args);
	}
}
