package com.Framework.Collection;

class Course {
	String cid;
	String cname;
	int ccost;
	
	public Course(String cid, String cname, int ccost) {
		this.cid = cid;
		this.cname = cname;
		this.ccost = ccost;
	}
}
class Student778 {
	String sid;
	String sname;
	String saddr;
	Course[] courses;
	
	public Student778(String sid,String sname,String saddr,Course[] courses) {
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.courses = courses;
	}
	public void getStudentDetails() {
		System.out.println("\nStudent details");
		System.out.println("------------------------");
		System.out.println("Student ID     : "+sid);
		System.out.println("Student Name   : "+sname);
		System.out.println("Student Addres : "+saddr);
		System.out.println();
		System.out.println("Course ID\tCourse Name\tCourse Cost");
		System.out.println("--------------------------------------------");
		for(Course s : courses) {
			System.out.print(s.cid+"\t  |  \t");
			System.out.print(s.cname+"\t  |  \t");
			System.out.print(s.ccost+"\n");
		}
	}														   							
}
public class CollectionFramework_3 {

	public static void main(String[] args) {
		Course c1 = new Course("A-111", "Java", 50000);
		Course c2 = new Course("B-222", "C++", 40000);
		Course c3 = new Course("C-333", "Phyton", 30000);
		Course c4 = new Course("D-444", "Kotlin", 20000);
		
		Course[] courses = {c1,c2,c3,c4};
		
		Student778 std1 = new Student778("S-111", "Anil", "Hyd", courses);
		Student778 std2 = new Student778("S-222", "Adham", "Mitan", courses);
		std1.getStudentDetails();
		std2.getStudentDetails();
	}

}
