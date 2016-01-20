package jrout.tutorial.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(3000);
		
		String logout = request.getParameter("logout");
		String inbox = request.getParameter("inbox");
		String fname = request.getParameter("fname");
		System.out.println("fname from request "+ fname);
//		session.removeAttribute(arg0);
//		request.getServletContext();
		
		ServletContext application = session.getServletContext();
		
		application.setAttribute("count", new Integer(count++));
//		application.removeAttribute("count");
		
		String sessionName = (String)session.getAttribute("name");
		if(sessionName != null){
				System.out.println("I am not null");
		}else {
			session.setAttribute("name", fname);
		}
		
		
		if("true".equals(logout)){
			session.invalidate();
			response.sendRedirect("session.html");
		}else{
			if(session.isNew()){
				out.println("I am in new session");
			}else{
				out.println("I am in an existing session");
			}
			if("true".equals(inbox)){
				RequestDispatcher body = request.getRequestDispatcher("inbox.jsp");
				body.forward(request, response);

//				String name = (String)session.getAttribute("name");
//				response.sendRedirect("inbox.jsp?name="+name);
			}
			out.println("Name is "+ fname+"<br>");
			
			out.println("<a href=\"" + 
					response.encodeURL("http://localhost:8081/employeeweb/SessionServlet?inbox=true") + 
					"\">Inbox</a>.<br>");
			
			out.println("Send request Again <a href=\"" + 
					response.encodeURL("http://localhost:8081/employeeweb/SessionServlet") + 
					"\">Send Request Again</a>.<br>");
			
			out.println("<a href=\"" + 
					response.encodeURL("http://localhost:8081/employeeweb/SessionServlet?logout=true") + 
					"\">Logout</a>.");	
		}
		
		
	}
}