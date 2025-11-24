package com.last.test;

import com.Core.Java.Anonotatoin.testcom.Core.java.test.Restaurant;

public class Order {
	String orderId;
	@Restaurant(
			id = "a-4444",
			name ="Anhor",
			phone = "04040",
			website = "www.anhor.com"
			)
	Item itm;
	String custName;
	String custMobile;
	String custLocation;
	
	public Order(String orderId,Item itm,String custname,String custMobile,String custLocation) {
		this.orderId = orderId;
		this.itm = itm;
		this.custMobile = custMobile;
		this.custLocation = custLocation;
	}
	
	public void getOrderDetails() {
		System.out.println("Order Details");
		System.out.println("-------------------------");
		System.out.println("Order ID   		  : "+orderId);
		System.out.println("Customer Name 	  : "+custName);
		System.out.println("Customer Moblie   : "+custMobile);
		System.out.println("Customer Location : "+custLocation);
		System.out.println();
		itm.getItemDetails();
		System.out.println();
	}

}
