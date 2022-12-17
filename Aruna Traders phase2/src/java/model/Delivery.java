/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delivery{

  
    
            private    String id;
            private    String customername ;
            private    String address ;
            private    String payment; 
            private    String charges ;
            boolean LogicState = false;
            int state=0;
            
            DBcon con = new DBcon();
            
              /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * @param customername the customername to set
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * @return the charges
     */
    public String getCharges() {
        return charges;
    }

    /**
     * @param charges the charges to set
     */
    public void setCharges(String charges) {
        this.charges = charges;
    }
    
     public boolean add() {
        
       
        try {
 
                PreparedStatement pss = con.Connection().prepareStatement("INSERT INTO delivery VALUES(?,?,?,?,?)");
                
                pss.setString(1, id);
                pss.setString(2, customername);
                pss.setString(3, address);
                pss.setString(4, payment);
                pss.setString(5, charges);
                
                state = pss.executeUpdate();

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        return state == 1;
            
    }
            
            

}
