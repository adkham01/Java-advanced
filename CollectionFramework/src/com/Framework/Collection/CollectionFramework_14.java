package com.Framework.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework_14 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(0,"AAA");
		list.add(1,"BBB");
		list.add(2,"CCC");
		list.add(3,"DDD");
		System.out.println(list);
		list.add(4,"EEE");
		//list.add(10,"ZZZ");
		list.add(2,"XXX");
		System.out.println(list);
	}

}
