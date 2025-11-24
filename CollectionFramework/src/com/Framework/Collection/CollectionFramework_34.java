package com.Framework.Collection;

import java.util.Comparator;
import java.util.TreeSet;

class Student011{
	String sid;
	String sname;
	int smarks;
	String saddr;
	
	public Student011(String sid, String sname, int smarks,String saddr) {
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.saddr = saddr;
	}
	@Override
	public String toString() {
		
		return "[Student ID : "+sname+"\t"+"Student Name : "+sname+"\t"+"Student Mark : "+smarks+"\t"+"Student Addres : "+saddr+"]\n";
			  
	}
}
class MyComparator2 implements Comparator<Student011>{

	@Override
	public int compare(Student011 s1, Student011 s2) {
		int val = s1.sname.compareTo(s2.sname);
		return val;
	}
	
}
public class CollectionFramework_34 {

	public static void main(String[] args) {
		Student011 s1 = new Student011("S-111", "Anil", 70, "Hyd");
		Student011 s2 = new Student011("S-222", "Jakuy", 88, "Lion");
		Student011 s3 = new Student011("S-333", "Felix", 72, "Portu");
		Student011 s4 = new Student011("S-444", "Cucu", 92, "Catalunya");
		Student011 s5 = new Student011("S-555", "Vinni", 95, "Madrid");
		
		MyComparator2 mc = new MyComparator2();
		
		TreeSet<Student011> ts = new TreeSet<Student011>(mc);
		ts.add(s4);
		ts.add(s1);
		ts.add(s5);
		ts.add(s3);
		ts.add(s2);
		System.out.println(ts);

	}

}
