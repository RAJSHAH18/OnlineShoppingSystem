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
        <title>WELCOME Page</title>
        <style>
            h1
            {
                position:absolute;
                top:50%;
                left:50%;
                transform:translate(-50%,-50%);
                /*width:350px;*/
                /*background-color: white;*/
                /*border-radius:5px;*/
                font-weight: 1400;
                font-size: 50px;
                text-decoration: underline double;
                
            }
            h1:hover
            {
                color:white;
            }
            body{
                    background-image: linear-gradient(to right, #fc5c7d, #6a82fb);
            }
        </style>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        
        <h1>WELCOME TO E-SHOPPING</h1>
    </body>
</html>
