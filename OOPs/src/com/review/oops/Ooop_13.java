package com.review.oops;
class Employee6{
	String eid;
	String ename;
	String eaddr;
	float esal;
	public Employee6(String eid,String ename,String eaddr,float esal) {
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.esal = esal;
	}
}
class Department1{
	String did;
	String dname;
	Employee6[] emps;
	public Department1(String did,String dname,Employee6[] emps) {
		this.did = did;
		this.dname = dname;
		this.emps = emps;
	}
	public void getDepartmentDetails() {
		System.out.println("Department Details");
		System.out.println("------------------");
		System.out.println("Department ID   : "+did);
		System.out.println("Department Name : "+dname);
		System.out.println("\nEID\tENMAE\tEADDR");
		System.out.println("----------------------");
		for(int i = 0; i < emps.length; i++) {
			Employee6 e = emps[i];
			System.out.println(e.eid+"\t"+e.ename+"\t"+e.eaddr);
		}
	}
}
public class Ooop_13 {

	public static void main(String[] args) {
		Employee6 e1 = new Employee6("E-111", "AAAA", "Hyd", 5200);
		Employee6 e2 = new Employee6("E-222", "BBBB", "Hyd", 2800);
		Employee6 e3 = new Employee6("E-333", "CCCC", "Hyd", 3000);
		Employee6[] emps = {e1,e2,e3};
		Department1 dep = new Department1("D-111", "Admin", emps);
		dep.getDepartmentDetails();
	}

}
