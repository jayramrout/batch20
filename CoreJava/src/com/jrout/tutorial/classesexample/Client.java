package com.jrout.tutorial.classesexample;

//import com.jrout.tutorial.object.Calculator;
//import datatypes.Calculator;
public class Client {

	public static void main(String[] args) {
		/*ComputerSystem cs = new ComputerSystem();
		cs.color = "White";
		cs.height = 45;
		
		System.out.println(cs.mouse.color); // Blue
		*/
		com.jrout.tutorial.object.Calculator calc = new com.jrout.tutorial.object.Calculator(3,4);
		System.out.println(calc.add());
		
		datatypes.Calculator calc1 = new datatypes.Calculator(3,4);
		System.out.println(calc1.add());
			
	}
}