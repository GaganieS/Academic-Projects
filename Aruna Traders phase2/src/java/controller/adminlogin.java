
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AdminStaff;

@WebServlet(name = "adminlogin", urlPatterns = {"/adminlogin"})
public class adminlogin extends HttpServlet {


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
        
        String uid = request.getParameter("uid");
        String password = request.getParameter("password");
        
        AdminStaff ad1 = new AdminStaff();
        ad1.setUid(uid);
        ad1.setPassword(password);
        
        if(ad1.login())
        {
            HttpSession s3 = request.getSession(true);
            s3.setAttribute("uid", uid);
            
            Cookie cok = new Cookie("uid",uid);
            response.addCookie(cok);
            
            RequestDispatcher rd = request.getRequestDispatcher("admindashboard.jsp");
            rd.include(request, response);
        }
        else
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('No Account Found!!!')");
            out.println("location='adminlogin.jsp';");
            out.println("</script>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
