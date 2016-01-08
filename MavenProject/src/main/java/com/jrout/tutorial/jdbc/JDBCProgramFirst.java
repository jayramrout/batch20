package com.jrout.tutorial.jdbc;

import java.sql.*;

public class JDBCProgramFirst {
	private static String empQuery = "select * from employees";
	private static String oracleDriver = "oracle.jdbc.driver.OracleDriver";
	private static String oracleConnectionURL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static void main(String[] args) {

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
				System.out.println(rs.getString("EMPLOYEE_ID") +" " + rs.getString(2));
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
	}
}
