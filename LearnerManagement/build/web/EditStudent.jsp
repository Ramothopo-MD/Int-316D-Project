<%@page import="za.ac.tut.Model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container d-flex flex-column justify-content-center align-items-center vh-100">
        <div class="card shadow-lg p-4" style="width: 100%; max-width: 600px;">
            <h2 class="text-center mb-4">Edit Student Details</h2>

            <form action="SaveEditedStudentServlet.do" method="POST">
                <%
                    Student student = (Student) request.getAttribute("student");
                %>
                <div class="mb-3 row">
                    <label for="stuNum" class="col-sm-4 col-form-label">Student Number</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="stuNum" name="stuNum" value="<%= student.getStudentNo() %>" readonly>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="name" class="col-sm-4 col-form-label">Name</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="name" name="name" value="<%= student.getName() %>">
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="surname" class="col-sm-4 col-form-label">Surname</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="surname" name="surname" value="<%= student.getSurname() %>">
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="dob" class="col-sm-4 col-form-label">Date of Birth</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="dob" name="dob" value="<%= student.getDob() %>" readonly>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="qualification" class="col-sm-4 col-form-label">Qualification</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="qualification" name="qualification" value="<%= student.getQualification() %>">
                    </div>
                </div>
                <div class="text-center">
                    <button type="submit" class="btn btn-primary">Submit Changes</button>
                </div>
            </form>
        </div>
    </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
