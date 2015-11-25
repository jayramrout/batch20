package com.jrout.tutorial.inheritance;

public class InheritanceClient {

	public static void main(String[] args) {
		Employee shipra = new Employee(2345,"Shipra","Finance");
		Employee mahadevan = new Employee(2345,"Mahadevan","Software");
		
		
		FinancialEmployee fe = new FinancialEmployee(2345, "Shipra", "Finance",4);
//		fe.setFinancicalExp(4);
		
		System.out.println(fe.getEmpDept());
		System.out.println(fe.getEmpId());
		System.out.println(fe.getFinancicalExp());
		System.out.println(fe.getName());
		System.out.println(fe.getTieColor());
		
		
		SoftwareEmployee se = new SoftwareEmployee(2345,"Mahadevan","Software");
		System.out.println(se.getName());
		System.out.println(se.getTieColor());
		
	}

}
