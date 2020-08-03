<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload = function () {
            // 点击图片切换验证码
            document.getElementById("img").onclick = function () {
                // 加上时间戳，让每次点击后都会重新请求新的验证码，而不是加载缓存中的
                this.src = "/day16/checkCodeServlet?time=" + new Date().getTime();
            }
        }
    </script>
    <style>
        div {
            color: red;
        }
    </style>
</head>
<body>

<form action="/day16/loginServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>验证码</td>
            <td><input type="text" name="checkCode"></td>
        </tr>
        <tr>
            <td colspan="2"><img id="img" src="/day16/checkCodeServlet" alt=""></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>


<div><%= request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error") %></div>
<div><%= request.getAttribute("cc_error") == null ? "" : request.getAttribute("cc_error") %></div>


</body>
</html>
