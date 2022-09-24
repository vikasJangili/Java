<%-- 
    Document   : AdminLoginjsp
    Created on : 17-Dec-2021, 12:42:13 pm
    Author     : root
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details</title>
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
        <script>
            function Load() {
                const xhttp = new XMLHttpRequest();
                xhttp.onload = function () {
                    document.getElementById("demo").innerHTML = this.responseText;
                }
                xhttp.open("GET", "../../FirstClassServlet");
                xhttp.send();
            }
            
        </script>
    </head>

    <body>
        <div class="Head">
            <a class="active" href="http://localhost:8080/UserRegistartion/View/AdminFolder/AdminLogin.html">Home</a> 
            <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/About.html">About</a>
            <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/Contact.html">Contact</a>
            <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/AdminLogin.html">Logout</a>

            <%session.invalidate();


            %>
        </div>
        <div class="table">
            <font color="Tomato"> <center><u> <i><h1>Welcome to Panterra School</h1></i></u></center></font>
            <br>
            <% String name = null;

                //  String password="";
                Cookie[] ck = request.getCookies();
                if (ck == null) {
                    out.println("please Login First");
                } else {
                    for (Cookie cookie : ck) {
                        String temp = cookie.getName();
                        if (temp.equals("adminname")) {
                            name = cookie.getValue();
                        }
                    }

                }

                // out.println("<h3>password is " + password + "</h3>");
                out.println("<h3>welcome " + name + "</h3>");
            %>
            <u><h3> Logined as Admin</h3></u>

            
            
           
          
          
          <p id="para" >Content After Refresh</p>
          
            <table border="2" align="center">
                <tr>
                    <th>Class</th>
                    <th>No Of Students</th>
                </tr>
                <tr>
                    <td>
                        <button  onclick="Load()">Class-1</button>
                    </td>
                    <td>
                        <form action="NumberofStudentServlet">
                            <input type="submit" value="click here to view 1st class total number of students" name="1">
                        </form>
                    </td>
                <tr>
                    <td>
                        <form action="SecondClass.jsp">
                            <input type="submit" value="Class-2" >
                        </form>
                    </td>
                    <td>
                        <form action="NumberofStudentServlet">
                            <input type="submit" value="click here to view 2nd class total number of students" name="2">
                        </form>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form action="ThirdClass.jsp">
                            <input type="submit" value="Class-3">
                        </form>
                    </td>
                    <td>
                        <form action="NumberofStudentServlet">
                            <input type="submit" value="click here to view 3rd class total number of students" name="3">
                        </form>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form action="FourthClass.jsp">
                            <input type="submit" value="Class-4">
                        </form>

                    </td>

                    <td>
                        <form action="NumberofStudentServlet">
                            <input type="submit" value="click here to view 4th class total number of students" name="4">
                        </form>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form action="FifthClass.jsp">
                            <input type="submit" value="Class-5">
                        </form>
                    </td>
                    <td>
                        <form action="NumberofStudentServlet">
                            <input type="submit" value="click here to view 5th class total number of students" name="5">
                        </form>
                    </td>
                </tr>
            </table>
            <p id="demo"> </p>
        </div>
    </body>
</html>

