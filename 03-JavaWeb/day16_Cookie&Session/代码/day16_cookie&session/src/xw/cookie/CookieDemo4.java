package xw.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie快速入门
 */

@WebServlet("/cookieDemo4")
public class CookieDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.创建Cookie对象
        Cookie c = new Cookie("msg", "setMaxAge");
        // 2.设置cookie的存活时间
        // c.setMaxAge(30); // 将cookie持久化到硬盘，30秒后会自动删除cookie文件
        // c.setMaxAge(-1); // 默认值，浏览器一关闭，cookie就会被删除
//        c.setMaxAge(300);
        c.setMaxAge(0);

        // 3. 发送Cookie
        response.addCookie(c);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
