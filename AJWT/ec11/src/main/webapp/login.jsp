<html>   
<body> 
  <%@ include file="header.jsp" %> 
  <br/> 
<%    
 
String name=request.getParameter("userName");   
%>  
<br/> 
<% 
out.print("Welcome "+name);   if(name.isEmpty()) 
 	 	response.sendRedirect("index.html"); 
session.setAttribute("user",name);   pageContext.setAttribute("user2",name,PageContext.SESSION_SCOPE);     String driver=config.getInitParameter("dname");   
%>   
<br/> 
<% 
out.print("driver name is="+driver); 
%> 
<br/>  
<% 
String driver2=application.getInitParameter("dname2");   out.print("driver name is="+driver2);   
%>   
<form action="home.jsp">   
 	No1:<input type="text" name="n1" /><br/><br/>   
 	No2:<input type="text" name="n2" /><br/><br/>   
<input type="submit" value="divide"/>   
</form></body></html>
