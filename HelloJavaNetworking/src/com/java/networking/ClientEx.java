package com.java.networking;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null;
		DataOutputStream dout = null;
		try {
			socket = new Socket("localhost", 6666);

			// Get the output stream and create a DataOutputStream
			OutputStream outputStream = socket.getOutputStream();
			dout = new DataOutputStream(outputStream);

			// Send a message to the server
			String message = "Hello Setrver!";
			dout.writeUTF(message);
			System.out.println("Client sent the message to the server: " + message);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dout != null) {
					dout.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
