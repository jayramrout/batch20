package com.jrout.tutorial.staticexample;

public class StaticExample {
	public static final String name = "Helo";
	public String instanceVariable = "";
	public static String classLevelVariable = "";
	
	public static void callMe() {
//		System.out.println(instanceVariable);
//		callNonStatic("Jay");
	}
	
	public void callNonStatic(){
		callNonStatic("Jay");
	}
	
	public void callNonStatic(String name){
		
	}
	
	public static void main(String[] args) {
		Pen rotomac = new Pen("Rotomac");
		
		/*Pen rotomac = new Pen("Rotomac");
		rotomac.height = 5;
		rotomac.country = "Germany";
		System.out.println("Line 9 "+ rotomac.country);
		
		Pen philip = new Pen("Philip");
		philip.height = 4;
		philip.country = "India";
		System.out.println(" Line 14 "+ philip.country);
		
//		System.out.println(rotomac.name + " Height = "+ rotomac.height);
//		System.out.println(philip.name +" Height = " + philip.height);
		
		System.out.println(rotomac.country);
		System.out.println(philip.country);
		
		System.out.println(Pen.country);
		
//		System.out.println(Pen.name);
		
		System.out.println(new Pen("Jayram").name);
		
		String name = "Jayram";
		
		System.out.println(name.toUpperCase());
		StringUtil su = new StringUtil();
		System.out.println(StringUtil.toUpperCase(name));*/
		
//		Pen roto = new Pen("Roto");
//		System.out.println(Pen.country);
//		
//		System.out.println(Pen.country);
//		
		Pen.country = "India";
		
		Pen roto = new Pen("Roto");
		roto.color ="Black";
		System.out.println(roto.name);
		
		Pen phil = new Pen("Phil");
		System.out.println(phil.name);
		
		System.out.println(roto.country);
		System.out.println(phil.country);
		
	}
}


