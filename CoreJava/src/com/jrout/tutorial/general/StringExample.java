package com.jrout.tutorial.general;

public class StringExample {

	public static void main(String[] args) {
		String name = new String("Jayram");
		String name2 = new String("Jayram");
		
		System.out.println(name.equals(name2));
		System.out.println(name == name2);
		System.out.println("=============");
		
		String name3 = "Atanu";
		String name4 = "Atanu";
		
		name3 = name3+" Test";
		
		System.out.println(name3.equals(name4));
		System.out.println(name3 == name4);
		
		System.out.println(name3);
		
//		String finalResult  = "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < 10 ; i++) {
//			finalResult = finalResult.concat(i+"");
			sb.append(i);
		}
		System.out.println(sb);
	}

}
