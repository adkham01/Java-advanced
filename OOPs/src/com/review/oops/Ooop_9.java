package com.review.oops;
enum Apple{
	RED(500), GREEN(250), YELLOW(100);
	private int price;
	private Apple(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}
class AppleClass{
	public static final AppleClass RED = new AppleClass(500);
	public static final AppleClass GREEN = new AppleClass(250);
	public static final AppleClass YELLOW = new AppleClass(100);
	int price;
	private AppleClass(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}
public class Ooop_9 {

	public static void main(String[] args) {
		System.out.println("Red apple    : "+Apple.RED.getPrice());
		System.out.println("Green apple  : "+Apple.GREEN.getPrice());
		System.out.println("Yellow apple : "+Apple.YELLOW.getPrice());
		System.out.println("--------------------");
		
		System.out.println("Red apple    : "+AppleClass.RED.getPrice());
		System.out.println("Green apple  : "+AppleClass.GREEN.getPrice());
		System.out.println("Yellow apple : "+AppleClass.YELLOW.getPrice());
	}

}
