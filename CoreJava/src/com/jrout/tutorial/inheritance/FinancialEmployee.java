package com.jrout.tutorial.inheritance;

public class FinancialEmployee extends Employee { // is a relationship
	private int financicalExp; // has a relationship
	
	public FinancialEmployee(int empId, String name, String empDept) {
		super(empId,name,empDept);
	}
	
	public FinancialEmployee(int empId, String name, String empDept, int financicalExp) {
		this(empId,name,empDept);
		this.financicalExp = financicalExp;
	}
	
	public int getFinancicalExp() {
		return financicalExp;
	}
	public void setFinancicalExp(int financicalExp) {
		this.financicalExp = financicalExp;
	}
}