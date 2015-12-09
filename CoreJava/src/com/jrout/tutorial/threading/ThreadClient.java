package com.jrout.tutorial.threading;

public class ThreadClient {

	public static void main(String[] args) throws Exception {
		System.out.println("Started....");
		System.out.println(Thread.currentThread().getName());
		
		Runner runner = new Runner();
		
		Thread atanu = new Thread(runner);
		atanu.setName("Atanu");
		
		Thread satya = new Thread(runner,"Satya");

		atanu.start();
		satya.start();
//		satya.setPriority(5);

//		runner.setName("ATanu");
		/*Runner runner2 = new Runner();
		runner2.setName("Satya");
		runner.start();
		runner2.start();*/
		
		System.out.println("Finished...");
		
		
	}
}