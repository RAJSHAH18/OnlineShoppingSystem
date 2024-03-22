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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class insert extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 
     * "C:\Users\RAJ SHAH\Documents\NetBeansProjects\OnlineShoppingSystem\src\java\insert.java"
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
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student result system","root","");
//                    if(con!=null)
//                    {
//                        out.println("Connected");
//                    }
                int rollno=Integer.parseInt(request.getParameter("rollno"));
//                String name=request.getParameter("name");
//                int cgpa=Integer.parseInt(request.getParameter("cgpa"));
                int d_id=Integer.parseInt(request.getParameter("d_id"));
                out.println(rollno+" "+d_id);

                
//                String query="INSERT INTO student_results(s_id,s_name,s_cgpa,d_id) VALUES(?,?,?,?)";
//                PreparedStatement ps=con.prepareStatement(query);
//                ps.setInt(1,rollno);
//                ps.setString(2,name);
//                ps.setInt(3,cgpa);
//                ps.setInt(4,d_id);
//                
//                int i=ps.executeUpdate();
//                if(i>0)
//                {
//                        session=request.getSession();
//                        session.setAttribute("inserted", "INSERTION SUCCESSFULLY");
//                        response.sendRedirect("insert.jsp");
//                }
//                
//                else
//                {
//                        session=request.getSession();
//                        session.setAttribute("failed", "INSERTION FAILED");
//                        response.sendRedirect("insert.jsp");
//                }
                
                
                
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
