package com.ivlai.templates.ssm.filter;

import com.ivlai.templates.ssm.utils.TimeUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter({"/admin/do/*"})
public class Filter09_AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        TimeUtil.WriteTimeLog("管理员登录限制器初始化成功。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        boolean admin = null == request.getSession().getAttribute("adminUser");
        if (admin) {
            request.getRequestDispatcher("/admin").forward(request, response);
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        TimeUtil.WriteTimeLog("管理员登录限制器销毁成功。");
    }
}
