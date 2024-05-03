<%@ page isErrorPage="true" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Null Pointer Error</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <div class="alert alert-danger" role="alert">
            <h4 class="alert-heading">OOPS! A Null Pointer Error Occurred</h4>
            <p>Something went wrong while processing your request. This could be due to an unexpected issue on our end. Please try again, or use the links below to navigate to another part of the site.</p>
            <hr>
            <ul class="list-inline">
                <li class="list-inline-item">
                    <a href="home.jsp" class="btn btn-outline-primary">Go Home</a>
                </li>
                <li class="list-inline-item">
                    <a href="contact.jsp" class="btn btn-outline-secondary">Contact Us</a>
                </li>
            </ul>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
