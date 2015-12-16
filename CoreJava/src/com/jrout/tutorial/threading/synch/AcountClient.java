package com.jrout.tutorial.threading.synch;

public class AcountClient {

	public static void main(String[] args) {
		Bank account = new Bank();
		
		Thread husband = new Thread(account , "Husband");
		Thread wife = new Thread(account,"Wife");
		Thread child1 = new Thread(account , "Husband");
		Thread child2 = new Thread(account , "Husband");

		husband.start();
		wife.start();
		
		child1.start();
		child2.start();
	}

}
