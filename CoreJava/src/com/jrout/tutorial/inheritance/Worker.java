package com.jrout.tutorial.inheritance;

public interface Worker {
	default void met(){
		System.out.println("Call me ...");
	}
}

