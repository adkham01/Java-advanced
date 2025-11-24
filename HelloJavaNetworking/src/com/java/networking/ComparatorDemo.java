package com.java.networking;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyOwnComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 < o2) {
			return +1;
		}else if (o1 > 02){
			return -1;
		}else {
			return 0;
		}
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		Comparator<Integer> comp = new MyOwnComparator();
		Set<Integer> s = new TreeSet<Integer>(comp);
		s.add(20);
		s.add(50);
		s.add(0);
		s.add(10);
		s.add(75);
		System.out.println(s);
	}

}
