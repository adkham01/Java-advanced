package com.Framework.Collection;

import java.util.Comparator;
import java.util.TreeSet;

class Student$1{
	
	String sid;
	String sname;
	String saddr;
	public Student$1(String sid,String sname,String saddr) {
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		
	}
	@Override
	public String toString() {
		return "\nStudent [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + "]";
	}
	
}
public class CollectionFramework_36 {

	public static void main(String[] args) {
		Student$1 s1 = new Student$1("S-111", "Rakesh", "Hyd");
		Student$1 s2 = new Student$1("S-222", "Adkham", "Mitan");
		Student$1 s3 = new Student$1("S-333", "Jamshid","Tashkent");
		Student$1 s4 = new Student$1("S-444", "Sardor", "Sam");
		Student$1 s5 = new Student$1("S-555", "Anil", "Sir");
		System.out.println("Student deteils in sorted by Student ID");
		
		Comparator<Student$1> mc = new Comparator<Student$1>() {
			public int compare(Student$1 std1, Student$1 std2) {
						
				return std1.sid.compareTo(std2.sid);		
			}
			
		};
		TreeSet<Student$1> ts = new TreeSet<>(mc);
		ts.add(s4);
		ts.add(s5);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println(ts);
		
	}

}
