<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 19.04.2015
  Time: 1:50
  To change this template use File | Settings | File Templates.
--%>
<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
    <title>
        Sign in
    </title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container" style="
        width:350px; min-height: 100%;
        height: auto !important;
        margin-bottom:25px;">

    <h3>Log in with your email account</h3>

        <c:if test="${error == true}">
             <div  class="alert alert-danger alert-error">Invalid login or password.</div>
        </c:if>

    <form method="post" id="login-form" action="<c:url value='j_spring_security_check'/>">
        <div class="form-group">
            <label for="email" class="sr-only">Email</label>
            <input id="email" class="form-control" type="text" name="j_username" id="j_username"
                   size="30"  maxlength="40" placeholder=" Email"/>
        </div>
        <div class="form-group">
            <label for="key" class="sr-only">Password</label>
            <input id="key" class="form-control"  type="password" name="j_password" id="j_password"
                   size="30" maxlength="32" placeholder=" Password"/></td>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" style="margin-bottom: 10px">Log in</button>
    </form>

</div>

<jsp:include page="footer.jsp"/>
</body>
</html>


<%--<form role="form" action="javascript:;" method="post" id="login-form" autocomplete="off">--%>
    <%--<div class="form-group">--%>
        <%--<label for="email" class="sr-only">Email</label>--%>
        <%--<input type="email" name="email" id="email" class="form-control" placeholder="somebody@example.com">--%>
    <%--</div>--%>
    <%--<div class="form-group">--%>
        <%--<label for="key" class="sr-only">Password</label>--%>
        <%--<input type="password" name="key" id="key" class="form-control" placeholder="Password">--%>
    <%--</div>--%>
    <%--<div class="checkbox">--%>
        <%--<span class="character-checkbox" onclick="showPassword()"></span>--%>
        <%--<span class="label">Show password</span>--%>
    <%--</div>--%>
    <%--<input type="submit" id="btn-login" class="btn btn-custom btn-lg btn-block" value="Log in">--%>
<%--</form>--%>