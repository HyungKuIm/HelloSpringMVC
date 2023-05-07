<%--
  Created by IntelliJ IDEA.
  User: daman
  Date: 2023-05-05
  Time: 오후 5:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/HelloSpringMVC/register">登録</a>
<h2>User Management Application</h2>
    <table border="1">
        <tr>
            <th>id</th>
            <th>이름</th>
            <th>성</th>
            <th>E-mail</th>
            <th>Password</th>
        </tr>
        <c:forEach var="user" items="${userlist}">
            <tr>
                <td>${user.userId}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.email}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
