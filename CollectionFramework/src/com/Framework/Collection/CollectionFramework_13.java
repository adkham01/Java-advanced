package com.Framework.Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CollectionFramework_13 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/Documents/Salaydinov_Adkham.pdf");
		FileInputStream fis1 = new FileInputStream("D:/Downloads/Adkham_Salaydinov.docx");
		System.out.println("Getting data-1 is Succes!");
		FileInputStream fis2 = new FileInputStream("D:/Downloads/Collection.pdf"); 
		System.out.println("Getting data-2 is Success!");
		int size = fis1.available();
		byte[] b1 = new byte[size];
		fis1.read(b1);
		int size2 = fis2.available();
		byte[] b2 = new byte[size2];
		fis2.read(b2);
		fos.write(b1);
		fis1.close();
		fos.write(b2);
		fis2.close();
		fos.close();
		System.out.println("File writting is Success!");
		
		
	}

}
