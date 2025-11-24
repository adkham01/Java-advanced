package com.Framework.Collection;


import java.util.TreeSet;

class Employee3 implements Comparable<Employee3> {
	int eno;
	String ename;
	float esal;
	String eaddr;
	public Employee3(int eno, String ename, float esal, String eaddr) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
	}
	
	@SuppressWarnings("removal")
	@Override
	public int compareTo(Employee3 emp) {
		int val = 0;
		try {
			val = new Float(this.esal).compareTo(emp.esal);
			//val = this.ename.compareTo(emp.ename);
			//val = new Integer (this.eno).compareTo(emp.eno);
		}
		catch (Exception e) {
			
		}
		return val;
	}
	@Override
	public String toString() {
		return "["+eno+","+ename+","+esal+","+eaddr+"]\n";
	}
	
}

public class CollectionFramework_32 {

	public static void main(String[] args) {
		Employee3 emp1 = new Employee3(444, "Machek", 8000, "Pabiance");
		Employee3 emp2 = new Employee3(222, "Mark", 6000, "London");
		Employee3 emp3 = new Employee3(555, "Sam", 9000, "Hyd");
		Employee3 emp4 = new Employee3(333, "Mack", 7000, "Zigers");
		Employee3 emp5 = new Employee3(111, "John", 5000, "Navoiy");
		TreeSet<Employee3> ts = new TreeSet<>();
		ts.add(emp4);
		ts.add(emp1);
		ts.add(emp5);
		ts.add(emp3);
		ts.add(emp2);
		System.out.println(ts);
		
	}

}
