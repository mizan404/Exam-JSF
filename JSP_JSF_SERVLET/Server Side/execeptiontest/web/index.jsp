<%@page errorPage="error_page.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1> Exception Handing In JSP</h1>  
        </div>
        <hr/>
        <div>
            <%!
                int n1 = 20;
                int n2 = 0;
            %>
            <%
                int division = n1 / n2;
            %>
            <h1>
                Division is =
                <%= division%>
            </h1> 
        </div>
    </body>
</html>
