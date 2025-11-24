package com.last.test;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

class Employee{
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
}
public class Introspection_1 {

	public static void main(String[] args) throws IntrospectionException {
		BeanInfo bninfo = Introspector.getBeanInfo(Employee.class);
		BeanDescriptor bnDesk = bninfo.getBeanDescriptor();
		System.out.println("Bean Name  : "+bnDesk.getName());
		
		PropertyDescriptor[] prd = bninfo.getPropertyDescriptors();
		System.out.println("Properties  : ");
		for(PropertyDescriptor p : prd) {
			System.out.println(p);
		}
		System.out.println();
		
		MethodDescriptor[] mtd = bninfo.getMethodDescriptors();
		for(MethodDescriptor m : mtd) {
			System.out.println("Methods : "+m);
		}
		 

	}

}
