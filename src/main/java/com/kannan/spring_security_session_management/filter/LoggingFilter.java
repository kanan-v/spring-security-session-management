package com.kannan.spring_security_session_management.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res  = (HttpServletResponse) servletResponse;
        long start = System.currentTimeMillis();
        System.out.println("Incoming Request:");
        System.out.println(req.getMethod() +
                " " +
                req.getRequestURI());
        filterChain.doFilter(req,res);
        long end = System.currentTimeMillis();
        System.out.println("Outgoing Response:");
        System.out.println("Status: " + res.getStatus());
        System.out.println("Time Taken: " +
                (end - start) + " ms");
    }
}
