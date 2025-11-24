package com.java.networking;

import java.io.*;

class ExternalizableDemo implements Externalizable {
	String str;
	int i;
	int j;

	public ExternalizableDemo() {
		System.out.println("Public No - Argument Constructor");
	}

	ExternalizableDemo(String str, int i, int j) {
		this.str = str;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.str);
		out.writeInt(this.i);
	}

	@Override
	public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
		this.str = (String) in.readObject();
		this.i = in.readInt();
	}
}

public class ExternalizableDemoEx {

	public static void main(String[] args) throws Exception {
		ExternalizableDemo d1 = new ExternalizableDemo("Adkham", 10, 20);

		FileOutputStream fos = new FileOutputStream("D:/Core Java/ext.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		fos.close();
		oos.close();
		System.out.println("Externalization is finished\n\n");

		FileInputStream fis = new FileInputStream("D:/Core Java/ext.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableDemo d2 = (ExternalizableDemo) ois.readObject();

		System.out.println(d2.str + "\t" + d2.i + "\t" + d2.j);
		fis.close();
		ois.close();

	}

}
