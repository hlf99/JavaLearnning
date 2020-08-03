<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="top.jsp" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>主体信息</h3>

    <!--
        <h3>world</h3>
    -->
    <!--
        <%
            System.out.println("hi~~~");
        %>
    -->

    <%--
        <h3>hello</h3>
    --%>
    <%--
        <%
            System.out.println("hi~~~");
        %>
    --%>

    <%
        pageContext.setAttribute("msg", "hello");

    %>

    <%=
        pageContext.getAttribute("msg")
    %>
</body>
</html>
