package com.interview.questions;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;

public class ArraysJoins {

	public static void main(String[] args) {
		String[] coreJavatechers = {
				"Adham",
				"Jamshid",
				"Yunus",
				"Diyor",
				"Aziz",
				"Oltin",
				"Sardor"
		};
		String[] advJavateacher = {
				"Muhammad",
				"Najmiddin",
				"Otabek",
				"Turabek",
				"Azizbek",
				"Sarvar"
		};
		Stream<String> steachers = Arrays.stream(coreJavatechers);
		Stream<String> teachresAdv = Arrays.stream(advJavateacher);
		String[] fullTeam = Stream.concat(steachers, teachresAdv).toArray(size -> new String[size]);
		for(String s : fullTeam) {
			System.out.println(s);
		}
		System.out.println();
		
		String[] allTeam = ObjectArrays.concat(coreJavatechers, 			advJavateacher,String.class);
		for(String s : allTeam) {
			System.out.println(s);
		}
	}

}
