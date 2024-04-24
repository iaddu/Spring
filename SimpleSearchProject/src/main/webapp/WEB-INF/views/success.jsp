<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="springmvcsearch.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Student std1=(Student)request.getAttribute("std1");
%>
<h1>Name is <%=std1.getName()%></h1>
<h1>Id is <%=std1.getId()%></h1>
<h1>Dob is <%=std1.getDob()%></h1>
<h1>Courses are <%=std1.getCourses()%></h1>
<h1>Gender is <%=std1.getGender()%></h1>
<h1>Type is <%=std1.getType()%></h1>
<h1> Address is as : </h1>
<h1>Street is <%=std1.getAddress().getStreet()%></h1>
<h1>City is <%=std1.getAddress().getCity()%></h1>


</body>
</html>