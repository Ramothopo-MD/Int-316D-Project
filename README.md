📘 Student Management System
This is a simple Student Management Web Application built using JSP, Servlets, Enterprise Java Beans (EJB), JPA (Java Persistence API), and styled with Bootstrap 5. It allows you to add, search, edit, and delete student records.

🛠️ Technologies Used
Java EE / Jakarta EE
JSP (Java Server Pages)
Servlets
EJB (Stateless Bean)
JPA (with Entity class Student)
Apache GlassFish Server
NetBeans IDE
Bootstrap 5 (for styling)

📁 Project Structure

StudentManagement/
│
├── Web Pages/
│   ├── index.html
│   ├── Menu.html
│   ├── AddStudent.html
│   ├── Search.html
│   ├── SearchResult.jsp
│   ├── EditStudent.jsp
│   ├── EditSuccess.html
│   ├── Remove.html
│   ├── DeleteSuccess.html
│   ├── StudentNotFound.html
│
├── Java Sources/
│   ├── za.ac.tut.Model/
│   │   └── Student.java
│   │   └── StudentFacade.java
│   │   └── StudentFacadeLocal.java
│   └── za.ac.tut.Controller/
│       └── AddStudentServlet.java
│       └── SearchStudentServlet.java
│       └── SaveEditedStudentServlet.java
│       └── RemoveStudentServlet.java
│
└── Configuration files
⚙️ Features
✅ Add a new student with details like name, surname, date of birth, and qualification.

🔍 Search student by student number.

✏️ Edit student details (except student number and date of birth).

❌ Delete a student record.

🧾 See success and error pages.

🧑‍🎓 Uses Student entity with JPA annotations for persistence.

🧪 How to Run
Clone or Download the project.
Open the project in NetBeans.
Make sure GlassFish Server is installed and running.
Make sure the database server is running.
Make a database and connect with the  entities.
Deploy the project on GlassFish.
Access it in your browser via: http://localhost:8080/StudentManagement

📌 Notes
The Student entity is persisted using StudentFacade (an EJB stateless bean).
All user interactions (forms) are routed through Servlets.
Bootstrap is used via CDN to enhance UI.
Ensure your GlassFish domain is using a JPA-compatible datasource (e.g., Derby or MySQL).
