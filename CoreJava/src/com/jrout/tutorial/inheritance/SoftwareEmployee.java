package com.jrout.tutorial.inheritance;

public class SoftwareEmployee extends Employee {
	
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
		super.getEmpDept();
	}
	
	@Override
	public String getTieColor() {
		return super.getEmpDept()+ " Employee has White color Tie";
	}
}