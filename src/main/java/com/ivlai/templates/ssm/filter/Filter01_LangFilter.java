package com.ivlai.templates.ssm.filter;

import com.ivlai.templates.ssm.utils.I18nUtil;
import com.ivlai.templates.ssm.utils.TimeUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Filter01_LangFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        TimeUtil.WriteTimeLog("语言过滤器初始化成功。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        I18nUtil.saveI18nToSession((HttpServletRequest) servletRequest);
        I18nUtil.saveI18nToSessionByJson((HttpServletRequest) servletRequest);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        TimeUtil.WriteTimeLog("语言过滤器销毁成功。");
    }
}
