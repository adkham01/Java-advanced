package com.Framework.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionFramework_1 {

	public static void main(String[] args) {
		Queue<String> qu = new PriorityQueue<>();
		qu.offer("AAA");
		qu.offer("BBB");
		qu.offer("CCC");
		qu.offer("DDD");
		qu.offer("EEE");
		qu.offer("FFF");
		System.out.println(qu);
		System.out.println(qu.poll());
		System.out.println(qu);
		System.out.println(qu.remove());
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.element());
		System.out.println(qu);
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.peek());
		System.out.println(qu.element());
		System.out.println(qu.remove());
		

	}

}
