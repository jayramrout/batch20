package com.jrout.tutorial.io;

import java.io.InputStreamReader;

public class ReadFromConsole {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		try{
			isr = new InputStreamReader(System.in);
			System.out.println("Enter q to quit");
			char c;
			do{
				c = (char)isr.read();
				System.out.print(c);
			}while(c != 'q');
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}

}
