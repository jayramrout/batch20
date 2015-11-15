package com.jrout.tutorial.object;

/**
 * This is used to calcution two number
 * @author Jayram
 *
 */
public class Calculator {
	int a;
	int b;
	
	public Calculator(int a , int b){
		this.a = a;
		this.b = b;
	}
	
	public int add(){
		return a+b;
	}
	
	public int sub() {
		return a-b;
	}
	
	public int finalResult() {
		return add() + sub();
	}
}
