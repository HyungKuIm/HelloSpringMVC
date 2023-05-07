<%--
  Created by IntelliJ IDEA.
  User: imhyeong-gu
  Date: 2023/05/07
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/HelloSpringMVC/registerSuccess" method="post" modelAttribute="user">
    <table>
        <tr>
            <td>First Name</td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="register"></td>
            <td></td>
        </tr>

    </table>
</form:form>

<%--  <form action="/HelloSpringMVC/registerSuccess" method="post">
      <table>
          <tr>
              <td>First Name</td>
              <td><input type="text" name="firstName"></td>
          </tr>
          <tr>
              <td>Last Name</td>
              <td><input type="text" name="lastName"></td>
          </tr>
          <tr>
              <td>Email</td>
              <td><input type="text" name="email"></td>
          </tr>
          <tr>
              <td>Password</td>
              <td><input type="password" name="password"></td>
          </tr>
          <tr>
              <td><input type="submit" value="register"></td>
              <td></td>
          </tr>
      </table>
  </form>--%>
</body>
</html>
