package com.jrout.tutorial.collections;

public class Elephant implements Comparable {
	private String name;
	private String color;
	private String breed;
	public Elephant(String name,String color,String breed) {
		this.name = name;
		this.color = color;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		return name+":"+color+":"+breed;
	}

	@Override
	public int compareTo(Object o) {
		String name = ((Elephant)o).getName();
		return this.name.compareTo(name);
/*		String breed = ((Elephant)o).getBreed();
		return this.breed.compareTo(breed);
*/	}
}
