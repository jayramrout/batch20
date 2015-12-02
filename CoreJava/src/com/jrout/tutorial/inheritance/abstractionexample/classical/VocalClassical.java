package com.jrout.tutorial.inheritance.abstractionexample.classical;

import com.jrout.tutorial.inheritance.abstractionexample.ClassicalMusic;
import com.jrout.tutorial.inheritance.abstractionexample.Running;
import com.jrout.tutorial.inheritance.abstractionexample.Swimming;

public class VocalClassical extends ClassicalMusic implements Swimming , Running {

	public VocalClassical(String type, String singer, String musicalIntrument) {
		super(type, singer, musicalIntrument);
	}
	
	@Override
	public String singingSpeed(){
		return "Singing Medium GOOD Vocal";
	}
	
	@Override
	public String classicalDuration() {
		return "Duration is min of 10 min";
	}

	@Override
	public void swimmingSkills() {
		System.out.println(getSinger() +" my speed is horible..") ;
		
	}
	@Override
	public void runningSpeed() {
		System.out.println("Running speed is Very good...");
		
	}
}