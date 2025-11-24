package com.Framework.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollectionFramework_4 {

	public static void main(String[] args) {
		HashMap<String, String> trainers = new HashMap<>();
		trainers.put("Nagoor", "Core Java");
		trainers.put("Nageswar", "Adv Java");
		trainers.put("Otabek", "Assistant");
		trainers.put("Najmiddin", "Spring");
		trainers.put("Jahon", "Core java");
		trainers.put(null, "HTML");
		trainers.put(null, "Regex");
		trainers.put("AAA", null);
		trainers.put("BBB", null);
		System.out.println(trainers);
		Set<Map.Entry<String, String>> set = trainers.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
