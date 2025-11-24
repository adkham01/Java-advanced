package com.Framework.Collection;

import java.util.Vector;

public class CollectionFramework_21 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("AAA");
		v.add("BBB");
		v.add("CCC");
		v.add("DDD");
		v.add("EEE");
		System.out.println(v);
		
		v.removeElementAt(3);
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		System.out.println();
		
		System.out.println(v.remove("CCC"));
		System.out.println(v.remove("ZZZ"));
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
	}

}
