package com.jrout.tutorial.inheritance;

public class WorkerImpl implements Worker {
	
	/*@Override
	public void met() {
		Worker.super.met();
	}*/
	
	public static void main(String arg[]) {
		Worker impl = new WorkerImpl();
		impl.met();
		
	}
}
