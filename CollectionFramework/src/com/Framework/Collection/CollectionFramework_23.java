package com.Framework.Collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionFramework_23 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("AAA");
		l1.add("BBB");
		l1.add("CCC");
		l1.add("DDD");
		l1.add("EEE");
		System.out.println(l1);
		
		LinkedList<String> l2 = new LinkedList<>(l1);
		System.out.println(l2);
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println(hs);
		
		LinkedList<Integer> l3= new LinkedList<>(hs);
		System.out.println(l3);
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("XXX");
		pq.add("YYY");
		pq.add("ZZZ");
		System.out.println(pq);
		
		LinkedList<String> l4 = new LinkedList<>(pq);
		System.out.println(l4);
		
	}

}
