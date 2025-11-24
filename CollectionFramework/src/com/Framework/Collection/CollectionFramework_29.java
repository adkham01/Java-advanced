package com.Framework.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionFramework_29 {

	public static void main(String[] args) {
		 
		SortedSet<String> ss= new TreeSet<>();
		ss.add("FFF");
		ss.add("AAA");
		ss.add("EEE");
		ss.add("BBB");
		ss.add("DDD");
		ss.add("CCC");
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet("DDD"));
		System.out.println(ss.tailSet("DDD"));
		System.out.println(ss.subSet("BBB", "EEE"));
	}

}
