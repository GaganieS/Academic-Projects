
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AdminStaff;


@WebServlet(name = "adminstafff", urlPatterns = {"/adminstafff"})
public class adminstafff extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
 
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String sname = request.getParameter("sname");
        String email = request.getParameter("email");
        String password = request.getParameter("spassword");
        String telephone = request.getParameter("telephone");
        
               
       AdminStaff as = new AdminStaff();
        as.setFname(fname);
        as.setSname(sname);
        as.setEmail(email);
        as.setSpassword(password);
        as.setTelephone(telephone);
       
        
         if(as.addAdminstaff())
         {
           out.println("<script type=\"text/javascript\">");
            out.println("alert('Staff Added..')");
            out.println("location='admindashboard.jsp';");
            out.println("</script>");  
         }
         else      
         {
             out.println("<script type=\"text/javascript\">");
            out.println("alert('Failed!!!...')");
            out.println("location='admindashboard.jsp';");
            out.println("</script>");  
         }
     
        
        
  
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
