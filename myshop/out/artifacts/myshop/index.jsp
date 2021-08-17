<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86136
  Date: 2021/7/7
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath = request.getScheme() + "://" +
        request.getServerName() + ":" +
        request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>

</head>
<body>
<table>
    <thead>

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
          </tr>


      </c:forEach>
    </tbody>
</table>

</body>
</html>
