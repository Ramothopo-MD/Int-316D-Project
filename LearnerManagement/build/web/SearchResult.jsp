<%@ page import="za.ac.tut.Model.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Search Result</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card shadow-lg p-4" style="width: 100%; max-width: 600px;">
            <h3 class="text-center mb-4">Student Details</h3>
            <%
                Student student = (Student) request.getAttribute("student");
                if (student != null) {
            %>
            <ul class="list-group">
                <li class="list-group-item"><strong>Student Number:</strong> <%= student.getStudentNo() %></li>
                <li class="list-group-item"><strong>Name:</strong> <%= student.getName() %></li>
                <li class="list-group-item"><strong>Surname:</strong> <%= student.getSurname() %></li>
                <li class="list-group-item"><strong>Date of Birth:</strong> <%= student.getDob() %></li>
                <li class="list-group-item"><strong>Qualification:</strong> <%= student.getQualification() %></li>
                <li class="list-group-item"><strong>Creation Date:</strong> <%= student.getCreationDate() %></li>
            </ul>
            <div class="mt-4 text-center">
                <a href="Menu.html" class="btn btn-primary">Back to Menu</a>
            </div>
            <% } else { %>
                <div class="alert alert-danger">Student data is not available.</div>
            <% } %>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
