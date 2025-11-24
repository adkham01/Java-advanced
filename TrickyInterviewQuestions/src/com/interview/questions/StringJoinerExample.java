package com.interview.questions;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(", ","[","]");
		joiner.add("Adham")
				.add("Jamshid")
					.add("Tom")
						.add("Lisa");
		System.out.println(joiner);
	}

}
