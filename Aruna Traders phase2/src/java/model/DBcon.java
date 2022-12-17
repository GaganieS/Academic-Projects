/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chalaka
 */
public class DBcon {
    

    
    
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/aruna1";
    
     public Connection Connection() throws ClassNotFoundException, SQLException
    {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, "root", "");
        
        return con;
    }
    
    
}
