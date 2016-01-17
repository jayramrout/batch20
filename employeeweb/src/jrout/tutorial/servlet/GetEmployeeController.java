package jrout.tutorial.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jrout.tutorial.dao.EmployeeDAO;
import jrout.tutorial.dao.EmployeeDAOImpl;
import jrout.tutorial.domain.Employee;

/**
 * Servlet implementation class GetEmployeeServlet
 */
@WebServlet("/GetEmployeeController")
public class GetEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId = request.getParameter("empId");
		
		EmployeeDAO	employeeDao = new EmployeeDAOImpl();
		Employee employee = employeeDao.getEmployee(empId);
		
		request.setAttribute("employee", employee);
/*		String queryString = "?fn="+employee.getFirstName()+"&ln="+employee.getLastName()+"&email="+employee.getEmail();
		
		RequestDispatcher body = request.getRequestDispatcher("EmployeeViewServlet"+queryString);
		body.include(request, response);
*/
//		RequestDispatcher body = request.getRequestDispatcher("EmployeeViewServlet");
		RequestDispatcher body = request.getRequestDispatcher("employeeViewJSP.jsp");
		body.forward(request, response);
		
//		response.sendRedirect("EmployeeViewServlet?fn="+employee.getFirstName());
	}

}
