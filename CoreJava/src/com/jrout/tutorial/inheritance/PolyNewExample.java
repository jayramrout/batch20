package com.jrout.tutorial.inheritance;

public class PolyNewExample {

	public static void main(String[] args) {
		Employee fe = new FinancialEmployee(2345, "Shipra", "Finance",4)
		{
			@Override
			public String getTieColor() {
				return "Hey I am BLACK TIE";
			}
		};
		System.out.println(fe.getTieColor());

	}

}
