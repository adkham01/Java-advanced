package com.review.oops;
class UserStatus1{
	public static final String AVILABLE = "Avilable";
	public static final String BUSY = "Busy";
	public static final String IDLE = "Idle";
}
enum UserStatus2{
	AVILABLE, BUSY, IDLE;
}

public class Ooop_8 {

	public static void main(String[] args) {
		System.out.println(UserStatus1.AVILABLE);
		System.out.println(UserStatus1.BUSY);
		System.out.println(UserStatus2.IDLE);
		System.out.println("==============\n");
		System.out.println(UserStatus2.AVILABLE);
		System.out.println(UserStatus2.BUSY);
		System.out.println(UserStatus2.IDLE);
		
	}

}
