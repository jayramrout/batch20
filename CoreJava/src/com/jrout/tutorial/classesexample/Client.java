package com.jrout.tutorial.classesexample;

public class Client {

	public static void main(String[] args) {
		ComputerSystem cs = new ComputerSystem();
		cs.color = "White";
		cs.height = 45;
		
		System.out.println(cs.mouse.color); // Blue
	}
}