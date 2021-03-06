<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 25.04.2015
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="<c:url value="/../resources/bootstrap-3.3.4-dist/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="../resources/js/jquery-1.11.2.min.js" />"></script>
    <script src="<c:url value="/../resources/js/jquery-1.11.2.min.js" />"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
</head>
<body>
<jsp:include page="header.jsp"/>

<div class="container"  style="text-align:center;width:400px;">
    <h3>Unmanaged classrooms</h3>
    <div style="margin:auto;padding:auto;">
        <ul class="list-group">
            <c:forEach items="${classrooms}" var="classroom">
                <li class="list-group-item">
                    <a href="/admin/classroom/manage/${classroom.number}"> Classroom ${classroom.number}</a>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
