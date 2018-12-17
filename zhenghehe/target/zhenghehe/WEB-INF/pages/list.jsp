<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/12/11
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h3>查询所有的帐户</h3>

        <c:forEach items="${list}" var="account">
            ${account.name}
        </c:forEach>
</body>
</html>
