<%-- 
    Document   : HomePage
    Created on : Jan 31, 2019, 8:47:10 AM
    Author     : Antonius Barus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <jsp:include page="Template.jsp"></jsp:include>
    <td valign="top"> 
        <html:form action="ValidateAction" method="Post">
            <table cellspacing='10' align='center'>
                <tr><td><font color='darkblue' size='+2'>Login Form
                </td></tr>
            </table>
            <table cellspacing='10' align='center' border='2' bordercolor='black'>
                <tr><td bordercolor='white'>User Id:<td COLSPAN='2' bordercolor='white'>
                <html:text property="userid"/>
                <tr><td bordercolor='white'>Password:<td COLSPAN='2' bordercolor='white'>
                <html:password property="password"/>
                <tr><td bordercolor='white'>Role:<td COLSPAN='2' bordercolor='white'>
                    <html:radio value="administrator" property="r1">Administrator</html:radio>
                <td bordercolor='white'><html:radio value="customer" property="r1">Customer</html:radio>
                <tr><td bordercolor='white'><br/>
                <tr><td bordercolor='white'><input type="Submit" value="Submit"/>
                    <td bordercolor='white'><input type="reset" value="Reset"/>
            </table>
        </html:form>
    </body>
</html>
