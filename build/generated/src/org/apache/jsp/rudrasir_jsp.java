package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rudrasir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Menu </title>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <style>       \n");
      out.write("        *, *::before, *::after { box-sizing: border-box;}\n");
      out.write("        :root{\n");
      out.write("            --colorPink: #CE3061;\n");
      out.write("            --colorBlueLight-clr: #8ed1fc;\n");
      out.write("            --colorGreen: #006241;\n");
      out.write("            --colorGreenDark: #1e3932;\n");
      out.write("            --colorGreenLight: #d4e9e2;\n");
      out.write("            --primary-font: \"Poppins\", Sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body{\n");
      out.write("            background-color: rgb(7, 20, 13);\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: var(--primary-font);\n");
      out.write("            color: white;\n");
      out.write("            min-height: 100vh;\n");
      out.write("        } \n");
      out.write("\n");
      out.write("        .main img{\n");
      out.write("            border-radius: 50%;\n");
      out.write("            width: 120px;\n");
      out.write("            height: 120px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body :is(.type1, .type2 ,.type3){\n");
      out.write("            font-size: 1.5rem;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main a{\n");
      out.write("            all: unset;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button{\n");
      out.write("            all: unset;\n");
      out.write("            background-color: white;\n");
      out.write("            color: black;\n");
      out.write("            width: 70px;\n");
      out.write("            border: 1px solid white;\n");
      out.write("            padding: .25rem .50rem .25rem .50rem;\n");
      out.write("            border-radius: 30px;\n");
      out.write("            transition: all 200ms ease-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover{\n");
      out.write("            background-color: transparent;\n");
      out.write("            position: relative; \n");
      out.write("            color: transparent;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover::before{\n");
      out.write("            content: attr(price);\n");
      out.write("            color: pink;\n");
      out.write("            position: absolute;\n");
      out.write("            margin-left: 7px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cart{\n");
      out.write("            width: 100%;\n");
      out.write("            height: 50px;\n");
      out.write("            padding: 20px 150px 20px 30px;\n");
      out.write("            background-color: var(--colorGreenDark);\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: flex-end;\n");
      out.write("            gap: 80em;\n");
      out.write("            position: fixed;\n");
      out.write("            bottom: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cart ion-icon{\n");
      out.write("            color: white;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main{\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 100px auto 100px auto;\n");
      out.write("            width: 80%;\n");
      out.write("            font-size: .75rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .item{\n");
      out.write("            padding: 2rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media(max-width: 980px){\n");
      out.write("            .main{\n");
      out.write("                display: block;\n");
      out.write("            }          \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <div class=\"type1\">\n");
      out.write("                    <p>Beverages</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"items/beverage1.png\">\n");
      out.write("                    <p>Pumpkin Spice Frappuccino</p>\n");
      out.write("                    <a href=\"addto_cart\"><button price=\"add\">13.75$</button></a>\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"items/beverage2.png\">\n");
      out.write("                    <p>Matcha Crème Frappuccino</p>\n");
      out.write("                    <a href=\"cart.jsp\"><button price=\"add\">15.00$</button></a>\n");
      out.write("                </div>  \n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"items/beverage3.png\">\n");
      out.write("                    <p>Strawberry Crème</p>\n");
      out.write("                    <a href=\"cart.jsp\"><button price=\"add\">17.25$</button></a>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col\">               \n");
      out.write("                <div class=\"type2\">\n");
      out.write("                    <p>Bakery</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"items/snack1.png\">\n");
      out.write("                    <p>Lime-Frosted Coconut Bar</p>\n");
      out.write("                    <a href=\"cart.jsp\"><button price=\"add\">10.00$</button></a>\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"items/snack2.png\">\n");
      out.write("                    <p>Ham & Swiss Croissant</p>\n");
      out.write("                    <a href=\"cart.jsp\"><button price=\"add\">25.00$</button></a>\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"items/snack3.png\">\n");
      out.write("                    <p>Glazed Doughnut</p>\n");
      out.write("                    <a href=\"cart.jsp\"><button price=\"add\">18.00$</button></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <div class=\"type3\">\n");
      out.write("                    <p>Refreshers</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"items/cold_drink1.png\">\n");
      out.write("                    <p>Strawberry Açaí Lemonade</p>\n");
      out.write("                    <a href=\"cart.jsp\"><button price=\"add\">45.00$</button></a>\n");
      out.write("                </div>               \n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"items/cold_drink2.png\">\n");
      out.write("                    <p>Paradise Drink</p>\n");
      out.write("                    <a href=\"cart.jsp\"><button price=\"add\">55.00$</button></a>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"items/cold_drink3.png\">\n");
      out.write("                    <p>Dragon Drink</p>\n");
      out.write("                    <a href=\"cart.jsp\"><button price=\"add\">65.00$</button></a>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"cart\">\n");
      out.write("            <a href=\"cart.jsp\">\n");
      out.write("                <ion-icon name=\"cart-outline\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
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
