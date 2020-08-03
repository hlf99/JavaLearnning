<%@ page import="xw.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中对象的数据</title>
</head>
<body>

    <%
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setBirthday(new Date());

        request.setAttribute("user", user);

        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(user);

        request.setAttribute("list", list);

        Map map = new HashMap();
        map.put("sname", "李四");
        map.put("gender", "男");
        map.put("user", user);

        request.setAttribute("map", map);
    %>

    <h3>el获取对象中的值</h3>
    ${requestScope.user}<br>

    <%--
    语法：
        ${域名称.键名.属性名}

        通过对象的属性来获取
            setter或getter方法，去掉set或get，再将剩余部分首字母变为小写
            getName -> Name -> name

            域名是可以省略的
    --%>
    ${requestScope.user.name}<br>
    ${user.age}<br>
    ${user.birthday}<br>
    ${user.birthday.date}<br>
    ${user.localDate}<br>

    <h3>el获取List中的值</h3>
    <%--
        语法：
            ${域名称.键名[索引]}
    --%>
    ${list}<br>
    ${list[0]}<br>
    ${list[1]}<br>
    ${list[2]}<br>
    ${list[5]}<br>
    ${list[3].name}<br>

    <h3>el获取Map中的值</h3>
    <%--
        语法：
            ${域名称.键名.key名称}
			${域名称.键名["key名称"]}
    --%>
    ${map.gender}<br>
    ${map["sname"]}<br>
    ${map.user.name}<br>
    ${map["user"].age}<br>
</body>
</html>
