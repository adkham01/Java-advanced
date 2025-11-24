package com.Framework.Collection;

import java.util.ArrayList;

public class CollectionFramework_11 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		System.out.println(al);
		
		Object[] elements = al.toArray();
		System.out.println(elements);
		for(Object obj : elements) {
			System.out.println(obj);
		}
		
	}

}
