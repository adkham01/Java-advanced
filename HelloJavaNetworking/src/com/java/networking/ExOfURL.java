package com.java.networking;

import java.net.*;
public class ExOfURL {

	public static void main(String[] args) {
		try {
			URL u1 = new URL("https://www.youtube.com/playlist?list=PLV8vIYTIdSnbz2QxelrDlv6Buf8Q6H59O");
			System.out.println("Protocol : "+u1.getProtocol());
			System.out.println("Host     : "+u1.getHost());
			System.out.println("Port     : "+u1.getPort());
			System.out.println("File     : "+u1.getFile());
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}

	}

}
