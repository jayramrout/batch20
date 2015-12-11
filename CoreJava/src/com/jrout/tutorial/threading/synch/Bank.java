package com.jrout.tutorial.threading.synch;

public class Bank implements Runnable {
	private Account account = new Account();

	@Override
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			makeWithdraw(10);
			if(account.getBalance() < 0) {
				System.out.println(Thread.currentThread().getName() + " Over drawn from the Account  !!!!");
			}
		}
	}
	
	private synchronized void makeWithdraw(int amount){
		if(account.getBalance() >= amount){
			account.withdraw(10);
			System.out.println(Thread.currentThread().getName() + " Now balance is "+ account.getBalance());
		}else {
			System.out.println(Thread.currentThread().getName() + "No Balance .. Sorry !!!");
		}
	}
}
