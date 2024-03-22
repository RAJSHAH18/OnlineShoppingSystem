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
        <title>ADD CATEGORY PAGE</title>
        <style>
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
        </style>
    </head>
    <body>
        
        
        <form action="addcategory" method="POST">
            <div class="center">
            <fieldset style="width:350px;height:160px;" >
                <legend align="center"> Add Category</legend>
                <table cellspacing="0px" cellpadding="10px" style="padding-top: 20px">
                    <tr>
                        <th>CATEGORY NAME : </th>
                        <td><input type="text" name="catname" placeholder="Enter Category Name" required></td>
                    </tr>
                    <tr>
                        <td align="center" style="text-align:right">
                            <input type="submit" name="submit" value="SUBMIT">
                        </td> 
                        <td>
                            <button><a href="welcome.jsp" style="text-decoration: none;color:black">BACK</a></button>
                        </td>
                    </tr>
                </table>
            </fieldset>
          </div>
        </form>
    </body>
</html>
