/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.Controller;

import java.io.IOException;
import java.io.PrintWriter;
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
public class DeleteStudentServlet extends HttpServlet {
@EJB
private StudentFacadeLocal sfl;
    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String stuNum=request.getParameter("stuNum");
            
        try {
            int studNo=Integer.parseInt(stuNum);
            Student student=sfl.find(studNo);
            if (student!=null) {
            sfl.remove(student);
            request.getRequestDispatcher("DeleteStudentSuccess.html").forward(request, response);
            }else{
            request.getRequestDispatcher("StudentNotFount.html").forward(request, response);
            }
          
            
        } catch (NumberFormatException e) {
            String message="The student number must be a int "+e.getMessage();
            request.setAttribute("message", message);
            request.getRequestDispatcher("ErrorPage.jsp").forward(request, response);
        } catch(EJBException ejb){
        String message="The student number does not exist so "+ejb.getMessage();
            request.setAttribute("message", message);
            request.getRequestDispatcher("ErrorPage.jsp").forward(request, response);
        }
            
            
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
