package com.review.oops;
class Account2{
	private String accNo;
	private String accHolderName;
	private String accType;
	private float accBalance;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}
}
class Employee5{
	private int eNo;
	private String eName;
	private float eSal;
	private String eAddr;
	
	private Account2 acc;

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float geteSal() {
		return eSal;
	}

	public void seteSal(float eSal) {
		this.eSal = eSal;
	}

	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public Account2 getAcc() {
		return acc;
	}

	public void setAcc(Account2 acc) {
		this.acc = acc;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println("Employee Number : "+eNo);
		System.out.println("Employee Name   : "+eName);
		System.out.println("Employee Salary : "+eSal);
		System.out.println("Employee Addres : "+eAddr);
		System.out.println("\nAccount Details");
		System.out.println("----------------");
		System.out.println("Account Number : "+acc.getAccNo());
		System.out.println("Account Holder Name : "+acc.getAccHolderName());
		System.out.println("Account Type        : "+acc.getAccType());
		System.out.println("Account Balance     : "+acc.getAccBalance());
	}
}
public class Ooop_12 {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		acc.setAccNo("abc123");
		acc.setAccHolderName("Sardor");
		acc.setAccType("Savings");
		acc.setAccBalance(250000);
		
		Employee5 emp = new Employee5();
		emp.seteNo(123);
		emp.seteName("Durga");
		emp.seteSal(2000);
		emp.seteAddr("Hyd");
		emp.setAcc(acc);
		
		emp.getEmployeeDetails();
	}

}
