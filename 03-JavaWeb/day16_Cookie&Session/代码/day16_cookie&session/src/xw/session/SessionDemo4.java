package xw.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/sessionDemo4")
public class SessionDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取session
        HttpSession session = request.getSession();
        System.out.println(session);
        // 浏览器不关闭，关闭服务器，获取到的session不一样
        // org.apache.catalina.session.StandardSessionFacade@7ac774d8
        // org.apache.catalina.session.StandardSessionFacade@67a218a9
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
