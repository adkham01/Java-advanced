package com.interview.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDublicateElements {

	public static void main(String[] args) {
		String[] str = {"Amazon", "GCP","Azure", "Amazon","Ali Baba","Azure","GCP"};
		System.out.println("*****brute force******");
		for(int i = 0; i < str.length;i++) {
			for(int j = i+1; j < str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
		System.out.println();
		System.out.println("*****hashset*****");
		Set<String> data =  new HashSet<>();
		for(String e :str) {
			if(data.add(e) == false) {
				System.out.println(e);
			}
		}
		System.out.println();
		
		System.out.println("*****hashmap*****");
		Map<String,Integer> map = new HashMap<>();
		for(String e : str) {
			Integer count = map.get(e);
			if(count == null) {
				map.put(e, 1);
			}
			else {
				map.put(e, ++count);
			}
		}
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println();

		System.out.println("*****Java Streams set & filter*****");
		Set<String> dataSet = new HashSet<>();
		Set<String> dupset =
		Arrays.asList(str).stream().filter(e -> !dataSet.add(e)).collect
		(Collectors.toSet());
		System.out.println(dupset);
		System.out.println();
		
		System.out.println("*****Java Streams grouping by*****");
		Set<String> eleSet = Arrays.asList(str).stream().
				collect(Collectors.groupingBy
				(Function.identity(), Collectors.counting())).entrySet().stream().
				filter(e -> e.getValue() > 1).map(Map.Entry::getKey).
				collect(Collectors.toSet());
		System.out.println(eleSet);
	}
	

}
