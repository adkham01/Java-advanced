package com.interview.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWordCount {

	public static void main(String[] args) {
		String str = "TakeYouForwardYoutubeTestingJava";

		int countChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				countChar++;
			}
		}
		System.out.println(countChar);

		int count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count1++;
			}
		}
		System.out.println(count1);

		long count2 = str.chars().filter(e -> e >= 65 && e <= 90).count();
		System.out.println(count2);

		String reg = "A-Z+";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		int count3 = 0;
		while (matcher.find()) {
			count3 += matcher.group(0).length();
		}
		System.out.println(count3);
	}

}
