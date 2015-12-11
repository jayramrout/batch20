package com.jrout.tutorial.threading.deadlock;

//DeadLockClient$Boy.class
//DeadLockClient$Girl.class

public class DeadLockClient {
	static String bike ="Bike";
	static String helmet ="Helmet";
	
	public static void main(String[] args) {
//		Boy boy = new DeadLockClient().new Boy();
		Boy boy = new Boy();
		boy.start();
		
		Girl girl = new Girl();
		girl.start();
		
	}
	static class Boy extends Thread {
		public void run() {
			synchronized(bike){
				System.out.println("Boy got hold of the bike");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Boy is waitig for Helmet");
				synchronized(helmet){
					System.out.println("Boy got hold of the Helmet");	
				}
			}
			System.out.println("Boy finished Biking....");
		}
	}
	
	static class Girl extends Thread{
		public void run() {
			synchronized(bike){
				System.out.println("Girl got hold of the Bike");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Girl is waitig for Helmet");
				synchronized(helmet){
					System.out.println("Girl got hold of the Helmet");	
				}
			}
			System.out.println("Girl finished Biking....");
		}
	}
}


