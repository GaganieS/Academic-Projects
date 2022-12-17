
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Client;


@WebServlet(name = "clientservlet", urlPatterns = {"/clientservlet"})
public class clientservlet extends HttpServlet {


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
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");      
        String telephone = request.getParameter("telephone");
        
       
       
    
       Client c1 = new Client();
       
       c1.setFname(fname);
       c1.setSname(sname);
       c1.setAddress(address);
       c1.setEmail(email);
       c1.setGender(gender);     
       c1.setTelephone(telephone);
       
      
               if(c1.signup())
               {
                   out.println("<script type=\"text/javascript\">");
                    out.println("alert('Customer Added')");
                    out.println("location='staffdashboard.jsp';");
                    out.println("</script>");
               }
               else
               {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Signup Failed..')");
                    out.println("location='clientsignup.jsp';");
                    out.println("</script>");
               }
                 
     
       
       
       
       
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>*/

}
