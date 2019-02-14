<%-- 
    Document   : HomePage
    Created on : Jan 31, 2019, 8:50:10 AM
    Author     : Antonius Barus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="ct" uri="/WEB-INF/tlds/UserNameTLD.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flights Page</title>
    </head>
    <body>
    <jsp:include page="Template.jsp"></jsp:include>
    <td valign="top" rowspan="200" colspan="80">
        <table>
        <tr>
        <td><font color='darkblue' size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Domestic Flights</a></td>
        <td><font color='darkblue' size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>International Flights</a></td>
        <td><font color='darkblue' size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Hotels</a></td>
        <td><font color='darkblue' size='+1'><a href='<c:url value="ConstructionPage.jsp"/>'>Car Rentals</a></td>
        <td><font color='darkblue' size='+1'><a href='<c:url value="TourPackage.jsp"/>'>Tour Package</a></td>
                <td width="450">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
        <ct:UserNameTagHandler/>
                </tr>
                </table>
                <br>
                <font align='center' color='darkblue' size='+1'>Please select the airline by which you want to go to your destination:
                    <br>
                    <br>
                    <form action='<c:url value="SessionServlet"/>' name='MyForm' method='POST'>
                            <table callspacing='10' align='center' border='2' bordercolor='black'>
                            <tr>
                            <td bordercolor='white'><font color='darkblue'> Select Airline:</font></td>
                            <td bordercolor='white'>
                                <select name='Airline'>
                                    <option value='British Airways'>British Airways</option>
                                    <option value='Cathay Pacific'>Cathay Pacific</option>
                                    <option value='Qantas'>Qantas</option>
                                    <option value='US Airways'>US Airways</option>
                                </select>
                            <input type='hidden' value='FlightsServlet' name='PageName'/>
                            </td>
                            </tr>
                            <tr>
                <td bordercolor='white'>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type='submit' value='Next'></input></a>
                </td>
                </tr>
                </table> 
                </form>
            </body>
</html>
