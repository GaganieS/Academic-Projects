

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff One Dashboard</title>
         <link rel="stylesheet" href="StaffOneDashboard/staffdash.css">
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
<!--        <div>
<nav>
</nav>
</div>	
<div class="text">
<pre><font size="3" face="Lucida Sans, Noto Sans Armenian" color="#282828"><font color="#E50914"><b>  PHOENIX</b></font> AIRLINES</font></pre>        
</div>
        
<div class="welcome">
            <h1><% 
        if(request.getParameter("email") == null)
    {
        out.println("Welcome"); 
    }
    else
    {
        String name = request.getParameter("email");
        out.println("Welcome "+name); }%></h1>
            </div>    
            
         <form action="flight.jsp">
            <input class="addflight" type="image" value="Add Flights" src="ClientDashboard/link.png" />
        </form>
        <span class="viewflights-title">View Flights</span>
            
            
            <form action="flightview" method="POST">
            <input type="hidden" name="task" value="Viewed Flight Details" />
            <input type="hidden" name="date" value="<%=(new java.util.Date()).toLocaleString()%>"/>
            <input class="viewflight" type="image" value="Flight Details" alt="submit" src="ClientDashboard/link.png" />
        </form>
        <span class="addflights-title">Add Flights</span>
            
           
        <form action="flightsedit.jsp" method="POST">
            <input class="editflights" type="image" value="flightsedit" alt="submit" src="ClientDashboard/link.png" />
        </form>
        <span class="editflights-title">Edit Flights</span>
           
        
        <form action="viewticket" method="POST">
            <input type="hidden" name="task" value="Viewed Ticket Details" />
            <input type="hidden" name="date" value="<%=(new java.util.Date()).toLocaleString()%>"/>
            <input class="viewtickets" type="image" value="viewticket" alt="submit" src="ClientDashboard/link.png" />
        </form>
        <span class="viewtickets-title">View Tickets</span>
        
        <form action="ticket.jsp" method="POST">
            <input class="edittickets" type="image" value="ticket" alt="submit" src="ClientDashboard/link.png" />
        </form>
        <span class="edittickets-title">Edit Tickets</span>
        
        <form action="viewclients" method="POST">
            <input type="hidden" name="task" value="Viewed Client Details" />
            <input type="hidden" name="date" value="<%=(new java.util.Date()).toLocaleString()%>"/>
            <input class="clients" type="image" value="viewclients" alt="submit" src="ClientDashboard/link.png" />
        </form>
            <span class="clients-title">Client Details</span>
            
        <form action="editclient.jsp" method="POST">
            <input class="editclients" type="image" value="clientdetailedit" alt="submit" src="ClientDashboard/link.png" />
        </form>
            <span class="editclients-title">Edit Client</span>
        
        <form action="chatstaff" method="POST">
            <input class="chat" type="image" value="chatstaff" alt="submit" src="ClientDashboard/link.png" />
        </form>
        <span class="chat-title">Chat</span>    
        
        -------------------------------------------------------------------------------------------------------------------------------------
<div>                        
         
             <form action="stafflogout" method="POST">
                 <input class="logout-btn" type="submit" value="Logout">
        </form>
</div>
        
        
        <div>
        <form action="reply" method="POST">
            <input type="hidden" name="task" value="Viewed Client Dashboard" />
            <input type="hidden" name="date" value="<%=(new java.util.Date()).toLocaleString()%>"/>
            <input class="clientdash-btn" type="submit" value="Client Dashboard" />
        </form>
        </div><br>
        
        
        
    <footer>
<div class="logo">
<img src="ClientDashboard/logo.png"  style="width:400px;height:200px;">
</div>
    

<p class="copyright">Copyright© 2021 Surge Web Bros - Phoenix Airlines  </p>
</footer>   -->
        
        
  
        <div class="one">                        

            <form action="clientsignup.jsp">
                <input type="image" src="Images/customer.jpg" class="img1">
            </form>
            <span class="title1"><h1>Customer</br>Registration</h1></span>
        </div>    

        <div class="two">                        

            <form action="order.jsp">
                <input type="image" src="Images/order.jpg" class="img2">
            </form>
            <span class="title2"><h1>Order</h1></span>
        </div>    

        <div class="three">                        

            <form action="payment.jsp">
                <input type="image" src="Images/payment.jpg" class="img3">
            </form>
            <span class="title3"><h1>Payment</h1></span>
        </div>    

        <div class="four">                        

            <form action="delivery.jsp">
                <input type="image" src="Images/Delivery.jpg" class="img4">
            </form>
            <span class="title4"><h1>Delivery</h1></span>
        </div>    

        <div class="five">                        

            <form action="productedit.jsp">
                <input type="image" src="Images/inventory.jpg" class="img5">
            </form>
            <span class="title5"><h1>Inventory</h1></span>
        </div>    
        
    </body>
</html>
