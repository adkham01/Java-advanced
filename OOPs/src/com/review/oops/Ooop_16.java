package com.review.oops;
class Course{
	String cid;
	String cname;
	int cost;
	public Course(String cid,String cname,int cost) {
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
		
	}
}
class Student2{
	String sid;
	String sname;
	String saddr;
	Course[] crs;
	public Student2(String sid,String sname,String saddr,Course[] crs) {
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.crs = crs;
	}
	public void getStudentDetails() {
		System.out.println("\n\nStudent Details");
		System.out.println("----------------");
		System.out.println("Student ID      : "+sid);
		System.out.println("Student Name    : "+sname);
		System.out.println("Student Address : "+saddr);
		System.out.println("CID\tCNAME\tCCOST");
		System.out.println("-----------------------");
		for(int i = 0; i < crs.length;i++) {
			Course c = crs[i];
			System.out.println(c.cid+"\t"+c.cname+"\t"+c.cost);
		}
	}
}
public class Ooop_16 {

	public static void main(String[] args) {
		Course c1 = new Course("C-111", "C", 2500);
		Course c2 = new Course("A-111", "Java", 50000);
		Course c3 = new Course("K-222", "JDBC", 7500);
		Course[] crs = {c1,c2,c3};
		
		Student2 std1 = new Student2("s-111", "Arslon", "Hyd", crs);
		Student2 std2 = new Student2("s-222", "Yunus", "Mitan", crs);
		Student2 std3 = new Student2("s-333", "Nur", "Dubai", crs);
		std1.getStudentDetails();
		std2.getStudentDetails();
		std3.getStudentDetails();
	}

}
