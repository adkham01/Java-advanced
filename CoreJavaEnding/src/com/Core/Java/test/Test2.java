package com.Core.Java.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.Core.Java.Anonotatoin.testcom.Core.java.test.Insititute;
import com.last.test.Student1;

public class Test2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception{
		Student1 std = new Student1("b-222", "Adkham", "Samarkand");
		std.getStudentDetails();
		System.out.println();
		Class cls = std.getClass();
		Method m = cls.getMethod("getStudentDetails");
		Annotation ann = m.getAnnotation(Insititute.class);
		Insititute ins = (Insititute)ann;
		
		System.out.println("Insitut details");
		System.out.println("--------------------------------");
		System.out.println("Inistitute Name 		: "+ins.name());
		System.out.println("Inistitute Branch 		: "+ins.branch());
		System.out.println("Inistitute Website 		: "+ins.website());
		System.out.println("Inistitute Phone Number : "+ins.phone());
	}

}
