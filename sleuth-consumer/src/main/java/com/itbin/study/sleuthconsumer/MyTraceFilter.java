package com.itbin.study.sleuthconsumer;

import brave.propagation.ExtraFieldPropagation;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/9 17:27
 * @description:
 * @modified By:
 */
@Component
public class MyTraceFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        ExtraFieldPropagation.set("BaggraceId", request.getHeader("BaggraceId"));
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
