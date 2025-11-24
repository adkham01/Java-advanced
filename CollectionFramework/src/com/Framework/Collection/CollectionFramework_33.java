package com.Framework.Collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2) {
		/*int length1 = sb1.length();
		int length2 = sb2.length();
		int val = 0;
		if(length1 < length2) {
			val = -100;
		}
		else if(length1 > length2) {
			val = 100;
		}
		else {
			val = 0;
		}*/
		return (sb1.length() - sb2.length());
	}

}
public class CollectionFramework_33 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("AAA");
		StringBuffer sb2 = new StringBuffer("BBBBB");
		StringBuffer sb3 = new StringBuffer("C");
		StringBuffer sb4 = new StringBuffer("DDDD");
		StringBuffer sb5 = new StringBuffer("EE");
		
		MyComparator mc = new MyComparator();
		TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(mc);
		ts.add(sb1);
		ts.add(sb2);
		ts.add(sb3);
		ts.add(sb4);
		ts.add(sb5);
		System.out.println(ts);

	}

}
