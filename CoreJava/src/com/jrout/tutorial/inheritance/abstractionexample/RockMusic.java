package com.jrout.tutorial.inheritance.abstractionexample;

public class RockMusic extends Music implements Running{
	
	private String bandName;
	
	public RockMusic(String type, String singer, String musicalIntrument) {
		super(type, singer,musicalIntrument);
	}
	
	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	
	@Override
	public String singingSpeed(){
		return "Singing Super Fast";
	}

	@Override
	public void runningSpeed() {
		System.out.println("My running speed is very very good...bad..");
	}
}
