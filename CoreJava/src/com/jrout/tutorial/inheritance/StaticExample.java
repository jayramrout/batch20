package com.jrout.tutorial.inheritance;

public class StaticExample {
	public static void main(String arg[]) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		new Employee();
		new Employee();
		System.out.println(emp3.empCount);
		emp3.empCount = 0;
		Employee.empCount = 0;
	}
}