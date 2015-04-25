<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 23.04.2015
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<div class="container" style="width:500px;text-align:center;">
    <h3>
        New classroom
    </h3>
    <form:form method="post" action="/admin/classroom/add" commandName="classroom">
        <table style="text-align:left;margin:auto;padding:auto;">
            <tr>
                <td>
                    <label for="rows">Rows:</label>
                    <form:input id="rows" class="form-control" path="rows" /></td>

                <c:set var="first"><form:errors class="form-control" path="rows"/></c:set>
                <c:if test="${not empty first}">
                    <td style="vertical-align:middle;"><span  style="color:darkred;padding-left:10px"> Must be greater than 0! </span></td>
                </c:if>
            </tr>

            <tr>
                <td>
                    <label for="columns">Columns:</label>
                    <form:input id="columns" class="form-control" path="columns" /></td>
                <c:set var="second"><form:errors path="columns"/></c:set>
                <c:if test="${not empty second}">
                    <td style="vertical-align:middle;"><span  style="color:darkred;padding-left:10px">  Must be greater than 0! </span></td>
                </c:if>
            </tr>

            <tr>
                <td>
                    <label for="assistant">Assistant:</label>
                    <form:select id="assistant" class="form-control" path="user">
                        <form:options items="${users}" itemValue="id"/>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td>
                    <label for="number">Number:</label>
                    <form:input id="number" class="form-control" path="number" /></td>
                <c:set var="third"><form:errors path="number"/></c:set>
                <c:if test="${not empty third}">
                    <td> <span  style="color:darkred;vertical-align:center;padding-left:10px">  Can not be empty! </span> </td>
                </c:if>
            </tr>

            <tr>
                <td style="height:10px">
                </td>
            </tr>

            <tr>
                <td>
                    <button type="submit" class="btn btn-default preview-add-button">
                        <span class="glyphicon glyphicon-plus"></span> Add
                    </button>
                </td>
            </tr>
        </table>
    </form:form>

</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
