package xw.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContextDemo4")
public class ServletContextDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            ServletContext功能
                1.获取MIME类型

                2.域对象：共享数据
                    域对象的三个方法：
                        1.setAttribute(String name, Object value)
                        2.getAttribute(String name)
                        3.removeAttribute(String name)
                    ServletContext对象的范围：所有用户所有请求的数据
                    生命周期：服务器开启时存在，服务器关闭时销毁
                3.获取文件的真实（服务器）路径


         */
        // 1.通过HttpServlet类获取
        ServletContext context = this.getServletContext();

        // 获取ServletContextDemo3中设置的数据
        Object msg = context.getAttribute("msg");
        System.out.println(msg);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
