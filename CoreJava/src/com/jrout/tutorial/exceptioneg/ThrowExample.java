package com.jrout.tutorial.exceptioneg;

public class ThrowExample {

	public static void main(String[] args) {
		
		System.out.println("I am at the beginning");
		
		/*try {
			Printer.printValue(args);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			Printer.addOnewithSomething(1,2);
		} catch (NotOneException e) {
			e.printStackTrace();
		}catch(Exception exp){
			exp.printStackTrace();
		}
		
		System.out.println("I am at the end");
		
	}
	
	public void callPrinter() throws Exception {
		Printer.addOnewithSomething(1,2);
		Printer.printValue(null);
	}
}