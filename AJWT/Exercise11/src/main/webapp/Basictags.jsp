<%@page language="java" %> 
<%@page language="java" session="true" %> <%!   
double pi=22.0/7; 
double area(int radius) {  return pi*radius*radius;  }  
%> 
<html> 
<body> 
<% int radius=Integer.parseInt(request.getParameter("radius")); %> 
Area of circle is <%= area(radius) %></body></html>
