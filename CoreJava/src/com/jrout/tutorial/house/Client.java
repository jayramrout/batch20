package com.jrout.tutorial.house;

public class Client {

	public static void main(String[] args) {
		Bathroom br = new Bathroom();
		br.showerStyle = "Stylish";
		
		House h = new House(br, new Kitchen());
		h.printDetails();
		
//		Testing test = new Testing();
		
	}
}