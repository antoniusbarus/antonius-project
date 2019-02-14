package exoticatravels;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Antonius Barus
 */
@WebServlet(name = "HomePage", urlPatterns = {"/HomePage"})
public class HomePage extends HttpServlet 
        {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
            {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> HomePage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='0' bgcolor='#00080' align='top' widht='100%' style='height:100px'>");
                        out.println("<tr>");
                        out.println("<td bgcolor='#00080' align=center'>");
                        out.println("<font style='font-family:'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='FFE4B5'> Exocita Travels</font>");
                        out.println("</td>");
                            out.println("<td bgcolor='#00080' align='left' width='150>");
                            out.println("<img src='Images/CompanyLogo.png' width='200' height='120' align='right'/>");
                            out.println("</td>");
                            out.println("</tr>");
                            out.println("</table>");
                            out.println("<br/>");
                            out.println("<B><I><font style='font-family: 'Brush Script MT Italics', Gadget, sans-serif;' size='+1 color='darkblue'>Exocita Travels is a travel managament company established by Jordan Desilva in Colombo, Sri Lanka. Today under the chairmanship of Jim Henry, The Company has spread across the country. It provides online air tickets booking. in addiction, it provides hotel suite booking in various exotic location all over the world. Moreover, it provides rental car booking. To avail the travel package services kindly log to the website.</B></I>");
                            out.println("<br/>");
                            out.println("<form method='Post' action='SubmitServlet'>");
                            out.println("<table cellspacing='10' align='center'>");
                           out.println("<tr>");
                           out.println("<td><font color='darkblue' size='+2'>Login AS:");
                           out.println("</tr>");
                           out.println("</td>");
                           out.println("</table>");
                           out.println("<table cellspacing='10' align='center'border='2' bordercolor='black'>");
                           out.println("<tr><td bordercolor='white'><input type='Radio' value='existinguser' name='r2' CHECKED> ExistingUser");
                           out.println("<tr><td bordercolor='white'><input type='Radio' value='newuser' name='r2'> New User");
                           out.println("<tr><td bordercolor='white'><input type='Submit' value='Submit'>");
                           out.println("</table>");
                           out.println("</from>");                           
            out.println("</body>");
            out.println("</html>");
        }
    }
}
