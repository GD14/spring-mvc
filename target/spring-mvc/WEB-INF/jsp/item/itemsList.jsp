<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: GD14
  Date: 2017/8/25
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="100" border="1">
    <tr>
        <td>name</td>
        <td>price</td>
        <td>opt</td>
    </tr>
    <c:forEach items="${itemList}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td><a href="${pageContext.request.contextPath}/item/editItem?id=${item.id}">edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
