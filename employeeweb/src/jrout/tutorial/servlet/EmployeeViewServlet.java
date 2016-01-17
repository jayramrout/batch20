package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jrout.tutorial.domain.Employee;

/**
 * Servlet implementation class EmployeeViewServlet
 */
@WebServlet("/EmployeeViewServlet")
public class EmployeeViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setContentType("application/pdf");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String email = request.getParameter("email");*/
		
		Employee emp = (Employee)request.getAttribute("employee");
		
		out.print("<html><body>");
		out.println("Hello you are in the view servlet");
		out.println("Details : Employee FN : "+ emp.getFirstName() +" <br>");
		out.println("Employee LN : "+ emp.getLastName() +" <br>");
		out.println("Employee Email : "+ emp.getEmail() +" <br>");
		out.println("Please return to the <a href=\"" + 
				response.encodeURL("http://localhost:8081/employeeweb") + 
				"\">Home Page</a>.");
		
		out.print("</body></html>");
	}
}