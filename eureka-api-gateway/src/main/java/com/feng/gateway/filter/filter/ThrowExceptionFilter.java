package com.feng.gateway.filter.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;

/**
 * 过滤器全局异常处理
 * @author: PMTY
 * @create: 2018-06-05 10:38
 **/
//@Component
public class ThrowExceptionFilter extends ZuulFilter {
    private static Logger logger = LoggerFactory.getLogger(ThrowExceptionFilter.class);

    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        logger.info("This is a pre filter, it will throw a RuntimeException");
        RequestContext ctx = RequestContext.getCurrentContext();
        try {
            doSomething();
        } catch (Exception e) {
            logger.info(e.getMessage());
            ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            ctx.set("error.exception",e);
//            ctx.set("error.message",e.getMessage());
        }
//        doSomething();
        return null;
    }

    public void doSomething() {
        throw new RuntimeException("Exist some errors...");
    }
}