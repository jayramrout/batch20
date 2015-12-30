package com.jrout.tutorial.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jrout.tutorial.object.Person;

public class LoopingExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(4);
		list.add(5);
//		list.add("4");
//		list.add(new Person(3,"name"));
		/*for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		System.out.println(list);
		for(Integer inn : list) {
			System.out.println(inn);
		}
		calculate(list);
	}
	
	public static void calculate(List<Integer> list) {
		Iterator<Integer> iter = list.iterator();
		int val = 0;
		while(iter.hasNext()) {
//			Object obj = iter.next();
			
//			Integer inte = (Integer)iter.next();
			val = val+iter.next();
			/*System.out.println(inte);
			if(inte == 4) {
				iter.remove();
			}*/
		}
		
		System.out.println(list);
		System.out.println(val);
	}
}
