package com.Framework.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollectionFramework_2 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println("-----");
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("Z"));
		System.out.println(map.containsValue("CCC"));
		System.out.println(map.containsValue("ZZZ"));
		System.out.println("------------");
		Set<String> set = map.keySet();
		System.out.println(set);
		System.out.println("---------------");
		Collection<String> cl = map.values();
		System.out.println(cl);
		System.out.println("-----------------------------");
		System.out.println(map);
		System.out.println("-----------------------------");
		System.out.println(map.remove("B"));
		System.out.println(map.remove("X"));
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map.isEmpty());
		System.out.println(map);

	}

}
