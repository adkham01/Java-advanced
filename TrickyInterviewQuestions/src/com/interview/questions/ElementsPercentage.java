 package com.interview.questions;

import java.text.DecimalFormat;

public class ElementsPercentage {

	public static void getCharPecentage(String str) {
		char[] chararry = str.toCharArray();
		int len = chararry.length; 
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitsCount = 0;
		int specCharsCount = 0;
		
		for(char c : chararry) {
			if(Character.isUpperCase(c)) {
				upperCaseCount++;
			}
			else if(Character.isLowerCase(c)) {
				lowerCaseCount++;
			}
			else if(Character.isDigit(c)) {
				digitsCount++;
			}
			else {
				specCharsCount++;
			}
		}
		double upperCasePercentage = ((upperCaseCount * 100.0)/len); 
		double lowerCasePercentage = ((lowerCaseCount * 100.0)/len);
		double digitsPercentage = ((digitsCount * 100.0)/len);
		double specCharsPercentage = ((specCharsCount * 100.0)/len);
		
		System.out.println("In th given String : "+str);
		DecimalFormat formater = new DecimalFormat("##.##");
		
		System.out.println("Upper case % ---> "+formater.format(upperCasePercentage));
		System.out.println("Lower case % ---> "+formater.format(lowerCasePercentage));
		System.out.println("Digits % ---> "+formater.format(digitsPercentage));
		System.out.println("Special char % ---> "+formater.format(specCharsPercentage));
		System.out.println("------------------------------");
	}
	
	public static void main(String[] args) {
		getCharPecentage("Adham");
		getCharPecentage("Core Java Learning procces going very fine 10/9 80%");
		getCharPecentage("--> Array is an Object,");
		getCharPecentage("EX: int[] a = {10,20,30,40,50};");
		
	}

}
