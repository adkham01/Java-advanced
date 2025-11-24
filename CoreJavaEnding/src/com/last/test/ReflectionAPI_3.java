package com.last.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class Abcd{
	public Abcd() {
		
	}
	protected Abcd(int i) {
		
	}
	@SuppressWarnings("unused")
	private Abcd(int i, String str) {
		
	}
}
public class ReflectionAPI_3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception{
		Class cls = Abcd.class;
		Constructor[] cons1 = cls.getConstructors();
		for(Constructor con : cons1) {
			con.setAccessible(true);
			System.out.println(Modifier.toString(con.getModifiers()));
		}
		System.out.println();
		
		Constructor[] cons2 = cls.getDeclaredConstructors();
		for(Constructor con : cons2) {
			con.setAccessible(true);
			System.out.println(Modifier.toString(con.getModifiers())+" : "+con.getParameterTypes()+" : "+con.getParameters());
		}
				

	}

}
