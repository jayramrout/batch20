package com.jrout.tutorial.staticexample;

public class Pen {
	public String name;
	public  String color;
	public int height;
	public static String country = "India";
	
	public Pen(String name) {
		System.out.println("I am in constructor");
		this.name = name;
	}
	
	static{
		System.out.println("I am in static Block...");
	}
}