package com.jrout.tutorial.inheritance;

public class PolymorphismExample {

	public static void main(String[] args) {
		Employee fe = new FinancialEmployee(2345, "Shipra", "Finance",4);
		printDetails(fe);

		Employee se = new SoftwareEmployee(2345,"Mahadevan","Software");
		printDetails(se);

/*		Employee emp = null;
		emp = new FinancialEmployee(2345, "Shipra", "Finance",4);
		printDetails(emp);

		emp = new SoftwareEmployee(2345,"Mahadevan","Software");
		printDetails(emp);*/
		
	}
	
	public static void printDetails(Employee se) {
		System.out.println(se.getTieColor());
		System.out.println("Poly Dept " + se.getEmpDept());
		System.out.println("Poly EmpId "+ se.getEmpId());
	}
	
	
	
}