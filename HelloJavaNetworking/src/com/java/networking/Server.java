package com.java.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket sSocket = null;
		try {
			/*
			 * Creaates a server socket, bound to the specified port.
			 */

			sSocket = new ServerSocket(6666);
			System.out.println("Sever is waiting for client request...");
			while (true) {
				/*
				 * Listens for a connectiom to be made this socket and accept it. The method
				 * blocks unitl a connection is made.
				 */

				Socket s = sSocket.accept();
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String str = (String) dis.readUTF();
				System.out.println("Server received message from client: " + str);

				// Send a response back to the client
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				String response = "Hello, Client!";
				dos.writeUTF(response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( sSocket != null) {
					sSocket.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
