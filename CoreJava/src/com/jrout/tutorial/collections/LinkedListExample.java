package com.jrout.tutorial.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
	}
	
	public void callMe(){
		List list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.add(2, "bb");
		
		Collections.synchronizedList(list);
		
	}

}
