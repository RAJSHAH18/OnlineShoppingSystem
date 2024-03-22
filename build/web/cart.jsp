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
        <title>CART</title>
        <style>
            .nav-bar{
                width:98%;
                position:fixed;
            }
        </style>
    </head>
    
    <body style="text-align:center">
        <%@include file="navbar.jsp"%>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <center><h1>PRODUCT INFORMATION</h1></center>
        <table border="2px" cellspacing="0px">
            <tr style="height:50px">
                <th style="width:5%">IMAGE</th>
                <th style="width:5%">PRODUCT NAME</th>
                <th style="width:10%">DESCRIPTION</th>
                <th style="width:10%">PRICE</th>
                <th style="width:1%">QUANTITY</th>
                <th style="width:1%">OPERATION</th>
            </tr>
        <%
            String remove =(String)session.getAttribute("remove");

             if (remove != null) {
                out.println("<script>alert('"+remove+"')</script>");
                session.removeAttribute("remove");
            }

            String fail = (String) session.getAttribute("fail");
            if (fail != null) {
                out.println("<script>alert('" + fail + "')</script>");
                session.removeAttribute("remove");
            }
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping system","root","");
//            if(con!=null)
//            {
//                out.println("Connected");
//            }
             String id=(String)session.getAttribute("id");
             int cid=Integer.parseInt(id);
            int total=0;
            String query="SELECT * FROM register,product_table,cart WHERE cart.Product_id=product_table.Product_id AND cart.cid=id AND cart.cid="+cid;
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            int i=1;
            while(rs.next())
            {
                total=total+rs.getInt("total");
               
        %>      
            <tr>
                
                <td><img src="<%=rs.getString("ImageURL")%>" alt="<%=rs.getString("Product_Name")%>" height="200px" weight="200px"></td>
                <td><%=rs.getString("Product_Name")%></td>
                <td><%=rs.getString("Description")%></td>
                <td align="center" id="quantity<%=rs.getInt("cart_id")%>"><%=rs.getInt("Price")*rs.getInt("quantity")%></td>
                <td > <%=rs.getInt("quantity")%></td>
                <td align="center"><a href="cartremove?cart_id=<%=rs.getInt("cart_id")%>"><button>REMOVE</button></a></td>
            </tr>
                
                
        
        
       
<!--        <script>
            function check(str,id)
            {
                console.log(id);
                 console.log(document.getElementById("quantity<%=rs.getInt("cart_id")%>"));
                if(str.length==0)
                {
                    document.getElementById("quantity<%=rs.getInt("cart_id")%>").innerHTML="";
                }
                else
                {
                    var xhr=new XMLHttpRequest();
                    xhr.onload=function()
                    {
                        
                        if(this.status==200)
                        {
//                                                alert("hello");
                            var qty=parseInt(this.responseText);
                            console.log(document.getElementById("quantity<%=i%>"))
                            document.getElementById("quantity<%=rs.getInt("cart_id")%>").innerHTML=(qty * <%=rs.getInt("price")%>);
//                            console.log(*(this.responseText));
                        }
                         
                    };
                    xhr.open("GET","qtyupdate?qty="+str+"&cart_id=<%=rs.getInt("cart_id")%>",true);
                    xhr.send();
                    
                }
               
            }
        </script>-->
        <%      
//            i++;
            }

            
        %>
            <tr>
                <td colspan="6" align="center" >TOTAL PRICE = &#8377;<%=total%></td>
            </tr>
         </table>
    </body>
</html>        

