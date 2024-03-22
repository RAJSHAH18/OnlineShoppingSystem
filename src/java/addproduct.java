    //    ENROLL NO. : SR21BSIT156
    //    NAME       : RAJ JIGNESHBHAI SHAH
    //    CLASS      : SYIT (SEM 3)
    //    DIV        : B
    //    FACULTY    : DR. RUPAL MAM
    //    SUBJECT    : JSP ASS 8
    //    AIM        : ONLINE SHOPPING SYSTEM
    //    DATE       : 18/11/2022


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@MultipartConfig

public class addproduct extends HttpServlet {

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
                
//                if(con!=null)
//                {
//                    out.println("Connected");
//                }
//                else
//                {
//                    out.println("Not Connected");
//                }
//                out.println("Hello");
//                    Part file=request.getPart("img");
//                    String filename=file.getSubmittedFileName();
//
//                    String display="images/"+filename;
//                String uploadpath="C:/Users/RAJ SHAH/Documents/NetBeansProjects/OnlineShoppingSystem/web/images/"+filename;
//                out.println(uploadpath);
//                FileOutputStream fos=new FileOutputStream(uploadpath);
//                InputStream is=file.getInputStream();
//                byte data[]=new byte[is.available()];
//                
//                is.read(data);
//                fos.write(data);
//                fos.close();
//                  String  img=request.getParameter("img");
//                  out.println(img);
                  String pname=request.getParameter("pname");
                  int id=Integer.parseInt(request.getParameter("catid"));
                  String description=request.getParameter("description");
                  int price=Integer.parseInt(request.getParameter("price"));
                    Part file=request.getPart("img");
                    String filename=file.getSubmittedFileName();
                    String display="images/"+filename;
//                    out.println(display);
//                  img="image/"+img;
//                  
                  String query="INSERT INTO product_table(Product_Name,Description,Price,ImageURL,Category_ID) VALUES(?,?,?,?,?)";
                  PreparedStatement ps=con.prepareStatement(query);
                  ps.setString(1, pname);
                  ps.setString(2, description);
                  ps.setInt(3, price);
                  ps.setString(4, display);
                  ps.setInt(5, id);
                  int i=ps.executeUpdate();
                  
                  if(i>0)
                  {
                        out.println("<script>alert('INSERTION SUCCESSFULLY');location.replace('product.jsp')</script>");

                  }
                  else
                  {
                        out.println("<script>alert('INSERTION SUCCESSFULLY');location.replace('product.jsp')</script>");
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
