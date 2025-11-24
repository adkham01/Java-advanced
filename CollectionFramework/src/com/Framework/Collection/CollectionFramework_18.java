package com.Framework.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework_18 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add(0,"AAA");
		l.add(1,"BBB");
		l.add(2,"CCC");
		l.add(3,"DDD");
		l.add(4,"EEE");
		l.add(5,"BBB");
		l.add(6,"FFF");
		l.add(7,"GGG");
		l.add(8,"BBB");
		System.out.println(l);
		System.out.println(l.indexOf("BBB"));
		System.out.println(l.indexOf("ZZZ"));
		System.out.println(l.lastIndexOf("BBB"));

	}

}
