package com.Framework.Collection;

import java.util.HashMap;
import java.util.WeakHashMap;

class A{
	public A() {
		System.out.println("Object Creating....");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Destroying....");
	}
	@Override
	public String toString() {
		
		return "A";
	}
	
}
public class MapCollectionFramework_6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception{
		A a = new A();
		a = null;
		System.gc();
		System.out.println();
		
		A a1 = new A();
		HashMap<A, String> hm = new HashMap<>();
		hm.put(a1, "AAA");
		System.out.println("HashMap Before GC   : " + hm);
		a1 = null;
		System.gc();
		System.out.println("HashMap After GC   : " + hm);
		System.out.println();
		
		A a2 = new A();
		WeakHashMap<A, String> whm = new WeakHashMap<>();
		whm.put(a2, "AAA");
		System.out.println("WeakHashMap Before GC   : " + whm);
		a2 = null;
		System.gc();
		System.out.println("WeakHashMap After GC   : " + whm);

	}

}
