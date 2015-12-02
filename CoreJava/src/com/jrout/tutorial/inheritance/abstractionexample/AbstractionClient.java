package com.jrout.tutorial.inheritance.abstractionexample;

import com.jrout.tutorial.inheritance.abstractionexample.classical.VocalClassical;

public class AbstractionClient {

	public static void main(String[] args) {
		Music cm = new VocalClassical("classical","viji","Biina");
//		cm.getClassicalMusicType();
		Music rm = new RockMusic("Rock","Prasanthi","RockBand");
	
		System.out.println(cm.singingSpeed());
		System.out.println(rm.singingSpeed());

		printSpeed(rm);
		printSpeed(cm);
//		Music music = new Music("classical","viji","Biina");
		
		
	}
	
	public static void printSpeed(Music music){
		System.out.println(music.singingSpeed());
	}

}
