<%-- 
    Document   : index
    Created on : Oct 23, 2020, 8:58:10 PM
    Author     : mohdm
--%>
<%--<%@taglib prefix="ex" uri="WEB-INF/tlds/custom.tld" %>
<%@taglib prefix="exa" uri="WEB-INF/tlds/customtwo.tld" %>
<%@taglib prefix="exam" uri="WEB-INF/tlds/customthree.tld" %>--%>
<%@taglib uri="/WEB-INF/tlds/mycustomtag.tld" prefix="tag" %>
<%@taglib uri="/WEB-INF/tlds/ch07.tld" prefix="ch07" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<!--                <ex:Hello/>
                <exa:Hello>
                    <h1>
                        This is message for rajaul chuthiyar jonno. 
                    </h1>
        
                </exa:Hello>
            <exam:Hello message="Mizan"/>-->
        <tag:mytag/>


        The current date and time is <ch07:datetime>
            <h1>
               This is message for rajaul chuthiyar jonno.   
            </h1>
        </ch07:datetime>

    </body>
</html>
