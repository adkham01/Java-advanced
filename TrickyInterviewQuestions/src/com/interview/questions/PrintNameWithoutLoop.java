package com.interview.questions;

public class PrintNameWithoutLoop {

	public static void main(String[] args) {
		String name = "Adham\n";
		name = name.repeat(1000);
		System.out.println(name);

		String printName = "i";
		printName = printName.replaceAll("i", "iiiiiiiiii");
		printName = printName.replaceAll("i", "iiiiiiiiii");
		printName = printName.replaceAll("i", "iiiiiiiiii");
		printName = printName.replaceAll("i", "Adham\n");
		System.out.println(printName);

	}

}
