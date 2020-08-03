<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/23
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%
    System.out.println("hello jsp");
    int i = 5;

    String contextPath = request.getContextPath();
    out.print(contextPath);
  %>

  <%!
    int i = 3;
  %>

  <%
      response.getWriter().write("response");
  %>

  <%=
    i
  %>

  System.out.println("hello jsp");
  <h1>hi ~ jsp</h1>
  </body>
</html>
