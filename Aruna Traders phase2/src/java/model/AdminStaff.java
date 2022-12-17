
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminStaff {
    
    private String uid;
    private String password;
    private String fname;
    private String sname;
    private String email;
    private String spassword;
    private String gender;
    private String telephone;
    private String type;
    int state =0;
    boolean LogicState = false;
   
    DBcon con = new DBcon();

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

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
 
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
    public boolean addAdminstaff()
    {
        try {
            PreparedStatement ps = con.Connection().prepareStatement("INSERT INTO staff VALUES(?,?,?,?,?)");
            ps.setString(1, fname);
            ps.setString(2, sname);
            ps.setString(3, email);
            ps.setString(4, spassword);         
            ps.setString(5, telephone);
    
            state = ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminStaff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return state  == 1;
    }

    public boolean addStaff() {
       
   
        try
        {
            PreparedStatement ps = con.Connection().prepareStatement("INSERT INTO staff "
                    + "SELECT * FROM teststaff "
                    + "WHERE email=?");
            
            ps.setString(1, email);
            
            state = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        return state == 1;
    }

    public boolean decStaff() {
               
         
        
        try
        {
            PreparedStatement ps = con.Connection().prepareStatement("DELETE FROM teststaff WHERE email=?");
            
            ps.setString(1, email);
            
            state = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        return state == 1;
        
    }


    public boolean login() {
        
         try {
             PreparedStatement ps = con.Connection().prepareStatement("SELECT * FROM admin WHERE userid=? and password=?");
             ps.setString(1, uid);
             ps.setString(2, password);
             ResultSet rs = ps.executeQuery();
             
             LogicState = rs.next();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return LogicState;
        
    }
        public List getGuestStaff()
    {
        List stafflist = new ArrayList();
        
        try {
            PreparedStatement ps = con.Connection().prepareStatement("SELECT * from teststaff");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                stafflist.add(rs.getString("firstname"));
                stafflist.add(rs.getString("lastname")); 
                stafflist.add(rs.getString("email"));
                stafflist.add(rs.getString("password"));
                stafflist.add(rs.getString("gender"));
                stafflist.add(rs.getString("telephone"));
                stafflist.add(rs.getString("stafftype"));
                
                 
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return stafflist;
    }

    
    

    
  
    
}
