/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.Model.Student;
import za.ac.tut.Model.StudentFacadeLocal;

/**
 *
 * @author Desmond
 */
public class SaveEditedStudentServlet extends HttpServlet {

   
@EJB
private StudentFacadeLocal sfl;
   
   @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    
    int studNum = Integer.parseInt(request.getParameter("stuNum"));
    String name = request.getParameter("name");
    String surname = request.getParameter("surname");
    String qualification = request.getParameter("qualification");

    Student student = sfl.find(studNum);
    student.setName(name);
    student.setSurname(surname);
    student.setQualification(qualification);

    sfl.edit(student);
    
    request.getRequestDispatcher("EditSuccess.html").forward(request, response);
}


}
