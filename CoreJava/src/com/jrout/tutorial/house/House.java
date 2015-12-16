package com.jrout.tutorial.house;

public class House {
	Bathroom br ;
	Kitchen k;
	
	public House(Bathroom br , Kitchen k) {
		this.br = br;
		this.k = k;
	}
	
	
	public void printDetails(){
		System.out.println("Style if Bathroom is " + br.showerStyle);
	}
}
