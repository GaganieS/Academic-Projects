
<%@page import="java.util.Date"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Staff Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="StaffLogin/login.css">
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
<!--        <div class="logo">
            <a href="index.html">
            <img src="StaffLogin/logo.png"  style="width:150px;height:75px">
            </a>
</div>-->

<div class="container">
</br></br><font size="6px"><b><center>STAFF</center></b></font></br>
<form action="staffone" method="POST">

<center><input type="text" name="email" value="" placeholder="        Email" class="un" required /></center>

<br>
<center><input type="password" name="password" value="" placeholder="        Password" class="un" required /></center>
<!--<input type="hidden" name="date" value="<%= new Date(session.getCreationTime()) %>">-->
<!--<select class="input-box" name="type" required>
                                <option value="">Select Category</option>
                                <option value="staff1">Staff 1</option>
                                <option value="staff2">Staff 2</option>
                            </select>-->

<br>
<form action="staffdashboard.jsp">
    <center><button class="btn">Login</button></center></br>
<font size="2px"><center><a href="">Forgot Password?</a></center></font>
</form>
</form>
</div>
<div class="register">
<a href=""> &nbsp;<br> Forgot Password?</a>
</div>




<br>
<!--<footer>
<p class="copyright">Copyright© 2021 Surge Web Bros - Phoenix Airlines  </p>
</footer>-->
    </body>
</html>
