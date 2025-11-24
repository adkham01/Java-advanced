package com.Framework.Collection;

import java.util.Stack;

public class CollectionFramework_22 {

	public static void main(String[] args) {
		Stack<String> s= new Stack<>();
		s.push("AAA");
		s.push("BBB");
		s.push("CCC");
		s.push("DDD");
		s.push("EEE");
		System.out.println(s);
		
		System.out.println(s.search("BBB"));
		System.out.println(s.search("ZZZ"));
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
