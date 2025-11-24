package com.Framework.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueCollectionFramework_3 {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		dq.addFirst("AAA");
		dq.addFirst("BBB");
		dq.addFirst("CCC");
		System.out.println(dq);
		
		dq.offerFirst("XXX");
		dq.offerFirst("YYY");
		dq.offerFirst("ZZZ");
		System.out.println(dq);
		System.out.println(dq.removeAll(dq));
		System.out.println(dq);
		
		dq.addLast("AAA");
		dq.addLast("BBB");
		dq.addLast("CCC");
		System.out.println(dq);
		dq.offerLast("XXX");
		dq.offerLast("YYY");
		dq.offerLast("ZZZ");
		System.out.println(dq);
	}

}
