package com.jrout.tutorial.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
	// Hello how are you...
	/* breakAndGiveCollection(String message){
		coll.add(char)
		return coll;
	}
	*/
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("x");
		list.add("c");
		list.add("f");
		list.add("l");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		/*Set <String> uniq = new HashSet(list);
		Set<String> coll = new HashSet<String>();
//		Set<String> coll = new TreeSet<String>();
//		List coll = new ArrayList();
		coll.add("a");
		coll.add("a");
		coll.add("c");
		coll.add("b");
		
		coll.add("z");
		coll.add("x");
		coll.add("d");
		coll.add("f");
		coll.add("e");
		System.out.println(coll);*/
		
		
		
	}
	
	
	
	public List giveItems(String string){
		// query the inventory to get all the list of laptops
		// dell inspiron
		// apple macbook
		
		List list = new ArrayList();
		list.add("dell inspiron");
		list.add("apple macbook");
		return list;
	}
	
	
}