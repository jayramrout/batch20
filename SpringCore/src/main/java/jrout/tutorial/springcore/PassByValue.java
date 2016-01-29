package jrout.tutorial.springcore;

public class PassByValue {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		addMe(a,5); // Pass by value
		System.out.println(a);
		
		Address address = new Address();
		address.setCountry("India");
		System.out.println(address.getCountry());
		showAddress(address);
		System.out.println(address.getCountry());
	}
	
	public static void addMe(int a , int b){
		a = 90;
	}
	
	public static void showAddress(Address address){
		address.setCountry("USA");
	}
	
	
	
	
	
}