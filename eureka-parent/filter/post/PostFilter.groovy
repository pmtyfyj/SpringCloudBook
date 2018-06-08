package com.feng.dynamicfilter.filter

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.servlet.http.HttpServletRequest
/**
 * 向PostFilter输出相关请求信息
 * @author: PMTY
 * @create: 2018-06-06 11:29
 **/
class PostFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(PostFilter.class);
    @Override
    String filterType() {
        return "post"
    }

    @Override
    int filterOrder() {
        return 2000
    }

    @Override
    boolean shouldFilter() {
        return true
    }

    @Override
    Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        logger.info("this is a post filter : Receive response")
        def response = RequestContext.getCurrentContext().getResponse()
        response.getOutputStream().print(", I am pmty")
        response.flushBuffer()
    }
}