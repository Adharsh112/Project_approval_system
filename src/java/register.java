
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.connect; 

/**
 * Servlet implementation class register
 */

public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        try {
	            /*
	             * TODO output your page here. You may use following sample code.  sturol
	             */
	        	String sturol=request.getParameter("sturol");
	        	String username=request.getParameter("username");
	    		String emailid=request.getParameter("emailid");
	    		String phone=request.getParameter("phone");
	    		String gender=request.getParameter("gender");
	    		String password=request.getParameter("password"); 
	    		String sq=request.getParameter("sq");
	    		String sa=request.getParameter("sa"); 
	    		String role=request.getParameter("branch"); 
                       out.println(""+sturol+""+username+""+emailid+""+phone+""+gender+""+ password+""+sq+""+sa+""+role);
	            response.setContentType("text/html"); 
	  		  connect db = new connect();
	            System.out.println("   ----  hello----- \n ");
	            String ss=db.studentregister(sturol,username, emailid, phone, gender, password,sq,sa,role);
	            
	            System.out.println("   ----  hello"+ss);
                    response.sendRedirect("register.jsp?v="+ss+"");
	        } catch(Exception e) {
	        	 out.println("   ----  hello----- \n "+e);
		        	e.printStackTrace();
	        }
	        finally {            
	            out.close();
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		
		
	} 
	

}
