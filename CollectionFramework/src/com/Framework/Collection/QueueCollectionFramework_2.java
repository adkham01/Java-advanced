package com.Framework.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueCollectionFramework_2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("AAA");
		StringBuffer sb2 = new StringBuffer("B");
		StringBuffer sb3 = new StringBuffer("CCCCC");
		StringBuffer sb4 = new StringBuffer("DD");
		StringBuffer sb5 = new StringBuffer("EEEE");
		Comparator<StringBuffer> mc = new Comparator<StringBuffer>() {
			
			public int compare(StringBuffer s1, StringBuffer s2) {
				return s1.length() - s2.length();
			}
		};
		
		PriorityQueue<StringBuffer> pq = new PriorityQueue<>(mc);
		pq.offer(sb1);
		pq.offer(sb2);
		pq.offer(sb3);
		pq.offer(sb4);
		pq.offer(sb5);
		System.out.println(pq);
		
		

	}

}
