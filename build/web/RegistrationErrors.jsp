<%-- 
    Document   : RegistrationErrors
    Created on : Feb 12, 2019, 6:19:44 PM
    Author     : Antonius Barus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html14/loose.dtd">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
    <jsp:include page="Template.jsp"></jsp:include>
    <td velign="top" rowspan="200"colspan="80">
        <table>
    <tr>
    <td>   
        <c:set var="message" value="${requestScope.err.Msg}"/>
        <font color='darkblue' size='+2'><c:out value="${message}"/>
        </table>
    </body>
</html>
