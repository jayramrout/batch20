package com.jrout.tutorial.inheritance.abstractionexample;

public abstract class Music {
	private String type; // Classical or rock or pop
	private String singer;
	private String musicalIntrument;
	
	public String getMusicalIntrument() {
		return musicalIntrument;
	}

	public void setMusicalIntrument(String musicalIntrument) {
		this.musicalIntrument = musicalIntrument;
	}

	public Music(String type , String singer, String musicalIntrument){
		this.type = type;
		this.singer = singer;
		this.musicalIntrument = musicalIntrument;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public abstract String singingSpeed();
}
