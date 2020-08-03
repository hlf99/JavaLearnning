<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>if标签</title>
</head>
<body>

<%--
    c:if标签
        1.属性
            * test 必需的属性，接受boolean表达式
                * 如果表达式为true，则显示if标签中的内容，如果为false，则不显示标签体中的内容
--%>

<c:if test="true">
    <h1>我是一个大帅哥</h1>
</c:if>

<%
    // 判断request域中的个list集合是否为空，如果不为null则显示遍历集合
    List list = new ArrayList();
    list.add("aaa");
    request.setAttribute("list", "list");
    request.setAttribute("number", 4);
%>

<c:if test="${not empty list}">
    遍历集合
</c:if>
<br>

<%--奇数--%>
<c:if test="${number % 2 != 0}">
    ${number}为奇数
</c:if>
<%--偶数--%>
<c:if test="${number % 2 == 0}">
    ${number}为偶数
</c:if>
</body>
</html>
