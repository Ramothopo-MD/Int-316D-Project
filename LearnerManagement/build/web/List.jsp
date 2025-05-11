<%@page import="java.util.List"%>
<%@page import="za.ac.tut.Model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>All Students</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body class="bg-light">
        <div class="container mt-5">
            <h1 class="text-center mb-4">List of All Students</h1>
            <%
                List<Student> students = (List<Student>) request.getAttribute("students");
            %>
            <div class="table-responsive">
                <table class="table table-striped table-bordered shadow-sm">
                    <thead class="table-dark">
                        <tr>
                            <th>Student Number</th>
                            <th>Name</th>
                            <th>Surname</th>
                            <th>Date of Birth</th>
                            <th>Qualification</th>
                            <th>Registered On</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            if (students != null && !students.isEmpty()) {
                                for (Student student : students) {
                        %>
                        <tr>
                            <td><%= student.getStudentNo() %></td>
                            <td><%= student.getName() %></td>
                            <td><%= student.getSurname() %></td>
                            <td><%= student.getDob() %></td>
                            <td><%= student.getQualification() %></td>
                            <td><%= student.getCreationDate() %></td>
                        </tr>
                        <%
                                }
                            } else {
                        %>
                        <tr>
                            <td colspan="6" class="text-center">No students found.</td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
            <div class="mt-4 text-center">
                <a href="Menu.html" class="btn btn-primary me-2">Go to Menu</a>
                <a href="ListAll.html" class="btn btn-secondary">Get Updated List</a>
            </div>
        </div>
    </body>
</html>
