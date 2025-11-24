package com.Framework.Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class QueueCollectionFramework_5 {
	public static void main (String[] args) throws Exception {
		Deque<String> dq = new ArrayDeque<>();
		dq.add("AAA");
		dq.add("BBB");
		dq.add("CCC");
		dq.add("DDD");
		dq.add("EEE");
		System.out.println(dq);
		
		Iterator<String> it1 = dq.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println();
		
		Iterator<String> it2 = dq.descendingIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
