package com.Framework.Collection;

import java.util.Comparator;
import java.util.TreeMap;

public class MapCollectionFramework_8 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("AAA");
		StringBuffer sb2 = new StringBuffer("BBBBB");
		StringBuffer sb3 = new StringBuffer("C");
		StringBuffer sb4 = new StringBuffer("DDD");
		StringBuffer sb5 = new StringBuffer("EE");
		Comparator<StringBuffer> mc = new Comparator<StringBuffer>() {
			
			@Override
			public int compare(StringBuffer s1, StringBuffer s2) {
				return s1.length() - s2.length();
			}
		};
		TreeMap<StringBuffer, String> tm1 = new TreeMap<>(mc);
		tm1.put(sb1, "3-length");
		tm1.put(sb2, "5-length");
		tm1.put(sb3, "1-length");
		tm1.put(sb4, "4-length");
		tm1.put(sb5, "2-length");
		System.out.println(tm1);
		System.out.println();
		
		TreeMap<String, String> tm2 = new TreeMap<>();
		tm2.put("C", "CCC");
		tm2.put("F", "FFF");
		tm2.put("A", "AAA");
		tm2.put("B", "BBB");
		tm2.put("E", "EEE");
		tm2.put("D", "DDD");
		System.out.println(tm2);
		System.out.println(tm2.put("B", "XXX"));
		System.out.println(tm2);
		tm2.put("F", "CCC");
		tm2.put("G", "DDD");
		System.out.println(tm2);
		System.out.println();
		tm2.put("H", null);
		tm2.put("J", null);
		System.out.println(tm2);
		
		
	}

}
