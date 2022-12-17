

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator Login</title>
        <link rel="stylesheet" href="AdminLogin/login.css">
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

        <div class="container"></br></br>
<font size="6px"><b><center>ADMIN</center></b></font></br>
<form action="./adminlogin" method="POST">

<center><input type="text" name="uid" value="" placeholder="        User Name" class="un" required /></center></br>


   <center> <input type="password" name="password" value="" placeholder="        Password" class="un" required /></center></br>
  

<form action="admindashboard.jsp">
<center><input type="submit" class="btn" value="LOGIN"></br></br></center>
<font size="2px"><center><a href="">Forgot Password?</a></center></font>
</form>
</form>
</div>                       
                        

        <br>
<footer>
<p class="copyright">Copyright©  Phoenix Airlines  2022</p>
</footer>
    </form>
        
    </body>
</html>
