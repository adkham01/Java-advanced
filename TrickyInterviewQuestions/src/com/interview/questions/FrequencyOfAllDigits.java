package com.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfAllDigits {

	public static Map<Integer, Integer> getFrequency(int number) {
		Map<Integer, Integer> digitMap = new HashMap<>();
		
		while(number != 0) {
			int lastDigit = number % 10;
			if(digitMap.containsKey(lastDigit)) {
				digitMap.put(lastDigit, digitMap.get(lastDigit)+1);
			}
			else {
				digitMap.put(lastDigit, 1);
			}
			number = number / 10;
		}
		digitMap.forEach((k , v) -> System.out.println(k + " : " + v));
		
		return digitMap;
	}
	
	public static void main(String[] args) {
		int number = 1233334234;
		getFrequency(number);

	}

}
