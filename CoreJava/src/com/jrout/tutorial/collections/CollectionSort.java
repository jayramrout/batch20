package com.jrout.tutorial.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
//		sortObjectListUsingName();
//		sortObjectListUsingBreed();
		sortObjectListUsingColor();
	}

	public static void sortObjectListUsingColor(){
		List<Elephant> elephants = getElephants();
		System.out.println(elephants);
		
/*		Collections.sort(elephants,
				(Object obj1 , Object obj2) -> ((Elephant)obj1).getBreed().compareTo(((Elephant)obj2).getBreed()));
*/
		Collections.sort(elephants,
				(obj1 ,obj2) -> ((Elephant)obj1).getBreed().compareTo(((Elephant)obj2).getBreed()));

		System.out.println(elephants);

		
		Collections.sort(elephants,
				(obj1 ,obj2) -> ((Elephant)obj1).getName().compareTo(((Elephant)obj2).getName()));

		System.out.println(elephants);

		Collections.sort(elephants,
				(obj1 ,obj2) -> ((Elephant)obj1).getColor().compareTo(((Elephant)obj2).getColor()));

		System.out.println(elephants);

	}
	public static void sortObjectListUsingBreed(){
		List<Elephant> elephants = getElephants();
		System.out.println(elephants);
		
		Collections.sort(elephants);
		System.out.println("Name "+elephants);
		
		Collections.sort(elephants, new ElephantBreedSorter());
		System.out.println("Breed "+elephants);
	}

	public static void sortObjectListUsingName(){
		List<Elephant> elephants = getElephants();
		System.out.println(elephants);
		Collections.sort(elephants);
		System.out.println(elephants);
	}
	
	
	
	
	
	
	
	public static List<Elephant> getElephants(){
		Elephant eleU = new Elephant("Heray","HasBrown","USA");
		Elephant eleC = new Elephant("Chene","White","China");
		Elephant eleI = new Elephant("Shera","Brown","Indian");

		List<Elephant> elephants = new ArrayList<Elephant>();
		
		elephants.add(eleI);
		elephants.add(eleU);
		elephants.add(eleC);
		
		return elephants;
	}
	
	public static void sortStringList(){
		List<String> names = new ArrayList<String>();
		names.add("Anand");
		names.add("Vijay");
		names.add("Jayram");
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);

	}
}
