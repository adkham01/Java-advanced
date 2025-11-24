package com.java.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	@SuppressWarnings({"resource" })
	public static void main(String[] args) {
		System.out.println("Client Started....");
		
		try {
			Socket soc = new Socket("localhost", 9806);
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a String");
			String str = userInput.readLine();
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(str);
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(in.readLine());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
