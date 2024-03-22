package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("wq\\77777777777777777777777<!--ENROLL NO. : SR21BSIT156\n");
      out.write("    NAME       : RAJ JIGNESHBAHI SHAH\n");
      out.write("    CLASS      : SYIT (SEM 3)\n");
      out.write("    DIV        : B\n");
      out.write("    FACULTY    : DR. RUPAL MAM\n");
      out.write("    SUBJECT    : JSP ASS 8\n");
      out.write("    AIM        : ONLINE SHOPPING SYSTEM\n");
      out.write("    DATE       : 18/11/2022\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ADD PRODUCT PAGE</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
            
            
            
        
      out.write("\n");
      out.write("        <h1>ADD NEW PRODUCT</h1>\n");
      out.write("        <hr>\n");
      out.write("        <form action=\"addproduct\" method=\"POST\" enctype=\"multipart/form-data\" >\n");
      out.write("            <table cellspacing=\"0px\" cellpadding=\"10px\" style=\"text-align: left\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>PRODUCT NAME</th>\n");
      out.write("                    <td><strong>:</strong></td>\n");
      out.write("                    <td><input type=\"text\" name=\"pname\" placeholder=\"ENTER PRODUCT NAME\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>PRODUCT CATEGORY</th>\n");
      out.write("                    <td><strong>:</strong></td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"catid\" required>\n");
      out.write("                            <option value=\"\" selected disabled hidden>SELECT CATEGORY</option>\n");
      out.write("          ");

                                String query="SELECT * FROM category_table";
                                Statement st=con.createStatement();
                                ResultSet rs=st.executeQuery(query);
                                while(rs.next())
                                {
            
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(rs.getInt("Category_ID"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("Category_Name"));
      out.write("</option>\n");
      out.write("                                \n");
      out.write("            \n");
      out.write("           ");
 
                                }
                                


          
      out.write("                      \n");
      out.write("                        </select>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>PRODUCT DESCRIPTION</th>\n");
      out.write("                    <td><strong>:</strong></td>\n");
      out.write("                    <!--<td><input type=\"text\" name=\"description\" placeholder=\"ENTER PRODUCT NAME\" required></td>-->\n");
      out.write("                    <td><textarea rows=\"6\" cols=\"\" placeholder=\"ENTER DESCRIPTION\" name=\"description\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>PRODUCT IMAGE</th>\n");
      out.write("                    <td><strong>:</strong></td>\n");
      out.write("                    <td><input type=\"file\" name=\"img\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>PRODUCT PRICE</th>\n");
      out.write("                    <td><strong>:</strong></td>\n");
      out.write("                    <td><input type=\"text\" name=\"price\" placeholder=\"ENTER PRICE\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" style=\"text-align:right \"><input type=\"submit\" value=\"SUBMIT\" ></td>\n");
      out.write("                    <td>\n");
      out.write("                            <button><a href=\"welcome.jsp\" style=\"text-decoration: none;color:black\">BACK</a></button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");

    }
    catch(Exception e)
    {
        out.println(e.getMessage());
    
    }

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
