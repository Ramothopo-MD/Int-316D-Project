<%-- 
    Document   : ErrorPage
    Created on : 11 Apr 2025, 11:16:10 PM
    Author     : Desmond
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
        <!-- Bootstrap CSS CDN -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body class="bg-light">
        <div class="container mt-5">
            <div class="card border-danger">
                <div class="card-header bg-danger text-white">
                    <h3>Error Page</h3>
                </div>
                <div class="card-body">
                    <%
                        String message = (String) request.getAttribute("message");
                    %>
                    <p class="text-danger fw-bold"><%= message %></p>
                    <a href="Menu.html" class="btn btn-primary mt-3">Go to Menu</a>
                </div>
            </div>
        </div>
    </body>
</html>
