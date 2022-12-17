
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Staff {
    
    DBcon con = new DBcon();
    
    private String email;
    private String password;
    private String type;
    private String fname;
    private String sname;
    private String gender;
    private String telephone;
    private String task;
    private String date;
    private String person;
    private String ip;
    
    int state = 0 ;
    boolean LogicState = false;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }



    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

 
    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public String getPerson() {
        return person;
    }


    public void setPerson(String person) {
        this.person = person;
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
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public boolean login() {
       
        try {
            PreparedStatement ps = con.Connection().prepareStatement("SELECT * FROM staff WHERE email=? and password=?");
            
            ps.setString(1, email);
            ps.setString(2, password);
          
            ResultSet rs = ps.executeQuery();
            LogicState = rs.next();
            
            ;
        } catch (ClassNotFoundException | SQLException  ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
  //      System.out.print(LoginState);
        
    return LogicState;
    }

    public boolean signup() {
        
          try
        {
            PreparedStatement ps = con.Connection().prepareStatement("INSERT INTO teststaff VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, fname);
            ps.setString(2, sname);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, gender);
            ps.setString(6, telephone);
            
            
            state = ps.executeUpdate();
        }
         catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminStaff.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return state == 1;
        
    }
    
    public List staffActivity()
    {
        List activities = new ArrayList();
        try {
            PreparedStatement ps = con.Connection().prepareStatement("SELECT * FROM stafftracker");
            ResultSet  rs = ps.executeQuery();
            while(rs.next())
            {
                activities.add(rs.getString("id"));
                activities.add(rs.getString("user"));
                activities.add(rs.getString("task"));
                activities.add(rs.getString("time"));
            }
                
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return activities;
        
    }
    public boolean staffipmonitor() {
        
        try {
            PreparedStatement ps = con.Connection().prepareStatement("INSERT into staffipmonitor(username,userip,logintime) VALUES(?,?,?)");
            ps.setString(1, person);
            ps.setString(2, ip);
            ps.setString(3, date);
            state = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return state == 1;
    }
    public List getstaffSessions()
    {
        List sessionlist = new ArrayList();
        try {
            PreparedStatement ps = con.Connection().prepareStatement("SELECT * from staffipmonitor");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                sessionlist.add(rs.getString("id"));
                sessionlist.add(rs.getString("username"));
                sessionlist.add(rs.getString("userip"));
                sessionlist.add(rs.getString("logintime"));
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return sessionlist;
    }
    
       public boolean loginEmail() {
        
         try {
             PreparedStatement ps = con.Connection().prepareStatement("SELECT * FROM staff WHERE email=?");
             ps.setString(1, email);
             ResultSet rs = ps.executeQuery();
             
             LogicState = rs.next();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return LogicState;
        
    }
              public boolean loginPassword() {
        
         try {
             PreparedStatement ps = con.Connection().prepareStatement("SELECT * FROM staff WHERE password=?");
             ps.setString(1, password);
             ResultSet rs = ps.executeQuery();
             
             LogicState = rs.next();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return LogicState;
        
    }
                     public boolean loginTest() {
        
         try {
             PreparedStatement ps = con.Connection().prepareStatement("SELECT * FROM teststaff WHERE email=? and password=?");
             ps.setString(1, email);
             ps.setString(2, password);
             ResultSet rs = ps.executeQuery();
             
             LogicState = rs.next();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return LogicState;
        
    }
                            public boolean testEmail() {
        
         try {
             PreparedStatement ps = con.Connection().prepareStatement("SELECT * FROM teststaff WHERE email=?");
             ps.setString(1, email);
             ResultSet rs = ps.executeQuery();
             
             LogicState = rs.next();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return LogicState;
        
    }
    

}
    
