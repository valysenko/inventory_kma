<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 26.04.2015
  Time: 1:50
  To change this template use File | Settings | File Templates.
--%>
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

    <script>
        $(document).ready(function() {
            $('#signInForm').formValidation();
        });
    </script>

</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container" style="width:400px;text-align:center">
    <h3>
        Sign up
    </h3>
    <form:form style="margin:auto;padding:auto;" method="post" action="/registration/add" commandName="user" id="signInForm">
        <table style="text-align:left;margin:auto;padding:auto;">
            <tr>
                <td>
                    <label for="firstName">First name:</label>
                    <form:input id="firstName" class="form-control" path="firstName"
                                
                                data-fv-notempty-message="The username is required"/>
                </td>
                <c:set var="first"><form:errors path="firstName"/></c:set>
                <c:if test="${not empty first}">
                    <td> <span  style="color:darkred;vertical-align:center;padding-left:10px">  Can not be empty! </span> </td>
                </c:if>
            </tr>

            <tr>
                <td>
                    <label for="lastName">Last name:</label>
                    <form:input id="lastName" class="form-control" path="lastName" />
                </td>
                <c:set var="second"><form:errors path="lastName"/></c:set>
                <c:if test="${not empty second}">
                    <td> <span  style="color:darkred;vertical-align:center;padding-left:10px">  Can not be empty! </span> </td>
                </c:if>
            </tr>

            <tr>
                <td>
                    <label for="email">Email:</label>
                    <form:input id="email" class="form-control" path="email"  name="email"
                                type="email"
                                data-fv-emailaddress-message="The value is not a valid email address" />
                </td>
                <c:set var="third"><form:errors path="email"/></c:set>
                <c:if test="${not empty third}">
                    <td> <span  style="color:darkred;vertical-align:center;padding-left:10px">  Can not be empty! </span> </td>
                </c:if>
            </tr>

            <tr>
                <td>
                    <label for="phoneNumber">Phone number:</label>
                    <form:input id="phoneNumber" class="form-control" path="phoneNumber" />
                </td>
                <c:set var="fourth"><form:errors path="phoneNumber"/></c:set>
                <c:if test="${not empty fourth}">
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
                        <span class="glyphicon glyphicon-plus"></span> Sign up
                    </button>
                </td>
            </tr>
        </table>
    </form:form>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>