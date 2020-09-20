package com.best.data_structure;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest2 {

	public static void main(String[] args) {
		Vector v=new Vector(3,2);
		System.out.println("Initial Size"+v.size());
		
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		System.out.println("Capacity "+v.capacity());
		
		v.addElement(new Double(5.45));
		System.out.println("Current Capacity "+v.capacity());
		
		v.addElement(new Double(6.08));
		System.out.println("First Element "+v.firstElement());
		System.out.println("Last Element: "+v.lastElement());
		
		Enumeration vEnum=v.elements();
		System.out.println("\n Element in vector ");
		while(vEnum.hasMoreElements()) {
			System.out.println(vEnum.nextElement());
		}
		System.out.println();
	}
}
