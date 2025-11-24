package com.review.oops;
class Employee7{
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
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
}
class Departmen2{
	private String did;
	private String dname;
	private Employee7[] emps;
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Employee7[] getEmps() {
		return emps;
	}
	public void setEmps(Employee7[] emps) {
		this.emps = emps;
	}
	void getDepartmentDetails() {
		System.out.println("Department Details");
		System.out.println("------------------");
		System.out.println("Department ID   : "+getDid());
		System.out.println("Department Name : "+getDname());
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("--------------------------");
		for(Employee7 emps: emps) {
			System.out.print(emps.getEno()+"\t");
			System.out.print(emps.getEname()+"\t");
			System.out.print(emps.getEsal()+"\t");
			System.out.print(emps.getEaddr()+"\n");
		}
	}
}
public class Ooop_14 {

	public static void main(String[] args) {
		Employee7 e1 = new Employee7();
		e1.setEno(111);
		e1.setEname("Durga");
		e1.setEsal(2500);
		e1.setEaddr("Hyd");
		
		Employee7 e2 = new Employee7();
		e2.setEno(222);
		e2.setEname("Adham");
		e2.setEsal(3500);
		e2.setEaddr("Hyd");
		
		Employee7 e3 = new Employee7();
		e3.setEno(333);
		e3.setEname("Diyor");
		e3.setEsal(2500);
		e3.setEaddr("Qarshi");
		
		Employee7 e4 = new Employee7();
		e4.setEno(444);
		e4.setEname("Jahon");
		e4.setEsal(4500);
		e4.setEaddr("Dehli");
		
		Employee7[] emps = {e1,e2,e3,e4};
		
		Departmen2 d = new Departmen2();
		d.setDid("A-111");
		d.setDname("Admin");
		d.setEmps(emps);
		d.getDepartmentDetails();

	}

}
