<%-- 
    Document   : MLogout
    Created on : Nov 23, 2022, 3:30:32 PM
    Author     : Lenovo
--%>
 
<%

try{
String email=session.getAttribute("email").toString();  
 
session.removeAttribute("email"); 
session.removeValue("email");

response.sendRedirect("index.jsp");

}catch(Exception e){  response.sendRedirect("index.jsp"); 
}
%>