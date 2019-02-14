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
@WebServlet(name = "WelcomeAdminServlet", urlPatterns = {"/WelcomeAdminServlet"})
public class WelcomeAdminServlet extends HttpServlet 
    {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> AdminPage </title>");            
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
                        out.println("<table>");
                        out.println("</table>");
                        out.println("<tr>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
