package com.jrout.tutorial.threading;
class Sports{
	
}
public class Runner extends Sports implements Runnable { //extends Thread {
	
	public void run(){
//		synchronized(this){
			for(int i = 0 ; i < 5; i++) {
				/*try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				System.out.println("Running "+ Thread.currentThread().getName() +" " + i);	
			}	
//		}
		
	}
}
