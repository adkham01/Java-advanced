package com.Framework.Collection;

import java.util.HashSet;

public class CollectionFramework_5 {

	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("AAA");
		hs1.add("BBB");
		hs1.add("CCC");
		hs1.add("DDD");
		System.out.println(hs1);
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("XXX");
		hs2.add("YYY");
		hs2.add("ZZZ");
		hs2.add("BBB");
		hs2.add("CCC");
		System.out.println(hs2);
		
		System.out.println(hs1.addAll(hs2));
		System.out.println(hs1);
		
		System.out.println(hs1.addAll(hs2));
		System.out.println(hs1);
	}

}
