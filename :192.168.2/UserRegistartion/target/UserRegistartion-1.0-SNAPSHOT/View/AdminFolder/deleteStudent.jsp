<%-- 
    Document   : deleteStudent
    Created on : 17-Dec-2021, 5:51:13 pm
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>delete Student</title>
        <style>
            .Head {
                overflow: hidden;
                background-color:lightgray;
            }

            /* Style the links inside the navigation bar */
            .Head a {
                float: left;
                display: block;
                color: black;
                text-align: center;
                padding: 14px 16px;
                text-decoration: black;
                font-size: 17px;
            }

            /* Change the color of links on hover */
            .Head a:hover {
                background-color: #ddd;
                color: black;
            }

            /* Style the "active" element to highlight the current page */
            .Head a.active {
                background-color: #2196F3;
                color: white;
            }

            </style>
    </head>
    <body>
        <form action="../../deleteServlet" method="post">
             <div class="Head">
                <a class="active" href="http://localhost:8080/UserRegistartion/View/AdminFolder/AdminLogin.html">Home</a>
                <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/About.html">About</a>
                <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/Contact.html">Contact</a>

            </div>
         <font color="Tomato"> <center><u> <i><h1>Welcome to Panterra School</h1></i></u></center></font>
         <hr>
         <hr>
         Enter Student Id : <input type="text"  id="StudentId" name="StudentId" placeholder="enter Student id" required="" />
         
        
        <br>
        <br>
       
       <center> <input type="submit" value="confirm delete" ></center>
      
        </form>
    </body>
</html>
