package jrout.tutorial.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jrout.tutorial.dao.EmployeeDAO;
import jrout.tutorial.dao.EmployeeDAOImpl;
import jrout.tutorial.domain.Employee;

/**
 * Servlet implementation class CookiesServlet
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesServlet() {
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
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Cookie cookies[] = request.getCookies();
		System.out.println(cookies);
		String message = "";
		if(cookies != null) {
			for(Cookie cook : cookies) {
				if(cook.getName().equals("myKey") && "234567".equals(cook.getValue())){
					message = ("I am an exiting Client");	
				}
			}
		}else{
			Cookie cookie = new Cookie("myKey","234567");
			response.addCookie(cookie);
			message = ("I am a new Customer");	
		}
		
		
		out.print("<html><body>");
		out.println(message);
		out.println("Please return to Cookie.html <a href=\"" + 
				"http://localhost:8081/employeeweb/cookies.html" + 
				"\">Home Page</a>.");
		
		out.print("</body></html>");
		
	}

}
