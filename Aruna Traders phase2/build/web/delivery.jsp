<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Registration</title>
        <link rel="stylesheet" href="CSS/backup/delivery.css">
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
         
             <form action="./" method="POST">
                 <input class="back" type="submit" value="BACK">
        </form>
        </div>
        
  <div class="all">
        <center><h1>Add Delivery Details</h1></center>
        <form action="delivery" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Delivery ID:</td>
                        <td><input type="text" class="input-box" name="id" value="" /><br><br></td>
                    </tr>
                   
                    <tr>
                        <td>Customer Name:</td>
                        <td><input type="text" class="input-box" name="customername" value="" /><br><br></td>
                    </tr>
                
                                     
                    <tr>
                        <td>Address:</td>
                        <td><input required type="text" class="input-box" name="address" value="" /><br><br></td>
                    </tr>
                
                    <tr>
                        <td><label>Payment Method:</label></td>
                       <td> <input type="radio" class="gender" name="payment" value="cash" /><label>Cash:</label>
                        <input type="radio" class="gender" name="payment" value="card" /><label>Card:</label></td>
                    </tr>
                    <tr>
                        <td>Delivery Charges:</td>
                        <td><input required type="text" class="input-box" name="charges" value="" placeholder="delivery charge" min="200.00" max="300.00"/></br></br></td>
                        <p>*Note: Rs.200.00 within colombo & Rs.300 out of colombo*</p>
                    </tr>
                    
               
                    
                </tbody>
                
            </table>

                        <input type="submit" class="btn1" value="Submit Delivery" /><br><br>
                         
                        
        </form>
         </div>
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
<p class="copyright">Copyright© 2021 Surge Web Bros - Phoenix Airlines  </p>
        </footer>
        </center>   
    </body>
</html>
