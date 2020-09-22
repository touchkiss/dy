package com.touchkiss.dy.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created on 2020/09/22 22:12
 *
 * @author Touchkiss
 */
@WebListener
@Slf4j
@Configuration
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

        log.info("------------------请求销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String value = request.getHeader(headerName);
            log.info("{}:{}", headerName, value);
        }
        System.out.println(request.getRequestURI());
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        String id1 = servletRequest.getParameter("id");

        log.info("------------------请求创建" + id1);

    }

}
