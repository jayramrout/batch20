package com.jrout.tutorial.inheritance;

public class ClassCastClient {

	public static void main(String[] args) {
		FinancialEmployee fe = new FinancialEmployee(2345, "Shipra", "Finance",4);
		printMe(fe);
		
		SoftwareEmployee se = new SoftwareEmployee(2345,"Mahadevan","Software");
		printMe(se);
		
		int i = 3 ;
		
//		Integer inObj = new Integer(i);
		Integer intObj = i; // Autoboxing
		int c = intObj;
	}
	
	public static void printMe(Object emp){
		if(emp instanceof FinancialEmployee) {
			FinancialEmployee fe = (FinancialEmployee)emp;
			System.out.println("Exp Is : "+ fe.getFinancicalExp());;
		}else if(emp instanceof SoftwareEmployee) {
			SoftwareEmployee fe = (SoftwareEmployee)emp;
			System.out.println("Java exp is : " + fe.getJavaExp());;
		}
	}
}