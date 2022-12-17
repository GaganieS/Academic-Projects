
package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Order{

   
            private    String id;
            private    String customername ;
            private    String date ;
            private    String price; 
                    
            int state =0;
            boolean LogicState;
            
            DBcon con = new DBcon();
            
    
    public String getId() {
        return id;
    }

  
    public void setId(String id) {
        this.id = id;
    }

    
    public String getCustomername() {
        return customername;
    }

  
    public void setCustomername(String customername) {
        this.customername = customername;
    }

   
    
    public String getDate() {
        return date;
    }

    
    public void setDate(String date) {
        this.date = date;
    }

   
    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price;
    }
    
    public boolean addPayment() {
        
        
                try {
                    PreparedStatement ps = con.Connection().prepareStatement("INSERT into payment VALUES(?,?,?,?)");
                    ps.setString(1, id);
                    ps.setString(2, customername);
                    ps.setString(3, date);
                    ps.setString(4, price);
               
                    
                    state = ps.executeUpdate();
                    
                    
                    
                
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        return state == 1;
    }
    
    public boolean addOrder() {
        
        
                try {
                    PreparedStatement ps = con.Connection().prepareStatement("INSERT into orders VALUES(?,?,?,?)");
                    ps.setString(1, id);
                    ps.setString(2, customername);
                    ps.setString(3, date);
                    ps.setString(4, price);
               
                    
                    state = ps.executeUpdate();
                    
                    
                    
                
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        return state == 1;
    }
    public boolean paidProduct() {
        
                try {
                    PreparedStatement ps = con.Connection().prepareStatement("DELETE from payment WHERE id=?");
                    ps.setString(1, id);
                    state = ps.executeUpdate();
                } catch (ClassNotFoundException |SQLException ex) {
                    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                } 
        
        
        return state == 1;
    }
}
