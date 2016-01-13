package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetEmployeeServlet
 */
@WebServlet("/GetEmployeeServlet")
public class GetEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String oracleDriver = "oracle.jdbc.driver.OracleDriver";
	private static String oracleConnectionURL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeeServlet() {
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
		String empId = request.getParameter("empId");
		String empQuery = "select * from employees where employee_id = "+ empId;
		String employeeFN = null;
		String employeeLN = null;
		String employeeEmail = null;
		try {
			Class.forName(oracleDriver);
			// Driver driver = new oracle.jdbc.driver.OracleDriver();
			// DriverManager.registerDriver(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(oracleConnectionURL, "HR", "HR");
			stmt = con.createStatement();
			rs = stmt.executeQuery(empQuery);
			while(rs.next()){
				employeeFN = rs.getString("First_name");
				employeeLN = rs.getString("last_name");
				employeeEmail = rs.getString("email");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			if(con != null){
				try {
					con.close();
				} catch (SQLException e2) {
					e.printStackTrace();
				}
			}
		}
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("Details : Employee FN : "+ employeeFN +" <br>");
		out.println("Employee FN : "+ employeeLN +" <br>");
		out.println("Employee FN : "+ employeeEmail +" <br>");
		out.print("</body></html>");
	}

}
