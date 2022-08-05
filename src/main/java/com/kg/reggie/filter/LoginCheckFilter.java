package com.kg.reggie.filter;

import com.alibaba.fastjson.JSON;
import com.kg.reggie.common.BaseContext;
import com.kg.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LoginCheckFilter
 * @Author kg
 * @Description 检查用户是否已经完成登录
 * @Date 2022/8/2 14:57
 * @Version 1.0
 */

@Component
@WebFilter(filterName = "logerChcekFilter", urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {

    // 路径匹配器，支持通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 调用ThreadLocal的set方法来设置当前线程的线程局部变量的值（用户id）
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set(request.getSession().getAttribute("employee"));

        // 1. 获取本次请求的URL
        String requestURI = request.getRequestURI();// backend/index.html

        log.info("拦截到请求：{}" , requestURI);

        // 定义不需要处理的请求路径
        String[] urls = new String[] {
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**"
        };

        // 2. 判断本次请求是否需要处理
        boolean check = check(urls, requestURI);
        
        // 3. 如果不需要处理，则直接放行
        if (check) {
            log.info("本次请求{}不需要处理", requestURI);
            filterChain.doFilter(request, response);
            return;
        }

        // 4. 判断登录状态，如果已登录，则直接放行
        if (request.getSession().getAttribute("employee") != null) {
            Long empId = (Long) request.getSession().getAttribute("employee");
            log.info("用户已登录，用户id为：{}", empId);
            BaseContext.setCurrentId(empId);

            filterChain.doFilter(request, response);
            return;
        }

        log.info("用户未登录");
        // 5. 如果未登录则返回未登录结果
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;
    }

    /**
     * 路径匹配，检查本次请求是否需要放行
     * @param urls
     * @param requestURI
     * @return
     */
    public boolean check(String[] urls, String requestURI) {
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestURI);
            if (match) {
                return true;
            }
        }
        return false;
    }
}
