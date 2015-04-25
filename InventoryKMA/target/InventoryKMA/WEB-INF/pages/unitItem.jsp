<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 25.04.2015
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="../resources/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css"/>">
</head>
<body>
<jsp:include page="header.jsp"/>
<div style="margin:auto;padding:auto;width:400px;text-align:center">

    <form:form method="post" action="/admin/unit/add" commandName="item" class="form-horizontal">
        <table>
            <tr style="text-align:center">
                <td style="text-align:center">
                    <form:input path="number" class="form-control" placeholder=" Number"/>
                     <c:set var="first"><form:errors path="number"/></c:set>
                        <c:if test="${not empty first}">
                            <td>Cannot be empty!</td>
                        </c:if>
                    <input type="hidden" name="id" value="${id}"/>
                    <input type="hidden" name="classroom_number" value="${classroom_number}"/>
                </td>
            </tr>
        </table>
        <table style="text-align:center">
            <tr >

                <td ><input type="radio" name="type" value="chair" />
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/chair.png"/>
                </td>

                <td><input type="radio" name="type" value="table" checked/>
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/table.png"/>
                </td>

                <td><input type="radio" name="type" value="monitor"/>
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/monitor.png"/>
                </td>

                <td><input type="radio" name="type" value="mouse"/>
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/mouse.png"/>
                </td>

                <td><input type="radio" name="type" value="keyboard"/>
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/keyboard.png"/>
                </td>
            </tr>
            <tr>
                <td><input type="radio" name="type" value="board"/>
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/board.png"/>
                </td>

                <td><input type="radio" name="type" value="computer"/>
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/computer.png"/>
                </td>

                <td><input type="radio" name="type" value="loudspeakers"/>
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/loudspeakers.png"/>
                </td>

                <td><input type="radio" name="type" value="powerUnit"/>
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/powerUnit.png"/>
                </td>

                <td><input type="radio" name="type" value="projector"/>
                    <img alt="number" style="margin:8px;width:40px;height:40px" src="/../resources/images/projector.png"/>
                </td>

            </tr>
        </table>

        <table>
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
