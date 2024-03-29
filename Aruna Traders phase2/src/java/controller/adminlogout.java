
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "adminlogout", urlPatterns = {"/adminlogout"})
public class adminlogout extends HttpServlet {

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
         PrintWriter out=response.getWriter();  
              
            request.getRequestDispatcher("index.html").include(request, response);  
              
            HttpSession session=request.getSession();  
            session.invalidate();  
            Cookie cok = new Cookie("uid","");
            cok.setMaxAge(0);
            response.addCookie(cok); 
              
            out.print("<center><font color='red'><b>You are successfully logged out!</b></font></center>");  
              
            out.close();
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
