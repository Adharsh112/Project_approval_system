package database;

import java.sql.*;

public class connect {
	static Connection con;
	public  Connection getConnection() {
		// TODO Auto-generated constructor stub
  try {     Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pas","root","root");
 }
catch(Exception e)
{
System.out.println(e);
}
  return con;
	}
public String studentregister(String rolln,String name,String email,String Phone,String gender,String password,String sq,String sa,String role) {  
		  String sql="SELECT count(*) FROM students ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			
			try {
                            System.out.println("   ----  hello"+sql);
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  rs.next();
				     int countid=rs.getInt(1)+1;  
					  String insertsql="insert into students values(?,?,?,?,?,?,?,?,?,?,?)"; 
				     PreparedStatement ps=connect.prepareStatement(insertsql);
				    ps.setString(1, ""+countid);
				    ps.setString(2, rolln);
				    ps.setString(3, name);
				    ps.setString(4, email);
				    ps.setString(5, Phone);
				    ps.setString(6, gender);
				    ps.setString(7, password);
				    ps.setString(8, sq);
				    ps.setString(9, sa);
				    ps.setString(10, role);
				    ps.setString(11, "InActive");
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Inserted";
				    }else {
						ret= "NotInserted";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
		   
	 
	}
public String adminlogin(String email,String password) {  
		  String sql="SELECT * FROM admin where admin='"+email+"' and password='"+password+"'";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			
			try {
                            System.out.println("SQL ::"+sql);
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  if(rs.next()){
				     
						ret= "valid";
				    }else {
						ret= "invalid";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
                            System.out.println("Error"+e);
                            ret= "invalid"; 
			}
			return ret;
	 
	}
public String studentlogin(String username,String password) {  
		  String sql="SELECT * FROM students where username='"+username+"' and password='"+password+"' and status='Active' ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			
			try {
                            System.out.println("SQL ::"+sql);
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  if(rs.next()){
				     String ss=rs.getString(2);
				     String bb=rs.getString(10);
				     String sid=rs.getString(1);
						ret= "valid-"+ss+"-"+sid+"-"+bb;
				    }else {
						ret= "invalid-mm";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
                             System.out.println("Error"+e);
                            ret= "invalid"; 
			}
			return ret;
		   
	 
	}
public String iglogin(String username,String password) {  
		  String sql="SELECT * FROM ig where email='"+username+"' and phone='"+password+"' and status='Active' ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			
			try {
                            System.out.println("SQL ::"+sql);
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  if(rs.next()){ 
				     String bb=rs.getString(6);
				     String sid=rs.getString(1);
						ret= "valid-"+sid+"-"+bb;
				    }else {
						ret= "invalid-mm";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
                             System.out.println("Error"+e);
                            ret= "invalid"; 
			}
			return ret;
		   
	 
	}
public String piclogin(String username,String password) {  
		  String sql="SELECT * FROM pic where email='"+username+"' and phone='"+password+"' and status='Active' ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			
			try {
                            System.out.println("SQL ::"+sql);
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  if(rs.next()){ 
				     String bb=rs.getString(6);
				     String sid=rs.getString(1);
						ret= "valid-"+sid+"-"+bb;
				    }else {
						ret= "invalid-mm";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
                             System.out.println("Error"+e);
                            ret= "invalid"; 
			}
			return ret;
		   
	 
	}
public String hodlogin(String username,String password) {  
		  String sql="SELECT * FROM hod where email='"+username+"' and phone='"+password+"' and status='Active' ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			
			try {
                            System.out.println("SQL ::"+sql);
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  if(rs.next()){ 
				     String bb=rs.getString(6);
				     String sid=rs.getString(1);
						ret= "valid-"+sid+"-"+bb;
				    }else {
						ret= "invalid-mm";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
                             System.out.println("Error"+e);
                            ret= "invalid"; 
			}
			return ret;
		   
	 
	}
	
public static void main(String[] arg)
	{

		try {
		  connect db = new connect();
		//  String dbs=db.managerregister("name", "email", "Phone", "gender", "password","sq", "sa");
//		  Connection connect=db.getConnection();
//		  Statement stmt=connect.createStatement();
//
//		  String sql="SELECT count(*) FROM user ";
//			 ResultSet rs =stmt.executeQuery(sql);
//				String utype="";
//			  rs.next();
//			     int countid=rs.getInt(1)+1; 
    //System.out.println("data "+dbs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
