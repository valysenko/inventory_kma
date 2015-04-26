<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 19.04.2015
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
<div class="container">
    <sec:authorize ifAnyGranted="ROLE_ADMIN">
        admin in the cabinet
    </sec:authorize>

<<<<<<< HEAD
<sec:authorize ifAnyGranted="ROLE_USER">
  User in kabinet
</sec:authorize>

    <sec:authorize ifAnyGranted="ROLE_ADMIN">

    </sec:authorize>

=======
    <sec:authorize ifAnyGranted="ROLE_USER">
        form
    </sec:authorize>
>>>>>>> origin/master

</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
