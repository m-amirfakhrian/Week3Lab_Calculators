
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
        
        // get age parameters from the POST request
        if((age == null || age.equals(""))){
            request.setAttribute("message" , "You must give your current age");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp")
                    .forward(request, response);
            return;
        }
        
        
        try
        {
            int ageInt = Integer.parseInt(age);
            String messageN;
            if (ageInt > 0){
                messageN = "Your age next birthday will be " + ++ageInt;
            }else
            {
                messageN = "Your age can not be a negative number.";
            }
            request.setAttribute("message" , messageN);
        }
        catch(Exception e)
        {
            request.setAttribute("message" , "You must give a correct age.");
            getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp")
                    .forward(request, response);
            return;
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp")
                .forward(request, response);
        return;
    }
}
