package com.Framework.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollectionFramework_3 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		System.out.println(map);
		System.out.println();
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		System.out.println(set);
		System.out.println();
		
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
