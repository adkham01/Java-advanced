package com.interview.questions;

import java.util.Arrays;

public class StringAnagram {

	public static boolean isAnagram(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		if (str1.length() == str2.length()) {
			char[] charArray1 = str1.toLowerCase().toCharArray();
			char[] charArray2 = str2.toLowerCase().toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			return Arrays.equals(charArray1, charArray2);

		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(isAnagram("Listen", "Silent"));
		System.out.println(isAnagram("all", "lol"));
		System.err.println(isAnagram("you", "your"));

	}

}
