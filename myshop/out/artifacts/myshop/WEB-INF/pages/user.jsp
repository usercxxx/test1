<%--
  Created by IntelliJ IDEA.
  User: 86136
  Date: 2021/8/10
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%String basePath = request.getScheme() + "://" +
        request.getServerName() + ":" +
        request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>

<body>
<table border="1px">
    <thead>
      <td>名字</td>
      <td>密码</td>
      <td>性别</td>
      <td>操作</td>


    </thead>
    <tbody>
    <c:forEach var="user" items="${requestScope.users}">
        <tr>
            <td>
                    ${user.name}
            </td>
            <td>
                    ${user.password}
            </td>
            <td>
                    ${user.gender}
            </td>
            <td>
                <a href="">修改</a>
                <a href="delete.do?no=${user.name}">删除</a>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
</html>
