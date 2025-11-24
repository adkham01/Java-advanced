package com.Framework.Collection;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapCollectionFramework_7 {

	public static void main(String[] args) {
		SortedMap<String, String> sm = new TreeMap<>();
		sm.put("C", "CCC");
		sm.put("F", "FFF");
		sm.put("A", "AAA");
		sm.put("B", "BBB");
		sm.put("E", "EEE");
		sm.put("D", "DDD");
		System.out.println(sm);
		System.out.println(sm.firstKey());
		System.out.println(sm.lastKey());
		System.out.println(sm.headMap("D"));
		System.out.println(sm.tailMap("D"));
		System.out.println(sm.subMap("C", "D"));
		System.out.println();
		
		NavigableMap<String, String> nm = new TreeMap<>(sm);
		System.out.println(nm);
		System.out.println(nm.descendingMap());
		System.out.println(nm.keySet());
		System.out.println(nm.descendingKeySet());
		System.out.println();
		System.out.println(nm.ceilingEntry("D"));
		System.out.println(nm.ceilingKey("D"));
		System.out.println();
		System.out.println(nm.higherEntry("D"));
		System.out.println(nm.higherKey("D"));
		System.out.println();
		System.out.println(nm.floorEntry("D"));
		System.out.println(nm.floorKey("D"));
		System.out.println();
		System.out.println(nm.lowerEntry("D"));
		System.out.println(nm.lowerKey("D"));
		System.out.println();
		System.out.println(nm);
		System.out.println(nm.pollFirstEntry());
		System.out.println(nm.pollLastEntry());
		System.out.println(nm);
		System.out.println();
		
	}

}
