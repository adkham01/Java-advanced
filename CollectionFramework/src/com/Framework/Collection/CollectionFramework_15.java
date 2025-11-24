package com.Framework.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework_15 {

	public static void main(String[] args) {
		List<String> ls1 = new ArrayList<>();
		ls1.add(0,"AAA");
		ls1.add(1,"BBB");
		ls1.add(2,"CCC");
		ls1.add(3,"DDD");
		System.out.println(ls1);
		
		List<String> ls2 = new ArrayList<>();
		ls2.add("XXX");
		ls2.add("YYY");
		ls2.add("ZZZ");
		System.out.println(ls2);
		
		ls1.addAll(2,ls2);
		System.out.println(ls1);

	}

}
