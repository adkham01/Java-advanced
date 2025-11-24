package com.last.test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.rmi.RemoteException;
import java.rmi.server.ExportException;
import java.sql.SQLException;

class Ab{
	public Ab() throws NullPointerException, IOException{
		
	}
	public Ab(int i) throws SQLException, RemoteException{
		
	}
	Ab(int i, String str) throws ClassCastException, ArrayIndexOutOfBoundsException{
		
	}
	@SuppressWarnings("unused")
	private Ab(int i, String str, float f) throws ClassNotFoundException, ExportException{
		
	}
	public Ab(int i, String str1, String st2) throws SQLException, StringIndexOutOfBoundsException{
		
	}
}
public class ReflectionAPI_4 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception{
		Class cls = Ab.class;
		Constructor[] cons = cls.getDeclaredConstructors();
		for(Constructor con : cons) {
			System.out.println("Name   			: "+con.getName());
			System.out.println("Acces Modifiers : "+Modifier.toString(con.getModifiers()));
			System.out.print("Parametr Types  : ");
			Class[] cls1 = con.getParameterTypes();
			for(Class c : cls1) {
				System.out.print(c.getName()+"\t");
			}
			System.out.println();
			System.out.print("Exception Types : ");
			Class[] cls2 = con.getExceptionTypes();
			for(Class c : cls2) {
				System.out.print(c.getName()+"\t");
			}
			System.out.println();
			System.out.println("----------------------------------------");
		}

	}

}
