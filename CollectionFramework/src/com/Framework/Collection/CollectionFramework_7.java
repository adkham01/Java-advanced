package com.Framework.Collection;

import java.util.ArrayList;

public class CollectionFramework_7 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		System.out.println(al);
		
		System.out.println(al.remove("BBB"));
		System.out.println(al.remove("CCC"));
		System.out.println(al);
		
		System.out.println(al.remove("BBB"));
		System.out.println(al.remove("CCC"));
		System.out.println(al);
	}
}
