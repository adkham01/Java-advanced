package com.java.networking;

import java.io.*;

@SuppressWarnings("serial")
class Dog implements Serializable {
	String str = "This is a Dog class";

	public void readObj() {
		System.out.println(this.str);
	}
}

@SuppressWarnings("serial")
class Cat2 implements Serializable {
	String str = "This is a Cat class";

	public void readObj() {
		System.out.println(this.str);
	}
}

@SuppressWarnings("serial")
class Rat implements Serializable {
	String str = "This is Rat calss";

	public void readObj() {
		System.out.println(this.str);
	}
}

public class SerializationOrder {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		Cat2 c1 = new Cat2();
		Rat r1 = new Rat();

		FileOutputStream fos = new FileOutputStream("\"D:/Core Java/abc.ser", false);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		oos.close();
		fos.close();
		System.out.println("Serialization is finished\n\n");

		FileInputStream fis = new FileInputStream("D:/Core Java/abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		for (int i = 0; i < 3; i++) {
			Object o = ois.readObject();
			if (o instanceof Dog) {
				Dog d2 = (Dog) o;
			} else if (o instanceof Cat2) {
				Cat2 c2 = (Cat2) o;
			} else {
				Rat r2 = (Rat) o;
			}

		}
	}

}
