<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 22.04.2015
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
<link rel="stylesheet" href="<c:url value="/../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="<c:url value="/../resources/bootstrap-3.3.4-dist/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/../resources/js/jquery-1.11.2.min.js" />"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<style>
    .panel-login {
        border-color: #ccc;
        -webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
        -moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
        box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
    }
    .panel-login>.panel-heading {
        color: #00415d;
        background-color: #fff;
        border-color: #fff;
        text-align:center;
    }
    .panel-login>.panel-heading a{
        text-decoration: none;
        color: #666;
        font-weight: bold;
        font-size: 12px;
        /*-webkit-transition: all 0.1s linear;*/
        /*-moz-transition: all 0.1s linear;*/
        /*transition: all 0.1s linear;*/
    }
    .panel-login>.panel-heading a.active{
        color: #029f5b;
        font-size: 12px;
    }
    .panel-login>.panel-heading hr{
        margin-top: 5px;
        margin-bottom: 0px;
        clear: both;
        border: 0;
        height: 1px;
        background-image: -webkit-linear-gradient(left,rgba(0, 0, 0, 0),rgba(0, 0, 0, 0.15),rgba(0, 0, 0, 0));
        background-image: -moz-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));
        background-image: -ms-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));
        background-image: -o-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));
    }
    /*.panel-login input[type="text"],.panel-login input[type="email"],.panel-login input[type="password"] {*/
        /*height: 45px;*/
        /*border: 1px solid #ddd;*/
        /*font-size: 16px;*/
        /*-webkit-transition: all 0.1s linear;*/
        /*-moz-transition: all 0.1s linear;*/
        /*transition: all 0.1s linear;*/
    /*}*/
    /*.panel-login input:hover,*/
    /*.panel-login input:focus {*/
        /*outline:none;*/
        /*-webkit-box-shadow: none;*/
        /*-moz-box-shadow: none;*/
        /*box-shadow: none;*/
        /*border-color: #ccc;*/
    /*}*/


    /*.btn-register {*/
        /*background-color: #1CB94E;*/
        /*outline: none;*/
        /*color: #fff;*/
        /*font-size: 12px;*/
        /*height: auto;*/
        /*font-weight: normal;*/
        /*padding: 7px 0;*/
        /*text-transform: uppercase;*/
        /*border-color: #1CB94A;*/
    /*}*/
    /*.btn-register:hover,*/
    /*.btn-register:focus {*/
        /*color: #fff;*/
        /*background-color: #1CA347;*/
        /*border-color: #1CA347;*/
    /*}*/

</style>

<script>
    $(function() {

        $('#login-form-link').click(function(e) {
            var that = $(this);
            $(".login-form").delay(100).fadeIn(100);
            $(".register-form").fadeOut(100);
            $('.register-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
        $('#register-form-link').click(function(e) {
            var that = $(this);
            $(".register-form").delay(100).fadeIn(100);
            $(".login-form").fadeOut(100);
            $('.login-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
        $(function() {
            $( "#tabs" ).tabs();
        });

    });
</script>
<div class="container-fluid navbar navbar-default">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
        <a class="navbar-brand" href="/index">InventoryKMA</a>
    </div>

    <sec:authorize ifAnyGranted="ROLE_ADMIN">
        <ul class="nav navbar-nav">
            <li>
                <a href="<c:url value="/admin/task/new"/>">Add task</a>
            </li>
            <li>
                <a href="<c:url value="/admin/classroom/new"/>">Add classroom</a>
            </li>
        </ul>
    </sec:authorize>

    <sec:authorize ifAnyGranted="ROLE_ASSISTANT">
        <ul class="nav navbar-nav">
            <li>
                <a href="<c:url value="/assistant/tasks"/>">My tasks</a>
            </li>
        </ul>
    </sec:authorize>

    <ul class="nav navbar-nav navbar-right">
        <li>
            <sec:authorize ifAnyGranted="ROLE_ANONYMOUS">
                <a href="<c:url value="/login"/>">Login</a>
            </sec:authorize>
        </li>
        <li>
            <sec:authorize ifNotGranted="ROLE_ANONYMOUS">
                <a href="<c:url value="/logout"/>">Logout</a>
            </sec:authorize>
        </li>
    </ul>
</div>
