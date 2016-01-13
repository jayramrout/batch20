package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/EmployeeServlet", "/EmployeePage" })
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public EmployeeServlet() {
        super();
        System.out.println("Servlet is created..");
    }

	@Override
    public void init() throws ServletException {
    	System.out.println("Servlet is initialized.....");
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		System.out.println("In the service method...");
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("<input type=\"text\"  name=\"name\" />");
		out.print("Hello "+ name + " How are you..." + new java.util.Date());
		out.print("</body></html>");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In the service method...");
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("<input type=\"text\"  name=\"name\" />");
		out.print("Hello "+ name + " How are you..." + new java.util.Date());
		out.print("</body></html>");
	}*/
	
	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed...");
	}

}
