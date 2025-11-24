package com.java.networking;

import java.io.*;

@SuppressWarnings("serial")
class Account implements Serializable {
	String uname = "Adkham";
	transient String upwd = "wolf010";
	transient int upin = 1234;

	void print() {
		System.out.println("User name is     : " + this.uname);
		System.out.println("User password is : " + this.upwd);
		System.out.println("User pincode is  : "+this.upin);
	}

	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String epwd = "123" + this.upwd;
		int epin = 4444+this.upin;
		os.writeObject(epwd);
		os.writeInt(epin);
	}

	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		this.upwd = epwd.substring(3);
		int epin = is.readInt();
		this.upin =epin - 4444;
		
	}
}

public class CustSerialization {

	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		a1.print();

		FileOutputStream fos = new FileOutputStream("D:/Core Java/cust.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		System.out.println("Account Object Serialization is finished sccesfully!\n\n");
		fos.close();
		oos.close();

		FileInputStream fis = new FileInputStream("D:/Core Java/cust.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		a2.print();
		System.out.println("Account Object De-Serialization is finished sccesfully!\n\n");
		fis.close();
		ois.close();

	}

}
