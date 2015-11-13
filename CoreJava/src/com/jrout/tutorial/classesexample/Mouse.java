package com.jrout.tutorial.classesexample;

public class Mouse {
	String color;
	int length;
	String company;
	String model;
	
	public void printDetails(){
		System.out.println("===============");
		System.out.println(color);
		System.out.println(length);
		System.out.println(company);
		System.out.println(model);
	}
	
	public void cost(){
		int tempCost = 0 ;
		if("Logitech".equals(company)){
			tempCost = 300;
		}
		if("Silver".equals(color)){
			tempCost = tempCost + 10;
		}
		System.out.println("Cost is "+ tempCost);
	}
}