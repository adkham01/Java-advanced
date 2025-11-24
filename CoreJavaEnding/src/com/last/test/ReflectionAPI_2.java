package com.last.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Person{
	public String pid;
	protected String pname;
	@SuppressWarnings("unused")
	private String paddr;
	
}
class Student extends Person {
	public static int eno = 111;
	protected static final String ename = "Adkham";
	static transient float esal = 22.22f;
	@SuppressWarnings("unused")
	private static volatile String eaddr = "Samarkand";
	
}
public class ReflectionAPI_2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Class clas = Student.class;
		
		Field[] fld1 = clas.getFields();
		for(Field f : fld1) {
			System.out.println(Modifier.toString(f.getModifiers())+" : "+f.getName());
		}
		System.out.println();
		
		Field[] fld2 = clas.getDeclaredFields();
		for(Field f : fld2) {
			System.out.println(Modifier.toString(f.getModifiers())+" : "+f.getName());
		}
		System.out.println("-------------------------------\n");
		
		Class cls = Student.class;
		Field[] fld = cls.getDeclaredFields();
		for(Field f : fld) {
			f.setAccessible(true);
			System.out.println("Field Name      : "+f.getName());
			System.out.println("Field Type      : "+f.getType().getName());
			System.out.println("Field Value     : "+f.get(f));
			System.out.println("Field Modifiers : "+Modifier.toString(f.getModifiers()));
			System.out.println("---------------------------------------");
			
		}
		
		
	}

}
