<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 24.04.2015
  Time: 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <ul>
        <c:forEach items="${classrooms}" var="classroom">
            <li>
                  <a href="/admin/classroom/${classroom.number}">  ${classroom.number}</a>
            </li>
        </c:forEach>
    </ul>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
