
package model;

import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {

  
    DBcon con = new DBcon();
     
    private String email;
    private String fname;
    private String sname;
    private String username;
    private String telephone;
    private String address;
    private String gender;
    
    boolean LogicState = false;
    int state=0;

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
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
  
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

  
   
   
    



    public boolean signup() {
        
       
        try {
 
                PreparedStatement pss = con.Connection().prepareStatement("INSERT INTO client VALUES(?,?,?,?,?,?)");
                
                pss.setString(1, fname);
                pss.setString(2, sname);
                pss.setString(3, address);
                pss.setString(4, email);
                pss.setString(5, gender);
                pss.setString(6, telephone);
                state = pss.executeUpdate();

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        return state == 1;
            
    }

   
  


    

    

    
      
   
   
              




   

    
    
    
}
