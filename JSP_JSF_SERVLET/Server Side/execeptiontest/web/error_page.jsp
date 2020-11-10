

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <div>
            <h1> Exception Handing In JSP</h1>  
        </div>
        <hr/>
        <div>
            <h1>
                <%= exception%>
            </h1>
        </div>
    </body>
</html>
