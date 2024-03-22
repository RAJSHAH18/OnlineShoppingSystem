<!--ENROLL NO. : SR21BSIT156
    NAME       : RAJ JIGNESHBAHI SHAH
    CLASS      : SYIT (SEM 3)
    DIV        : B
    FACULTY    : DR. RUPAL MAM
    SUBJECT    : JSP ASS 8
    AIM        : ONLINE SHOPPING SYSTEM
    DATE       : 18/11/2022
-->



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
        <title>NAVIGATION BAR</title>
        <!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--> 

        <style>
            *{
                padding: 0;
                margin: 0;
                font-family: "Poppins", Sans-serif;
            }
            .nav-bar{
                /*width: 98%;*/
                display: flex;
                flex-direction: row;
                justify-content: space-between;
                align-items: center;
                background-color: #000000;
                padding: 1.2rem;
                color:white;
                /*position: fixed;*/
            }       
            
            a{
                all: unset;
                font-size: 1.2rem;
                font-weight: 600;
            }
            
            a:hover{
                cursor: pointer;
                color: steelblue;
            }
           
            ul{
                display: flex;
                align-items: center;
                list-style: none;
                gap: 1.2rem;
            }
           
            
        </style>
    </head>
    <body>
        <%
            String role = (String) session.getAttribute("role");

            if (role != null) {
                String name = (String) session.getAttribute("username");
                name = name.toUpperCase();
                if (role.equalsIgnoreCase("admin")) {
        %>            
        <nav class="nav-bar">
            <ul>
                <li class="logo" style="font-size:2rem; font-weight: 800; color: white;">E-SHOPPING</li>
            </ul>     
            <ul>
                <li class="active"><a href="#">HOME</a></li>
                <li class="active"><a href="addcategory.jsp">CATEGORY</a></li>
                <li class="active"><a href="product.jsp">PRODUCTS</a></li>
                <li class="active"><a href="#">CUSTOMER ORDERS</a></li>
                <li class="active"><a href="logout">LOGOUT</a></li>
                <li class="active" style="font-weight:bold;font-size: 25px;color: #666dff; "> WELCOME <%=name%></li>

            </ul>

        </nav>


        <%
        } else if (role.equalsIgnoreCase("user")) {
        %>
        <nav class="nav-bar">
            <ul>
                <li class="logo" style="font-size:2rem; font-weight: 800; color: white;">E-SHOPPING</li>
            </ul>
            <ul>
                <li class="active"><a href="welcome.jsp">HOME</a></li>
                <li class="active"><a href="purchase.jsp">PURCHASE</a></li>
                <li class="active"><a href="cart.jsp">CART</a></li>
                <li class="active"><a href="logout">LOGOUT</a></li>
                <!--<button class="active" style="width:100px;height:50px"></button>-->
                <li class="active" style="font-weight:bold;font-size: 25px;color:#666dff; "> WELCOME <%=name%></li>

                <!--<button class="active" style="width:100px;height:50px">LOGOUT</button>-->

            </ul>

        </nav>


        <%
            }
        } else {


        %>
        <nav class="nav-bar">
            <ul>
                <li class="logo" style="font-size:2rem; font-weight: 800; color: white;">E-SHOPPING</li>
            </ul>
            <ul>
                <li class="active"><a href="index.jsp">HOME</a></li>
                <li class="active"><a href="register.jsp">REGISTER</a></li>
                <li class="active"><a href="login.jsp">LOGIN</a></li>

            </ul>

        </nav>
        
        <%            }

        %>
    </body>
</html>
