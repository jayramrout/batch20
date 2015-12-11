package com.jrout.tutorial.threading;

public class WaitNotifyAll {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		Reader readerOne = new Reader(calc, "ONE");
		Reader readerTwo = new Reader(calc,"TWO");
		Reader readerThree = new Reader(calc,"Three");
		readerOne.start();
		readerTwo.start();
		readerThree.start();
		
		calc.start();
		
		
	}

}

class Reader extends Thread {
	Calculator calc;
	public Reader(Calculator calc, String name) {
		this.calc = calc;
		this.setName(name);
	}
	@Override
	public void run() {
		synchronized(calc) {
			System.out.println(this.getName() + " Waiting for the Calculator to complete...");
			try{
				calc.wait();		
			}catch(InterruptedException exp){
				exp.printStackTrace();
			}
		}
		System.out.println(this.getName() + " Final Value is "+ calc.totalSum);
	}
}

class Calculator extends Thread {
	int totalSum = 0;
	@Override
	public void run() {
		synchronized(this){
			for(int i = 0 ; i < 5 ; i++) {
				totalSum += i;
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			notifyAll();	
		}
	}
}