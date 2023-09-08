<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head> 
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>PAS-Product Register</title> 
  <link rel="stylesheet" href="vendors/feather/feather.css">
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css"> 
  <link rel="stylesheet" href="css/vertical-layout-light/style.css"> 
  <link rel="shortcut icon" href="images/favicon.png" />
</head>

<body>
  <div class="container-scroller">
    <div class="container-fluid page-body-wrapper full-page-wrapper">
      <div class="content-wrapper d-flex align-items-center auth px-0">
        <div class="row w-100 mx-0">
          <div class="col-lg-4 mx-auto">
            <div class="auth-form-light text-left py-5 px-4 px-sm-5">
              <div class="brand-logo">
                <img src="images/logo.svg" alt="logo">
              </div>
              <h4>New here?</h4>
              <%
String ss=request.getParameter("v");
if(ss!=null){
   if(ss.equalsIgnoreCase("Inserted")) {%>    
   <script>  window.alert("Registation Successfully");</script>
 <% } else  if(ss.equalsIgnoreCase("NotInserted")) {%>    
   <script>  window.alert("Registation Unsuccessfully");</script>    <% }}  %>
              <h6 class="font-weight-light"> Manager Signing up is easy. It only takes a few steps</h6>
              <form class="pt-3" action="./register" method="post" >
                <div class="form-group">
                  <input type="text" name="sturol" class="form-control form-control-lg" id="exampleInputUsername1" required placeholder="Student Rollnumber">
                </div>
                 <div class="form-group">
                  <input type="text" name="username" class="form-control form-control-lg" id="exampleInputUsername1" required placeholder="Username">
                </div>
                <div class="form-group">
                  <input type="email" name="emailid" class="form-control form-control-lg" id="exampleInputEmail1" required placeholder="Email">
                </div>
                 <div class="form-group">
                  <input type="tel" name="phone" class="form-control form-control-lg" id="exampleInputUsername1" pattern="[0-9]{10}" required placeholder="Phone number">
                </div>
                <div class="form-group">
                  <select name="gender" class="form-control form-control-lg" id="exampleFormControlSelect2" required>
                    <option value="">Gender</option>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Others">Others</option>
                  </select>
                </div>
                  
                <div class="form-group">
                  <input type="password" name="password" class="form-control form-control-lg" id="exampleInputPassword1" required placeholder="Password">
                </div>
                 <div class="form-group">
                  <select name="sq" class="form-control form-control-lg" id="exampleFormControlSelect2" required="true">
                    <option value="">Security Question</option>
                    <option value="What is your date of birth?">What is your date of birth? </option>
                    <option value="What was your favorite school teacher?s name?">What was your favorite school teacher?s name?</option>
                    <option value="What?s your favorite movie?">What?s your favorite movie? </option>
                    <option value="What was your first car?">What was your first car? </option>
                    <option value="What is your pet name?">What is your pet name?</option>
                    <option value="What is your favorite vilan?">What is your favorite vilan?</option>
                  </select>
                </div> 
                   <div class="form-group">
                  <input type="text" name="sa" class="form-control form-control-lg" id="exampleInputUsername1" required placeholder="Security-Answer">
                </div>
                  <div class="form-group">
                  <select name="branch" class="form-control form-control-lg" id="exampleFormControlSelect2" required>
                    <option value="">Branch</option> 
                    <option value="cse">CSE</option>
                    <option value="it">IT</option>
                    <option value="ece">ECE</option>
                    <option value="eee">EEE</option>
                    <option value="mech">MECH</option>
                    <option value="civil">CIVIL</option>
                  </select>
                </div>
               
                <div class="mt-3">
                    <input class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" type="submit"value="SIGN UP">
               
                </div>
                <div class="text-center mt-4 font-weight-light">
                  Already have an account? <a href="studentlogin.jsp" class="text-primary">Login</a>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div> 
    </div> 
  </div> 
  <script src="vendors/js/vendor.bundle.base.js"></script> 
  <script src="js/off-canvas.js"></script>
  <script src="js/hoverable-collapse.js"></script>
  <script src="js/template.js"></script>
  <script src="js/settings.js"></script>
  <script src="js/todolist.js"></script> 
</body>

</html>
