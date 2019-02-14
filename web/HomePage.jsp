<%-- 
    Document   : HomePage
    Created on : Jan 31, 2019, 8:45:10 AM
    Author     : Antonius Barus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <jsp:include page="Template.jsp"></jsp:include>
    <td valign="top"> <br/><br/><B><I><font style="font-family: 'Brush Script MT Italics'" Gadget Sans-serif size='+1' color='darkblue'>
    Exotica Travels is a travel management company established by Jordan Desilva in Colombo, Sri Lanka. 
    Today under the chairmanship of Jim Henry, the company has spread across the county. 
    it providers online air tickets booking. In addition,it provides hotel suite booking in various exotic locations 
    all over the world. Moreover, it provides rental car bookings. To avail the travel package services kindly log on to 
    the website.</I></B>
      <br/>
      <br/>
        <html:form method="Post" action="/SubmitAction" >
          <table cellspacing='10' align='center'>
            <tr>
                <td><font color='darkblue' size='+2'>LOGIN AS:
                </td>
            </tr>
        </table>
          <table cellspacing='10' align='center' border='2' bordercolor='black'>
              <tr><td bordercolor='white'><html:radio property='r1' value="existinguser">Existing User</html:radio>
              <tr><td bordercolor='white'><html:radio property='r1'  value="newuser">New User</html:radio>
              <tr><td bordercolor='white'><input type="Submit" value="Submit"/>
        </html:form>
    </tr>
    </table>
    </body>
</html>
