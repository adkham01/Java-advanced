package com.Framework.Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class CollectionFramework_30 {

	public static void main(String[] args) {
		NavigableSet<String> ns = new TreeSet<>();
		ns.add("BBB");
		ns.add("AAA");
		ns.add("EEE");
		ns.add("DDD");
		ns.add("CCC");
		System.out.println(ns);
		System.out.println(ns.descendingSet());
		System.out.println(ns);
		System.out.println(ns.ceiling("DDD"));
		System.out.println(ns.higher("DDD"));
		System.out.println(ns.floor("DDD"));
		System.out.println(ns.lower("DDD"));
		System.out.println(ns.pollFirst());
		System.out.println(ns.pollLast());
		System.out.println(ns);
	}

}
