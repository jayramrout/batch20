package com.jrout.tutorial.object;

public class Overloading {

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.calc(1, 2);
		ol.calc(1,2,3);
//		ol.printDetails("jay", 20);
//		ol.printDetails(20 ,"jay");
	}
	
	public void calc(int a , int b){
		System.out.println(a+b);
	}
	
	public void calc(int a , int b, int c){
		System.out.println(a+b+c);
	}
	
	/*public void printDetails(String name , int age) {
		System.out.println(name + " " + age);
	}
	
	public void printDetails(int age , String name) {
	
	}*/
	
}
