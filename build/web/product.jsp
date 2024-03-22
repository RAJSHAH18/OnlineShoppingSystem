wq\77777777777777777777777<!--ENROLL NO. : SR21BSIT156
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
        <title>ADD PRODUCT PAGE</title>
    </head>
    <body>
        <%
            try
            {
                Connection con=null;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping system","root","");
                
//                if(con!=null)
//                {
//                    out.println("Connected");
//                }
//                else
//                {
//                    out.println("Not Connected");
//                }
            
            
            
        %>
        <h1>ADD NEW PRODUCT</h1>
        <hr>
        <form action="addproduct" method="POST" enctype="multipart/form-data" >
            <table cellspacing="0px" cellpadding="10px" style="text-align: left">
                <tr>
                    <th>PRODUCT NAME</th>
                    <td><strong>:</strong></td>
                    <td><input type="text" name="pname" placeholder="ENTER PRODUCT NAME" required></td>
                </tr>
                <tr>
                    <th>PRODUCT CATEGORY</th>
                    <td><strong>:</strong></td>
                    <td>
                        <select name="catid" required>
                            <option value="" selected disabled hidden>SELECT CATEGORY</option>
          <%
                                String query="SELECT * FROM category_table";
                                Statement st=con.createStatement();
                                ResultSet rs=st.executeQuery(query);
                                while(rs.next())
                                {
            %>
                                    <option value="<%=rs.getInt("Category_ID")%>"><%=rs.getString("Category_Name")%></option>
                                
            
           <% 
                                }
                                


          %>                      
                        </select>
                </tr>
                <tr>
                    <th>PRODUCT DESCRIPTION</th>
                    <td><strong>:</strong></td>
                    <!--<td><input type="text" name="description" placeholder="ENTER PRODUCT NAME" required></td>-->
                    <td><textarea rows="6" cols="" placeholder="ENTER DESCRIPTION" name="description"></textarea></td>
                </tr>
                <tr>
                    <th>PRODUCT IMAGE</th>
                    <td><strong>:</strong></td>
                    <td><input type="file" name="img" required></td>
                </tr>
                <tr>
                    <th>PRODUCT PRICE</th>
                    <td><strong>:</strong></td>
                    <td><input type="text" name="price" placeholder="ENTER PRICE" required></td>
                </tr>
                <tr>
                    <td align="center" style="text-align:right "><input type="submit" value="SUBMIT" ></td>
                    <td>
                            <button><a href="welcome.jsp" style="text-decoration: none;color:black">BACK</a></button>
                    </td>
                </tr>
                
            </table>
        </form>
    </body>
</html>


<%
    }
    catch(Exception e)
    {
        out.println(e.getMessage());
    
    }
%>