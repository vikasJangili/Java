<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Admin Login Form</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            form {
                border: 2px solid olivedrab;
            }

            input[type=text], input[type=password] {
                width: 20%;
                padding: 10px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 2px solid mediumseagreen;
                box-sizing: border-box;
            }
            button {
                background-color: Orange;
                color: black;
                padding: 14px 20px;
                margin: 8px 0;
                border: 2px solid MintCream;
                cursor: pointer;
                width: 10%;

            }
            button:hover{
                opacity: 0.8
            }
            a:link {
                color: green;
            }
            a:visited {
                color: blue;
            }
            a:hover {
                color: red;
            }
            a:active {
                color: greenyellow;
            }

            .AdminImage {
                text-align: center;



            }
            img.logo {
                width: 10%;
                border-radius: 10%;
            }

            .psw{
                margin-left:200px;
                padding: 20%;
            }
            /*marquee tag background color*/
            #updatenews{
                background-color: orange;
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
        <script>
            function  validate() {
                var username = document.getElementById("usname");
                var password = document.getElementById("pswbtn");

                if (username.value.trim() == "") {
                    alert("username cannot be blank");
                    username.style.border = "solid 3px red ";
                    return false;
                } else if (password.value.trim() == "") {
                    alert("password cannot be blank");
                    password.style.border = "solid 3px red ";
                    return  false;
                } else if (password.value.trim().length < 5) {
                    alert("password too  short");
                    password.style.border = "solid 3px red";
                    return false;
                } else {
                    return true;
                }

            }
            function myFunction() {
                var x = document.getElementById("pswbtn");
                if (x.type === "password") {
                    x.type = "text";
                } else {
                    x.type = "password";
                }
            }
        </script>
    </head>
    <body>
        <form  action="../../LoginServlet" method="Get">
            <div class="Head">
                <a class="active" href="http://localhost:8080/UserRegistartion/View/AdminFolder/AdminLogin.html">Home</a>
                <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/About.html">About</a>
                <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/Contact.html">Contact</a>
            </div>
            <div class="AdminImage">
                <img src="/UserRegistartion/Images/Admin.jpg" alt="Admin" class="logo"/>
            </div>
            <center> <h1 id="login"> <i>Admin Login</i> </h1></center>
            <marquee id="updatenews"> <h3> <a href="../../updatenews">Click Here to Update News</a></h3></marquee>
            Username: <input type="text" id="usname" placeholder="username" name="Ladminname" required>
            <br>
            Password: <input type="password" placeholder="password" name="Lpassword" id="pswbtn" required/> 
            <input type="checkbox" onclick="myFunction()"/> Show password
            <br>
            <br>
            <br>
            <div class="container" style="background-color:darkgrey">
                <button type="reset" class="resetbtn">Reset</button><button><a href="http://localhost:8080/UserRegistartion/View/AdminFolder/AdminForgotPassword.html">Forgot password</a></button>

            </div>
            <br>
            <center> <button type="submit"  onclick="  validate()" >Login</button> <button> <a href="http://localhost:8080/UserRegistartion/View/AdminFolder/AdminRegistration.html">New Admin </a></button></center>

        </form>
    </body>
</html>
