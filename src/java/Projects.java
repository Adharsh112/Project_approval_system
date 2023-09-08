/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Maindata.AES;
import com.pas.hods;
import java.io.File;
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
public class Projects extends HttpServlet {

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
           
           
            DiskFileItemFactory dif=new DiskFileItemFactory();
 ServletFileUpload upload=new ServletFileUpload(dif);
hods hod=new hods() {};
 
List list=upload.parseRequest(request);

FileItem f1=(FileItem)list.get(0);

String type=f1.getString();  System.out.println("type   ::"+type);
 if(type.equalsIgnoreCase("add")){
     
FileItem f2=(FileItem)list.get(1);
FileItem f3=(FileItem)list.get(2); 
FileItem f4=(FileItem)list.get(3);
FileItem f5=(FileItem)list.get(4);
FileItem f6=(FileItem)list.get(5);
FileItem f7=(FileItem)list.get(6); 
FileItem f8=(FileItem)list.get(7);
FileItem f9=(FileItem)list.get(8);   
 
 String path=request.getRealPath("fpath");
         
String rfile=f8.getName();  System.out.println("file   ::"+rfile);
File rf= new File(path+"\\"+rfile);   String repopa="fpath"+"/"+rfile;
System.out.println("path:: "+repopa);
f8.write(rf);



String filee=f9.getName();  System.out.println("file   ::"+filee);
File f= new File(path+"\\"+filee);   String codepa="fpath"+"/"+filee;
System.out.println("path:: "+codepa);
f9.write(f);







String ff2=f2.getString();  System.out.println(" sid   ::"+ff2);
String ff3=f3.getString();  System.out.println("roll   ::"+ff3);
String ff4=f4.getString();  System.out.println("branch   ::"+ff4);
String ff5=f5.getString();  System.out.println("name  ::"+ff5);
String ff6=f6.getString();  System.out.println("Abstract  ::"+ff6);
String ff7=f7.getString();  System.out.println("Synopsis   ::"+ff7);
String ff8=AES.encrypt(repopa);  System.out.println("report   ::"+ff8);
String ff9=AES.encrypt(codepa);  System.out.println("code  ::"+ff9); 
  
 String its= hod.AddProject(ff2,ff3,ff4,ff5,ff6,ff7,ff8,ff9);
 
 
 if(its.equalsIgnoreCase("Inserted"))
                 {  response.sendRedirect("Sprojects.jsp?v="+its+"");}
             else{  response.sendRedirect("Sprojects.jsp?v="+its+"");}
 
  
 


 }   else if(type.equalsIgnoreCase("delete")){   
     FileItem f2=(FileItem)list.get(1);    
     String ff2=f2.getString();  System.out.println("file name   ::"+ff2); 
     String its= hod.Deletehod(ff2);
      
 
 if(its.equalsIgnoreCase("Deleted"))
                 {  response.sendRedirect("Sprojects.jsp?v="+its+"");}
             else{  response.sendRedirect("Sprojects.jsp?v="+its+"");}
 
       
     
     
      
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
  
 String its= hod.updatehod(ff4,ff5,ff6,ff7,ff2,ff3);
      
   

 if(its.equalsIgnoreCase("Updated"))
                 {  response.sendRedirect("Sprojects.jsp?v="+its+"");}
             else{  response.sendRedirect("Sprojects.jsp?v="+its+"");}
 
   
 
 


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
