package com.last.test;

import com.Core.Java.Anonotatoin.testcom.Core.java.test.Bank;

@Bank(bid = "B-222",
	  bname = "Pekao",
	  webSite = "www.pecao.com/Samarkand"
	  )
public class Account {
	String accNo;
	String accHName;
	String accType;
	int balance;
	
	public Account(String accNo,String accHName,String accType,int balance) {
		this.accNo = accNo;
		this.accHName = accHName;
		this.accType = accType;
		this.balance = balance;
		
	}
	public void getAccountDetails() {
		System.out.println("Account Details");
		System.out.println("------------------------------");
		System.out.println("Account Number      : "+accNo);
		System.out.println("Account Holder Name : "+accHName);
		System.out.println("Account Type        : "+accType);
		System.out.println("Account Balance     : "+balance);
	}
}
