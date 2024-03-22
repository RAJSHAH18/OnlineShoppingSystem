<!--ENROLL NO. : SR21BSIT156
    NAME       : RAJ JIGNESHBAHI SHAH
    CLASS      : SYIT (SEM 3)
    DIV        : B
    FACULTY    : DR. RUPAL MAM
    SUBJECT    : JSP ASS 8
    AIM        : ONLINE SHOPPING SYSTEM
    DATE       : 18/11/2022
-->



<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PURCHASE Page</title>
        <!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--> 
        <!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">-->
        <style>
            *, *::before, *::after {box-sizing: border-box;}
            .nav-bar
            {
                position:fixed;
                width:100%;
            }
            .container{
                text-align: center;
                padding:10px;
            }

            .main{
                display: grid;
                grid-template-columns: repeat(3, 1fr);
                padding: 1.2rem;
            }
            p{
                text-align: left;
            }
            img{
                object-fit: contain;
            }

            button{
                all: unset;
                cursor:pointer;
                color: black;
                background-color: rgba(0,0,0,20%);
                padding: .25rem .50rem .25rem .50rem;
                border-radius: 1.5rem;
                transition: all 250ms ease-in;
            }

            button:hover{
                background-color: rgba(0,0,0,25%);
            }
        </style>
    </head>

    <body>
        <%@include file="navbar.jsp"%>
        <br><br><br><br>

    <center><h1 style="margin: 30px 0 40px 0;">SHOP PRODUCTS</h1></center>
        <%        Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping system", "root", "");

            //    if(con!=null)
            //    {
            //        out.println("Connected");
            //    }
            //    else
            //    {
            //        out.println("Not Connected");
            //    }
            String added = (String) session.getAttribute("added");
            if (added != null) {
                out.println("<script>alert('" + added + "')</script>");
                session.removeAttribute("added");
            }

            String failed = (String) session.getAttribute("failed");
            if (failed != null) {
                out.println("<script>alert('" + failed + "')</script>");
                session.removeAttribute("failed");
            }

            String qry = "SELECT * FROM category_table";
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(qry);
            while (r.next()) {


        %>

    <div class="main">

        <%        String query = "SELECT * FROM product_table WHERE Category_ID=" + r.getInt("Category_ID");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
        %>       

        <div class="container">
            <form action="cart?pid=<%=rs.getInt("Product_id")%>" method="POST">

                <img src="<%=rs.getString("ImageURL")%>"alt="<%=rs.getString("Product_Name")%>" height="200px" width="200px">
                <br>
                <h3><%=rs.getString("Product_Name")%></h3>
                <br>
                <h3>&#8377;<%=rs.getString("Price")%></h3>
                <input type="hidden" name="price" value="<%=rs.getString("Price")%>">
                <br>
                <p> <%=rs.getString("Description")%></p>
                <br>
                <input type="number" name="qty" placeholder="Enter Quantity"> 
                <button type="submit">ADD TO CART</button></a>
            </form>
        </div>
        <%
            }


        %>
    </div>
    <%    }
    %>

</body>
</html>
