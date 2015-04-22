<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
</head>
<body>
    <jsp:include page="header.jsp"/>
    <div class="container">
        <form:form method="post" action="/admin/task/add" commandName="task">
            <table>
                <tr>
                    <td>Message: <form:textarea path="message" /></td>
                </tr>
                <tr>
                    <td>User to:
                        <form:select path="userTo">
                            <form:options items="${users}" itemValue="id"/>
                        </form:select>
                    </td>
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
