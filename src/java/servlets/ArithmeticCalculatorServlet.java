
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
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculatorForm.jsp")
                .forward(request, response);
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstnumber = request.getParameter("firstnumber");
        String secondnumber = request.getParameter("secondnumber");
        String operator = request.getParameter("operator");
        
        int firstnumberI = Integer.parseInt(firstnumber);
        int secondnumberI = Integer.parseInt(secondnumber);
        
        request.setAttribute("firstnumber", Integer.parseInt(firstnumber));
        request.setAttribute("secondnumber", Integer.parseInt(secondnumber));
        request.setAttribute("operator", operator);
        
        
        
        int result;
        
        switch(operator){
            case "+":
                result = firstnumberI + secondnumberI;
            case "-":
                result = firstnumberI - secondnumberI;
            case "*":
                result = firstnumberI * secondnumberI;
            case "%":
                result = firstnumberI % secondnumberI;
        }
       
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculatorForm.jsp")
                .forward(request, response);
    }
    
    
    
}
