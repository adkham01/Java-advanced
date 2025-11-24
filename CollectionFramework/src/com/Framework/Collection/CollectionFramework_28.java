package com.Framework.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionFramework_28 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("AAA");
		hs.add("BBB");
		hs.add("CCC");
		hs.add("DDD");
		hs.add("EEE"); 
		System.out.println(hs); 
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("AAA");
		lhs.add("BBB");
		lhs.add("CCC");
		lhs.add("DDD");
		lhs.add("EEE");
		System.out.println(lhs);

		
	}

}
