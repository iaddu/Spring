<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Say Hello</title>
</head>
<body>
    <h2>Enter Your Name</h2>
    <form action="welcome" method="post">  <!-- The form submits to 'helloServlet' -->
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" placeholder="Enter your name" required>
        <button type="submit">Say Hello</button>  <!-- The button to submit the form -->
    </form>
</body>
</html>
