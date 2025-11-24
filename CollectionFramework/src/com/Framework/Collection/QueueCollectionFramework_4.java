package com.Framework.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueCollectionFramework_4 {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		dq.addFirst("AAA");//					 FFF BBB EEE
		dq.addLast("BBB");
		dq.offerFirst("CCC");
		dq.offerLast("FFF");
		dq.pollFirst();
		dq.removeLast();
		dq.offerLast("EEE");
		dq.removeFirst();
		dq.offerFirst("FFF");
		System.out.println(dq);
		System.out.println(dq.removeAll(dq));
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq.getLast());
		System.out.println(dq.getFirst());
		

	}

}
