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


public class qtyupdate extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) 
        {
            try
            {
                
            
                    Connection con=null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping system","root","");

        //            if(con!=null)
        //            {
        //                out.println("Connected");
        //            }
                    int qty=Integer.parseInt(request.getParameter("qty"));
//                    out.println(qty);
                    int cart_id=Integer.parseInt(request.getParameter("cart_id"));
                    if(qty>0)
                    {
                        String query="UPDATE cart SET quantity=? WHERE cart_id=?";
                        PreparedStatement ps=con.prepareStatement(query);
                        ps.setInt(1, qty);
                        ps.setInt(2, cart_id);
                        int i=ps.executeUpdate();
                        if(i>0)
                        {
                        
                            out.println(qty);
                            out.println(" <script>console.log('update sucessfully')</script>");

                        }
                        else
                        {
//                            
                            out.println(" <script>console.log('update sucessfully')</script>");

                        }
                                
                    }
              
            }
            catch(Exception e)
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
