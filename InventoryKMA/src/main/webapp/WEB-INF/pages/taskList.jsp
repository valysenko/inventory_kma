<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 23.04.2015
  Time: 14:01
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
    <table class="table table-striped custab" style="min-width:400px;">
        <thead>
            <tr>
                <td>
                    Message
                </td>
                <td>
                    Status
                </td>
                <td>
                </td>
            </tr>
        </thead>
        <c:forEach items="${tasks}" var="task">
            <tr>
                <td>${task.message}</td>
                <td>${task.status}</td>
                <td>
                    <c:if test="${task.status == 'in progress'}">
                    <a href="/assistant/task/finish/${task.id}">finish </a>
                </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>



