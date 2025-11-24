package com.Core.Java.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.Core.Java.Anonotatoin.testcom.Core.java.test.Restaurant;
import com.last.test.Item;
import com.last.test.Order;

public class Test3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception{
		Item itm = new Item("I_555", "Osh", 25);
		Order order = new Order("O-999", itm, "Islom", "98-344-344-223", "23/45");
		order.getOrderDetails();

		Class cls = Order.class;
		Field f = cls.getDeclaredField("itm");
		Annotation an = f.getAnnotation(Restaurant.class);
		Restaurant rst = (Restaurant)an;
		
		System.out.println("Restaurant Details");
		System.out.println("------------------------");
		System.out.println("Restaurent ID	   : "+rst.id());
		System.out.println("Restaurant Name    : "+rst.name());
		System.out.println("Restaurant Phone   : "+rst.phone());
		System.out.println("Restaurant Website : "+rst.phone());
		
	}

}
