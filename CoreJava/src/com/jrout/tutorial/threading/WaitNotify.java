package com.jrout.tutorial.threading;

public class WaitNotify {

	public static void main(String[] args) throws Exception {
		Summer s = new Summer();
		s.start();
		
		synchronized(s) {
			System.out.println("Waiting for Summer to complete...");
			try{
				s.wait();		
			}catch(InterruptedException exp){
				exp.printStackTrace();
			}
		}
		
		System.out.println(s.totalSum);
	}
}