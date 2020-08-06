package xw.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

import static javax.servlet.DispatcherType.FORWARD;
import static javax.servlet.DispatcherType.REQUEST;

// 浏览器直接访问index.jsp资源时，该过滤器才会被执行
//@WebFilter(value = "/index.jsp", dispatcherTypes = REQUEST)
// 转发访问index.jsp资源时，该过滤器才会被执行
//@WebFilter(value = "/index.jsp", dispatcherTypes = FORWARD)

// 浏览器直接访问或转发访问index.jsp资源时，该过滤器都会被执行
//@WebFilter(value = "/index.jsp", dispatcherTypes = {REQUEST, FORWARD})
public class FilterDemo5 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo5...");

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
