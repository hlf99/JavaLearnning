package xw.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取用户名
        String username = request.getParameter("username");

        // 2.调用service层判断用户名是否存在
        // 期望服务器响应回来的数据格式:
        //                      {"userExsit": true, "msg": "此用户太受欢迎，请更换一个"}
        //                      {"userExsit": false, "msg": "用户名可用"}
//        response.setContentType("text/html;charset=utf-8");
        // 设置响应的数据格式为json
        response.setContentType("application/json;charset=utf-8");
        Map<String, Object> map = new HashMap<String, Object>();

        if ("tom".equals(username)) {
            // 存在
            map.put("userExsit", true);
            map.put("msg", "此用户太受欢迎，请更换一个");
        } else {
            // 不存在
            map.put("userExsit", false);
            map.put("msg", "用户名可用");
        }

        // 3. 将map转为json，并且把数据响应给客户端
        // 创建一个jacjson核心对象
        ObjectMapper mapper = new ObjectMapper();
        // 使用mapper.writeValue()将map对象转换为json格式，并写入response.getWriter()创建的输出流中
        mapper.writeValue(response.getWriter(), map);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
