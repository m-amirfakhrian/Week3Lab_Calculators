
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
    String result = "---";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //String result = "---";
        request.setAttribute("result" , result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculatorForm.jsp")
                .forward(request, response);
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstnumber = request.getParameter("firstnumber");
        String secondnumber = request.getParameter("secondnumber");
        String operator = request.getParameter("operator");
        
        request.setAttribute("firstnumber", firstnumber);
        request.setAttribute("secondnumber", secondnumber);
        request.setAttribute("operator", operator);
        
        try
        {
            int firstnumberI = Integer.parseInt(firstnumber);
            int secondnumberI = Integer.parseInt(secondnumber);
            
            int resultInt = 0;
            
            switch(operator){
                case "+":
                    resultInt = firstnumberI + secondnumberI;
                    break;
                case "-":
                    resultInt = firstnumberI - secondnumberI;
                    break;
                case "*":
                    resultInt = firstnumberI * secondnumberI;
                    break;
                case "%":
                    resultInt = firstnumberI % secondnumberI;
                    break;
            }
            request.setAttribute("result" , resultInt);
        }
        catch(Exception e)
        {
            request.setAttribute("result" , "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculatorForm.jsp")
                    .forward(request, response);
            return;
        }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculatorForm.jsp")
                .forward(request, response);
        return;
    }
    
    
    
}
