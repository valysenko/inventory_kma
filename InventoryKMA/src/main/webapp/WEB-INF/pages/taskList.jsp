<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 23.04.2015
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="<c:url value="/../resources/bootstrap-3.3.4-dist/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="../resources/js/jquery-1.11.2.min.js" />"></script>
    <script src="<c:url value="/../resources/js/jquery-1.11.2.min.js" />"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div><h3>Current tasks list</h3></div>
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



