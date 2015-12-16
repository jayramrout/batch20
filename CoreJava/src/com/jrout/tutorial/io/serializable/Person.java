package com.jrout.tutorial.io.serializable;

import java.io.Serializable;
// Marker interface
public class Person implements Serializable {
	
//	private static final long serialVersionUID = 1L;
	
//	private static final long serialVersionUID = 2032140561873175293L;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6085261734914740154L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = -6085261734914740154L;
	
	private String name;
	private String address;
	private transient String ssn;
	private String id;
	private String lang;
	
	public Person(String name, String address, String ssn){
		this.name = name;
		this.address = address;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
