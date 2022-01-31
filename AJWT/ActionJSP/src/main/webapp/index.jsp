<html>   
<body> 
 
<form action="userdetails.jsp" method="post">  
User Name: <input type="text" name="username"><br>  
User Password: <input type="password" name="password"><br>  
User Age: <input type="text" name="age"><br>  
<input type="submit" value="register">  
</form>     
 
<jsp:include page="printdate.jsp" >   
<jsp:param name="name" value="ParamActionTag" /> </jsp:include>    
</body>   
</html> 
