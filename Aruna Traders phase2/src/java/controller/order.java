/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Order;

/**
 *
 * @author gaganie silva
 */
@WebServlet(name = "order", urlPatterns = {"/order"})
public class order extends HttpServlet {

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
        String customername = request.getParameter("customername");
        String date = request.getParameter("date");
        String price = request.getParameter("price");
        
        
        
        Order f1 = new Order();
        f1.setId(id);
        f1.setCustomername(customername);       
        f1.setDate(date);
        f1.setPrice(price);
        
        if(f1.addOrder())
        { 
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Order Data Added')");
            out.println("location='order.jsp';");
            out.println("</script>");
        }
        else
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Order Data Adding Failed!!')");
            out.println("location='order.jsp';");
            out.println("</script>");
        }
        if(f1.addPayment())
        { 
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Payment Data Added')");
            out.println("location='order.jsp';");
            out.println("</script>");
        }
        else
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Payment Data Adding Failed!!')");
            out.println("location='order.jsp';");
            out.println("</script>");
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
