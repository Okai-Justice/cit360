import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PracticeServlet
 */
@WebServlet("/PracticeServlet")
public class PracticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see JIL
     */
    public PracticeServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException { 
			
PrintWriter out = response.getWriter();
		
		double sqrtvalue = Math.sqrt(8.0);
		
		out.println("<html><body><h1 align='center'>ServletPractice</h1>"
					+ "<br>The Square root of 8.0 is: " +sqrtvalue + "<br>"
					+ "</body></html>");
				
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		

	}

}