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
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet 
        {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login Page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='0' bgcolor='#00080' align='top' widht='100%' style='height:100px'>");
                        out.println("<tr>");
                        out.println("<td bgcolor='#00080' align='center'>");
                        out.println("<font style='font-family:'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='FFE4B5'> Exocita Travels</font>");
                        out.println("</td>");
                        out.println("<td bgcolor='#00080' align='left' width='180'>");
                        out.println("<img src='Images/CompanyLogo.png' width='180' height='120' align='right' />");
                        out.println("</td>");
                        out.println("</tr>");
                        out.println("</table>");
                        out.println("<form action='ValidationServlet' method='Post'>");
                        out.println("<table cellspacing='10' align='center'>");
                        out.println("<tr>");
                        out.println("<td><font color='darkblue' size='+2'> Login Form");
                        out.println("</tr>");
                        out.println("</td>");
                        out.println("</table>");
                        out.println("<table cellspacing='10' align='center'border='2' bordercolor'black'>");
                        out.println("<tr><td bordercolor='white'>User Id:<td COLSPAN='2'bordercolor='white'<input type='text' name'uid'>");
                        out.println("<tr><td bordercolor='white'>Password:<td COLSPAN='2'bordercolor='white'<input type='password' name'pwd'>");
                        out.println("<tr><td bordercolor='white'>Role:<td bordercolor='white'<input type='Radio' value='administarator'name='r1'>Adminstator");
                        out.println("<tr><td bordercolor='white'><input type='Radio' value='Customer'name='r1'>Customer");
                         out.println("<tr><td bordercolor='white'></br>");
                        out.println("<tr><td bordercolor='white'><input type='Submit'value='Submit'>");
                        out.println("<td bordercolor='white'><input type='RESET'text='Reset'>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
