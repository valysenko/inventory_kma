<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 23.04.2015
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">

    <form:form method="post" action="/admin/classroom/add" commandName="classroom">
        <table>
            <tr>
                <td>Rows: <form:input path="rows" /></td>

                <c:set var="first"><form:errors path="rows"/></c:set>
                <c:if test="${not empty first}">
                    <td>Must be greater than 0!</td>
                </c:if>
            </tr>
            <tr>
                <td>Columns: <form:input path="columns" /></td>
                <c:set var="second"><form:errors path="columns"/></c:set>
                <c:if test="${not empty second}">
                    <td>Must be greater than 0!</td>
                </c:if>
            </tr>
            <tr>
                <td>Number: <form:input path="number" /></td>
            </tr>

            <tr>
                <td><input type="submit"></td>
            </tr>
        </table>
    </form:form>

</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
