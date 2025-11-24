package com.interview.questions;

import org.apache.commons.lang3.StringUtils;

public class RemoveWhiteSpaces {
	
	public static String removeSpace(String str) {
		String newString = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) !='\n') {
				newString += str.charAt(i);
			}
		}
		return newString;
	}
	
	public static void main(String[] args) {
		String str = "	This 	is	my 	java code	"
				+ "\n	hi this is remove "
				+ "\n String";
		
		System.out.println(str.trim());
		 
		String remstr = StringUtils.deleteWhitespace(str);
		System.out.println(remstr);
		
		System.out.println("My method : "+removeSpace(str));
	}
}
