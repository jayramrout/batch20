package com.jrout.tutorial.exceptioneg;

public class Printer {
	
	public static void printValue(String [] args) throws Exception {
		System.out.println("args value "+ args[1]);
	}
	
	public static void addSomething(int one , int something) throws Exception {
		if(one != 1) {
			throw new Exception("First Value is not ONE..Please check...");
		}
		System.out.println(one + something);
	}
	
	public static void addOnewithSomething(int one , int something) throws NotOneException {
		if(one != 1) {
			throw new NotOneException("First Value is not ONE..Please check...");
		}
		System.out.println(one + something);
	}
}
