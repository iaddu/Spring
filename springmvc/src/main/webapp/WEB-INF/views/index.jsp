<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is Home page</h1>
	<h2>Called By home controller</h2>
	<h1>Url is /home</h1>
	<%
	String name=(String)request.getAttribute("name");
	int rollno=(Integer)request.getAttribute("rollno");
	%>
	<h1>My name is 
	<%=name %>
	</h1>
	<h1>My rollno is 
	<%=rollno%>
	</h1>
</body>
</html>