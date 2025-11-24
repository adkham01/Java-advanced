package com.interview.questions;

import java.lang.reflect.Field;

public class StringTranslator {
	static {

		try {
			Field val = String.class.getDeclaredField("value");
			val.setAccessible(true);
			try {
				val.set("Hello Adham", "Salom Adham!".toCharArray());
				val.set("Good morning Adham", "Xayrli kun Adham!".toCharArray());
				val.set("How are you Adham", "Axvaollaring yaxshimi Adham?".toCharArray());

			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println("Hello Adham");
		System.out.println("Good morning Adham");
		System.out.println("How are you Adham");
	}
}
