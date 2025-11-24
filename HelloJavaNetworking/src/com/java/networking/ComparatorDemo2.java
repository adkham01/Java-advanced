package com.java.networking;

import java.util.*;
import java.util.Map.Entry;

class ComparatorDemo2 {
	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Chira", 700);
		m.put("Adkham", 800);
		m.put("balaiah", 600);
		m.put("nagarjuna", 500);
		System.out.println(m);
		System.out.println(m.put("Chiru", 1000));

		Set<String> s = m.keySet();
		System.out.println(s);

		Collection<Integer> c = m.values();
		System.out.println(c);

		Set<Entry<String, Integer>> s1 = m.entrySet();
		System.out.println(s1);

		Iterator<Entry<String, Integer>> itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>) itr.next();
			System.out.println(m1.getKey() + "....." + m1.getValue());
			if ( m1.getKey().equals("nagarjuna")) {
				m1.setValue(10000);
			}
		}
		System.out.println(m);

	}
}