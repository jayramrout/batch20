package com.jrout.tutorial.inheritance;

public class MethodOverrdingClient {

	public static void main(String[] args) {
		FinancialEmployee fe = new FinancialEmployee(2345, "Shipra", "Finance",4);
//		System.out.println(fe.getTieColor());
		
		Object se = new SoftwareEmployee(2345,"Mahadevan","Software");
//		System.out.println(se.getTieColor());
		
		System.out.println(se);
		Object obj = new Object();
		
	}
}
