package com.last.test;

import com.Core.Java.Anonotatoin.testcom.Core.java.test.Insititute;

public class Student1 {
	String sid;
	String sname;
	String saddr;
	public Student1(String sid,String sname,String saddr) {
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
	}
	@Insititute(name = "SamGaSi",
				branch = "Navoiy",
				phone = "098-7654-321"
			   )
	public void getStudentDetails() {
		System.out.println("Student Details ");
		System.out.println("------------------------");
		System.out.println("Student ID      : "+sid);
		System.out.println("Student Name    : "+sname);
		System.out.println("Stuedent Addres : "+saddr);
	}
}
