<%-- 
    Document   : Iprojects
    Created on : Jun 8, 2023, 10:45:07 PM
    Author     : Lenovo
--%>

<%@page import="Maindata.AES"%>
<%@page import="database.connect"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Date"%>
 
<%
try{
String email=session.getAttribute("email").toString();
if(email !=null){ 
String sid=session.getAttribute("igid").toString(); 
String branch=session.getAttribute("branch").toString();
  connect db=new connect();
          Connection connect=db.getConnection(); 
%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>PAS-Projects SHome </title> 
  <link rel="stylesheet" href="vendors/feather/feather.css">
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css"> 
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" type="text/css" href="js/select.dataTables.min.css"> 
  <link rel="stylesheet" href="css/vertical-layout-light/style.css"> 
  <link rel="shortcut icon" href="images/favicon.png" />
</head>
<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
          <a class="navbar-brand brand-logo mr-5" href="Ighome.jsp"><img src="images/logo.svg" class="mr-2" alt="logo"/></a>
          <a class="navbar-brand brand-logo-mini" href="Ighome.jsp"><img src="images/logo-mini.svg" alt="logo"/></a>
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
              
                <a class="dropdown-item" href="logout.jsp">
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
     
      
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="Ighome.jsp">
              <i class="icon-grid menu-icon"></i>
              <span class="menu-title">PAS-Project</span>
            </a>
          </li>
           
           
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#authq" aria-expanded="false" aria-controls="authq">
              <i class="icon-head menu-icon"></i>
              <span class="menu-title">Projects</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="authq">
              <ul class="nav flex-column sub-menu"> 
                  
                <li class="nav-item"> <a class="nav-link" href="Iprojects.jsp?st=students"> View Students </a></li> 
                <li class="nav-item"> <a class="nav-link" href="Iprojects.jsp?st=Approval"> Approval Projects</a></li> 
                <li class="nav-item"> <a class="nav-link" href="Iprojects.jsp?st=view"> View Projects</a></li>
              </ul>
            </div>
          </li> 
          
         
           
           
          
          
           
          
            
         
           
           <li class="nav-item">
            <a class="nav-link" href="logout.jsp">
              <i class="icon-arrow-left menu-icon"></i>
              <span class="menu-title">Logout</span>
            </a>
          </li>
          
          
        </ul>
      </nav>
      
 <%
String ss=request.getParameter("v");
if(ss!=null){
   if(ss.equalsIgnoreCase("Updated")) {%>    
   <script>  window.alert("Project Approval  Successfully");</script>
 <% } else  if(ss.equalsIgnoreCase("Updated")) {%>    
   <script>  window.alert("Project Approval  Failed");</script>    <%  

 }

}  %>     
      
      
      <!-- partial -->
      <div class="main-panel">
        <div class="content-wrapper">
          <!-- <div class="row">
            <div class="col-md-12 grid-margin">
              <div class="row">
                
                 
              </div>
            </div>
          </div>  --> 
           
          <div class="row">
            <div class="col-md-12 grid-margin">
              <div class="row">
                <div class="col-12 col-xl-8 mb-4 mb-xl-0">
                  <h3 class="font-weight-bold">Welcome <%=email%> </h3> 
                </div>
                
              </div>
            </div>
          </div>
            
          <div class="row"> 
            <div class="col-12 grid-margin">
              <div class="card">
                <div class="card-body">
                <%
                 

String st=request.getParameter("st");
System.out.println("mmm::"+st);

if(st!=null){ 
    
System.out.println("mmm::"+st);

   if(st.equalsIgnoreCase("view")) {
       
%>       <p class="card-title">Projects Details</p>
                   <div class="table-responsive">
                        <table id="example" class="display expandable-table" style="width:100%">
                          <thead>
                           <tr>  <th>  Project ID  </th> <th>  Student ID  </th> <th> Roll Number  </th>    
                                <th> Project Name </th>  <th>  Abstract  </th>     <th>  Synopsis  </th>  <th>  Report  </th> 
                                 <th>  Code  </th> <th> IG Status </th> <th> PIC Status </th> <th> HOD Status </th>    </tr>
                          </thead>
                           <tbody>
                               
                            <%
         
          String sql="SELECT * FROM projects where  branch='"+branch+"' ";
          Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				 while (rs.next()) {        
%>                           
<tr>
  <td class="py-1"> <%=rs.getString(1)%> </td>   
  <td> <%=rs.getString(2)%></td>   
  <td> <%=rs.getString(3)%></td>  
  <td> <%=rs.getString(5)%></td>   
  <td> <%=rs.getString(6)%></td>    
  <td> <%=rs.getString(7)%></td>   
  <td> <a href="<%=AES.decrypt(rs.getString(8))%>"><%=AES.decrypt(rs.getString(8))%></a></td>
  <td> <a href="<%=AES.decrypt(rs.getString(9))%>"><%=AES.decrypt(rs.getString(9))%></a></td>    
  <td> <%=rs.getString(10)%></td>   
  <td> <%=rs.getString(11)%></td>    
  <td> <%=rs.getString(12)%></td>    
</tr>                
<%}%>    
                  
                               
                
  </tbody> 
                          
                      </table>
                      </div>
<% }else  if(st.equalsIgnoreCase("Approval")) {
    %> 

       
            <h4 class="card-title"> Project Approval System</h4>
                    <div class="table-responsive">
                    <table class="table table-striped">
                      <thead>
  <tr>  
      
      <th>  Project ID  </th>     <th>  Project Name </th> <th>  Status </th>     <th>  Action </th>  </tr>
                      </thead>
                      <tbody>
                 <% 
          String sql="SELECT * FROM projects where  branch='"+branch+"'";
          Statement stmt=connect.createStatement();
				 ResultSet rs =stmt.executeQuery(sql);
					String utype="";
				 while (rs.next()) {        
%>                           
<tr>
  <td class="py-1"> <%=rs.getString(1)%> </td>   
  <td> <%=rs.getString(5)%></td>  
  <td> <%=rs.getString(10)%></td>   
  <td>   <form class="form-sample" action="./hod" method="post"  enctype="multipart/form-data" > 
                     <input type="hidden"  name="type"  value="acce"/>  
                      <input type="hidden"  name="per"  value="ig"/>
           <input type="hidden"  name="per"  value="Accepted"/>        
          <input  type="hidden" name="id" value="<%=rs.getString(1)%>">
                          <div class="col-sm-9">    
     <input class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" type="submit" value="Accepted">
      </form> <br> <br>

 <form class="form-sample" action="./hod" method="post"  enctype="multipart/form-data" >
                     <input type="hidden"  name="type"  value="acce"/>   
           <input type="hidden"  name="per"  value="ig"/>   
           <input type="hidden"  name="per"  value="NotAccepted"/>       
          <input  type="hidden" name="id" value="<%=rs.getString(1)%>">
                          <div class="col-sm-9">    
     <input class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn"type="submit" value="Not Accepted">
      </form>


  </td>  
</tr>                
<%}  %>  
  </tbody>  </table>  </div>
    
    
    
    
    
    
<% }else  if(st.equalsIgnoreCase("students")) {
    %> 
 <h4 class="card-title">View Students </h4>
                    <div class="table-responsive">
                    <table class="table table-striped">
                      <thead>
  <tr>  <th>  ID  </th> <th>  Roll Number  </th>    <th>  Name </th>  <th>  Email id </th>   
    <th>  Phone </th>   <th>  Gender  </th> <th> Branch  </th>   <th>  Status </th> </tr>
                      </thead>
                      <tbody>
                 <%
         
          String sql="SELECT * FROM students where branch='"+branch+"'";
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
  <td> <%=rs.getString(10)%></td>     
  <td> <%=rs.getString(11)%></td>    
</tr>                
<%}%>  
  </tbody>  </table>  </div>
<% }}
    %> 
                    </div>
                  </div>
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
  <script src="js/off-canvas.js"></script>
  <script src="js/hoverable-collapse.js"></script>
  <script src="js/template.js"></script>
  <script src="js/settings.js"></script>
  <script src="js/todolist.js"></script> 
  <script src="js/dashboard.js"></script>   
</body>

</html>




<%
}else { response.sendRedirect("iglogin.jsp"); }
}catch(Exception e){  response.sendRedirect("iglogin.jsp");
}
%>