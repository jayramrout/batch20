package com.jrout.tutorial.threading;

public class Summer extends Thread {
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
			notify();	
		}
	}
}