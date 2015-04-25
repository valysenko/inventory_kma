
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container" style="width:280px;text-align:center">
    <h3>
        New task
    </h3>
    <form:form style="margin:auto;padding:auto;" method="post" action="/admin/task/add" commandName="task">
        <table>
            <tr>
                <td>
                    <label for="message">Message:</label>
                    <form:textarea id="message" class="form-control" path="message" /></td>
            </tr>
            <tr>
                <td style="margin-top:10px">
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
