/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoticatravels;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Antonius Barus
 */
public class ValidateAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String WelcomeAdmin = "admin";
    private static final String WelcomeCustomer = "customer";
    private static final String Error = "error";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
         LoginBean lb=(LoginBean)form;
        String userid=lb.getUserid();
        String password=lb.getPassword();
        String role=lb.getR1();
        if (userid.equals("admin") && password.equals("password@123") && role.equals("administrator"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("User", userid);
            return mapping.findForward(WelcomeAdmin);
        }
        else {
            if (userid.equals("user1") && password.equals("user1@123") && role.equals("customer"))
            {
            HttpSession session = request.getSession();
            session.setAttribute("User", userid);
            return mapping.findForward(WelcomeCustomer);                
            }
            else
            {
                return mapping.findForward(Error);
            }
    }
    }
}