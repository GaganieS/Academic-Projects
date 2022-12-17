

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product Details</title>
        <link rel="stylesheet" href="CSS/backup/product.css">        
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
         
             <form action="admindashboard.jsp" method="POST">
                 <input class="back" type="submit" value="BACK">
        </form>
</div>
       <div class="all">
        <h1>Add Product Details</h1>
        <form action="product" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Product ID:</td>
                        <td><input type="text" class="input-box" name="id" value="" /></td>
                    </tr>
                   
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
                        <td><input type="text" class="input-box" name="cost" value="" /></td>
                    </tr>
                
               
                    
                </tbody>
                
            </table>

                        <input type="submit" class="btn1" value="Submit Product" />
                         
                        
        </form>
                </center> 
    </div>
      <footer>
<p class="copyright">Copyright©   ARUNA TRADERS  2022</p>
</footer> 
    </body>
</html>
