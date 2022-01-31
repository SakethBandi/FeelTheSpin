<jsp:useBean id="userinfo" class="net.Details"></jsp:useBean>  
<jsp:setProperty property="*" name="userinfo"/>  
You have enterted below details:<br>  
<% 
String k=request.getParameter("username"); 
if (k.isEmpty()) 
{%> 
 	<jsp:forward page="printdate.jsp" >   
 	<jsp:param name="name" value="User name is null so try by entering again" /> 
 	</jsp:forward> 	 
<%} 
%> 
<jsp:getProperty property="username" name="userinfo"/><br>  
<jsp:getProperty property="password" name="userinfo"/><br>  
<jsp:getProperty property="age" name="userinfo" /><br>  
