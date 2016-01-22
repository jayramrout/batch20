package jrout.tutorial.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import jrout.tutorial.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static String oracleDriver = "oracle.jdbc.driver.OracleDriver";
	private static String oracleConnectionURL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public EmployeeDAOImpl() {
		try {
			Class.forName(oracleDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Employee getEmployee(String empId){
		Employee emp = null;
		try {
			con = DriverManager.getConnection(oracleConnectionURL, "HR", "HR");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employees where employee_id = "+ empId);
			
			while(rs.next()){
				emp = new Employee();
				emp.setFirstName(rs.getString("First_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
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
		return emp;
	}
	@Override
	public List<Employee> getEmployeeUsingDeptId(String deptId) {
		return null;
	}
}
