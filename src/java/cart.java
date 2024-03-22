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


public class cart extends HttpServlet {

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
//                
                int pid=Integer.parseInt(request.getParameter("pid"));
                int qty=Integer.parseInt(request.getParameter("qty"));
                int price=Integer.parseInt(request.getParameter("price"));
                out.println(pid);
                out.println(qty);
                session=request.getSession();
                String id=(String)session.getAttribute("id");
                int cid=Integer.parseInt(id);
                
                String qry="SELECT * FROM cart WHERE Product_id="+pid+" AND cid="+cid;
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(qry);
                
                if(rs.next())
                {
                    String q="UPDATE cart SET quantity=quantity+?,total=(?*quantity) WHERE Product_id=? AND cid=?";
                    PreparedStatement p=con.prepareStatement(q);
                    p.setInt(1,qty);
                    p.setInt(2,price);
                    p.setInt(3,pid);
                    p.setInt(4,cid);
                    int j=p.executeUpdate();
                    if(j>0)
                    {
                        session.setAttribute("added","PRODUCT ADDED TO THE CART" );
                        response.sendRedirect("purchase.jsp");
                    }
                    else
                    {
                            session.setAttribute("failed","PRODUCT IS NOT ADDED TO THE CART" );
                            response.sendRedirect("purchase.jsp");
                    }
                }
                    
                else
                    
                {
                        price=price*qty;
                        String query="INSERT INTO cart(Product_id,cid,quantity,total) VALUES(?,?,?,?)";
                        PreparedStatement ps=con.prepareStatement(query);
                        ps.setInt(1, pid);
                        ps.setInt(2, cid);
                        ps.setInt(3, qty);
                        ps.setInt(4, price);
                        int i=ps.executeUpdate();
                        if(i>0)
                        {
                            session.setAttribute("added","PRODUCT ADDED TO THE CART" );
                            response.sendRedirect("purchase.jsp");
                        }
                        else
                        {
                            session.setAttribute("failed","PRODUCT IS NOT ADDED TO THE CART" );
                            response.sendRedirect("purchase.jsp");
                        }
                }
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
