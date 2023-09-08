<%-- 
    Document   : logout
    Created on : Jun 7, 2023, 9:19:30 PM
    Author     : Lenovo
--%>
 <%
 

try{
String email=session.getAttribute("username").toString();  

String sid=session.getAttribute("sid").toString();
String roll=session.getAttribute("roll").toString();
String branch=session.getAttribute("branch").toString();
session.removeAttribute("username"); 
session.removeValue("username");


session.removeAttribute("sid"); 
session.removeValue("sid");


session.removeAttribute("roll"); 
session.removeValue("roll");


session.removeAttribute("branch"); 
session.removeValue("branch");


response.sendRedirect("index.jsp");

}catch(Exception e){  response.sendRedirect("index.jsp"); 
}



%>