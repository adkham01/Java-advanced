package com.interview.questions;

public class FindSubString {
	public static boolean isSubString1(String mainstr,String substr) {
		
		return mainstr.contains(substr);
	}
	public static boolean isSubString2(String main, String sub) {
		return main.indexOf(sub) != -1;
	}
	public static void main(String[] args) {
		System.out.println(isSubString1("Core Java Learning", "Java"));
		System.out.println(isSubString1("naveen automation labs lectures", "labs"));
		System.out.println(isSubString2("naveen automation labs lectures", "testing"));
		System.out.println(isSubString2("naveen automation labs lectures", "auto"));
		System.out.println(isSubString2("naveen automation labs lectures", " "));
	}
 
}
