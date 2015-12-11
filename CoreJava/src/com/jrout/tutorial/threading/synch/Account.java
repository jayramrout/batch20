package com.jrout.tutorial.threading.synch;

public class Account {
	private int balance = 50;
	public int getBalance(){
		return balance;
	}
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
