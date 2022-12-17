

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" href="CSS/flight.css">        
        <style>
    

    p.copyright {
        position: fixed;
        width: 100%;
        left: 0%;
        
        opacity: 0.95;
        color: #fff;
        line-height: 50px;
        font-size: 0.7em;
        text-align: center;
        bottom:-2%;
        z-index: 9999;
    }
</style>
    </head>
    
    
    
    <body>
        <!--<div class="back">                        
         
             <form action="staffdashboard.jsp" method="POST">
                 <input class="back" type="submit" value="BACK">
        </form>
</div>-->
        <center>
            
            <h1>Update Product Details - <font color="#000"><% out.println(request.getParameter("id")); %></font></h1>
        <hr style="width:20%;height:0.5px;;color:black;">
        <br><br>
        
      
        <form action="updateproduct" method="POST">
            <table border="0">
                <tbody>
                                       
                    <tr>
                        <td>Item Name:</td>
                        <td><input type="text" class="input-box" name="itemname" value="" /></td>
                    </tr>
                
                    <tr>
                        <td>Quantity:</td>
                        <td><input type="text" class="input-box" name="quantity" value="" /></td>
                    </tr>
                 
                    <tr>
                        <td>Manufacture Date:</td>
                        <td><input required type="date" class="input-date" name="date" value="" /></td>
                    </tr>
                
                    <tr>
                        <td>Cost:</td>
                        <td><input type="text" class="input-box" name="cost" value="" />
                        <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
                        </td>
                    </tr>
                
               
                    
                </tbody>
                
            </table>

                        <input type="submit" class="book" value="Submit Product" />
                         <input type="reset" class="book2" value="Cancel" />
                        
        </form>
                </center>  
      <footer>
<p class="copyright">Copyright©   ARUNA TRADERS  2022</p>
</footer> 
    </body>
</html>

