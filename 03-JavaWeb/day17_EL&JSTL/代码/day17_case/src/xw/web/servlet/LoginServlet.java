package xw.web.servlet;

import org.apache.commons.beanutils.BeanUtils;
import xw.domain.User;
import xw.service.UserService;
import xw.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request);

        // 1.设置请求编码
        request.setCharacterEncoding("UTF-8");

        // 2.获取数据
        // 2.1获取用户填写的验证码
        String verifycode = request.getParameter("verifycode");

        // 3.验证码校验  CHECKCODE_SERVER
        // 从session中获取随机生成的验证码
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER"); // 确保验证码的一次性
        if (!checkcode_server.equalsIgnoreCase(verifycode)) {
            // 验证码不正确
            // 提示信息
            request.setAttribute("login_msg", "验证码错误！");
            // 跳转(转发)到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request, response);

            return;
        }

        // 获取所有的参数并存入map集合
        Map<String, String[]> map = request.getParameterMap();

        // 4.封装User对象
        User user = new User();
        try {
            // 将map中的数据封装到User对象中
            BeanUtils.populate(user, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        // 5.调用Service查询
        UserService service = new UserServiceImpl();
        User loginUser = service.login(user);

        // 6.判断是否登录成功
        if (loginUser != null) {
            // 登录成功
            // 将用户存入session
            session.setAttribute("user", loginUser);
            // 跳转页面
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } else {
            // 登录失败
            // 提示信息
            request.setAttribute("login_msg", "用户名或密码错误！");
            // 跳转(转发)到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
