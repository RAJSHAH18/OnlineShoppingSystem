package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--ENROLL NO. : SR21BSIT071\n");
      out.write("    NAME       : HIRAL KOTWANI\n");
      out.write("    CLASS      : SYIT (SEM 3)\n");
      out.write("    DIV        : A\n");
      out.write("    FACULTY    : DR. RUPAL MAM\n");
      out.write("    SUBJECT    : JSP ASS 5\n");
      out.write("    AIM        : ONLINE SHOPPING SYSTEM\n");
      out.write("    DATE       : 18/11/2022\n");
      out.write("    PC NO.     : SRKI036-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CART</title>\n");
      out.write("        <style>\n");
      out.write("            .nav-bar{\n");
      out.write("                width:98%;\n");
      out.write("                position:fixed;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"text-align:center\">\n");
      out.write("        ");
      out.write("<!--ENROLL NO. : SR21BSIT071\n");
      out.write("    NAME       : HIRAL KOTWANI\n");
      out.write("    CLASS      : SYIT (SEM 3)\n");
      out.write("    DIV        : A\n");
      out.write("    FACULTY    : DR. RUPAL MAM\n");
      out.write("    SUBJECT    : JSP ASS 5\n");
      out.write("    AIM        : ONLINE SHOPPING SYSTEM\n");
      out.write("    DATE       : 18/11/2022\n");
      out.write("    PC NO.     : SRKI036-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>\n");
      out.write("        <title>NAVIGATION BAR</title>\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">--> \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: \"Poppins\", Sans-serif;\n");
      out.write("            }\n");
      out.write("            .nav-bar{\n");
      out.write("                /*width: 98%;*/\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: row;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                background-color: #34495e;\n");
      out.write("                padding: 1.2rem;\n");
      out.write("                /*position: fixed;*/\n");
      out.write("            }       \n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                all: unset;\n");
      out.write("                font-size: 1.2rem;\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a:hover{\n");
      out.write("                cursor: pointer;\n");
      out.write("                color: steelblue;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            ul{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                list-style: none;\n");
      out.write("                gap: 1.2rem;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String role = (String) session.getAttribute("role");

            if (role != null) {
                String name = (String) session.getAttribute("username");
                name = name.toUpperCase();
                if (role.equalsIgnoreCase("admin")) {
        
      out.write("            \n");
      out.write("        <nav class=\"nav-bar\">\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">E-SHOPPING</li>\n");
      out.write("            </ul>     \n");
      out.write("            <ul>\n");
      out.write("                <li class=\"active\"><a href=\"#\">HOME</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"addcategory.jsp\">CATEGORY</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"product.jsp\">PRODUCTS</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"#\">CUSTOMER ORDERS</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"logout\">LOGOUT</a></li>\n");
      out.write("                <li class=\"active\" style=\"font-weight:bold;font-size: 25px;color: #666dff; \"> WELCOME ");
      out.print(name);
      out.write("</li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

        } else if (role.equalsIgnoreCase("user")) {
        
      out.write("\n");
      out.write("        <nav class=\"nav-bar\">\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">E-SHOPPING</li>\n");
      out.write("            </ul>\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"active\"><a href=\"welcome.jsp\">HOME</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"purchase.jsp\">PURCHASE</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"cart.jsp\">CART</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"logout\">LOGOUT</a></li>\n");
      out.write("                <!--<button class=\"active\" style=\"width:100px;height:50px\"></button>-->\n");
      out.write("                <li class=\"active\" style=\"font-weight:bold;font-size: 25px;color:#666dff; \"> WELCOME ");
      out.print(name);
      out.write("</li>\n");
      out.write("\n");
      out.write("                <!--<button class=\"active\" style=\"width:100px;height:50px\">LOGOUT</button>-->\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            }
        } else {


        
      out.write("\n");
      out.write("        <nav class=\"nav-bar\">\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"logo\" style=\"font-size:2rem; font-weight: 800; color: white;\">E-SHOPPING</li>\n");
      out.write("            </ul>\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"active\"><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"register.jsp\">REGISTER</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        ");
            }

        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <center><h1>PRODUCT INFORMATION</h1></center>\n");
      out.write("        <table border=\"2px\" cellspacing=\"0px\">\n");
      out.write("            <tr style=\"height:50px\">\n");
      out.write("                <th style=\"width:5%\">IMAGE</th>\n");
      out.write("                <th style=\"width:5%\">PRODUCT NAME</th>\n");
      out.write("                <th style=\"width:10%\">DESCRIPTION</th>\n");
      out.write("                <th style=\"width:10%\">PRICE</th>\n");
      out.write("                <th style=\"width:1%\">QUANTITY</th>\n");
      out.write("                <th style=\"width:1%\">OPERATION</th>\n");
      out.write("            </tr>\n");
      out.write("        ");

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
             
            String query="SELECT * FROM register,product_table,cart WHERE cart.Product_id=product_table.Product_id AND cart.cid=id AND cart.cid="+cid;
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            int i=1;
            while(rs.next())
            {
               
        
      out.write("      \n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td><img src=\"");
      out.print(rs.getString("ImageURL"));
      out.write("\" alt=\"");
      out.print(rs.getString("Product_Name"));
      out.write("\" height=\"200px\" weight=\"200px\"></td>\n");
      out.write("                <td>");
      out.print(rs.getString("Product_Name"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("Description"));
      out.write("</td>\n");
      out.write("                <td align=\"center\" id=\"quantity");
      out.print(i++);
      out.write('"');
      out.write('>');
      out.print(rs.getInt("Price")*rs.getInt("quantity"));
      out.write("</td>\n");
      out.write("                <td ><input type=\"number\"  value=\"");
      out.print(rs.getInt("quantity"));
      out.write("\" onchange=\"check(this.value)\"></td>\n");
      out.write("                <td align=\"center\"><a href=\"cartremove?cart_id=");
      out.print(rs.getInt("cart_id"));
      out.write("\"><button>REMOVE</button></a></td>\n");
      out.write("            </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <script>\n");
      out.write("            function check(str)\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                if(str.length==0)\n");
      out.write("                {\n");
      out.write("                    document.getElementById().innerHTML=\"\";\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    var xhr=new XMLHttpRequest();\n");
      out.write("                    xhr.onload=function()\n");
      out.write("                    {\n");
      out.write("                        \n");
      out.write("                        if(this.status==200)\n");
      out.write("                        {\n");
      out.write("//                                                alert(\"hello\");\n");
      out.write("                            var qty=parseInt(this.responseText);\n");
      out.write("                            console.log(document.getElementById(\"quantity");
      out.print(i);
      out.write("\"))\n");
      out.write("                            document.getElementById(\"quantity");
      out.print(i);
      out.write("\").innerHTML=(qty * ");
      out.print(rs.getInt("price"));
      out.write(");\n");
      out.write("//                            console.log(*(this.responseText));\n");
      out.write("                        }\n");
      out.write("                         \n");
      out.write("                    };\n");
      out.write("                    xhr.open(\"GET\",\"qtyupdate?qty=\"+str+\"&cart_id=");
      out.print(rs.getInt("cart_id"));
      out.write("\",true);\n");
      out.write("                    xhr.send();\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");
      
            i++;
            }

            
        
      out.write("\n");
      out.write("        \n");
      out.write("         </table>\n");
      out.write("    </body>\n");
      out.write("</html>        \n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
