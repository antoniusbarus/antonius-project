<%-- 
    Document   : HomePage
    Created on : Jan 31, 2019, 8:45:20 AM
    Author     : Antonius Barus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
    <jsp:include page="Template.jsp"></jsp:include>
    <td valign="top">
        <html:form method="POST" action="/RegistrationAction"> 
            <table cellspacing='10' align='center'>
                <tr><td><font color='darkblue' size='+2'>New User Registration Form</td>
                </tr></td>
            </table>
            <table cellspacing='10' align='center' border='2' bordercolor='black'>
                <tr><td bordercolor='white'>User Name:<td COLSPAN='2' bordercolor='white'><html:text property="username"/>
                <tr><td bordercolor='white'>User Id:<td COLSPAN='2' bordercolor='white'><html:text property="userid"/>
                    </tr>
                    <tr><td bordercolor='white'>Password:<td colspan="2" bordercolor='white'>
                        <html:password property="password"/>
                        </tr>
                    <tr><td bordercolor='white'>Re-enter Password:<td colspan="2" bordercolor='white'>
                       <html:password property="reenterpassword"/>
                    <tr><td bordercolor='white'>Address:<td colspan="2" bordercolor='white'>
                        <html:textarea property="address"/>
                    <tr><td bordercolor='white'>State:<td colspan="2" bordercolor='white'>
                        <html:text property="state"/>
                    <tr><td bordercolor='white'>Country:<td colspan="2" bordercolor='white'>
                        <html:text property="country"/>
                        <tr><td bordercolor='white'></br>
                        <tr><td bordercolor='white'><input type="Submit" value="Submit">
                            <td bordercolor='white'><input type="button" value="Reset">
                    </table>
                </html:form>
        </body>
</html>
