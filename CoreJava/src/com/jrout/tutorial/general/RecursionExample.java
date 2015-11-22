package com.jrout.tutorial.general;

public class RecursionExample {
	//factorial of 4 =  4*3*2*1 
	public static void main(String[] args) {
		RecursionExample re = new RecursionExample();
		System.out.println(re.factorial(15));
	}
	
	public int factorial(int n) { 
		if(n == 1) return 1;
		return n * factorial(n-1);
	}
	
}