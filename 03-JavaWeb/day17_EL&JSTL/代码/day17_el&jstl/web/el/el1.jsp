<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${3 > 4}
\${3 > 4}
<hr>

<h3>算数运算符</h3>
${3 + 4}<br>
${3 - 4}<br>
${3 * 4}<br>
${3 / 4}<br>
${3 div 4}<br> <%--除--%>
${3 % 4}<br>
${3 mod 4}<br> <%--取余--%>

<h3>比较运算符</h3>
${3 > 4}
${3 < 4}
${3 >= 4}
${3 <= 4}
${3 == 4}
${3 != 4}

<h3>逻辑运算符</h3>
${3 > 4 && 3 < 4}
${3 > 4 and 3 < 4}
${3 > 4 || 3 < 4}
${3 > 4 or 3 < 4}
${!(3 > 4)}
${not(3 > 4)}

<h3>empty运算符</h3>
<%
    String str = "abc";
    request.setAttribute("str", str);

    List list = new ArrayList();
    request.setAttribute("list", list);
%>

${empty str} <%--false--%>
${not empty str} <%--true--%>
${empty list} <%--true--%>
${not empty list} <%--false--%>


</body>
</html>
