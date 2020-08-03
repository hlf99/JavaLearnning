package xw.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/servletContextDemo5")
public class ServletContextDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            ServletContext功能
                1.获取MIME类型

                2.域对象：共享数据

                3.获取文件的真实（服务器）路径
                    方法：getRealPath(String path)

         */
        // 1.通过HttpServlet类获取
        ServletContext context = this.getServletContext();

        // 获取文件的服务器路径
        // 此处的/代表的是 web目录
        //  E:\JavaLearnning\03-JavaWeb\day15_Response\代码\day15_response\out\artifacts\day15_response_war_exploded
        String realPath = context.getRealPath("/b.txt"); // web目录下的资源访问
        System.out.println(realPath);
       // File file = new File(realPath);

        String realPath2 = context.getRealPath("/WEB-INF/c.txt"); // WEB-INF目录下的资源访问
        System.out.println(realPath2);

        // src目录下的资源会放在WEB-INF目录下的classes目录中
        // src中的资源也可以使用类加载器类获取，但类加载器无法获取web目录下的资源
        String realPath3 = context.getRealPath("/WEB-INF/classes/a.txt"); // src目录下的资源访问
        System.out.println(realPath3);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
