/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class GetListServlet extends HttpServlet {
@EJB
private StudentFacadeLocal sfl;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            List<Student> students=sfl.findAll();
            request.setAttribute("students", students);
            request.getRequestDispatcher("List.jsp").forward(request, response);
    }

    
}
