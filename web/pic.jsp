<%-- 
    Document   : pic
    Created on : Jun 7, 2023, 6:56:33 PM
    Author     : Lenovo
--%> 
 
<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@page import="database.connect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%
try{
String email=session.getAttribute("email").toString();
if(email !=null){  
%>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>PAS-Projects PIC </title> 
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css"> 
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" type="text/css" href="js/select.dataTables.min.css"> 
  <link rel="stylesheet" href="css/vertical-layout-light/style.css"> 
  <link rel="shortcut icon" href="images/favicon.png" /> 
  <link rel="stylesheet" href="vendors/feather/feather.css">  
  <link rel="stylesheet" href="vendors/select2/select2.min.css">
  <link rel="stylesheet" href="vendors/select2-bootstrap-theme/select2-bootstrap.min.css">   
  
  
</head>
<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
          <a class="navbar-brand brand-logo mr-5" href="adminhome.jsp"><img src="images/logo.svg" class="mr-2" alt="logo"/></a>
          <a class="navbar-brand brand-logo-mini" href="adminhome.jsp"><img src="images/logo-mini.svg" alt="logo"/></a>
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
         <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
          <span class="icon-menu"></span>
        </button>
        <ul class="navbar-nav mr-lg-2">
           
        </ul>
      <ul class="navbar-nav navbar-nav-right">
            
          <li class="nav-item nav-profile dropdown">
            <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
              <img src="images/faces/face28.jpg" alt="profile"/>
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
              
                <a class="dropdown-item" href="mlogout.jsp">
                <i class="ti-power-off text-primary"></i>
                Logout
              </a>
            </div>
          </li>
          
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
          <span class="icon-menu"></span>
        </button>
      </div>
    </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <!-- partial:partials/_settings-panel.html -->
     
              <%
String ss=request.getParameter("v");
if(ss!=null){
   if(ss.equalsIgnoreCase("Inserted")) {%>    
   <script>  window.alert("PIC Added Successfully");</script>
 <% } else  if(ss.equalsIgnoreCase("NotInserted")) {%>    
   <script>  window.alert("PIC Adding Failed");</script>    <% }
else  if(ss.equalsIgnoreCase("Deleted")) {%>    
   <script>  window.alert(" PIC Delete Successfully");</script>    <% }
   else  if(ss.equalsIgnoreCase("NotDeleted")) {%>    
   <script>  window.alert(" PIC Deleting Failed");</script>    <% }
else  if(ss.equalsIgnoreCase("Updated")) {%>    
   <script>  window.alert(" PIC Updated Successfully");</script>    <% }
   else  if(ss.equalsIgnoreCase("Permission")) {%>    
   <script>  window.alert(" PIC Permission Successfully");</script>    <% }



}  %>
      
      
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="adminhome.jsp">
              <i class="icon-grid menu-icon"></i>
              <span class="menu-title">PAS-Project</span>
            </a>
          </li>
           
           
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#authqa" aria-expanded="false" aria-controls="authqa">
              <i class="icon-head menu-icon"></i>
              <span class="menu-title">Hod's</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="authqa">
              <ul class="nav flex-column sub-menu"> 
                <li class="nav-item"> <a class="nav-link" href="hod.jsp?st=add"> Add Hod</a></li>
                <li class="nav-item"> <a class="nav-link" href="hod.jsp?st=update"> Update Hod</a></li>
                <li class="nav-item"> <a class="nav-link" href="hod.jsp?st=delete"> Delete Hod</a></li>
                <li class="nav-item"> <a class="nav-link" href="hod.jsp?st=view"> View Hod</a></li>
              </ul>
            </div>
          </li> 
          
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#autha" aria-expanded="false" aria-controls="autha">
              <i class="icon-head menu-icon"></i>
              <span class="menu-title">Project in-charge</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="autha">
              <ul class="nav flex-column sub-menu"> 
                 <li class="nav-item"> <a class="nav-link" href="pic.jsp?st=add"> Add  PI-Charge</a></li> 
                <li class="nav-item"> <a class="nav-link" href="pic.jsp?st=update">  Update PI-Charge</a></li> 
                <li class="nav-item"> <a class="nav-link" href="pic.jsp?st=delete">Delete  PI-Charge</a></li> 
                <li class="nav-item"> <a class="nav-link" href="pic.jsp?st=view"> View PI-Charge</a></li>
                <li class="nav-item"> <a class="nav-link" href="pic.jsp?st=per"> Permission PI-Charge</a></li>  
              </ul>
            </div>
          </li> 
          
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#auths" aria-expanded="false" aria-controls="auths">
              <i class="icon-head menu-icon"></i>
              <span class="menu-title">Internal guide</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="auths">
              <ul class="nav flex-column sub-menu">  
                 <li class="nav-item"> <a class="nav-link" href="ig.jsp?st=add"> Add  Ig</a></li> 
                <li class="nav-item"> <a class="nav-link" href="ig.jsp?st=update">  Update Ig</a></li> 
                <li class="nav-item"> <a class="nav-link" href="ig.jsp?st=delete">Delete Ig</a></li> 
                <li class="nav-item"> <a class="nav-link" href="ig.jsp?st=view"> View Ig</a></li>  
             </ul>
            </div>
          </li>
          
          
           <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basi" aria-expanded="false" aria-controls="ui-basi">
              <i class="icon-layout menu-icon"></i>
              <span class="menu-title">Sudents</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basi">
              <ul class="nav flex-column sub-menu"> 
                <li class="nav-item"> <a class="nav-link" href="Students.jsp?st=verify">Student Requests</a></li>
                <li class="nav-item"> <a class="nav-link" href="Students.jsp?st=view">View Students</a></li>
               </ul>
            </div>
          </li>
          
          
          
          
           
          
            
         
           
           <li class="nav-item">
            <a class="nav-link" href="mlogout.jsp">
              <i class="icon-arrow-left menu-icon"></i>
              <span class="menu-title">Logout</span>
            </a>
          </li>
          
          
        </ul>
      </nav>
      <!-- partial -->
          <div class="main-panel">        
        <div class="content-wrapper">
          <div class="row">
           
             
            
            <div class="col-12 grid-margin">
              <div class="card">
                <div class="card-body">
                 <%
                 

String st=request.getParameter("st");
System.out.println("mmm::"+st);
 try{
          connect db=new connect();
          Connection connect=db.getConnection(); 
if(st!=null){ 
    
System.out.println("mmm::"+st);

   if(st.equalsIgnoreCase("add")) {
       
%>
 <h4 class="card-title">Add Project in-charge </h4>
                  <form class="form-sample" action="./pic" method="post"  enctype="multipart/form-data" > 
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">PIC Name</label>
                          <div class="col-sm-9">
                              <input type="hidden" class="form-control" name="type" value="add">
                              <input type="text" class="form-control" name="name" required />
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Email id</label>
                          <div class="col-sm-9">
                               <input type="email" class="form-control" name="email" required />
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Address</label>
                          <div class="col-sm-9">
                               <textarea name="address" class="form-control" required=""> </textarea>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Branch</label>
                          <div class="col-sm-9">
                              <select name="branch"class="form-control" required>
                    <option value="">Branch</option> 
                    <option value="cse">CSE</option>
                    <option value="it">IT</option>
                    <option value="ece">ECE</option>
                    <option value="eee">EEE</option>
                    <option value="mech">MECH</option>
                    <option value="civil">CIVIL</option>
                  </select>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Phone</label>
                          <div class="col-sm-9">
                            
                              <input type="text" name="phone" class="form-control" required>
                          </div>
                        </div>
                      </div> 
                         <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label"></label>
                          <div class="col-sm-9">
                             <input class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" type="submit" value="Add PIC">
                          </div>
                        </div>
                      </div>
                    </div> 
                       
                     
                            
                            
                            
                            
                      
                  </form>
                                

      <%} else  if(st.equalsIgnoreCase("view")) {
          %>
                    <h4 class="card-title">View Project in-charge</h4>
                    <div class="table-responsive">
                    <table class="table table-striped">
                      <thead>
  <tr>  <th>  ID  </th>    <th>  Name </th>  <th>  Email id </th>   
    <th>  Phone </th>   <th>  Address  </th> <th> Branch  </th>   <th>  Status </th> </tr>
                      </thead>
                      <tbody>
                 <%
         
          String sql="SELECT * FROM pic";
          Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				 while (rs.next()) {        
%>                           
<tr>
  <td class="py-1"> <%=rs.getString(1)%> </td>   
  <td> <%=rs.getString(2)%></td>  
  <td> <%=rs.getString(3)%></td>   
  <td> <%=rs.getString(4)%></td>  
  <td> <%=rs.getString(5)%></td>   
  <td> <%=rs.getString(6)%></td>    
  <td> <%=rs.getString(7)%></td>    
</tr>                
<%}%>  
  </tbody>  </table>  </div>
<% }else  if(st.equalsIgnoreCase("delete")) {
    %> 
     <h4 class="card-title">Delete Project in-charge</h4>
                    <div class="table-responsive">
                    <table class="table table-striped">
                      <thead>
  <tr>  
      
      <th>  IID  </th>     <th>  Name </th>     <th>  Action </th>  </tr>
                      </thead>
                      <tbody>
                 <% 
          String sql="SELECT * FROM pic";
          Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				 while (rs.next()) {        
%>                           
<tr>
  <td class="py-1"> <%=rs.getString(1)%> </td>   
  <td> <%=rs.getString(2)%></td>   
  <td>   <form class="form-sample" action="./pic" method="post"  enctype="multipart/form-data" > 
                     <input type="hidden"  name="type"  value="delete"/>          
          <input  type="hidden" name="id" value="<%=rs.getString(1)%>">
                          <div class="col-sm-9">    
         
   <input class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" type="submit" value="Delete">
      </form>  </td>  
</tr>                
<%}  %>  
  </tbody>  </table>  </div>
    
      <%}else  if(st.equalsIgnoreCase("update")) {
    %> 

     <h4 class="card-title">Update Project in-charge</h4>
                 <% 
          String sql="SELECT * FROM pic";
          Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String idname="";
                                        %>
                                         <div class="row">
                                             <form action="pic.jsp?st=updated" method="post">
                       
                           <select name="id" class="form-control" required>
                              <option value="">Select Project in-charge</option>
                 <%
				 while (rs.next()) {       
                    idname=rs.getString(1)+"  -  "+rs.getString(2);
%>      
<option value="<%=rs.getString(1)%>"><%=idname%></option> 
                       <%}%>     </select>
                               <input class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" type="submit" value="Select">
        </form>  </div> 
    
<%}else  if(st.equalsIgnoreCase("updated")) {
      
String id=request.getParameter("id"); 
          Statement stmt=connect.createStatement();
         String updatesql="SELECT * FROM pic where picid='"+id+"'";   
	ResultSet rs1 =stmt.executeQuery(updatesql);
          if (rs1.next()) { 
    %> 
   <br>
   <h4 class="card-title">Update Project in-charge :: <%=id%> --<%=rs1.getString(2)%> </h4> 
         <form class="form-sample" action="./pic" method="post"  enctype="multipart/form-data" > 
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label"> Name</label>
                          <div class="col-sm-9">
                              <input type="hidden"  name="type"  value="update"/>
                               <input type="hidden"  name="id"  value="<%=rs1.getString(1)%>"/>
                              <input type="text" class="form-control" name="name" value="<%=rs1.getString(2)%>" readonly />
      
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">email</label>
                          <div class="col-sm-9">
                               
                              <input type="email" name="email"  value="<%=rs1.getString(3)%>" class="form-control" required>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Address</label>
                          <div class="col-sm-9">
                               <textarea name="descr" class="form-control"   required=""><%=rs1.getString(5)%></textarea>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Branch</label>
                          <div class="col-sm-9">
                                   <select name="branch"class="form-control" required>
                    <option value="<%=rs1.getString(6)%>"><%=rs1.getString(6)%></option> 
                    <option value="">Branch</option> 
                    <option value="cse">CSE</option>
                    <option value="it">IT</option>
                    <option value="ece">ECE</option>
                    <option value="eee">EEE</option>
                    <option value="mech">MECH</option>
                    <option value="civil">CIVIL</option>
                  </select>
                          </div>
                        </div>
                      </div>
                    </div>
                      
                        <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Phone</label>
                          <div class="col-sm-9">
                            <input type="text" name="phone"  value="<%=rs1.getString(4)%>" class="form-control" required>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label"></label>
                          <div class="col-sm-9">
                             <input class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" type="submit" value="Update Pic">
       
                          </div>
                        </div>
                      </div>
                    </div>   
                          
                          
                          
                      
                     
                        
                  </form>
                           
                              
                              
                              
                              
<%}
      }else  if(st.equalsIgnoreCase("per")) { %>  
             
          
            <h4 class="card-title">Permission IG</h4>
                    <div class="table-responsive">
                    <table class="table table-striped">
                      <thead>
  <tr>  
      
      <th>  IID  </th>     <th>  Name </th> <th>  Status </th>     <th>  Action </th>  </tr>
                      </thead>
                      <tbody>
                 <% 
          String sql="SELECT * FROM pic";
          Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				 while (rs.next()) {        
%>                           
<tr>
  <td class="py-1"> <%=rs.getString(1)%> </td>   
  <td> <%=rs.getString(2)%></td>  
  <td> <%=rs.getString(7)%></td>   
  <td>   <form class="form-sample" action="./pic" method="post"  enctype="multipart/form-data" > 
                     <input type="hidden"  name="type"  value="per"/>  
           <input type="hidden"  name="per"  value="Active"/>        
          <input  type="hidden" name="id" value="<%=rs.getString(1)%>">
                          <div class="col-sm-9">    
     <input class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" type="submit" value="Permission">
      </form> <br> <br>

 <form class="form-sample" action="./pic" method="post"  enctype="multipart/form-data" >
                     <input type="hidden"  name="type"  value="per"/>   
           <input type="hidden"  name="per"  value="inActive"/>       
          <input  type="hidden" name="id" value="<%=rs.getString(1)%>">
                          <div class="col-sm-9">    
     <input class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn"type="submit" value="No Permission">
      </form>


  </td>  
</tr>                
<%}  %>  
  </tbody>  </table>  </div>
    
        <%      
          }

}
}catch(Exception e) {e.printStackTrace();} %>         
                </div>
              </div>
            </div>
            
             
          </div>
        </div>  
        <!-- content-wrapper ends -->
        <!-- partial:partials/_footer.html -->
      <footer class="footer">
          <div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2023.  Premium <a href="https://www.PAS.com/" target="_blank">PAS</a>. All rights reserved.</span>
            
          </div>
          <div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Distributed by <a href="https://www.DGRIMS.com/" target="_blank"> DG PAS-Project</a></span> 
          </div>
        </footer> 
      </div> 
    </div>    
  </div> 
 
    
  <script src="vendors/js/vendor.bundle.base.js"></script> 
  <script src="vendors/typeahead.js/typeahead.bundle.min.js"></script>
  <script src="vendors/select2/select2.min.js"></script> 
  <script src="js/off-canvas.js"></script>
  <script src="js/hoverable-collapse.js"></script>
  <script src="js/template.js"></script>
  <script src="js/settings.js"></script>
  <script src="js/todolist.js"></script> 
  <script src="js/file-upload.js"></script>
  <script src="js/typeahead.js"></script>
  <script src="js/select2.js"></script>  
  <script src="vendors/js/vendor.bundle.base.js"></script>  
  <script src="js/off-canvas.js"></script> 
  <script src="js/dashboard.js"></script>   

</body>

</html>

<%
}else { response.sendRedirect("index.jsp"); }
}catch(Exception e){  response.sendRedirect("index.jsp");
}
%>

