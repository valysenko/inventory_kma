<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 27.04.2015
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
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

    <script type="text/javascript">

        $(document).ready(function() {
//            $('#em').focus(function(){
//                if(this.value==null){
//                    $('.hr').remove();
//                }
//            });
            $('#em').on('input',function(){
                var value = this.value;
                ///console.log(value);
                //alert(value);
                jQuery.ajax({
                    type: 'GET',
                    url:   'http://localhost:8080'+'/admin/find/user/'+value+'',
                    dataType: 'json',
                    async: true,
                    contentType: 'application/json',
                    success: function(data) {
                        $('.hr').remove();
                        $.each(data, function(index, user) {
                            /* "<a href = 'admin/change/role/'" + user.id+">" +*//*"</a>"*/
                            var us = user.firstName +" "+ user.lastName+ "  " + user.email;
                            $("#list").append("<a href='/admin/change/role/"+user.id+"'"+"><p class='hr'> "+ us + "</p></a>");
                        });
                    },
                    error: function(jqXHR, textStatus, errorThrown) {

                    }
                });
            });
        });

    </script>

</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container" style="text-align:center">
    <h3> Changing  user's role to assistant</h3>
   <div  id="list" style="width:300px;height:300px;margin:auto;padding:auto;text-align:left;">
       <form style="padding-bottom:30px">
           <label for="em">Email:</label>
           <input type="text"  id="em" name="userLastName" class="form-control">
       </form>

   </div>

</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
