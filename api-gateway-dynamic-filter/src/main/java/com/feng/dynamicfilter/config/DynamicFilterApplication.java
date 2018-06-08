package com.feng.dynamicfilter.config;

import com.feng.dynamicfilter.config.config.FilterConfiguration;
import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * 动态过滤器启动类
 * @author: PMTY
 * @create: 2018-06-06 11:08
 **/
@EnableZuulProxy
@EnableConfigurationProperties({FilterConfiguration.class})
@SpringCloudApplication
public class DynamicFilterApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicFilterApplication.class, args);
    }

    @Bean
    public FilterLoader filterLoader(FilterConfiguration filterConfiguration) {
        FilterLoader filterLoader = FilterLoader.getInstance();
        filterLoader.setCompiler(new GroovyCompiler());
        try {
            FilterFileManager.setFilenameFilter(new GroovyFileFilter());
            FilterFileManager.init(
                    filterConfiguration.getInterval(),
                    filterConfiguration.getRoot() + "/pre",
                    filterConfiguration.getRoot() + "/post"
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return filterLoader;
    }
}