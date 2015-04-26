<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 24.04.2015
  Time: 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="<c:url value="/../resources/bootstrap-3.3.4-dist/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="../resources/js/jquery-1.11.2.min.js" />"></script>
    <script src="<c:url value="/../resources/js/jquery-1.11.2.min.js" />"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
</head>
<body>
<jsp:include page="header.jsp"/>
    <div  style="margin-left:10px;margin-right:10px;text-align:center;margin-bottom:50px;/*border:1px solid red*/">
   <%--style="border:1px solid darkslategray;border-radius: 3px;"--%>
    <h2>${classroom.number} edit</h2>
        <div style="text-align:center;margin:auto;padding:auto;/*border:2px solid black*/">

                <c:forEach items="${classroom.workplaces}" var="workplace">

                    <div style="padding-top:3px;margin:3px;float:left;border:1px solid darkslategray;border-radius:3px; width:130px;height:130px;">
                        <%--units--%>
                          <div style="width:135px;display:table-cell;vertical-align: top;height:105px;text-align:center">
                              <c:forEach items="${workplace.units}" var="unit">

                                  <div
                                       onmouseover =
                                               "$('#img1${unit.id}').css('display','none');
                                                $('#img2${unit.id}').css('display','inline-block');"
                                       onmouseout =
                                               " $('#img1${unit.id}').css('display','inline-block');
                                                       $('#img2${unit.id}').css('display','none');
                                                       "
                                          >


                                      <span id="img1${unit.id}" style="float:left;margin:2px;width:30px;height:30px">
                                        <img  alt="number" style="width:30px;height:30px" src="/../resources/images/${unit.unit.name}.png"/>
                                      </span>

                                      <span id="img2${unit.id}" style="margin:2px;width:30px;height:30px;display:none; float:left">
                                         <a href="/admin/unititem/delete/${classroom.number}/${unit.id}">
                                             <button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal"
                                                  data-target="#delete" ><span class="glyphicon glyphicon-trash"></span>
                                             </button>
                                         </a>
                                      </span>
                                  </div>

                              </c:forEach>
                          </div>
                          <table style="text-align:center;width:130px">
                              <tr>
                                  <td style="text-align:center">
                                        <a href="/admin/unit/new/${classroom.number}/${workplace.id}">add</a>
                                  </td>
                              </tr>
                          </table>
                            <%--<button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal"--%>
                                    <%--data-target="#delete" ><span class="glyphicon glyphicon-trash"></span>--%>
                            <%--</button>--%>
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
