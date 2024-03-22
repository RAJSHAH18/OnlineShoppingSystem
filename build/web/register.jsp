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
        <title>REGISTER</title>
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
                    width:480px;
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

        
<!--        <div></div>
        <form action="register" method="POST">
            NAME:
            <div class="container">
                <input type="text" name="name" placeholder="ENTER NAME...">
            </div>
            EMAIL:
            <div class="container">
                <input type="email" name="email" placeholder="ENTER EMAIl...">
            </div>
            PASSWORD:
            <div class="container">
                <input type="password" name="password" placeholder="ENTER PASSWORD...">
            </div>
             CONFIRM PASSWORD:
            <div class="container"> 
                <input type="password" name="cnpassword" placeholder="ENTER CONFIRM PASSWORD...">
            </div>   
             <div class="container"> 
                <input type="submit" name="submit" value="REGISTER">
            </div>
        </form>-->
        
        
        <form action="register" method="post" autocomplete="OFF">
            <div class="center">
                <h1>REGISTER</h1>
        <%
            String error=(String)session.getAttribute("error");
            if(error!= null)
            {
        %>  
        <div class="alert alert-danger" role="alert"><%=error%></div>
            
        <%        
            }
            session.removeAttribute("error");

        %>
        
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
            String exist=(String)session.getAttribute("exist");
            if(exist!= null)
            {
        %>  
        <div class="alert alert-danger" role="alert"><%=exist%></div>
            
        <%        
            }
            session.removeAttribute("exist");

        %>
        
        <%
            String success=(String)session.getAttribute("success");
            if(success!= null)
            {
        %>  
            <div class="alert alert-success" role="alert"><%=success%><a href="login.jsp">LOGIN HERE</a></div>
            
        <%        
            }
            session.removeAttribute("success");

        %>
        
         <%
            String failed=(String)session.getAttribute("success");
            if(failed!= null)
            {
        %>  
        <div class="alert alert-danger" role="alert"><%=failed%></div>
            
        <%        
            }
            session.removeAttribute("failed");

        %>
        
                <div class="form">

                    <input type="text" name="name" class="textfield" placeholder="Name">          
                    <input type="email" name="email" class="textfield" placeholder="EMAIL">
                    <input type="password" name="password" class="textfield" placeholder="PASSWORD">
                    <input type="password" name="cnpassword" class="textfield" placeholder=" CONFIRM PASSWORD">

        <!--            <div class="forget">
                        <a href="#" class="link" onclick="alert('PLEASE THINK YOUR PASSWORD')">Forget Your Password ?</a>
                    </div>-->
                    <div>
                        <input type="submit" class="btn" name="submit" value="REGISTER"> 
                    </div>    
<!--                    <div class="signup">
                    New Member <a href="" class="link">Sign Up Here?</a>
                    </div>      -->
                </div>
            </div>
        </form>
    </body>
</html>
