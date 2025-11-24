package com.Framework.Collection;

import java.util.ArrayList;

public class CollectionFramework_9 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("AAA");
		al1.add("BBB");
		al1.add("CCC");
		al1.add("DDD");
		System.out.println(al1);

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("BBB");
		al2.add("CCC");
		System.out.println(al2);
		System.out.println(al1.containsAll(al2));
		
		ArrayList<String> al3 = new ArrayList<>();
		al3.add("XXX");
		al3.add("ZZZ");
		al3.add("YYY");
		System.out.println(al1.containsAll(al3));
		
		ArrayList<String> al4 = new ArrayList<>();
		al4.add("AAA");
		al4.add("XXX");
		al4.add("ZZZ");
		al4.add("YYY");
		System.out.println(al1.containsAll(al4));
	}

}
