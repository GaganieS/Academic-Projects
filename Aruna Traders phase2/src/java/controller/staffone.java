
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
import model.Staff;

@WebServlet(name = "staffone", urlPatterns = {"/staffone"})
public class staffone extends HttpServlet {


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
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
    

       
   
        Staff st = new Staff();
        st.setEmail(email);
        st.setPassword(password);
       
        
        
      
          
          if(!st.loginEmail() && st.loginPassword())
          {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Invalid E-Mail..')");
            out.println("location='stafflogin.jsp';");
            out.println("</script>");
          }
          else if(st.loginEmail() && !st.loginPassword())
          {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Invalid Password..')");
            out.println("location='stafflogin.jsp';");
            out.println("</script>");
          }
        else  if(st.login())
        {
           
          
            RequestDispatcher rd = request.getRequestDispatcher("staffdashboard.jsp");
            rd.include(request, response); 
           
              
        }
        else
        { 
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Account Not Found')");
            out.println("location='stafflogin.jsp';");
            out.println("</script>");
            
        }
            
        
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
