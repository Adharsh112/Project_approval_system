/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Maindata;

import database.connect;
import java.sql.*;
import java.text.SimpleDateFormat;   

import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author Lenovo
 */
public abstract class User {  
        public  String Addhod(String f1,String f2,String f3,String f4,String f5) { 
           String sql="SELECT count(*) FROM hod ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
                        try {
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  rs.next();
				     int cid=rs.getInt(1)+1; 
                                     String Eid="CA00"+cid;
                                    String insertsql="insert into hod values(?,?,?,?,?,?,?)"; 
				     PreparedStatement ps=connect.prepareStatement(insertsql);
				    ps.setString(1, Eid);
				    ps.setString(2, f1); 
				    ps.setString(3, f2); 
				    ps.setString(4, f3); 
				    ps.setString(5, f4); 
				    ps.setString(6, f5); 
				    ps.setString(7, "nill"); 
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
        public  String Deletehod(String f1) {
            
             String deletesql="delete FROM hod where hodid='"+f1+"'";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			 try { PreparedStatement ps=connect.prepareStatement(deletesql); 
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Deleted";
				    }else {
						ret= "NotDeleted";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
        public  String updatehod(String f1,String f2,String f3,String f4,String f5,String f6) {  
            connect db = new connect();
			Connection connect=db.getConnection();
			String ret=""; 
			try { String updatesql="update hod set email=?,address=?,branch=?,phone=? where hodid=? and name=?"; 
				     PreparedStatement ps=connect.prepareStatement(updatesql);
				     ps.setString(1, f1);
				     ps.setString(2, f2); 
				     ps.setString(3, f3);
				     ps.setString(4, f4); 
				     ps.setString(5, f5);
				     ps.setString(6, f6);  
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Updated";
				    }else {
						ret= "NotUpdated";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
         public  String PerHod(String f1,String f2) {
            
             String deletesql="update hod set status=? where hodid=?";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			 try { PreparedStatement ps=connect.prepareStatement(deletesql); 
                                     ps.setString(1, f1);
				     ps.setString(2, f2);
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Permission";
				    }else {
						ret= "NotPermission";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
         
        public  String Addpic(String f1,String f2,String f3,String f4,String f5) { 
           String sql="SELECT count(*) FROM pic ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
                        try {
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  rs.next();
				     int cid=rs.getInt(1)+1; 
                                     String Eid="CA00"+cid;
                                    String insertsql="insert into pic values(?,?,?,?,?,?,?)"; 
				     PreparedStatement ps=connect.prepareStatement(insertsql);
				    ps.setString(1, Eid);
				    ps.setString(2, f1); 
				    ps.setString(3, f2); 
				    ps.setString(4, f3); 
				    ps.setString(5, f4); 
				    ps.setString(6, f5); 
				    ps.setString(7, "nill"); 
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
        public  String Deletepic(String f1) {
            
             String deletesql="delete FROM pic where picid='"+f1+"'";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			 try { PreparedStatement ps=connect.prepareStatement(deletesql); 
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Deleted";
				    }else {
						ret= "NotDeleted";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
        public  String updatepic(String f1,String f2,String f3,String f4,String f5,String f6) {  
            connect db = new connect();
			Connection connect=db.getConnection();
			String ret=""; 
			try { String updatesql="update pic set email=?,address=?,branch=?,phone=? where picid=? and name=?"; 
				     PreparedStatement ps=connect.prepareStatement(updatesql);
				     ps.setString(1, f1);
				     ps.setString(2, f2); 
				     ps.setString(3, f3);
				     ps.setString(4, f4); 
				     ps.setString(5, f5);
				     ps.setString(6, f6);  
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Updated";
				    }else {
						ret= "NotUpdated";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
      
         public  String Perpic(String f1,String f2) {
            
             String deletesql="update pic set status=? where picid=? ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			 try { PreparedStatement ps=connect.prepareStatement(deletesql); 
                                     ps.setString(1, f1);
				     ps.setString(2, f2);
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Permission";
				    }else {
						ret= "NotPermission";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
         
        public  String Addig(String f1,String f2,String f3,String f4,String f5) { 
           String sql="SELECT count(*) FROM ig ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
                        try {
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  rs.next();
				     int cid=rs.getInt(1)+1; 
                                     String Eid="CA00"+cid;
                                    String insertsql="insert into ig values(?,?,?,?,?,?,?)"; 
				     PreparedStatement ps=connect.prepareStatement(insertsql);
				    ps.setString(1, Eid);
				    ps.setString(2, f1); 
				    ps.setString(3, f2); 
				    ps.setString(4, f3); 
				    ps.setString(5, f4); 
				    ps.setString(6, f5); 
				    ps.setString(7, "nill"); 
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
        public  String Deleteig(String f1) {
            
             String deletesql="delete FROM ig where igid='"+f1+"'";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			 try { PreparedStatement ps=connect.prepareStatement(deletesql); 
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Deleted";
				    }else {
						ret= "NotDeleted";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
        public  String updateig(String f1,String f2,String f3,String f4,String f5,String f6) {  
            connect db = new connect();
			Connection connect=db.getConnection();
			String ret=""; 
			try { String updatesql="update ig set email=?,address=?,branch=?,phone=? where igid=? and name=?"; 
				     PreparedStatement ps=connect.prepareStatement(updatesql);
				     ps.setString(1, f1);
				     ps.setString(2, f2); 
				     ps.setString(3, f3);
				     ps.setString(4, f4); 
				     ps.setString(5, f5);
				     ps.setString(6, f6);  
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Updated";
				    }else {
						ret= "NotUpdated";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
       public  String Perig(String f1,String f2) {
            
             String deletesql="update ig set status=? where igid=?";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			 try { PreparedStatement ps=connect.prepareStatement(deletesql); 
                                     ps.setString(1, f1);
				     ps.setString(2, f2);
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Permission";
				    }else {
						ret= "NotPermission";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
         
        
         public  String StudentVerify(String f1) {  
            connect db = new connect();
			Connection connect=db.getConnection();
			String ret=""; 
			try { String updatesql="update students set status=? where uid=?"; 
				     PreparedStatement ps=connect.prepareStatement(updatesql);
				     ps.setString(1, "Active");
				     ps.setString(2, f1); ;  
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
      
         public  String StudentDelete(String f1) {
            
             String deletesql="delete FROM students where uid='"+f1+"'";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			 try { PreparedStatement ps=connect.prepareStatement(deletesql); 
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Deleted";
				    }else {
						ret= "NotDeleted";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
        
        
        public  String UpdateMAccount(String f1) {  
            connect db = new connect();
			Connection connect=db.getConnection();
			String ret=""; 
			try {    System.out.println("data ::"+f1);
				     PreparedStatement ps=connect.prepareStatement(f1);   
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    { ret= "Inserted";
				    }else { ret= "NotInserted";
				    }
			} catch (SQLException e) { e.printStackTrace();
			}
			return ret;
       }
        public  String AddProject(String f1,String f2,String f3,String f4,String f5,String f6,String f7,String f8) throws ParseException { 
           String sql="SELECT count(*) FROM projects ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
                        try { 
                             
                                    System.out.println("jj");  
                                    
                                    
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  rs.next();
                                   
				     int cid=rs.getInt(1)+1; 
                                     String Eid="PI00"+cid; 
				    
                                    String insertsql="insert into projects values(?,?,?,?,?,?,?,?,?,?,?,?)"; 
				     PreparedStatement ps=connect.prepareStatement(insertsql);
				    ps.setString(1, Eid);
				    ps.setString(2, f1); 
				    ps.setString(3, f2);
				    ps.setString(4, f3); 
				    ps.setString(5, f4);
				    ps.setString(6, f5); 
				    ps.setString(7, f6);
				    ps.setString(8, f7); 
				    ps.setString(9, f8);
				    ps.setString(10, "NoUpdate"); 
				    ps.setString(11, "NoUpdate");
				    ps.setString(12, "NoUpdate"); 
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
        public  String DeleteProject(String f1) {
            
             String deletesql="delete FROM projects where proid='"+f1+"'";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
			 try { PreparedStatement ps=connect.prepareStatement(deletesql); 
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Deleted";
				    }else {
						ret= "NotDeleted";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }      
        public  String UpdateProject(String f1,String f2,String f3,String f4,String f5,String f6,String f7,String f8,String f9,String f10) {  
            connect db = new connect();
             SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
//                              Date date = new Date();  
//                            System.out.println(formatter.format(date)); 
//                                     String edate=formatter.format(date);
             
             
			Connection connect=db.getConnection();
			String ret=""; 
			try { 
                             long millis=System.currentTimeMillis();  
                     java.sql.Date cdate=new java.sql.Date(millis);  
                                System.out.println(cdate);    
                                 Date edate=Date.valueOf(f7); 
                                    System.out.println(edate);  
 String updatesql="UPDATE item SET name=? , category=?,descri=?, Pcompany=?, price=?, discount=?, edate=?, addby=?, modifydate=?, icount=? WHERE id =?"; 
 //String updatesql="UPDATE item SET name=?, category=?, desc=?, Pcompany=?, price=?, discount=?, edate=?, addby=?, modifydate=? WHERE id =?"; 
  // String updatesql="update item set name='"+f1+"', category='"+f2+"' , desc='"+f3+"' , Pcompany='"+f4+"' , price='"+f5+"' , discount='"+f6+"' , edate='"+f7+"', addby='MANAGER', modifydate='"+edate+"' where id='"+f8+"'"; 
		   PreparedStatement ps=connect.prepareStatement(updatesql);
			System.out.println("sql= : "+updatesql);	  
				    ps.setString(1, f1); 
				    ps.setString(2, f2);
				    ps.setString(3, f3); 
				    ps.setString(4, f4);
				    ps.setString(5, f5); 
				    ps.setString(6, f6);
				    ps.setDate(7, edate); 
				    ps.setString(8, f9);
				    ps.setDate(9, cdate);   
				    ps.setString(10, f8); 
				    ps.setString(11, f10);   
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Updated";
				    }else {
						ret= "NotUpdated";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }

         public  String SendFeedbacks(String f1,String f2,String f3) { 
                System.out.println("price   1::"+f2);
           String sql="SELECT count(*) FROM Feedback ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
                        try {
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  rs.next();
				     int cid=rs.getInt(1)+1; 
                                     String Eid="FB00"+cid; 
                                    String insertsql="insert into Feedback values(?,?,?,?)"; 
				     PreparedStatement ps=connect.prepareStatement(insertsql);
				    ps.setString(1, Eid);
				    ps.setString(2, f1); 
				    ps.setString(3, f2); 
				    ps.setString(4, f3);   
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
         public  String SendEmails(String f1,String f2) { 
                System.out.println("price   1::"+f1);
           String sql="SELECT emailid FROM students where uid='"+f1+"' ";
		  connect db = new connect();
			Connection connect=db.getConnection();
			String ret="";
                        try {
				Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				  rs.next();
				     String cid=rs.getString(1); 
                                     
				    
                                        ss.mail(cid,"Your Project Approval Accepted Succssfully \n Your Project Id :: "+f2+"   ","Project Approval Accepted");
						ret= "Inserted";
				    
				  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
           return ret;
       }

         public  String Accepted(String f1,String f2,String f3) {  
            connect db = new connect();
			Connection connect=db.getConnection();
			String ret=""; 
			try {
                            String updatesql="";
                            
                              if(f1.equalsIgnoreCase("ig")){
                            
                            updatesql="update projects set igstatus=? where proid=?"; 
				  }else   if(f1.equalsIgnoreCase("pic")){  
                                      
                            updatesql="update projects set picstatus=? where proid=?"; 
                               }else   if(f1.equalsIgnoreCase("hod")){    
                                   
                            updatesql="update projects set hodstatus=? where proid=?"; 
                               }
                            
                            PreparedStatement ps=connect.prepareStatement(updatesql);
				     ps.setString(1, f2);
				     ps.setString(2, f3);     
				    int i=ps.executeUpdate();
				    if(i!=0) 
				    {
						ret= "Updated";
				    }else {
						ret= "NotUpdated";
				    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
       }
        
         
         
         
         
}
