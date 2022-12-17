<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Order Details</title>
        <link rel="stylesheet" href="CSS/clientregistration.css">        
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
        <center>
        <div class="back">                        
         
             <form action="staffdashboard.jsp" method="POST">
                 <input class="back" type="submit" value="BACK">
        </form>
        </div>
       <div class="all">
        <h1>Add Order Details</h1>
        <form action="order" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Order ID:</td>
                        <td><input type="text" class="input-box" name="id" value="" /><br><br></td>
                    </tr>
                   
                    <tr>
                        <td>Customer Name:</td>
                        <td><input type="text" class="input-box" name="customername" value="" /><br><br></td>
                    </tr>
                
                                     
                    <tr>
                        <td>Ordered Date:</td>
                        <td><input required type="date" class="input-date" name="date" value="" /><br><br></td>
                    </tr>
                
                    <tr>
                        <td>Total Price:</td>
                        <td><input type="text" class="input-box" name="price" value="" /><br><br></td>
                    </tr>
                
               
                    
                </tbody>
                
            </table>

                        <input type="submit" class="btn1" value="Submit Order" /><br><br>
                         
                        
        </form>
         </div>
                </center>  
      <footer>
<p class="copyright">Copyright©   ARUNA TRADERS  2022</p>
</footer> 
   
    </body>
</html>
