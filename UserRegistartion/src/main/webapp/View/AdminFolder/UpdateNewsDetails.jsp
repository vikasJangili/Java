<%-- 
    Document   : Details
    Created on : 16-Dec-2021, 12:44:28 pm
    Author     : root
--%>


<%@page import="com.mycompany.HelperClasses.UpdateNewsDTo"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details Page</title>
        <style>
            .details{
                background-color: white;
            }
            #table{
                background-color: blanchedalmond
            }
                .topnav {
  overflow: hidden;
  background-color: #e9e9e9;
}
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
        <div class="Head">
                <a class="" href="http://localhost:8080/UserRegistartion/View/AdminFolder/AdminLogin.html">Home</a>
                <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/About.html">About</a>
                <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/Contact.html">Contact</a>

            </div>
        <div class="details">
   <font color="darkyellow"> <center> <i><u> <h1>Welcome to panterra school</h1></i> </u></center></font>
   <marquee><h1> updated time table </h1></marquee>
   <br>
   <br>
   <hr>
   <hr>
    <table border="1solidblack" id="table" width="50%" align="center">
        <tr>
       
            <td><b>Date </b></td>
            <td><b>Day</b></td>
            <td><b>Exam name</b> </td>
            <td><b>Class</b></td>
            <td><b>Exam time</b></td>
    </tr> 

    <%
        ArrayList<UpdateNewsDTo> li = (ArrayList) (request.getAttribute("news"));
        for (UpdateNewsDTo updateNewsDTo : li) {
            out.println("<tr>");
            out.println("<td>" + updateNewsDTo.getDate() + "</td>");
            out.println("<td>" + updateNewsDTo.getDay() + "</td>");
            out.println("<td>" + updateNewsDTo.getExamname() + "</td>");
            out.println("<td>" + updateNewsDTo.getClass1() + "</td>");
            out.println("<td>" + updateNewsDTo.getExamtime() + "</td>");
            out.println("</tr>");
        }
        //out.println("</table>");


    %>
</table>
   </div>


</body>
</html>
