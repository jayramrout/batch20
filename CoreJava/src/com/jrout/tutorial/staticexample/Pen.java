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
	
	public static Pen p = new Pen("");
	
	public static Pen getInstance(){
		if(p == null) {
			p = new Pen("");
		}
		return p;
	}
}