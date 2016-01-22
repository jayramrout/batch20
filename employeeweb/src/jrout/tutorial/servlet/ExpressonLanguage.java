package jrout.tutorial.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jrout.tutorial.domain.Address;
import jrout.tutorial.domain.Employee;

/**
 * Servlet implementation class GetEmployeeServlet
 */
@WebServlet("/ExpressonLanguage")
public class ExpressonLanguage extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExpressonLanguage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String [] bigFive = {"U.S.A", "Russia", "France", "China","U.K"};
		HttpSession session = request.getSession();
		
		request.setAttribute("bigFive", bigFive);
		session.setAttribute("name", "Jayram");
		
		Address address = new Address();
		address.setStreeName("Lexington");
		
		Employee employee = new Employee();
		employee.setFirstName("Rajesh");
		employee.setLastName("Mathur");
		employee.setEmail("rmathur@gmail.com");
		employee.setAddress(address);
		
		session.setAttribute("employee", employee);
		
		RequestDispatcher body = request.getRequestDispatcher("el/arrayAccess.jsp");
		body.forward(request, response);

	}

}
