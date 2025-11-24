package com.last.test;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

class A{
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
public class Introspection_2 {
	/*@@@@@@@@@@@@@@@@@@@@*/
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IntrospectionException {
		BeanInfo bn = Introspector.getBeanInfo(A.class);
		BeanDescriptor bnd = bn.getBeanDescriptor();
		System.out.println("Bean Name   : "+bnd.getName());
		Class cls = bnd.getBeanClass();
		System.out.println("Bean class  : "+cls.getName());
		System.out.println("Super Class : "+cls.getSuperclass());	
		
		PropertyDescriptor[] pd = bn.getPropertyDescriptors();
		for(PropertyDescriptor p : pd) {
			if(!p.getName().equals("class")) {
				System.out.println("Name         : "+p.getName());
				System.out.println("Data Type    : "+p.getPropertyType());
				System.out.println("Read Method  : "+p.getReadMethod());
				System.out.println("Write Method : "+p.getWriteMethod());
				System.out.println("---------------------------------------");
			}
			
		}
	}

}
