package com.Framework.Collection;

import java.util.LinkedList;

public class CollectionFramework_24 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("DDD");
		System.out.println(ll);
		
		ll.addFirst("XXX");
		ll.addLast("ZZZ");
		System.out.println(ll);

		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		

	}

}
