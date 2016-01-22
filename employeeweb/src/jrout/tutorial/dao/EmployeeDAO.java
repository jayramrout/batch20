package jrout.tutorial.dao;

import java.util.List;

import jrout.tutorial.domain.Employee;

public interface EmployeeDAO {
	public Employee getEmployee(String empId);
	public List<Employee> getEmployeeUsingDeptId(String deptId);
}
