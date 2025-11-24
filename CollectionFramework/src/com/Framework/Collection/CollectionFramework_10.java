package com.Framework.Collection;

import java.util.ArrayList;

public class CollectionFramework_10 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("AAA");
		al1.add("BBB");
		al1.add("CCC");
		al1.add("DDD");
		al1.add("EEE");
		System.out.println(al1);

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("AAA");
		al2.add("BBB");
		al2.add("XXX");
		al2.add("YYY");
		System.out.println(al2);
		System.out.println(al1.retainAll(al2));
		System.out.println(al1);
	}

}
