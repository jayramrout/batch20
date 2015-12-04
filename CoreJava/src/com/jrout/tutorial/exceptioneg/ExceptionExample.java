package com.jrout.tutorial.exceptioneg;

import com.jrout.tutorial.inheritance.abstractionexample.Music;
import com.jrout.tutorial.inheritance.abstractionexample.classical.VocalClassical;

public class ExceptionExample {

	public static void main(String[] args) {
		VocalClassical cm = new VocalClassical("classical", "viji", "Biina");
		cm.setClassicalMusicType("CMT");
		
		multipleException(cm, args);
		
	}
	
	
	public static void multipleException(VocalClassical cm, String[] args){
		
		System.out.println(cm.getSinger().toUpperCase());
		String type = cm.getType();
		System.out.println(type.toUpperCase());
		
		String cmt = cm.getClassicalMusicType();
//		System.out.println(args[2]);
		
		try{
			System.out.println(cmt.toUpperCase());
			
			System.out.println(args[2]);
		}catch(NullPointerException exp) {
			System.out.println("In NPE");
			exp.printStackTrace();
			cmt = "Value is NULL";
		}catch(ArrayIndexOutOfBoundsException exp){
			System.out.println("In Some other exception");
			exp.printStackTrace();
		}catch(Exception exp) {
			
		}finally{
			System.out.println("I am in finally block...");
		}
		
		System.out.println(cmt.toUpperCase());
		
		System.out.println("I am done with the program...");
		
	}
	

	public void numberFormatException(String arg) {

		System.out.println("Parsing Started...");

		int a = 0;

		try {
			a = Integer.parseInt(arg);
		} catch (Exception exp) {
			System.err.println("I am in exception block...");
			exp.printStackTrace();
			a = 2;
		}

		System.out.println("Parsing done...");
		int b = 10 + a;
		System.out.println(b);

		int c = b + getValue(a);

		System.out.println("Final result = " + c);
	}

	public static int getValue(int a) {
		return a + 400;
	}
}
