package com.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateElements {

	public static void main(String[] args) {
		printDublicateChar("");
	}

	public static void printDublicateChar(String str) {
		if (str == null) {
			System.out.println("NULL String ");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if (str.length() == 1) {
			System.out.println("Single Char String");
			return;
		}

		char[] checkWords = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for (Character ch : checkWords) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
