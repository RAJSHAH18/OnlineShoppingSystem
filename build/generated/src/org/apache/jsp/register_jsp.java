package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>REGISTER</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\"> \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                    margin:0;\n");
      out.write("                    padding:0;\n");
      out.write("                    background-color: #D071f9;\n");
      out.write("                }\n");
      out.write("                .center\n");
      out.write("                {\n");
      out.write("                    position:absolute;\n");
      out.write("                    top:50%;\n");
      out.write("                    left:50%;\n");
      out.write("                    transform:translate(-50%,-50%);\n");
      out.write("                    width:480px;\n");
      out.write("                    background-color: white;\n");
      out.write("                    border-radius:5px;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                .center h1{\n");
      out.write("                    text-align:center;\n");
      out.write("                    padding:20px;\n");
      out.write("                    border-bottom:2px solid silver;\n");
      out.write("                }\n");
      out.write("                .form{\n");
      out.write("                    padding-bottom: 15px;\n");
      out.write("                    margin:20px;\n");
      out.write("                    text-align: center;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                .textfield\n");
      out.write("                {\n");
      out.write("                    width:100%;\n");
      out.write("                    height:50px;\n");
      out.write("                    font-size:18px;\n");
      out.write("                    border:2px solid #D071f9;\n");
      out.write("                    border-radius:5px;\n");
      out.write("                    box-sizing: border-box;\n");
      out.write("                    padding-left:10px;\n");
      out.write("                    margin:7px 0px;\n");
      out.write("                }\n");
      out.write("                .btn\n");
      out.write("                {\n");
      out.write("                    width:100%;\n");
      out.write("                    height:50px;\n");
      out.write("                    background-color: #D071f9;\n");
      out.write("                    border-radius: 5px;\n");
      out.write("                    font-size: 20px;\n");
      out.write("                    margin:7px 0px;\n");
      out.write("                    color:white;\n");
      out.write("                    border:0;\n");
      out.write("                    cursor:pointer;\n");
      out.write("                }\n");
      out.write("                .btn:hover{\n");
      out.write("                    background-color: #0a63d8;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                .link\n");
      out.write("                {\n");
      out.write("                    font-size: 16px;\n");
      out.write("                    padding:4px 0px;\n");
      out.write("                    margin:3px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                @media (max-width:  420px)\n");
      out.write("                {\n");
      out.write("                    .center{\n");
      out.write("                        width:88%;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("<!--        <div></div>\n");
      out.write("        <form action=\"register\" method=\"POST\">\n");
      out.write("            NAME:\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"ENTER NAME...\">\n");
      out.write("            </div>\n");
      out.write("            EMAIL:\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"ENTER EMAIl...\">\n");
      out.write("            </div>\n");
      out.write("            PASSWORD:\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"ENTER PASSWORD...\">\n");
      out.write("            </div>\n");
      out.write("             CONFIRM PASSWORD:\n");
      out.write("            <div class=\"container\"> \n");
      out.write("                <input type=\"password\" name=\"cnpassword\" placeholder=\"ENTER CONFIRM PASSWORD...\">\n");
      out.write("            </div>   \n");
      out.write("             <div class=\"container\"> \n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"REGISTER\">\n");
      out.write("            </div>\n");
      out.write("        </form>-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form action=\"register\" method=\"post\" autocomplete=\"OFF\">\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <h1>REGISTER</h1>\n");
      out.write("        ");

            String error=(String)session.getAttribute("error");
            if(error!= null)
            {
        
      out.write("  \n");
      out.write("        <div class=\"alert alert-danger\" role=\"alert\">");
      out.print(error);
      out.write("</div>\n");
      out.write("            \n");
      out.write("        ");
        
            }
            session.removeAttribute("error");

        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            String n=(String)session.getAttribute("e");
            if(n!= null)
            {
        
      out.write("  \n");
      out.write("        <div class=\"alert alert-danger\" role=\"alert\">");
      out.print(n);
      out.write("</div>\n");
      out.write("            \n");
      out.write("        ");
        
            }
            session.removeAttribute("e");

        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            String exist=(String)session.getAttribute("exist");
            if(exist!= null)
            {
        
      out.write("  \n");
      out.write("        <div class=\"alert alert-danger\" role=\"alert\">");
      out.print(exist);
      out.write("</div>\n");
      out.write("            \n");
      out.write("        ");
        
            }
            session.removeAttribute("exist");

        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            String success=(String)session.getAttribute("success");
            if(success!= null)
            {
        
      out.write("  \n");
      out.write("            <div class=\"alert alert-success\" role=\"alert\">");
      out.print(success);
      out.write("<a href=\"login.jsp\">LOGIN HERE</a></div>\n");
      out.write("            \n");
      out.write("        ");
        
            }
            session.removeAttribute("success");

        
      out.write("\n");
      out.write("        \n");
      out.write("         ");

            String failed=(String)session.getAttribute("success");
            if(failed!= null)
            {
        
      out.write("  \n");
      out.write("        <div class=\"alert alert-danger\" role=\"alert\">");
      out.print(failed);
      out.write("</div>\n");
      out.write("            \n");
      out.write("        ");
        
            }
            session.removeAttribute("failed");

        
      out.write("\n");
      out.write("        \n");
      out.write("                <div class=\"form\">\n");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"name\" class=\"textfield\" placeholder=\"Name\">          \n");
      out.write("                    <input type=\"email\" name=\"email\" class=\"textfield\" placeholder=\"EMAIL\">\n");
      out.write("                    <input type=\"password\" name=\"password\" class=\"textfield\" placeholder=\"PASSWORD\">\n");
      out.write("                    <input type=\"password\" name=\"cnpassword\" class=\"textfield\" placeholder=\" CONFIRM PASSWORD\">\n");
      out.write("\n");
      out.write("        <!--            <div class=\"forget\">\n");
      out.write("                        <a href=\"#\" class=\"link\" onclick=\"alert('PLEASE THINK YOUR PASSWORD')\">Forget Your Password ?</a>\n");
      out.write("                    </div>-->\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"submit\" class=\"btn\" name=\"submit\" value=\"REGISTER\"> \n");
      out.write("                    </div>    \n");
      out.write("                    <div class=\"signup\">\n");
      out.write("                    <!--New Member <a href=\"\" class=\"link\">Sign Up Here?</a>-->\n");
      out.write("                    </div>      \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
