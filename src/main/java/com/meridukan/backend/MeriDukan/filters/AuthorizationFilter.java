package com.meridukan.backend.MeriDukan.filters;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.Date;

@Component
public class AuthorizationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long requestTime = System.currentTimeMillis();
        Date requestTimeInDateFormat = new Date(requestTime);
        System.out.println(requestTimeInDateFormat);
        final HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
