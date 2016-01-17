package jrout.tutorial.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class EmployeeFilter
 */
//@WebFilter(filterName="EmployeeFilter", urlPatterns="/*")
public class EmployeeFilter implements Filter {

    /**
     * Default constructor. 
     */
    public EmployeeFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String empId = request.getParameter("empId");
		String ipAddress = request.getRemoteAddr();
		
		System.out.println("IPAddress "+ ipAddress);
		
		System.out.println("EmployeeFilter.doFilter()" + empId);
		if(empId == null) {
			chain.doFilter(request, response);
		}else{
			int empIdInt = Integer.parseInt(empId);
			if(empIdInt > 200) {
				HttpServletResponse res = (HttpServletResponse)response;
				res.sendRedirect("employee.html");
			}else{
				chain.doFilter(request, response);	
			}	
		}
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
