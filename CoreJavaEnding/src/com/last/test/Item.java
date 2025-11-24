package com.last.test;

public class Item {
	String itmid;
	String itmname;
	int itmcost;
	
	public Item(String itmid,String itmname,int itmcost) {
		this.itmid = itmid;
		this.itmname = itmname;
		this.itmcost = itmcost;
		
	}
	
	public void getItemDetails() {
		System.out.println("Item Details");
		System.out.println("-------------------");
		System.out.println("Item ID   : "+itmid);
		System.out.println("Item Name : "+itmname);
		System.out.println("Item Cost : "+itmcost);
	}
}
