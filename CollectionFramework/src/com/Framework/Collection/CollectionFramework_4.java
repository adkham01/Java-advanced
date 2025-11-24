package com.Framework.Collection;

import java.util.HashSet;

public class CollectionFramework_4 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.add("AAA"));
		System.out.println(hs.add("BBB"));
		System.out.println(hs.add("CCC"));
		System.out.println(hs.add("DDD"));
		System.out.println(hs);
		
		System.out.println(hs.add("BBB"));
		System.out.println(hs.add("CCC"));
		System.out.println(hs);
	}

}
