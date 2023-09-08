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

/**
 *
 * @author Lenovo
 */
public class pic extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
          
            out.println("<html>"); 
            DiskFileItemFactory dif=new DiskFileItemFactory();
 ServletFileUpload upload=new ServletFileUpload(dif);
hods hod=new hods() {};
 
List list=upload.parseRequest(request);

FileItem f1=(FileItem)list.get(0);

String type=f1.getString();  System.out.println("type delete  ::"+type);
 if(type.equalsIgnoreCase("add")){
     
FileItem f2=(FileItem)list.get(1);
FileItem f3=(FileItem)list.get(2); 
FileItem f4=(FileItem)list.get(3);
FileItem f5=(FileItem)list.get(4);
FileItem f6=(FileItem)list.get(5);   
 
String ff2=f2.getString();  System.out.println(" name   ::"+ff2);
String ff3=f3.getString();  System.out.println("Email   ::"+ff3);
String ff6=f6.getString();  System.out.println("Phone  ::"+ff6); 
String ff4=f4.getString();  System.out.println("Address   ::"+ff4);
String ff5=f5.getString();  System.out.println("Branch  ::"+ff5);
  
 String its= hod.Addpic(ff2,ff3,ff6,ff4,ff5);
 
 
 if(its.equalsIgnoreCase("Inserted"))
                 {  response.sendRedirect("pic.jsp?v="+its+"");}
             else{  response.sendRedirect("pic.jsp?v="+its+"");}
 
  
 


 }   else if(type.equalsIgnoreCase("delete")){   
     FileItem f2=(FileItem)list.get(1);    
     String ff2=f2.getString();  System.out.println("file name   ::"+ff2); 
     String its= hod.Deletepic(ff2);
      
 
 if(its.equalsIgnoreCase("Deleted"))
                 {  response.sendRedirect("pic.jsp?v="+its+"");}
             else{  response.sendRedirect("pic.jsp?v="+its+"");}
 
       
     
     
      
 }else if(type.equalsIgnoreCase("update")){   
    
          
FileItem f2=(FileItem)list.get(1);
FileItem f3=(FileItem)list.get(2); 
FileItem f4=(FileItem)list.get(3);
FileItem f5=(FileItem)list.get(4);
FileItem f6=(FileItem)list.get(5); 
FileItem f7=(FileItem)list.get(6); 
     
     
String ff2=f2.getString();  System.out.println("id  ::"+ff2);
String ff3=f3.getString();  System.out.println(" name   ::"+ff3);
String ff4=f4.getString();  System.out.println("email   ::"+ff4);
String ff5=f5.getString();  System.out.println("Address  ::"+ff5);
String ff6=f6.getString();  System.out.println("branch  ::"+ff6);
String ff7=f7.getString();  System.out.println("phone   ::"+ff7); 
  
 String its= hod.updatepic(ff4,ff5,ff6,ff7,ff2,ff3);
      
   

 if(its.equalsIgnoreCase("Updated"))
                 {  response.sendRedirect("pic.jsp?v="+its+"");}
             else{  response.sendRedirect("pic.jsp?v="+its+"");}
 
   
 
 


 }else if(type.equalsIgnoreCase("per")){ 
         FileItem f2=(FileItem)list.get(1);
         FileItem f3=(FileItem)list.get(2);    
     String ff2=f2.getString();  System.out.println("file name   ::"+ff2); 
     String ff3=f3.getString();  System.out.println("file name   ::"+ff3); 
     String its= hod.Perpic(ff2,ff3);
      
 
 if(its.equalsIgnoreCase("Permission"))
                 {  response.sendRedirect("pic.jsp?v="+its+"");}
             else{  response.sendRedirect("pic.jsp?v="+its+"");}
 
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
