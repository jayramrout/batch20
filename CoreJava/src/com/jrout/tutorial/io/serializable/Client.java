package com.jrout.tutorial.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person atanu = null;
		atanu = new Person("ATanu", "Kolkata2","4567");
		
		System.out.println(atanu.getAddress() + " "+ atanu.getName() + " " + atanu.getSsn() );
		FileOutputStream fos = new FileOutputStream("atanu.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(atanu);
		oos.close();
		System.out.println("Object written successfully...");
		
		System.out.println("===================");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("atanu.dat"));
		atanu = (Person)ois.readObject();
		System.out.println(atanu.getAddress() + " "+ atanu.getName() + " " + atanu.getSsn() );
		for(;;){
			
		}
	}
}