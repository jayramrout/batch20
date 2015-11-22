package com.jrout.tutorial.enumExample;

enum Coffee {
	SMALL ,MEDIUM ,LARGE;
}

public class EnumExample {

	public static void main(String[] args) {
		EnumExample ee = new EnumExample();
		ee.printDay(Days.TUE);
	} 
	
	public void printDay(Days day){
		if(day == Days.MON) {
			System.out.println("Monday is a Great Day with value =" + day.getValue());
		}else if(day == Days.TUE) {
			System.out.println("Tuesday is Pretty Good = "+ day.getValue());
		}else if(day == Days.WED) {
			System.out.println("Wed is Awesome");
		}
	}
	
	public void printDay2(Days day){
		if(day.getValue() == 1) {
			System.out.println("Monday is a Great Day");
		}else if(day.getValue() == 2) {
			System.out.println("Tuesday is Pretty Good");
		}else if(day.getValue() == 3) {
			System.out.println("Wed is Awesome");
		}
	}

}
