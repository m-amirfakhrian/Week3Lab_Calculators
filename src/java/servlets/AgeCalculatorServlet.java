
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Majid
 */
public class AgeCalculatorServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
    
        request.setAttribute("age", age);        
        
        // Validation
        if((age == null || age.equals(""))){  
            request.setAttribute("message" , "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp")
                    .forward(request, response);
            return;
        }
        
        int ageInt = Integer.parseInt(age) + 1;
        String messageN = "Your age next birthday will be " + ageInt;
        request.setAttribute("message" , messageN);        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
}
