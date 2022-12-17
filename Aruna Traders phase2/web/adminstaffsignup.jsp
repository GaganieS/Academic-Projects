

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin-Staff Add</title>
        <link rel="stylesheet" href="CSS/adminstaffsignup.css">        
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
<div class="back">                        
         
             <form action="admindashboard.jsp" method="POST">
                 <input class="back" type="submit" value="BACK">
        </form>
</div>
        <center>
<div class="all">
         <h1><b> EMPLOYEE </b></h1>

     
       
        <form action="adminstafff" method="POST">
            <table border="0">
                <tbody>
                    <tr>

                        <td><input type="text" class="input-box" name="fname" value="" placeholder="        First Name" /> <br><br></td>
                        
                    </tr>
                    
                    <tr>
                    <td><input type="text" class="input-box" name="sname" value="" placeholder="        Surname Name"  /> <br><br></td>
                    </tr>
                    
                    <tr>

                        <td><input required type="email" class="input-box" name="email" value="" placeholder="        www@mail.com" /><br> <br></td>
                    </tr>
                    <tr>

                        <td><input required type="password" class="input-box" name="spassword" value="" placeholder="        Password"/> <br><br></td>
                    </tr>
                    <tr>
                        <td><input type="text" class="input-box" name="telephone" value="" placeholder="        Contact Number"/> <br><br></td>
                    </tr>
                     <tr>
                    
                        <td><br><br><br></br><input type="submit" class="book" value="ADD" /></td>

                    </tr>
                    
                </tbody>
            </table>
            </form>
 </div>
             </center>
       <footer>
<p class="copyright">Copyright©   Phoenix Airlines 2022 </p>
</footer>
    </body>
</html>
