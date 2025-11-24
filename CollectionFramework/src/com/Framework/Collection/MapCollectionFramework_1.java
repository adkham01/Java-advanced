package com.Framework.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionFramework_1 {

	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<>();
		System.out.println(map1.put("A", "AAA"));
		System.out.println(map1.put("B", "BBB"));
		System.out.println(map1.put("C", "CCC"));
		System.out.println(map1.put("D", "DDD"));
		System.out.println(map1.put("E", "EEE"));
		System.out.println(map1);
		System.out.println(map1.put("B", "XXX"));
		System.out.println(map1.put("C", "YYY"));
		System.out.println(map1.put("D", "ZZZ"));
		System.out.println(map1);
		System.out.println();
		
		Map<String, String> map = new HashMap<>();
		map.putAll(map1);
		System.out.println(map);
		System.out.println("A ---> "+map.get("A"));
		System.out.println("B ---> "+map.get("B"));
		System.out.println("C ---> "+map.get("C"));
		System.out.println("D ---> "+map.get("D"));
		System.out.println("E ---> "+map.get("E"));
		System.out.println("X ---> "+map.get("X"));
		System.out.println("Y ---> "+map.get("Y"));
		
		
	}

}
