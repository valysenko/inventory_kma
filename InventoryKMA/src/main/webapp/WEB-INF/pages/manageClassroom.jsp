<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 25.04.2015
  Time: 20:13
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
<div class="container" style="width:280px;text-align:center">
    <h3>
        Managing classroom
    </h3>
    <form:form style="margin:auto;padding:auto;" method="post" action="/admin/classroom/save" commandName="classroom">
        <table style="text-align:left;margin:auto;padding:auto;">

            <tr>
                <td>
                    <label for="assistant">Assistant:</label>
                    <form:hidden path="id"/>
                    <form:select id="assistant" class="form-control" path="user">
                        <form:options items="${users}" itemValue="id"/>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td style="height:10px">
                </td>
            </tr>

            <tr>
                <td>
                    <button type="submit" class="btn btn-default preview-add-button">
                        <span class="glyphicon glyphicon-save"></span> Save
                    </button>
                </td>
            </tr>
        </table>
    </form:form>

</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
