package com.feng.dynamicfilter.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 向PreFilter输出相关请求信息
 * @author: PMTY
 * @create: 2018-06-06 11:29
 **/
public class PreFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(PreFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1000;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        logger.info("this is a pre filter : send {} request to {}",request.getMethod(),request.getRequestURL().toString());
        return null;
    }
}