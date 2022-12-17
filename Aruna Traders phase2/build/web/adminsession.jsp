

<%@page import = "java.io.*,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Session</title>
    </head>
    <body>
        <%
            HttpSession s3 = request.getSession(false);
            if(s3.getAttribute("uid") != null)
            {
               
                
               
            } 
     
            else
            {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Only Admin Can Access This Site')");
                    out.println("location='adminlogin.jsp';");
                    out.println("</script>");
            }

        %> 


        
    </body>
</html>

