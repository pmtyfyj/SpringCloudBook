package com.feng.dynamicfilter.config.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义属性配置类
 * @author: PMTY
 * @create: 2018-06-06 11:09
 **/
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {
    private String root;
    private Integer interval;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}