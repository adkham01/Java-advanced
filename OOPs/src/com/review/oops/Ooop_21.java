package com.review.oops;
class Account_1{
	String accNo;
	String accName;
	String accType;
	int accbal;
	public Account_1(String accNo, String accName,String accType,int accbal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.accbal = accbal;
	}
}
class Employee_1 implements Cloneable{
	String eid;
	String ename;
	String eaddr;
	Account_1 acc;
	public Employee_1(String eid,String ename,String eaddr,Account_1 acc) {
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.acc = acc;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	public String toString() {
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee ID     : "+eid);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Employee Addres : "+eaddr);
		System.out.println("\nAccount details");
		System.out.println("--------------------------");
		System.out.println("Account Number    : "+acc.accNo);
		System.out.println("Account Name      : "+acc.accName);
		System.out.println("Account Type      : "+acc.accType);
		System.out.println("Account Balance   : "+acc.accbal);
		System.out.println("Account Reference : "+acc);
		return "";
	}
}
public class Ooop_21 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account_1 acc = new Account_1("A-111", "Durga", "Savings", 5000);
		Employee_1 emp1 = new Employee_1("E-222", "Durga", "Hyd", acc);
		System.out.println("Employee details before cloning\n");
		System.out.println(emp1);
		
		Employee_1 emp2 = (Employee_1)emp1.clone();
		System.out.println("\nEmployee details after deep cloning\n");
		System.out.println(emp2);
	}

}
