package exoticatravels;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Antonius Barus
 */
@WebServlet(name = "ValidationServlet", urlPatterns = {"/ValidationServlet"})
public class ValidationServlet extends HttpServlet 
    {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String user=request.getParameter("uid");
            String password=request.getParameter("pwd");
            String role=request.getParameter("r1");
            if (user.equals("admin") && password.equals("password@123") && role.equals("administrator"))
	{
		RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/WelcomeAdminServlet");
			dispatch.forward(request, response);
	}
else 
            {
	if (user.equals("user1") && password.equals("user1@123") && role.equals("customer"))
	{
		RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/WelcomeCustomerServlet");
		dispatch.forward(request, response);
	}
    else
        {
	out.println("<html>");
		out.println("<head>");
		out.println("<title>ErrorPage</title>");
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
			out.println("<font style='font-family:'Arial Rounded MT Bold', Gadget, sans-serif;' size='+2' color='red'> invalid user Credential!!");
                        }
                            }
                    out.println("</body>");
                    out.println("</html>");
        }
    }   
}
    

