<%-- 
    Document   : FirstClass
    Created on : 17-Dec-2021, 11:34:39 am
    Author     : root
--%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.HelperClasses.FirstClassDto"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>
    <title> First class JSP Page</title>
    <style>
        .topnav {
            overflow: hidden;
            background-color: #e9e9e9;
        }
        .topnav a {
            float: left;
            display: block;
            color: black;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            font-size: 17px;
        }
        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }
        .topnav a.active {
            background-color: #2196F3;
            color: white;
        }
        /* Style the search box inside the navigation bar */


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





<hr>
<hr>

<br>
<br>
<body>
<center> <h1> Details of First Class</h1></center>
    <%
        out.println("<table border=1px solidblack align='center'>");
        out.println("<tr>");
        out.println("<th>" + "class_id" + "</th>");
        out.println("<th>" + "PreviousSchoolClass" + "</th>");
        out.println("<th>" + "PreviousSchoolName" + "</th>");
        out.println("<th>" + "PresentSchoolClass" + "</th>");
        out.println("<th>" + "FirstLanguage" + "</th>");
        out.println("<th>" + "SecondLanguage" + "</th>");
        out.println("<th>" + "ThirdLanguage" + "</th>");
        out.println("<th>" + "Student_id" + "</th>");
        out.println("</tr>");
        List<FirstClassDto> arr = (List) request.getAttribute("FirstClassList");
        for (FirstClassDto i : arr) {
            out.println("<tr>");
            out.println("<td>" + i.getClassid() + "</td>");
            out.println("<td>" + i.getPreviousschlclass() + "</td>");
            out.println("<td>" + i.getPreviousschlname() + "</td>");
            out.println("<td>" + i.getPresentschlclass() + "</td>");
            out.println("<td>" + i.getFirstlang() + "</td>");
            out.println("<td>" + i.getSecondlang() + "</td>");
            out.println("<td>" + i.getThirdlang() + "</td>");
            out.println("<td>" + i.getStudentid() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");

    %>
<br>
<br>
<br>
<form action="deleteStudent.jsp">
    <center><input type="submit" value="deleteStudent" /></center>
</form>
</body>
</html>
