<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>时间显示</title>
</head>
<body>
<%
    // 设置响应消息体的数据格式及编码
    response.setContentType("text/html;charset=utf-8");

    // 1.获取所有的Cookie
    Cookie[] cookies = request.getCookies();
    boolean flag = false; // 记录是否有Cookie为lastTime 默认是没有
    // 2.遍历cookies数组
    // 首先要判断数组不为空且长度大于0
    if (cookies != null && cookies.length > 0) {
        for (Cookie cookie : cookies) {
            // 3.获取Cookie的名称
            String name = cookie.getName();
            // 4.判断Cookie名称是否为：lastTime
            if ("lastTime".equals(name)) {
                // 有该Cookie，就不是第一次访问

                flag = true; // 有lastTime的Cookie

                // 重新设置Cookie的value
                // 获取当前时间的字符串，重新设置Cookie的值，重新发送Cookie
                // 创建一个日期对象
                Date date = new Date();
                // 使用格式化日期对象来格式化日期
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                // 获取到的是一个yyyy年MM月dd日 HH:mm:ss格式的日期字符串
                String str_date = sdf.format(date);
                System.out.println("编码前：" + str_date);
                // URL编码
                str_date = URLEncoder.encode(str_date, "utf-8");
                System.out.println("编码后：" + str_date);
                // 重新设置Cookie的值
                cookie.setValue(str_date);
                // 设置Cookie的存活时间 为一个月
                cookie.setMaxAge(60 * 60 * 24 * 30);
                // 重新发送该Cookie
                response.addCookie(cookie);

                // 响应数据
                // 获取Cookie的value值 也就是时间
                String value = cookie.getValue();
                System.out.println("解码前：" + value);
                // URL解码
                value = URLDecoder.decode(value, "utf-8");
                System.out.println("解码后：" + value);
                %>

<h1>欢迎回来，您上次访问时间为:<%= value %></h1>

<%


                // 此时已经找到lastTime， 可以结束循环了
                break;
            }
        }
    }

    // 没有Cookie为lastTime
    if (cookies == null || cookies.length == 0 || flag == false) {
        // 获取当前时间的字符串，设置Cookie的值，发送Cookie
        // 创建一个日期对象
        Date date = new Date();
        // 使用格式化日期对象来格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // 获取到的是一个yyyy年MM月dd日 HH:mm:ss格式的日期字符串
        String str_date = sdf.format(date);
        System.out.println("编码前：" + str_date);
        // URL编码
        str_date = URLEncoder.encode(str_date, "utf-8");
        System.out.println("编码后：" + str_date);

        Cookie cookie = new Cookie("lastTime", str_date);
        // 设置Cookie的存活时间 为一个月
        cookie.setMaxAge(60 * 60 * 24 * 30);
        // 发送该Cookie
        response.addCookie(cookie);

%>


<h1>您好，欢迎您首次访问</h1>
<%
    }
%>
</body>
</html>
