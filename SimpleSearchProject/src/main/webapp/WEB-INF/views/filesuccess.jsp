<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Success</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <div class="alert alert-success" role="alert">
            <h4 class="alert-heading">Success!</h4>
            <p>Your file has been uploaded successfully.</p>
            <hr>
            <p class="mb-0">What would you like to do next?</p>
            <ul class="list-inline">
                <li class="list-inline-item">
                    <a href="fileform.jsp" class="btn btn-outline-primary">Upload Another File</a>
                </li>
                <li class="list-inline-item">
                    <a href="index.jsp" class="btn btn-outline-secondary">Return to Home</a>
                </li>
            </ul>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
