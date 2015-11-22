package com.jrout.tutorial.enumExample;

public enum Days {
	MON(1),TUE(2),WED(3),THRU(4),FRI(5),SAT(6),SUN(7);
	
	private int value;
	private Days(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}
}