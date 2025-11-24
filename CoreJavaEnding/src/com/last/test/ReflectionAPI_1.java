package com.last.test;

import java.util.Arrays;
import java.util.Comparator;

class Abc implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		
		return 0;
	}
	
}
public class ReflectionAPI_1 {

	@SuppressWarnings({ "rawtypes"})
	public static void main(String[] args) throws ClassNotFoundException {
		Class c1 = Class.forName("com.last.test.Abc"); 
		System.out.println(c1.getName());
		
		Abc abc = new Abc();
		Class c2 = abc.getClass();
		System.out.println(c2.getSimpleName());
		
		Class c3 = Abc.class;
		System.out.println(c3.getSimpleName());
		
		System.out.println(c3.getModifiers());
		System.out.println(c3.getSuperclass());
		
		System.out.println(Arrays.toString(c3.getInterfaces()));
		System.out.println(Arrays.toString(c3.getDeclaredFields()));
		System.out.println(Arrays.toString(c3.getDeclaredConstructors()));
		System.out.println(Arrays.toString(c3.getDeclaredMethods()));

	}

}
