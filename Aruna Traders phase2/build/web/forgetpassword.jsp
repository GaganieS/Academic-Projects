
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/3.1.2/rollups/aes.js"></script>
<script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/md5.js"></script>
    </head>
    <body>
        <form action="resetpass" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        
                        <td><input required type="text" name="uname" value="" placeholder="Username" /></td>
                    </tr>
                    <tr>
                        
                        <td><input type="password"  name="password" id="psw" placeholder="New Password" value=""  /></tr>
                    <tr>
                        
                        <td><input type="password" id="rpsw" name="rpassword" value="" placeholder="Retype-Passowrd" required/></td>
                    </tr>
                    <tr>
                        <input type="hidden" name="hide" id="hide" />
                        <input type="hidden" name="task" value="Reset Password" />
                        <input type="hidden" name="date" value="<%=(new java.util.Date()).toLocaleString()%>"/>
                        <td><input type="submit" onclick="return Fun()" value="Reset Password" /></td>
                    </tr>
                </tbody>
            </table>
        </form>

 <script>
    
       function Validate() 
       {
        var password = document.getElementById("psw").value;
        var confirmPassword = document.getElementById("rpsw").value;
        if (password != confirmPassword) {
            alert('Password Does Not Match');
            
            return false;
        }
        else
        {
        return true;
        }
       }
        
    function encrypt()
	 {
        var pass=document.getElementById('psw').value;
		var hide=document.getElementById('hide').value;
		if(pass=="")
		{
		   document.getElementById('err').innerHTML='Error:Password is missing';
		   return false;
		}
		else
		{
		   document.getElementById("hide").value = document.getElementById("psw").value;
		   var hash = CryptoJS.MD5(pass);
		   document.getElementById('psw').value=hash;
                   document.resetpass[0].encrypt();
		  return true;
		}
	}


            function Fun() {
                if(Validate() && encrypt())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
    
</script>


    </body>
</html>
