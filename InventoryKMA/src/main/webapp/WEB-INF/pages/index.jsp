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
    <style>
        .fig {
            text-align: center;
            color:#253d6d;
            font-size:53px;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">

    <p class="fig"><img src="/../resources/images/kiev-mohyla-academy-arms.jpg"
                        width="20%" height="20%" alt=""></p>
    <h1 class="fig"  >Welcome to KMA inventory project</h1>

</div>
<jsp:include page="footer.jsp"/>
</body>
</html>