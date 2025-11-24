package com.Framework.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionFramework_31 {

	public static void main(String[] args) {
		SortedSet<String> ss = new TreeSet<>();
		ss.add("AAA");
		ss.add("BBB");
		ss.add("CCC");
		ss.add("DDD");
		System.out.println(ss);
		
		TreeSet<String> ts = new TreeSet<>(ss);
		System.out.println(ts);
		System.out.println();
		
		List<String> list = new ArrayList<>();
		list.add("AAA");
		list.add("FFF");
		list.add("BBB");
		list.add("EEE");
		list.add("DDD");
		list.add("CCC");
		System.out.println(list);
		TreeSet<String> ts1 = new TreeSet<>(list);
		System.out.println(ts1);
		System.out.println();
		
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println(set);
		TreeSet<Integer> ts2 = new TreeSet<>(set);
		System.out.println(ts2);
		System.out.println();
		
		Queue<String> qu = new PriorityQueue<>();
		qu.add("AAA");
		qu.add("BBB");
		qu.add("CCC");
		qu.add("DDD");
		qu.add("EEE");
		System.out.println(qu);
		TreeSet<String> ts3 = new TreeSet<>(qu);
		System.out.println(ts3);
		System.out.println();
	}

}
