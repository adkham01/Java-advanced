package com.Framework.Collection;

import java.util.ArrayList;

public class CollectionFramework_12 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("AAA");
		al1.add("BBB");
		al1.add("CCC");
		al1.add("DDD");
		al1.add("EEE");
		System.out.println(al1);
		System.out.println(al1.size());
		
		ArrayList<Integer> al2 = new ArrayList<>();
		System.out.println(al2.isEmpty());
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		System.out.println(al2);
		System.out.println(al2.isEmpty());
		al2.clear();
		System.out.println(al2);
		System.out.println(al2.isEmpty());

	}

}
