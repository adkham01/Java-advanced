package com.interview.questions;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;

public class AvarageArray {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int [] array = {1,2,76,45,43,2,7,9};
		int totalSum = 0;
		
		for(int i : array) {
			totalSum += i;
		}
		System.out.println("Avarage is equal to : "+totalSum/array.length);
		System.out.println();
		
		OptionalDouble avg = Arrays.stream(array).average();
		System.out.println("Average is equal to : "+(int)avg.getAsDouble());
		System.out.println();
		
		double avg2 = DoubleMath.mean(array);
		System.out.println("Average is equal to : "+(int)avg2);
	}

}
