/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import database.connect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class alogin extends HttpServlet {

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
        try {  HttpSession session=request.getSession();
	              response.setContentType("text/html"); 
	  		  connect db = new connect();
	        	String type=request.getParameter("type"); 
//	    		student
                         if(type.equalsIgnoreCase("admin")){
                        
                        String username=request.getParameter("admin"); 
	    		String password=request.getParameter("pass");   
	          
	            System.out.println("   ----  hello----- \n ");
	            String ss=db.adminlogin(username, password);
	            
	            if(ss.equalsIgnoreCase("valid")){
	            
       
                    session.setAttribute("email",username);   
                    response.sendRedirect("adminhome.jsp");
            }else{
                response.sendRedirect("adminlogin.jsp?v="+ss+"");
            } 
	        
        
        }else  if(type.equalsIgnoreCase("student")){
                          String username=request.getParameter("name"); 
	    		String password=request.getParameter("pass");   
                         
                          String ss=db.studentlogin(username, password);
                          String sm[]=ss.split("-");
                          String val=sm[0];
                           if(val.equalsIgnoreCase("valid")){
	            
        session.setAttribute("username",username);  
        session.setAttribute("roll",sm[1]);  
        session.setAttribute("sid",sm[2]); 
        session.setAttribute("branch",sm[3]);
                    response.sendRedirect("Shome.jsp?v="+val+"");
            }else{
                response.sendRedirect("studentlogin.jsp?v="+val+"");
            }
                         
                           }else  if(type.equalsIgnoreCase("ig")){
                           
                             String email=request.getParameter("email"); 
	    		String phone=request.getParameter("pass");   
                         
                          String ss=db.iglogin(email, phone);
                          String sm[]=ss.split("-");
                          String val=sm[0];
                           if(val.equalsIgnoreCase("valid")){
	            
        session.setAttribute("email",email);  
        session.setAttribute("igid",sm[1]);  
        session.setAttribute("branch",sm[2]);  
                    response.sendRedirect("Ighome.jsp?v="+val+"");
            }else{
                response.sendRedirect("iglogin.jsp?v="+val+"");
            }
                           
                           }
                         else  if(type.equalsIgnoreCase("pic")){
                           
                               String email=request.getParameter("email"); 
	    		String phone=request.getParameter("pass");   
                         
                          String ss=db.piclogin(email, phone);
                          String sm[]=ss.split("-");
                          String val=sm[0];
                           if(val.equalsIgnoreCase("valid")){
	            
        session.setAttribute("email",email);  
        session.setAttribute("picid",sm[1]);  
        session.setAttribute("branch",sm[2]);  
                    response.sendRedirect("Pichome.jsp?v="+val+"");
            }else{
                response.sendRedirect("piclogin.jsp?v="+val+"");
            }
                           
                           
                         }else  if(type.equalsIgnoreCase("hod")){
                           
                                String email=request.getParameter("email"); 
	    		String phone=request.getParameter("pass");     
                         
                          String ss=db.hodlogin(email, phone);
                          String sm[]=ss.split("-");
                          String val=sm[0];
                           if(val.equalsIgnoreCase("valid")){
	            
        session.setAttribute("email",email);  
        session.setAttribute("hodid",sm[1]);  
        session.setAttribute("branch",sm[2]);  
                    response.sendRedirect("Hodhome.jsp?v="+val+"");
            }else{
                response.sendRedirect("hodlogin.jsp?v="+val+"");
            }
                 
                           
                           }
        
        
        
        
        
        } catch(Exception e) {
	        	 out.println("   ----  hello----- \n "+e);
		        	e.printStackTrace();
	        }
	        finally {            
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
