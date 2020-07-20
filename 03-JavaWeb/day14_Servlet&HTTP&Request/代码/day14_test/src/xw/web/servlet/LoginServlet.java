package xw.web.servlet;

import org.apache.commons.beanutils.BeanUtils;
import xw.dao.UserDao;
import xw.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        /*//2.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //3.封装User对象
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);*/
        // 2.获取所有的请求参数
        Map<String, String[]> map = req.getParameterMap();
        // 3.创建User对象
        User loginUser = new User();
        // 3.2使用BeanUtils封装map集合中的数据成对象
        try {
            // 一调用populate方法，就会将map集合鸿的数据封装到loginUser中
            BeanUtils.populate(loginUser, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //4.调用UserDao的login方法
        UserDao dao = new UserDao();
        User user = dao.login(loginUser);

        //5.判断user是否为null
        if (user == null) {
            // 登录失败 跳转到failServlet
            req.getRequestDispatcher("/failServlet").forward(req, resp);
        } else {
            // 登录成功 先存储数据，再跳转到successServlet
            // 存储数据
            req.setAttribute("user", user);
            // 转发
            req.getRequestDispatcher("/successServlet").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
