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
@WebServlet(name = "SubmitServlet", urlPatterns = {"/SubmitServlet"})
public class SubmitServlet extends HttpServlet 
    {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {  
    String requestType1=request.getParameter("r2");
	if(requestType1.equals("newuser"))
	{    
	RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/RegistrationServlet");

	dispatch.forward(request, response);
	}
        else
		if(requestType1.equals("existinguser"))
		{
		RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/LoginServlet");
		dispatch.forward(request, response);
		}         
        }
    }
}
