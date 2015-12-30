package com.jrout.tutorial.collections;

import java.util.Comparator;

public class ElephantBreedSorter implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String breed1 = ((Elephant)o1).getBreed();
		String breed2 = ((Elephant)o2).getBreed();
		return breed1.compareTo(breed2);
	}
}
