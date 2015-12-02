package com.jrout.tutorial.inheritance.abstractionexample;

import com.jrout.tutorial.inheritance.SoftwareEmployee;
import com.jrout.tutorial.inheritance.abstractionexample.classical.VocalClassical;

public class InterfaceClient {

	public static void main(String[] args) {
		Swimming vc = new VocalClassical("Classical", "Atanu", "SomeVCI");
		vc.swimmingSkills();
		
		Running vcr = new VocalClassical("Classical", "Viji", "SomeVCI");
		runningSpeed(vcr);
		
		SoftwareEmployee vcr2 = new SoftwareEmployee(7777, "Jay", "Software");
		runningSpeed(vcr2);
		
		Running vc11 = new VocalClassical("Classical", "Atanu", "SomeVCI");
		runningSpeed(vc11);
	}
	
	public static void runningSpeed(Running run){
		run.runningSpeed();
	}
}