package za.ac.tut.Controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.Model.Student;
import za.ac.tut.Model.StudentFacadeLocal;

public class SearchStudentServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int stuNum = Integer.parseInt(request.getParameter("stuNum"));
        Student student = sfl.find(stuNum);

        if (student != null) {
            request.setAttribute("student", student); // Add student to request
            request.getRequestDispatcher("SearchResult.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("StudentNotFount.html").forward(request, response); // Fix filename
        }
    }
}
