<%--
  Created by IntelliJ IDEA.
  User: Valentyn
  Date: 26.04.2015
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
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

<%--<div class="container" style="text-align:center;width:400px;">--%>
  <%--<h3>Complaint list</h3>--%>
  <%--<div style="margin:auto;padding:auto;">--%>
    <%--<ul class="list-group">--%>
      <%--<c:forEach items="${complaint}" var="complaint">--%>
        <%--<li class="list-group-item">--%>
          <%--<tr>--%>
          <%--<td>${complaint.message}</td>--%>
          <%--</tr>--%>
          <%--<td>--%>
              <%--<a href="/admin/complaint/delete/${complaint.id}">delete</a>--%>
          <%--</td>--%>
        <%--</li>--%>
      <%--</c:forEach>--%>
    <%--</ul>--%>
  <%--</div>--%>

<%--</div>--%>
<%--<jsp:include page="footer.jsp"/>--%>

<div class="container">
  <div><h3>Complaint list</h3></div>
  <table class="table table-striped custab" style="min-width:400px;">
    <thead>
    <tr>
      <td>
      Message
      </td>
      <td>
      </td>
    </tr>
    </thead>
    <c:forEach items="${complaint}" var="complaint">
      <tr>
        <td>${complaint.message}</td>
        <td>
          <a href="/admin/complaint/delete/${complaint.id}">delete</a>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
<jsp:include page="footer.jsp"/>




</body>
</html>
