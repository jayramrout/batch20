package com.jrout.tutorial.object;

public class CompanyClient {

	public static void main(String[] args) {
		Person ajay = new Person(11,"Ajay"); // Constructor
		
		Person satya = new Person(20,"Satya",5);
		
		System.out.println(satya.getName());
//		ajay.age = -1;
//		ajay.setAge(11);
//		ajay.setName("Ajay");
		/*ajay.setHeight(7);
		ajay.setName("Ajay");
		ajay.setAddress("India");*/
		
		System.out.println(ajay.getAge());
		System.out.println(ajay.getName());
		
		/*Calculator calc = new Calculator(4,5);
		System.out.println(calc.add());
		System.out.println(calc.finalResult());*/
		Overloading ol = new Overloading();
		ol.calc(3, 3);
	}
}
