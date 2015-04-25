<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 24.04.2015
  Time: 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
</head>
<body>
<jsp:include page="header.jsp"/>
    <div style="text-align:center;">
   <%--style="border:1px solid darkslategray;border-radius: 3px;"--%>
    <h2>${classroom.number} edit</h2>
        <div style="margin-bottom:50px;text-align:center;margin:auto;padding:auto;">

                <c:forEach items="${classroom.workplaces}" var="workplace">

                    <div style="float:left;margin:3px;border:1px solid darkslategray;border-radius:3px; width:135px;height:135px;">
                        <%--units--%>
                          <div style="width:135px;display:table-cell;vertical-align: top;height:120px;text-align:center">
                              units<br>
                              <c:forEach items="${workplace.units}" var="unit">
                                  <img alt="number" style="margin:2px;width:25px;height:25px" src="/../resources/images/${unit.unit.name}.png"/>
                              </c:forEach>
                          </div>
                          <span style="display:table-cell;vertical-align:bottom;text-align:center">
                              <a href="/admin/unit/new/${classroom.number}/${workplace.id}">add</a>
                          </span>
                    </div>
                    <c:if test="${workplace.sequenceNumber%classroom.columns == 0}">
                        <div style="clear:left;height:0px;width:0px">
                        </div>
                     </c:if>
                </c:forEach>

        </div>
    </div>
<jsp:include page="footer.jsp"/>
</body>
</html>
