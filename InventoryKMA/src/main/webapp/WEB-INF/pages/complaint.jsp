<%--
  Created by IntelliJ IDEA.
  User: Valentyn
  Date: 26.04.2015
  Time: 2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<div class="container">
  <body>
  <div class="container" style="width:280px;text-align:center">
  <h3>
  New message
  </h3>
  <form:form style="margin:auto;padding:auto;" method="post" action="/user/complaint/add" commandName="complaint">
    <table>
      <tr>
        <td>
          <label for="message">Message:</label>
          <form:textarea id="message" class="form-control" path="message" /></td>
        <c:set var="first"><form:errors path="message"/></c:set>
        <c:if test="${not empty first}">
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
            Send
          </button>
        </td>
      </tr>
    </table>
  </form:form>
  </div>
  <jsp:include page="footer.jsp"/>


</body>
</html>
