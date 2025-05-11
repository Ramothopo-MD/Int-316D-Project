/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
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
public class AddStudentServlet extends HttpServlet {
@EJB
private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String studNum=request.getParameter("studNo");
            
            String name=request.getParameter("name");
            String surname=request.getParameter("surname");
            String dob=request.getParameter("dob");
            String qualification=request.getParameter("qualification");
            Date dateOfBirth=null;
          
            
            
            
            SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        try {
            int studNo=Integer.parseInt(studNum);
            dateOfBirth=format.parse(dob);
            Student stud=new Student(studNo, name, dateOfBirth, surname, qualification, new Date(System.currentTimeMillis()));
            sfl.create(stud);
            request.getRequestDispatcher("AddSuccess.html").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AddStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NumberFormatException n){
            String message="The student number is supposed to be a int but it is "+n.getMessage();
            request.setAttribute("message", message);
        request.getRequestDispatcher("ErrorPage.jsp").forward(request, response);
        }catch (EJBException ejb){
         String message="The student number already exists in the database "+ejb.getMessage();
         request.setAttribute("message", message);
         request.getRequestDispatcher("ErrorPage.jsp").forward(request, response);
        }
    }

    

}
