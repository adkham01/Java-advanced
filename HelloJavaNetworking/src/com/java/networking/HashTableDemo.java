package com.java.networking;

import java.util.Random;

public class HashTableDemo {

	public static void main(String[] args) {
		int num = getNewUserUuId();
		
		System.out.println(num);
		
	}
	public static int getNewUserUuId(){
		Random rn = new Random();
		int uuid = 0;
		@SuppressWarnings("unused")
		boolean nonUnique;
		do{
			for(int i = 1; i <= 6; i++){
				uuid *= 10;
				uuid += rn.nextInt(10);
			}
			nonUnique = true;
//			for (User u : this.users){
//				if(uuid !=u.getuuid){
//					nonUnique = true;
//					break;
//				}
//			}
		}while(false);
		
		return uuid;
	}

}
