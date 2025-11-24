package com.java.networking;

import java.io.*;


@SuppressWarnings("serial")
class Cat implements Serializable{
	int i = 10;
	float f = 21.23f;
	String name = "Adkham";
	char c = 'A';

	public void print() {
		System.out.println(this.i);
		System.out.println(this.f);
		System.out.println(this.name);
		System.out.println(this.c);
	}
}

public class SerializeDemo {

	public static void main(String[] args) {
		Cat c = new Cat();
		
		try {
			FileOutputStream fos = new FileOutputStream("D:/Core Java/abs.ser");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			System.out.println("Serialization is finito!");
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader("D:/Core Java/abs.ser");
			String data = "";
			int val = fr.read();
			
			while(val != -1) {
				data += (char)val;
				val = fr.read();
			}
			System.out.println(data);
			fr.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("D:/Core Java/abs.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("Deserialization began");
			Cat c2 = (Cat)ois.readObject();
			c2.print();
			fis.close();
			ois.close();
			System.out.println(c.equals(c2));
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
