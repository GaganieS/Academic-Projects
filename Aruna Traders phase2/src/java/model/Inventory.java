
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Inventory {


    
            private    String id;
            private    String itemname ;
            private    String quantity ;
            private    String date; 
            private    String cost ;
        
            int state =0;
            boolean LogicState;
            
            DBcon con = new DBcon();
   
    public String getId() {
        return id;
    }

   
    public void setId(String id) {
        this.id = id;
    }

  
    public String getItemname() {
        return itemname;
    }

   
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

   
    public String getQuantity() {
        return quantity;
    }


    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

  
    public String getDate() {
        return date;
    }

  
    public void setDate(String date) {
        this.date = date;
    }

   
    public String getCost() {
        return cost;
    }

   
    public void setCost(String cost) {
        this.cost = cost;
    }
 



    public boolean add() {
        
        
                try {
                    PreparedStatement ps = con.Connection().prepareStatement("INSERT into product VALUES(?,?,?,?,?)");
                    ps.setString(1, getId());
                    ps.setString(2, itemname);
                    ps.setString(3, quantity);
                    ps.setString(4, date);
                    ps.setString(5, cost);
               
                    
                    state = ps.executeUpdate();
                    
                    
                    
                
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        return state == 1;
    }
    
    

    public boolean updateFlight() {
        
                try {
                    PreparedStatement ps = con.Connection().prepareStatement("UPDATE product SET itemname=?,quantity=?,date=?,cost=? WHERE id=?");
                    
                    
                    ps.setString(1, itemname);
                    ps.setString(2, quantity);
                    ps.setString(3, date);
                    ps.setString(4, cost);
                    ps.setString(5, id);
                    
                    state = ps.executeUpdate();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                return state == 1;
    }

    public boolean deleteProduct() {
        
                try {
                    PreparedStatement ps = con.Connection().prepareStatement("DELETE from product WHERE id=?");
                    ps.setString(1, getId());
                    state = ps.executeUpdate();
                } catch (ClassNotFoundException |SQLException ex) {
                    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                } 
        
        
        return state == 1;
    }

    

   
    
     
        

      
}
            
    

