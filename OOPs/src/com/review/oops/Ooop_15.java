package com.review.oops;
class Branch1{
	String bid;
	String bname;
	public Branch1(String bid, String bname) {
		this.bid = bid;
		this.bname = bname;
	}
}
class Student1{
	String sid;
	String sname;
	String saddr;
	Branch1 branch;
	public Student1(String sid,String sname,String saddr,Branch1 branch) {
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.branch = branch;
	}
	void getStudentDetails() {
		System.out.println("\n\nStudent Detalis");
		System.out.println("----------------");
		System.out.println("Student Id     : "+sid);
		System.out.println("Student Name   : "+sname);
		System.out.println("Student Addres : "+saddr);
		System.out.println("Branch Id   : "+branch.bid);
		System.out.println("Branch NAme : "+branch.bname);
	}
}

public class Ooop_15 {

	public static void main(String[] args) {
		Branch1 branch = new Branch1("B-111", "CS");
		Student1 std1 = new Student1("S-111", "Adkham", "Hyd", branch);
		Student1 std2 = new Student1("D-222", "Diyor", "Qarshi", branch);
		Student1 std3 = new Student1("F-333", "Jamol", "Mitan", branch);
		std1.getStudentDetails();
		std2.getStudentDetails();
		std3.getStudentDetails();
	}

}
