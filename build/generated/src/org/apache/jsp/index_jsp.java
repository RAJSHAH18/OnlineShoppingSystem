package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--ENROLL NO. : SR21BSIT156\n");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>INDEX PAGE</title>\n");
      out.write("        <style>\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                position:absolute;\n");
      out.write("                top:50%;\n");
      out.write("                left:50%;\n");
      out.write("                transform:translate(-50%,-50%);\n");
      out.write("                /*width:350px;*/\n");
      out.write("                /*background-color: white;*/\n");
      out.write("                /*border-radius:5px;*/\n");
      out.write("                font-weight: 1400;\n");
      out.write("                font-size: 50px;\n");
      out.write("                text-decoration: underline double;\n");
      out.write("                background-image: linear-gradient(to right, #fc5c7d, #6a82fb);\n");
      out.write("            }\n");
      out.write("            h1:hover\n");
      out.write("            {\n");
      out.write("                    color:white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      out.write("<!--ENROLL NO. : SR21BSIT156\n");
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
      out.write("\n");
      out.write("        <h1>ONLINE SHOPPING SYSTEM</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
