package com.Framework.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class CollectionFramework_26 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		System.out.println(al);
		
		ListIterator<String> lit = al.listIterator();
		System.out.println("Elements in Forward Direction");
		while(lit.hasNext()) {
			System.out.println(lit.nextIndex()+" --> "+lit.next());
		}
		System.out.println();
		
		System.out.println("Elaements in Backward Diretion");
		while(lit.hasPrevious()) {
			System.out.println(lit.previousIndex()+" --> "+lit.previous());
		}
		System.out.println();
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("DDD");
		ll.add("EEE");
		System.out.println(ll);
		System.out.println();
		
		ListIterator<String> li = ll.listIterator();
		while (li.hasNext()) {
			String str = (String) li.next();
			
			if(str.equals("BBB")) {
				li.add("XXX");
			}
			if(str.equals("DDD")) {
				li.set("YYY");
			}
			if(str.equals("EEE")) {
				li.remove();
			}
		
		}
		System.out.println(ll);
				
	}

}
