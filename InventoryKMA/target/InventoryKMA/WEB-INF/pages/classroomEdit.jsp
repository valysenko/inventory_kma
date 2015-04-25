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

<%--<div class="container">--%>
    <%--<div class="row">--%>
        <%--<div class="col-md-6 col-md-offset-3">--%>
            <%--<div class="panel panel-login">--%>
                <%--<div class="panel-heading">--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-xs-6">--%>
                            <%--<a href="#" class="active" id="login-form-link">List</a>--%>
                        <%--</div>--%>
                        <%--<div class="col-xs-6">--%>
                            <%--<a href="#" id="register-form-link">Add</a>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<hr>--%>
                <%--</div>--%>
                <%--<div class="panel-body">--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-lg-12">--%>
                            <%--<div id="login-form">--%>
                                <%--first--%>
                            <%--</div>--%>

                            <%--<div id="register-form">--%>
                                <%--second--%>
                            <%--</div>--%>
                            <%--&lt;%&ndash;<form id="login-form" action="http://phpoll.com/login/process" method="post" role="form" style="display: block;">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group text-center">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<input type="checkbox" tabindex="3" class="" name="remember" id="remember">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<label for="remember"> Remember Me</label>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<div class="row">&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<div class="col-sm-6 col-sm-offset-3">&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<div class="row">&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<div class="col-lg-12">&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;<div class="text-center">&ndash;%&gt;--%>
                                                <%--&lt;%&ndash;<a href="http://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;</form>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;<form id="register-form" action="http://phpoll.com/register/process" method="post" role="form" style="display: none;">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;<div class="form-group">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<div class="row">&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<div class="col-sm-6 col-sm-offset-3">&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                            <%--&lt;%&ndash;</form>&ndash;%&gt;--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
    <div style="text-align:center;margin:auto;padding:auto;">
   <%--style="border:1px solid darkslategray;border-radius: 3px;"--%>
    <h2>${classroom.number} edit</h2>
        <div style="margin-bottom:50px;text-align:center;overflow-x:scroll;">

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
