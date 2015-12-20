package com.jrout.tutorial.rmi;

import java.io.Serializable;

public class Watch implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String company;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
