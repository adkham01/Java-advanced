package com.Framework.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectionFramework_25 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("AAA");
		v.add("BBB");
		v.add("CCC");
		v.add("DDD");
		v.add("EEE");
		System.out.println(v);
		
		Enumeration<String> e = v.elements();
		System.out.println(e);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		System.out.println();
		
		List<String> l = new ArrayList<>();
		l.add("XXX");
		l.add("YYY");
		l.add("ZZZ");
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println();
		
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set);
		System.out.println();
		
		Iterator<Integer> it2 = set.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
