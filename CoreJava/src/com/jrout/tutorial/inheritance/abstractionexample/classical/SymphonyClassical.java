package com.jrout.tutorial.inheritance.abstractionexample.classical;

import com.jrout.tutorial.inheritance.abstractionexample.ClassicalMusic;

public class SymphonyClassical extends ClassicalMusic{
	
	public SymphonyClassical(String type, String singer, String musicalIntrument) {
		super(type, singer, musicalIntrument);
	}
	
	@Override
	public String singingSpeed(){
		return "Singing Medium OK for Symphony";
	}
	
	
	@Override
	public String classicalDuration() {
		return "Duration is min of 30 min";
	}
}