package com.jrout.tutorial.inheritance.abstractionexample;

public abstract class ClassicalMusic extends Music {
	
	private String classicalMusicType;
	
	public ClassicalMusic(String type, String singer, String musicalIntrument) {
		super(type, singer,musicalIntrument);
	}
	
	public String getClassicalMusicType() {
		return classicalMusicType;
	}

	public void setClassicalMusicType(String classicalMusicType) {
		this.classicalMusicType = classicalMusicType;
	}
	
	/*@Override
	public String singingSpeed(){
		return "Singing Medium";
	}*/
	
	public abstract String classicalDuration();
}
