<%@ page errorPage="error.jsp" %>  
<%@ include file="header.jsp" %> 
<br/> 
<%    
String num1=request.getParameter("n1");   String num2=request.getParameter("n2");   int a=Integer.parseInt(num1);   int b=Integer.parseInt(num2);   
int c=a/b;   
out.print("division of numbers is: "+c); 
%> 
<br/> 
<%  
String name=(String)session.getAttribute("user");   out.print("Hello "+name); %>   
<br/><% 
String name2=(String)pageContext.getAttribute("user",PageContext.SESSION_SCOPE);   out.print("Hello "+name2); %>   
