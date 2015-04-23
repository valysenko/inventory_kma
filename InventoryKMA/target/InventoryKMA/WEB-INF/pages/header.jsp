<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 22.04.2015
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
<link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
<script src="<c:url value="../resources/bootstrap-3.3.4-dist/js/bootstrap.min.js" />"></script>

<div class="container-fluid navbar navbar-default">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
        <a class="navbar-brand" href="/index">InventoryKMA</a>
    </div>

    <sec:authorize ifAnyGranted="ROLE_ADMIN">
        <ul class="nav navbar-nav">
            <li>
                <a href="<c:url value="/admin/task/new"/>">Add task</a>
            </li>
        </ul>
    </sec:authorize>

    <sec:authorize ifAnyGranted="ROLE_ASSISTANT">
        <ul class="nav navbar-nav">
            <li>
                <a href="<c:url value="/assistant/tasks"/>">My tasks</a>
            </li>
        </ul>
    </sec:authorize>

    <ul class="nav navbar-nav navbar-right">
        <li>
            <sec:authorize ifAnyGranted="ROLE_ANONYMOUS">
                <a href="<c:url value="/login"/>">Login</a>
            </sec:authorize>
        </li>
        <li>
            <sec:authorize ifNotGranted="ROLE_ANONYMOUS">
                <a href="<c:url value="/logout"/>">Logout</a>
            </sec:authorize>
        </li>
    </ul>
</div>
