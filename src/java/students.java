/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.pas.hods;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class students extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
         
            out.println("<html>"); 
            DiskFileItemFactory dif=new DiskFileItemFactory();
 ServletFileUpload upload=new ServletFileUpload(dif);
hods hod=new hods() {};
 
List list=upload.parseRequest(request);

FileItem f1=(FileItem)list.get(0);

String type=f1.getString();  System.out.println("type   ::"+type);
 if(type.equalsIgnoreCase("verify")){
     
FileItem f2=(FileItem)list.get(1);    
 
String ff2=f2.getString();  System.out.println(" id   ::"+ff2); 
  
 String its= hod.StudentVerify(ff2);
 
 
 if(its.equalsIgnoreCase("Inserted"))
                 {  response.sendRedirect("Students.jsp?v="+its+"");}
             else{  response.sendRedirect("Students.jsp?v="+its+"");}
 
  
 


 }   else if(type.equalsIgnoreCase("delete")){   
     FileItem f2=(FileItem)list.get(1);    
     String ff2=f2.getString();  System.out.println("file name   ::"+ff2); 
     String its= hod.StudentDelete(ff2);
      
 
 if(its.equalsIgnoreCase("Deleted"))
                 {  response.sendRedirect("Students.jsp?v="+its+"");}
             else{  response.sendRedirect("Students.jsp?v="+its+"");}
 
       
     
     
      
 } 
         }
        catch(Exception e) {
	        	 out.println("   ----  hello----- \n "+e);
		        	e.printStackTrace();
	       
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
