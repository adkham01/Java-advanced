package com.interview.questions;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

/**
 * how to find total number of vowels wothin java String:
 * 
 * @author Adham
 *
 */
public class Vowels {
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U';
	}

	public static void main(String[] args) {
		String str = "Core Java Questions";
		int vCount = 0;
		for (char c : str.toCharArray()) {
			if (isVowel(c)) {
				vCount++;
			}
		}
		System.out.println(vCount);

		IntPredicate vowel = new IntPredicate() {

			@Override
			public boolean test(int value) {
				return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'A'
						|| value == 'E' || value == 'I' || value == 'O' || value == 'U';
			}
		};
		String test = "Adham Salaydinov";
		long count = test.chars().filter(vowel).count();
		System.out.println(count);

		String st = "Java Vowel Counting Examples";
		int voCount = CharMatcher.anyOf("aeiouAEIOU").countIn(st);
		System.out.println(voCount);
	}

}
