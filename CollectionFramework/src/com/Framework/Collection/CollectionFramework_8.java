package com.Framework.Collection;

import java.util.ArrayList;

public class CollectionFramework_8 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		System.out.println(al);
		
		System.out.println(al.contains("BBB"));
		System.out.println(al.contains("DDD"));
		System.out.println(al.contains("ZZZ"));
	}

}
