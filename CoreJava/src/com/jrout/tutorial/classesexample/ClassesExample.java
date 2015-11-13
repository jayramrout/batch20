package com.jrout.tutorial.classesexample;

public class ClassesExample {
	int one = 89;
	
	public static void main(String[] args) {
		int two = 89;

		Mouse logitechMouse = new Mouse(); // instance // object
		logitechMouse.color = "Black"; // State
		logitechMouse.length = 5;
		logitechMouse.company = "Logitech";
		logitechMouse.model = "XYZ";

		logitechMouse.printDetails();

		logitechMouse.cost();
		
		System.out.println(logitechMouse.color);
		
		/*System.out.println(logitechMouse.length);
		System.out.println(logitechMouse.company);
		System.out.println(logitechMouse.model);
		 */
		Mouse logitechMouse2 = logitechMouse;
		logitechMouse2.color = "Purple";
		
//		System.out.println(logitechMouse2.color);
//		System.out.println(logitechMouse.color);
		
		/*
		 System.out.println(logitechMouse2.length);
		System.out.println(logitechMouse2.company);
		System.out.println(logitechMouse2.model);
		 */
		
		/*Mouse appleMouse = new Mouse();
		appleMouse.color = "White";
		appleMouse.length = 4;
		appleMouse.company = "Apple";
		appleMouse.model = "appleModel";
		
		
		System.out.println(appleMouse.color);
		System.out.println(appleMouse.length);
		System.out.println(appleMouse.company);
		System.out.println(appleMouse.model);*/
		
		
	}
}