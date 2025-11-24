package com.interview.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to find length of String in java without using length() method
 * 
 * @author Adham
 *
 */
public class StringLength {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "Interview questions";
		char[] charArray = str.toCharArray();
		System.out.println(charArray.length);

		System.out.println(str.lastIndexOf(""));

		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int length = m.end();
		System.out.println(length);

		System.out.println(str.split("").length);

		int count = 0;
		for (char c : str.toCharArray()) {
			count += 1;
		}
		System.out.println(count);

		System.out.println(getLength(str));

	}

	public static int getLength(String str) {
		int i = 0;
		try {
			while (true) {
				str.charAt(i);
				i++;
			}
		} catch (Exception e) {
			return i;
		}
	}

}
