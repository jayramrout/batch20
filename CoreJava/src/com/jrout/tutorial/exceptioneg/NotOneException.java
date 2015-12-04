package com.jrout.tutorial.exceptioneg;

public class NotOneException extends Exception{
	private String myMessage;
	
	public NotOneException(String myMessage){
		this.myMessage = myMessage;
	}
	
	@Override
	public String toString() {
		return "User Defined Exception "+ myMessage ;
	}
}
