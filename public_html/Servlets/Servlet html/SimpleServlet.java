import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /*doGet sends right away
    * This method will handle all GET request.
    * Not secure
    * */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException { 
			
PrintWriter out = response.getWriter();
		
		double sqrtvalue = Math.sqrt(8.0);
		
		out.println("<html><body><h1 align='center'>SimpleServlet</h1>"
					+ "<br>The Square root of 8.0 is: " +sqrtvalue + "<br>"
					+ "</body></html>");
				
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//doPost waits until secure connection
	//Secure
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}