package com.jrout.tutorial.object;

public class GarbageCollector {

	public static void main(String[] args) {
		/*Person atanu = new Person(20,"Atanu");
		System.out.println(atanu.getAge());
		System.out.println(anand.getName());
		
		Person anand = new Person(20,"Anand");*/
		
		Person sohail = new Person(20,"Sohail");
		System.out.println("Hello I am here...");
		sohail.showDetails();
		
		/*for(int i = 0 ; i < 20000; i++) {
			new Person(i,"Name"+i);
		}*/
	}
}