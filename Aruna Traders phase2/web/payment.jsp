
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.DBcon"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Connection connection = null; %>
<% Statement st = null ; %>
<% ResultSet rs = null; %>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
         <link rel="stylesheet" href="CSS/flightdetails.css">
        <title>Filter Flights</title>
        <style>
    

    p.copyright {
        position: absolute;
        width: 100%;
        left: 0%;
        color: #fff;
        line-height: 40px;
        font-size: 0.7em;
        text-align: center;
        bottom:0;
    }
</style>
    </head>
    
    
    <body>
        <div class="back">                        
         
             <form action="staffdashboard.jsp" method="POST">
                 <input class="back" type="submit" value="BACK">
        </form>
</div>
        <h1>Payment Details</h1>
        <div class="tbl-header">
       <table cellpadding="0" cellspacing="0" border="0">
            <thead>
            <tr>
                <th>Order ID</th>
                <th>Customer Name</th>                
                <th>Order Date</th>
                <th>Total Price</th>                
                <th>Paid Status</th>
            </tr>
            </thead>
       </table>
        </div>
        
        <div class="tbl-content">
              <table cellpadding="0" cellspacing="0" border="0">
            <tbody>
                <tr>
                    
                    <%
                        DBcon con = new DBcon();
                        st = con.Connection().createStatement();
                        String sql = "SELECT * from payment";
                        rs = st.executeQuery(sql);
                        while(rs.next())
                        {
                     %>
            <img src="../../../../../../../AppData/Local/Temp/download.jpg" alt=""/>
                     <td><%= rs.getString("id")%></td>
                     <td><%= rs.getString("customername") %></td>
                     <td><%= rs.getString("date") %></td>
                     <td><%= rs.getString("price") %></td>
                     <td>                   
                    <form action="payment" method="POST">
                        <input type="hidden" name="id" value="<%= rs.getString("id") %>">
                    <input type="submit" value="Paid" />
                    </form>
                    </td>
                    </tr>
           
                
                     <% } %> 
                     
                     
                
            </tbody>
        </table>
        </div>
                     
                     
    <footer>
<p class="copyright">Copyright©  Phoenix Airlines 2022</p>
</footer>                 
    </body>
</html>
