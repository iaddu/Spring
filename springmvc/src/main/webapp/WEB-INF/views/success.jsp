<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="springmvc.model.User" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
User user=(User)request.getAttribute("user");
%>
<h1>UserEmail:</h1>
<%=user.getEmail()%>
<h2>UserPassword:</h2>
<%=user.getPass()%>
</body>
</html>