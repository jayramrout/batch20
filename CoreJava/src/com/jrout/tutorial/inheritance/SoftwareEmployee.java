package com.jrout.tutorial.inheritance;

import com.jrout.tutorial.inheritance.abstractionexample.Running;

public class SoftwareEmployee extends Employee implements Running{
	
	public SoftwareEmployee(int empId, String name, String empDept) {
		super(empId, name, empDept);
	}

	private int javaExp;
	
	public int getJavaExp() {
		return javaExp;
	}

	public void setJavaExp(int javaExp) {
		this.javaExp = javaExp;
	}
	
	public void printMyDetails(){
		System.out.println(getEmpId() +" " +getEmpDept() +" " + getName());
	}
	
	@Override
	public String getTieColor() {
		return super.getEmpDept()+ " Employee has White color Tie";
	}
	
	@Override
	public String toString() {
		return getEmpId() +" " +getEmpDept() +" " + getName();
	}

	@Override
	public void runningSpeed() {
		System.out.println("My running speed is very very good...bad..");
	}
}