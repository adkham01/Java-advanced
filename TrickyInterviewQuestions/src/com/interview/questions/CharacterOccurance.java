package com.interview.questions;

public class CharacterOccurance {

	public static void main(String[] args) {
		String str = "I love coding and testing in java programming language";
		getCharOccurence1(str,'g');
		getCharCount(str,'o');
		getCharStream(str,"i");
		
		
	}
	public static void getCharStream(String str,String val) {
		long count = str.chars()
				.mapToObj(e -> String.valueOf((char)e))
					.filter(e -> e.equals(val))
						.count();
		System.out.println(val+" : "+count);
	}
	public static void getCharCount(String str, char val) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == val) {
				count += 1;
			}
		}
		System.out.println(val+" : "+count);
	}
	public static void getCharOccurence1(String str, char val) {
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(ch == val) {
				count += 1;
			}
		}
		System.out.println(val+" : "+count);
		
	}
}
