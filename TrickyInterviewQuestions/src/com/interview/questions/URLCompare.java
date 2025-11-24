package com.interview.questions;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * What will be output when you compare site URL with its ip addres?
 * 
 * @author Adham
 *
 */
public class URLCompare {

	public static void main(String[] args) {
		try {
			System.out.println(new URL("https://ubuntu.com").equals(new URL("https://76.223.54.146")));
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}

	}

}
