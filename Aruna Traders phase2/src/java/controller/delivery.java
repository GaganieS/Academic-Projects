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
import model.Delivery;

/**
 *
 * @author gaganie silva
 */
@WebServlet(name = "delivery", urlPatterns = {"/delivery"})
public class delivery extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        String address = request.getParameter("address");
        String payment = request.getParameter("payment");
        String charges = request.getParameter("charges");
  
        
        /*String task = request.getParameter("task");
        String date = request.getParameter("date");

        String value=null;
        String name=null;
        
         Cookie ck[]=request.getCookies();  
        for(int i=0;i<ck.length;i++){  
        name= ck[i].getName();
        value = ck[i].getValue();
        }
        if(name.equals("staffmail"))
        {
            request.setAttribute("filteruser", value);
        }
          String filter = (String)request.getAttribute("filteruser");*/
  
  
        
        
        Delivery f1 = new Delivery();
        f1.setId(id);
        f1.setCustomername(customername);
        f1.setAddress(address);
        f1.setPayment(payment);
        f1.setCharges(charges);

        
       
        
       
        if(f1.add())
        { 
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Delivery Data Added')");
            out.println("location='delivery.jsp';");
            out.println("</script>");
        }
        else
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Delivery Data Adding Failed!!')");
            out.println("location='delivery.jsp';");
            out.println("</script>");
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
