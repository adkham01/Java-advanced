package com.review.oops;
class User{
	private String uname;
	private String upwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
}
class Employee3{
	private String eid;
	private String ename;
	private float esal;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	private String eaddr;
}
class A8 {
	void method_1() {
		System.out.println("Method 1 A");
	}
	void method_2() {
		System.out.println("Method 2 A");
		method_1();
		this.method_1();
	}
}
public class Ooop_4 {

	public static void main(String[] args) {
		
		A8 a = new A8();
		a.method_2();
	}
	public static void thisKeySG() {
		User u = new User();
		u.setUname("Durga");
		u.setUpwd("abc123");
		System.out.println("User Details");
		System.out.println("--------------------------");
		System.out.println("User Name     : "+u.getUname());
		System.out.println("User Password : "+u.getUpwd());
	}
	public static void thisKeySG2() {
		Employee3 emp = new Employee3();
		emp.setEid("A-1111");
		emp.setEname("Durga");
		emp.setEsal(250000f);
		emp.setEaddr("Hyd");
		
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee ID     : "+emp.getEid());
		System.out.println("Employee Name   : "+emp.getEname());
		System.out.println("Employee Salary : "+emp.getEsal());
		System.out.println("EMployee Addres : "+emp.getEaddr());
	}

}
