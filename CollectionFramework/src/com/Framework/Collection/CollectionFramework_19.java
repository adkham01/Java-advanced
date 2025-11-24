package com.Framework.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class CollectionFramework_19 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("AAA");
		al1.add("BBB");
		al1.add("CCC");
		al1.add("DDD");
		
		System.out.println(al1);
		ArrayList<String> al2 = new ArrayList<>(al1);
		System.out.println(al2);
		System.out.println();
	
		HashSet<String> hs = new HashSet<>();
		hs.add("XXX");
		hs.add("YYY");
		hs.add("ZZZ");
		System.out.println(hs);
		
		ArrayList<String> al3 = new ArrayList<>(hs);
		System.out.println(al3);
		System.out.println();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(111);
		pq.add(222);
		pq.add(333);
		pq.add(444);
		System.out.println(pq);
		
		ArrayList<Integer> al4 = new ArrayList<>(pq);
		System.out.println(al4);
	}

}
