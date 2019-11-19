package com.ivlai.templates.ssm.filter;

import com.ivlai.templates.ssm.utils.TimeUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter({"/admin/*"})
public class AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        TimeUtil.WriteTimeLog("管理员登录限制器初始化成功。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        boolean admin = null == request.getSession().getAttribute("admin");
        if (admin){

        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        TimeUtil.WriteTimeLog("管理员登录限制器注销成功。");
    }
}
