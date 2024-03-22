    //    ENROLL NO. : SR21BSIT156
    //    NAME       : RAJ JIGNESHBHAI SHAH
    //    CLASS      : SYIT (SEM 3)
    //    DIV        : B
    //    FACULTY    : DR. RUPAL MAM
    //    SUBJECT    : JSP ASS 8
    //    AIM        : ONLINE SHOPPING SYSTEM
    //    DATE       : 18/11/2022


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            try 
            {
                HttpSession session;

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
                  String name=request.getParameter("name");
                  String email=request.getParameter("email");
                  String password=request.getParameter("password");
                  String cnpassword=request.getParameter("cnpassword");
//                  out.println(password);
//                  out.println(cnpassword);
//                  out.println(name);
//                  out.println(email);
                  
                  if(name.equalsIgnoreCase("")|| email.equalsIgnoreCase("") || password.equalsIgnoreCase("") || cnpassword.equalsIgnoreCase(""))
                  {
                      session=request.getSession();
                      session.setAttribute("e","ALL FIELDS ARE REQUIRED" );
                      response.sendRedirect("register.jsp");
                  }
                  else
                  {
                      String query="SELECT * FROM register WHERE Email='"+email+"'";
                      Statement st=con.createStatement();
                      ResultSet rs=st.executeQuery(query);
                      if(rs.next())
                      {
                          session=request.getSession();
                          session.setAttribute("exist","EMAIL  ID IS ALREADY EXISTS" );
                          response.sendRedirect("register.jsp");
                      }
                      else
                      {
                          if(password.equals(cnpassword))
                          {
                              String qry="INSERT INTO register(Name,Email,Password,Confirm_Password) VALUES(?,?,?,?)";
                              PreparedStatement ps=con.prepareStatement(qry);
                              ps.setString(1, name);
                              ps.setString(2, email);
                              ps.setString(3, password);
                              ps.setString(4, cnpassword);
                              int i=ps.executeUpdate();
                              if(i>0)
                              {
                                      session=request.getSession();
                                      session.setAttribute("success","REGISTRATION SUCCESSFULLY...." );
                                      response.sendRedirect("register.jsp");
                              }
                              else
                              {
                                      session=request.getSession();
                                      session.setAttribute("fsiled","REGISTRATION FAILED" );
                                      response.sendRedirect("register.jsp");
                              }
                            
                          }
                          
                          else  
                         {
                                session=request.getSession();
                         
                                session.setAttribute("error","Password  And Confirm Password Aren't Same");
                                response.sendRedirect("register.jsp");
                         }
                      }
                    }
                  
                  
                 
//                          session=request.getSession();
//                      session.setAttribute("error","PASSWORD AND CONFRIM PASSWORD NOT MATCHED" );
//                      session.setAttribute();
//                      String error=(String)session.getAttribute("error");
//                      out.println(error);
                      
                      
            } 
            catch (Exception e) 
            {
                out.println(e.getMessage());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
                         