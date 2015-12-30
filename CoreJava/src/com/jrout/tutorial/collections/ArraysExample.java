package com.jrout.tutorial.collections;

import java.util.ArrayList;
import java.util.List;

import com.jrout.tutorial.object.Person;

public class ArraysExample {

	public static void main(String[] args) {
		/*int[] ages = {23,4,5,6,7};
		 * ages[5] = 89;// exception
		for(int age : ages) {
			System.out.println(age);
		}
		for(int i = 0  ; i < ages.length ; i ++){
			System.out.println(ages[i]);
		}*/
		
		
		List list = new ArrayList();
		list.add(23);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add("Jayram");
		Person per = new Person(56,"Name");
		list.add(per);
		
		System.out.println("Size of ArrayList = "+ list.size());
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		list.add(1, 100);
		
		System.out.println("Size of ArrayList = "+ list.size());
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		passCollection(list);
/*		list.add(89);
		
		System.out.println("Size of ArrayList = "+ list.size());
		System.out.println(list);
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
*/	}

	public static void passCollection(List something){
		System.out.println("something "+something);
	}
	
	
}
