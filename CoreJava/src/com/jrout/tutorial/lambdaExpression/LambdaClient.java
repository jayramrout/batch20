package com.jrout.tutorial.lambdaExpression;

public class LambdaClient {

	public static void main(String[] args) {
//		WorkerInterface wi = new WorkerImpl();
//		wi.working();
		
		WorkerInterface wi = () -> System.out.println("I am from worker department...");
		wi.working();
	
		Calcuator calc = new Add();
		System.out.println(calc.calc(4, 3));
		
		calc = new Sub();
		System.out.println(calc.calc(4, 3));
		
		calc = (a ,b) -> a/b;
		System.out.println(calc.calc(4, 2));
		
		callMe(calc);
	}
	
	public static void callMe(Object obj) {
		System.out.println(obj);
	}
}
