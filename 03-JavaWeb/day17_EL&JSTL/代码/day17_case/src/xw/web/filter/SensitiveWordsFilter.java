package xw.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 敏感词汇过滤器
 */
@WebFilter("/*")
public class SensitiveWordsFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 1.创建代理对象，增强getParameter方法
        ServletRequest proxy_req = (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 增强getParameter方法
                // 判断是否是getParameter方法
                if (method.getName().equals("getParameter")) {
                    // 增强返回值
                    // 获取返回值
                    String value = (String) method.invoke(req, args);
                    // 判断获取到的返回值是否为空
                    if (value != null) {
                        // 不为空就遍历敏感词汇集合
                        for (String str : list) {
                            // 判断返回值中是否包含敏感词汇
                            if (value.contains(str)) {
                                // 有敏感词汇就替换为***
                                value = value.replaceAll(str, "***");
                            }
                        }
                    }
                    // 将增强后的返回值返回
                    return value;
                }

                // 判断方法名是否为 getParameterMap

                // 判断方法名是否为 getParameterValue

                // 如果不是getParameter方法，原样执行，传入真实对象和args
                return method.invoke(req, args);
            }
        });

        // 2.放行
        chain.doFilter(proxy_req, resp);
    }

    // 敏感词汇集合
    List<String> list = new ArrayList<String>();

    public void init(FilterConfig config) throws ServletException {
        try {
            // 1.获取文件的真实路径
            ServletContext servletContext = config.getServletContext();
            String realPath = servletContext.getRealPath("/WEB-INF/classes/敏感词汇.txt");
            // 2.读取文件
            // 使用带有缓冲区的高效的字符输入流
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            // 3.将文件中的每一行数据添加到list中
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }

            // 释放资源
            br.close();

            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3.将文件中的每一行数据添加到list中
    }

}
