package com.jrout.tutorial.object;

public class ObjectAsParameter {

	public static void main(String[] args) {
		
//		Person satya = new Person(20,"Satya",5);
//		oap.objectParameter(satya);

		ObjectAsParameter oap = new ObjectAsParameter();
		Person ajay = new Person(11,"Ajay");
		System.out.println("Before ==========="+ajay.getName());
		System.out.println(ajay);
		oap.objectParameter(ajay);
		System.out.println("AFter ==========="+ajay.getName());
		
		int val = 200;
		System.out.println("Before "+ val);
		oap.callMeParameter(val);
		System.out.println("After "+ val);
		
		String name = new String("Viji");
		
		System.out.println("Before " + name);
		
		oap.changeMe(name);
		
		System.out.println("After " + name);
		
		int a = 10;
		Integer intObj = new Integer(10);
		
		String name1 = "Jayram";
		name1 = "Rout";
	}
	
	public void objectParameter(Person per){
//		per.showDetails();
		per.setName("Testing");
	}
	
	public void callMeParameter(int age){
		age = 10;
	}
	
	public void changeMe(String name) {
		String test = "TestingName";
		name = test;
	}
	
}
