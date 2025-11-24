package com.review.oops;
class Student$1 implements Cloneable {
	String sid;
	String sname;
	String saddr;
	public Student$1(String sid, String sname, String saddr) {
		this.sid = sid;
		this.sname = sname;
		this.saddr =saddr;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String toString() {
		System.out.println("Student Details");
		System.out.println("---------------------");
		System.out.println("Student ID     : "+sid);
		System.out.println("Student Name   : "+sname);
		System.out.println("Student Addres : "+saddr);
		return "";
	}
}
public class Ooop_20 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student$1 std1 = new Student$1("A-111", "Adham", "Hyd");
		System.out.println("Student Details before cloning:");
		System.out.println(std1);
		
		Student$1 std2 = (Student$1)std1.clone();
		System.out.println("\nStudent Details after Cloning");
		System.out.println(std2);

	}

}
