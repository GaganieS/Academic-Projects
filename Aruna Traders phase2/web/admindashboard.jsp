

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file= "adminsession.jsp"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator Dashboard </title>
         <link rel="stylesheet" href="AdminDashboard/admindash.css">
        <style>
    footer
    {
        position: absolute;
        height: 300px;
        width: 100%;

    }

    p.copyright {
        position: fixed;
        width: 100%;
        color: #fff;
        line-height: 40px;
        font-size: 0.7em;
        text-align: center;
        bottom:0;
    }
</style>
    </head>
    
    
    
    <body>

        
<div class="one">                        
         
             <form action="adminstaffsignup.jsp">
                 <input type="image" src="Images/employee.jpg" class="img1">
        </form>
    <span class="title1"><h1>Employee</h1></span>
</div>       

        
        
<div class="two">                        
         
             <form action="product.jsp" method="POST">
                 <input class="img2" type="image" src="Images/product.jpg">
        </form>
<span class="title2"><h1>Product</h1></span>
</div>   
        
        
<div class="three">                        
         
             <form action="productedit.jsp">
                 <input class="img3" type="image" src="Images/inventory.jpg">
        </form>
    <span class="title3"><h1>Inventory</h1></span>
</div>
        
        


<p class="copyright">Copyright© ARUNA TRADERS 2022 </p>
</footer>    -->
    </body>
</html>
