package com.review.oops;
class Account{
	String accno;
	String accname;
	String acctype;
	int balance;
	public Account(String accno, String accname,String acctype,int balance) {
		this.accno = accno;
		this.accname = accname;
		this.acctype = acctype;
		this.balance = balance;
	}
}
class Transaction{
	String txid;
	String txtype;
	public Transaction(String txid,String txtype) {
		this.txid = txid;
		this.txtype = txtype;
	}
	public void deposit(Account acc, int depAmt) {
		int initalAmt = acc.balance;
		int totalAvilavleAmt = initalAmt + depAmt;
		acc.balance = totalAvilavleAmt;
		
		System.out.println("Transaction Details");
		System.out.println("---------------------");
		System.out.println("Transaction ID  : "+txid);
		System.out.println("Account Number  : "+acc.accno);
		System.out.println("Account Type    : "+acc.acctype);
		System.out.println("Initial Amount  : "+initalAmt);
		System.out.println("Deplsit Amount  : "+depAmt);
		System.out.println("Total Avilable Amount : "+totalAvilavleAmt);
	}
	
}
public class Ooop_17 {

	public static void main(String[] args) {
		
	}

}
