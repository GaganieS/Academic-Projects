

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
        <title>Filter Products</title>
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
         
             <form action="admindashboard.jsp" method="POST">
                 <input class="back" type="submit" value="Admin Dashboard">
        </form>
           
           
</div>
            
        <h1>Edit Products</h1>
        <div class="tbl-header">
       <table cellpadding="0" cellspacing="0" border="0">
            <thead>
            <tr>
                <th>Product ID</th>
                <th>Item Name</th>                
                <th>Quantity</th>
                <th>Date</th>
                <th>Cost</th>
                <th>Update</th>
                <th>Delete</th>
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
                        String sql = "SELECT * from product";
                        rs = st.executeQuery(sql);
                        while(rs.next())
                        {
                     %>
            <img src="../../../../../../../AppData/Local/Temp/download.jpg" alt=""/>
                     <td><%= rs.getString("id")%></td>
                     <td><%= rs.getString("itemname") %></td>
                     <td><%= rs.getString("quantity") %></td>
                     <td><%= rs.getString("date") %></td>
                     <td><%= rs.getString("cost") %></td>
                     
                     <td><form action="updateproduct.jsp">
                     <input type="hidden" name="id" value="<%= rs.getString("id")%>">
                    <input type="submit" value="UPDATE" />
                    </form></td>
                    <td>
                    <form action="deleteproduct" method="POST">
                        <input type="hidden" name="id" value="<%= rs.getString("id") %>">
                        <input type="hidden" name="task" value="Product Deleted" />
                        <input type="hidden" name="date" value="<%=(new java.util.Date()).toLocaleString()%>"/>
                    <input type="submit" value="DELETE" />
                    </form>
                    </td>
                    </tr>
            
                
                     <% } %> 
                     
                     
                
            </tbody>
        </table>
        </div>
                 
                     
    <footer>
<p class="copyright">Copyright© ARUNA TRADERS 2022  </p>
</footer>                 
    </body>
</html>
