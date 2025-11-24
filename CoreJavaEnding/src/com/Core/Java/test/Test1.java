package com.Core.Java.test;

import com.last.test.Account;

import java.lang.annotation.Annotation;

import com.Core.Java.Anonotatoin.testcom.Core.java.test.Bank;

public class Test1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception{
		Account acc = new Account("abc123","Adkham","Savings",20000);
		acc.getAccountDetails();
		System.out.println();
		Class cls = Class.forName("com.last.test.Account");
		Annotation ann = cls.getAnnotation(Bank.class);
		Bank bank = (Bank) ann;
		
		System.out.println("Bank Id      : "+bank.bid());
		System.out.println("Bank Name    : "+bank.bname());
		System.out.println("Branch Name  : "+bank.branch());
		System.out.println("WebSite Name : "+bank.webSite());
		

	}

}
