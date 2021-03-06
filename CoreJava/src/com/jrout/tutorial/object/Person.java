package com.jrout.tutorial.object;

import com.jrout.tutorial.staticexample.Pen;

public class Person { // this person // POJO // Domain Object
	private int age;
	private String name;
	private int height;
	private String address;
	private Pen pen;
	
	/*public Person() {
		age = 1;
		name = "Default";
	}*/
	
	public Person(int age , String name) {
		this.age = age;
		this.name = name;
	}
	
	public Person(int age , String name, int height) {
		this(age,name);
		this.height = height;
	}
	
	public Person(int age , String name, int height, String address) {
		this(age,name,height);
		this.address = address;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			this.age = 1;
		}else {
			this.age = age;	
		}
	}
	
	public int getAge(){
		return age;
	}
	
	 public void setName(String name) {
		this.name = name;
	 } 
	
	public String getName(){
		return name;
	}
	
	public void showDetails() {
		System.out.println("Name :" +name +" Age :" + age );
		System.out.println(getName());
		System.out.println("Hello I am here now.");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Reclaimed "+ name);
	}
}