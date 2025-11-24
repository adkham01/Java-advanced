package com.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	public static void getCharCount(String name) {
		Map<Character, Integer> charMap = new HashMap<>();
		char[] strArray = name.toCharArray();
		
		for(char ch : strArray) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(name + " : "+charMap);
		
	}
	public static void main(String[] args) {
		 getCharCount("j");
		 getCharCount("Core Java Questions");
		 getCharCount("");
		 getCharCount("fffff");
	}

}
