package com.review.oops;
class Account1{
	String accNo;
	String accName;
	String accType;
	public Account1(String accNo, String accName, String accType) {
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
	}
	
}
class Employee4{
	String eId;
	String eName;
	float eSal;
	String eAddr;
	Account1 acc;
	public Employee4(String eId, String eName, float eSal, String eAddr, Account1 acc) {
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
		this.eAddr = eAddr;
		this.acc = acc;
	}
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("-----------------");
		System.out.println("Employee ID     : "+eId);
		System.out.println("Employee Name   : "+eName);
		System.out.println("Employee Salary : "+eSal);
		System.out.println("Employee Addres : "+eAddr);
		System.out.println("\nAccount Details");
		System.out.println("----------------");
		System.out.println("Account Number : "+acc.accNo);
		System.out.println("Account Name   : "+acc.accName);
		System.out.println("Account Type   : "+acc.accType);
	}
}
public class Ooop_11 {

	public static void main(String[] args) {
		Account1 acc = new Account1("abc123","Durga","Savings");
		
		Employee4 emp = new Employee4("E-111", "Sardor", 250000, "Hyd", acc);
		emp.getEmpDetails();
	}

}
