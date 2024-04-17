<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String useremail=(String)request.getAttribute("useremail");
String userpassword=(String)request.getAttribute("userpass");
%>
<h1>UserEmail:</h1>
<%=useremail %>
<h2>UserPassword:</h2>
<%=userpassword %>
</body>
</html>