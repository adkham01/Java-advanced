package com.Framework.Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class MapCollectionFramework_5 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		HashMap<String, Integer> stds = new HashMap<>();
		stds.put("Adkham", 93);
		stds.put("Otabek", 75);
		stds.put("Diyor", 76);
		stds.put("Ilhom", 60);
		stds.put("John", 72);
		stds.put("Sam", 89);
		System.out.println(stds);
		
		LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
		students.put("Adkham", 93);
		students.put("Otabek", 75);
		students.put("Diyor", 76);
		students.put("Ilhom", 60);
		students.put("John", 72);
		students.put("Sam", 89);
		System.out.println(students);
		System.out.println();
		
		Integer in1 = new Integer(10);
		Integer in2 = new Integer(10);
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(in1, "AAA");
		hm.put(in2, "BBB");
		System.out.println(hm);
		System.out.println();
		
		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
		ihm.put(in1, "AAA");
		ihm.put(in2, "BBB");
		System.out.println(ihm);
		
	}

}
