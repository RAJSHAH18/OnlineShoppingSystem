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
        <title>LOGIN</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> 

               <style>
            body{
                margin:0;
                padding:0;
                background-color: #D071f9;
            }
            .center
            {
                position:absolute;
                top:50%;
                left:50%;
                transform:translate(-50%,-50%);
                width:350px;
                background-color: white;
                border-radius:5px;

            }
            .center h1{
                text-align:center;
                padding:20px;
                border-bottom:2px solid silver;
            }
            .form{
                padding-bottom: 15px;
                margin:20px;
                text-align: center;

            }
            .textfield
            {
                width:100%;
                height:50px;
                font-size:18px;
                border:2px solid #D071f9;
                border-radius:5px;
                box-sizing: border-box;
                padding-left:10px;
                margin:7px 0px;
            }
            .btn
            {
                width:100%;
                height:50px;
                background-color: #D071f9;
                border-radius: 5px;
                font-size: 20px;
                margin:7px 0px;
                color:white;
                border:0;
                cursor:pointer;
            }
            .btn:hover{
                background-color: #0a63d8;
            }




            .link
            {
                font-size: 16px;
                padding:4px 0px;
                margin:3px;
            }



            @media (max-width:  420px)
            {
                .center{
                    width:88%;
                }
            }

        </style>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
    <form action="login" method="post" autocomplete="OFF">
            <div class="center">
                <h1>LOGIN</h1>
        <%
            String n=(String)session.getAttribute("e");
            if(n!= null)
            {
        %>  
        <div class="alert alert-danger" role="alert"><%=n%></div>
            
        <%        
            }
            session.removeAttribute("e");

        %>
        
        <%
            String failed=(String)session.getAttribute("failed");
            if(failed!= null)
            {
        %>  
        <div class="alert alert-danger" role="alert"><%=failed%></div>
            
        <%        
            }
            session.removeAttribute("failed");

        %>
        
                <div class="form">

                            <input type="email" name="email" class="textfield" placeholder="Email-ID">
                            <input type="password" name="password" class="textfield" placeholder="Password">
                        <div class="forget">
                            <a href="#" class="link" onclick="alert('PLEASE THINK YOUR PASSWORD')">Forget Your Password ?</a>
                        </div>
                        <div>
                            <input type="submit" class="btn" name="submit" value="LOGIN"> 
                        </div>    
                        <div class="signup">
                            New Member <a href="register.jsp" class="link">Sign Up Here?</a>
                        </div>      
                </div>

            </div>
</form>
    </body>
</html>
