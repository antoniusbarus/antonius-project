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
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet 
    {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
     String Uid=request.getParameter("t1");
     String Pwd=request.getParameter("t2");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registration Page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='0' bgcolor='#00080' align='top' widht='100%' style='height:100px'>");
                out.println("<tr>");
                out.println("<td bgcolor='#00080' align='center'>");
                out.println("<font style='font-family: 'Arial Rounded Bold', Gadget, sans-serif; size='+4 color='#FFE4B5'>ExoticaTravels</font>");
                out.println("</td>");
                out.println("<td bgcolor='#00080' align='left' width='180'>");
                out.println("<img src='Images/CompanyLogo.png' width=;180' height='120' align='right'/>");
                out.println("</tr>");
                out.println("</table");
                    out.println("<form method='Post' action='submitservlet'>");
                    out.println("<table cellspacing='10' align='center'>");
                    out.println("<tr>");
                    out.println("<td><font color='darkblue' size='+2'>New User Registration Form");
                    out.println("</tr>");
                        out.println("</td>");
                            out.println("</table>");
                            out.println("<table cellspacing='10' align='center'border='2' bordercolor'black'>");
                    out.println("<tr><td bordercolor='white'>UserName:<td COLSPAN='2'bordercolor='white'<input type='text' name'tt1'>");
                    out.println("<tr><td bordercolor='white'>UserID:<td COLSPAN='2'bordercolor='white'>");
                    out.println("<input type='text' name='tt2'>");
                    out.println("</tr>");
                out.println("<tr><td bordercolor='white'>Password:<td COLSPAN='2'bordercolor='white'>");
                out.println("<input type='password' name='tt3'>");
                    out.println("</tr>");
                    out.println("<tr><td bordercolor='white'>Re-enter Password:<td COLSPAN='2'bordercolor='white'<input type='password' name'tt4'>");
                    out.println("<tr><td bordercolor='white'>Address:<td COLSPAN='2'bordercolor='white'<input type='textArea' name'tt5'>");
                    out.println("<tr><td bordercolor='white'>State:<td COLSPAN='2'bordercolor='white'<input type='text' name'tt6'>");
                    out.println("<tr><td bordercolor='white'>Country:<td COLSPAN='2'bordercolor='white'<input type='text' name'tt7'>");
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
