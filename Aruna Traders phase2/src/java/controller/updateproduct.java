
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
import model.Inventory;

@WebServlet(name = "updateproduct", urlPatterns = {"/updateproduct"})
public class updateproduct extends HttpServlet {


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
        String id = request.getParameter("id");
        String itemname = request.getParameter("itemname");
        String quantity = request.getParameter("quantity");
        String date = request.getParameter("date");
        String cost = request.getParameter("cost");
    
        
    
        
        Inventory f1 = new Inventory();
        
        
        f1.setItemname(itemname);
        f1.setQuantity(quantity);
        f1.setDate(date);
        f1.setCost(cost);
        f1.setId(id);       
        
        
        
        
        if(f1.updateFlight())
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert(' Product Deatils Updated..')");
            out.println("location='productedit.jsp';");
            out.println("</script>");
                    
        }
            
        else
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert(' Product Deatils Update Failed..')");
            out.println("location='productedit.jsp';");
            out.println("</script>");
        }
    
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

