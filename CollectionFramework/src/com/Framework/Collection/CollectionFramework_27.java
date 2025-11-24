package com.Framework.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionFramework_27 {

	public static void main(String[] args) {
			HashSet<String> hs1 = new HashSet<>(20,0.80f);
			System.out.println(hs1);
			
			List<String> list = new ArrayList<>();
			list.add("AAA");
			list.add("BBB");
			list.add("CCC");
			list.add("DDD");
			System.out.println(list);
			
			HashSet<String> hs2 = new HashSet<>(list);
			System.out.println(hs2);
			System.out.println();
			
			Queue<Integer> qu = new PriorityQueue<>();
			qu.add(10);
			qu.add(20);
			qu.add(30);
			qu.add(40);
			qu.add(50);
			System.out.println(qu);
			
			HashSet<Integer> hs3 = new HashSet<>(qu);
			System.out.println(hs3);
	}

}
