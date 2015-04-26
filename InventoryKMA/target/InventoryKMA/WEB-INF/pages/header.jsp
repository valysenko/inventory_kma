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

<link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
<link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="<c:url value="/../resources/bootstrap-3.3.4-dist/js/bootstrap.min.js" />"></script>
<script src="<c:url value="../resources/js/jquery-1.11.2.min.js" />"></script>
<script src="<c:url value="/../resources/js/jquery-1.11.2.min.js" />"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>


<nav  class="container-fluid navbar navbar-default">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
        <a class="navbar-brand" href="/index">InventoryKMA</a>
    </div>

    <sec:authorize ifAnyGranted="ROLE_ADMIN">
    <div>
        <ul class="nav navbar-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Add <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <li>
                        <a href="<c:url value="/admin/task/new"/>">Add task</a>
                    </li>
                    <li>
                        <a href="<c:url value="/admin/classroom/new"/>">Add classroom</a>
                    </li>
                    <li>
                        <a href="<c:url value="/admin/assistant/new"/>">Add assistant from user</a>
                    </li>
                </ul>
            </li>
        </ul>
        <ul class="nav navbar-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">View and manage <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <li>
                        <a href="<c:url value="/admin/classroom/list"/>">Classroom list</a>
                    </li>
                    <li>
                        <a href="<c:url value="/admin/assistant/list"/>">Assistant list</a>
                    </li>
                    <li>
                        <a href="<c:url value="/admin/classroom/unmanaged/list"/>">Unmanaged classrooms</a>
                    </li>
                    <li>
                        <a href="<c:url value="/admin/task/unmanaged/list"/>">Unmanaged tasks</a>
                    </li>
                    <li>
                        <a href = "<c:url value="/admin/complaint/list"/>"> All complaint </a>
                    </li>
                </ul>
            </li>
        </ul>
        </div>
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
                <a href="<c:url value="/registration"/>">Sign up</a>
            </sec:authorize>
        </li>
        <li>
            <sec:authorize ifAnyGranted="ROLE_ANONYMOUS">
                <a href="<c:url value="/login"/>">Sign in</a>
            </sec:authorize>
        </li>
        <li>
            <sec:authorize ifNotGranted="ROLE_ANONYMOUS">
                <a href="<c:url value="/logout"/>">Logout</a>
            </sec:authorize>
        </li>
    </ul>
</nav >
