
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<div class="container" style="width:400px;text-align:center">
    <h3>
        Manage task
    </h3>
    <form:form style="margin:auto;padding:auto;" method="post" action="/admin/task/save" commandName="task">
        <table style="text-align:left;margin:auto;padding:auto;">
            <tr>
                <td style="margin-top:10px">
                    <form:hidden path="id"/>
                    <form:hidden path="message"/>
                    <form:hidden path="status"/>
                    <form:hidden path="userFrom" itemValue="userFrom_id"/>
                    <label for="user">Assistant:</label>
                    <form:select id="user" class="form-control" path="userTo">
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
                        <span class="glyphicon glyphicon-ok"></span> Save
                    </button>
                </td>
            </tr>
        </table>
    </form:form>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>
