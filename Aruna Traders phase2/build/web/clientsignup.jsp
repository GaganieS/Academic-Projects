

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Registration</title>
        <link rel="stylesheet" href="CSS/backup/customerregistration.css">
        <title>Filter Clients</title>
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
        
   <div class="all">     
        <center>
        <h1>CUSTOMER REGISTRATION</h1>
        

        <br>
        <form action="clientservlet" method="POST">
            <table border="0">
                <tbody>

                    <tr>
                        <td><input required type="text" class="input-box" name="fname" value="" placeholder="First Name" /></br></br></td>
                    </tr>
                    <tr>
                    <td><input required type="text" name="sname" class="input-box" value="" placeholder="Last Name "/></br></br></td>
                    </tr>
                     <tr>
                        <td><input required type="text" class="input-box" name="address" value="" placeholder="Address " /></br></br></td>
                    </tr>
                    
                    <tr>
                        <td><input required type="email" class="input-box" name="email" value="" placeholder="Email Address" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" /></br></br></td>
                    </tr>
                    <tr>
                        <td><label>Gender:</label>
                        <input type="radio" class="gender" name="gender" value="male" /><label>Male:</label>
                        <input type="radio" class="gender" name="gender" value="female" /><label>Female:</label></td>
                       
                    </tr>
                    <tr>
                        <td><input type="text" class="input-box" name="telephone"  pattern="[0-9]{3}-[0-9]{7}" value="" title="Format 077-1111111"placeholder="Telephone No" maxlength="11" required/>
                        </br></br></td>
                    </tr>
                    

                    <tr>
                        <td><input type="submit" class="btn1" value="ADD" /></td>

                    </tr>
                    
                    
                </tbody>
            </table>

        </form>
        </div >
               <script>
var myInput = document.getElementById("psw");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");

myInput.onfocus = function() {
  document.getElementById("message").style.display = "block";
}

myInput.onblur = function() {
  document.getElementById("message").style.display = "none";
}

myInput.onkeyup = function() {
  
  var lowerCaseLetters = /[a-z]/g;
  if(myInput.value.match(lowerCaseLetters)) {  
    letter.classList.remove("invalid");
    letter.classList.add("valid");
  } else {
    letter.classList.remove("valid");
    letter.classList.add("invalid");
  }

  var upperCaseLetters = /[A-Z]/g;
  if(myInput.value.match(upperCaseLetters)) {  
    capital.classList.remove("invalid");
    capital.classList.add("valid");
  } else {
    capital.classList.remove("valid");
    capital.classList.add("invalid");
  }

  var numbers = /[0-9]/g;
  if(myInput.value.match(numbers)) {  
    number.classList.remove("invalid");
    number.classList.add("valid");
  } else {
    number.classList.remove("valid");
    number.classList.add("invalid");
  }
  if(myInput.value.length >= 6) {
    length.classList.remove("invalid");
    length.classList.add("valid");
  } else {
    length.classList.remove("valid");
    length.classList.add("invalid");
  }
}
</script>
        <footer>
<p class="copyright">Copyright©  Phoenix Airlines 2021 </p>
</footer>
        </center>   
    </body>
</html>
