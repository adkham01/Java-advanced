package com.java.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	@SuppressWarnings({ "resource"})
	public static void main(String[] args) {
		System.out.println("Waiting for clients.....");
		
		try {
			ServerSocket ss = new ServerSocket(9806);
			Socket soc = ss.accept();
			System.out.println("Connection Established");
			BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str = reader.readLine();
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			out.println("Servert says : "+str);
		} catch (IOException e) {
			
			e.printStackTrace();
		}


	}

}
